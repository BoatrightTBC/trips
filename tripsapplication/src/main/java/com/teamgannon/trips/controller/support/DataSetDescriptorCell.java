package com.teamgannon.trips.controller.support;

import com.teamgannon.trips.jpa.model.DataSetDescriptor;
import com.teamgannon.trips.search.StellarDataUpdater;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListCell;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tooltip;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DataSetDescriptorCell extends ListCell<DataSetDescriptor> {

    private StellarDataUpdater updater;

    public DataSetDescriptorCell(StellarDataUpdater updater) {
        this.updater = updater;
    }

    // We want to create a single Tooltip that will be reused, as needed. We will simply update the text
    // for the Tooltip for each cell
    final Tooltip tooltip = new Tooltip();

    @Override
    public void updateItem(DataSetDescriptor descriptor, boolean empty) {
        super.updateItem(descriptor, empty);

        int index = this.getIndex();
        String name = null;
        ContextMenu contextMenu = new ContextMenu();
        MenuItem plotMenuItem = new MenuItem("Plot Star");
        plotMenuItem.setOnAction((event) -> {
            log.info("plot stars!");
            updater.showNewStellarData(true, false);
        });

        MenuItem displayMenuItem = new MenuItem("Display Data");
        displayMenuItem.setOnAction((event) -> {
            log.info("display star data!");
            updater.showNewStellarData(false, true);
        });

        MenuItem displayPlotMenuItem = new MenuItem("Plot and display data");
        displayPlotMenuItem.setOnAction((event) -> {
            log.info("plot and display star data!");
            updater.showNewStellarData(true, true);
        });

        MenuItem deleteMenuItem = new MenuItem("Delete");
        deleteMenuItem.setOnAction((event) -> {
            log.info("delete star data!");
            updater.removeDataSet(descriptor);
        });


        contextMenu.getItems().addAll(plotMenuItem, displayMenuItem, displayPlotMenuItem, deleteMenuItem);

        // Format name
        if (descriptor != null && !empty) {
            name = "Set " + (index + 1) + ": " +
                    descriptor.getDataSetName() + " has " +
                    descriptor.getNumberStars() + " stars";

            tooltip.setText(descriptor.getToolTipText());
            setTooltip(tooltip);
            setContextMenu(contextMenu);
        }

        this.setText(name);
        setGraphic(null);
    }
}