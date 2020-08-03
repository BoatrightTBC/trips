package com.teamgannon.trips.dialogs;

import com.teamgannon.trips.search.AstroSearchQuery;
import com.teamgannon.trips.search.SearchContext;
import com.teamgannon.trips.search.SearchPane;
import com.teamgannon.trips.search.StellarDataUpdater;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Dialog;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import lombok.extern.slf4j.Slf4j;

import static com.teamgannon.trips.support.AlertFactory.showErrorAlert;


@Slf4j
public class QueryDialog extends Dialog<AstroSearchQuery> {

    private final SearchContext searchContext;

    private final SearchPane searchPane;

    private CheckBox plotDisplayCheckbox = new CheckBox("Show Plot");
    private CheckBox tableDisplayCheckbox = new CheckBox("Show Table");

    public final Button runQueryButton = new Button("Run Query");
    Button cancelDataSetButton = new Button("Dismiss");

    public QueryDialog(SearchContext searchContext, StellarDataUpdater updater) {
        this.searchContext = searchContext;
        this.setTitle("Query And Search for Stars");

        searchPane = new SearchPane(this.searchContext, updater);

        this.setHeight(1000);
        this.setWidth(500);

        VBox vBox = new VBox();

        vBox.getChildren().add(searchPane);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10.0);

        HBox hBox1 = new HBox();
        hBox1.getChildren().add(plotDisplayCheckbox);
        hBox1.getChildren().add(tableDisplayCheckbox);
        vBox.getChildren().add(hBox1);

        HBox hBox2 = new HBox();
        hBox2.setAlignment(Pos.CENTER);
        vBox.getChildren().add(hBox2);

        runQueryButton.setOnAction(this::addDataSetClicked);
        hBox2.getChildren().add(runQueryButton);

        cancelDataSetButton.setOnAction(this::close);
        hBox2.getChildren().add(cancelDataSetButton);

        this.getDialogPane().setContent(vBox);

        // set the dialog as a utility
        Stage stage = (Stage) this.getDialogPane().getScene().getWindow();
        stage.setOnCloseRequest(this::close);
    }

    private void close(ActionEvent actionEvent) {
        setResult(searchContext.getAstroSearchQuery());
    }

    private void close(WindowEvent we) {
        setResult(searchContext.getAstroSearchQuery());
    }

    private void addDataSetClicked(ActionEvent actionEvent) {
        boolean showPlot = plotDisplayCheckbox.isSelected();
        boolean showTable = tableDisplayCheckbox.isSelected();

        if (!showPlot && !showTable) {
            showErrorAlert("Query Request",
                    "Must select at leat one target for data, plot or table");
        }
        searchPane.runQuery(showPlot, showTable);
    }

}
