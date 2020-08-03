package com.teamgannon.trips;

import com.teamgannon.trips.javafxsupport.TripsFxApplication;
import com.teamgannon.trips.jpa.model.AstrographicObject;
import com.teamgannon.trips.jpa.repository.AstrographicObjectRepository;
import javafx.application.Application;
import javafx.scene.Node;
import lombok.extern.slf4j.Slf4j;
import net.rgielen.fxweaver.core.FxControllerAndView;
import net.rgielen.fxweaver.core.FxWeaver;
import net.rgielen.fxweaver.spring.InjectionPointLazyFxControllerAndViewResolver;
import net.rgielen.fxweaver.spring.SpringFxWeaver;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.Optional;

/**
 * FxWeaverSpringBootStarterSampleApplication.
 *
 * @author Rene Gielen
 */
@Slf4j
@SpringBootApplication
public class TripsSpringBootApplication implements CommandLineRunner {


    @Autowired
    private AstrographicObjectRepository astrographicObjectRepository;

    public static void main(String[] args) {
        Application.launch(TripsFxApplication.class, args);
    }

    @Bean
    public FxWeaver fxWeaver(ConfigurableApplicationContext applicationContext) {
        // Would also work with javafx-weaver-core only:
        // return new FxWeaver(applicationContext::getBean, applicationContext::close);
        return new SpringFxWeaver(applicationContext);
    }

    /**
     * See {@link DialogController#DialogController(FxControllerAndView)}
     * for an example usage.
     * <p/>
     * <strong>MUST be in scope prototype!</strong>
     */
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public <C, V extends Node> FxControllerAndView<C, V> controllerAndView(FxWeaver fxWeaver,
                                                                           InjectionPoint injectionPoint) {
        return new InjectionPointLazyFxControllerAndViewResolver(fxWeaver)
                .resolve(injectionPoint);
    }

    @Override
    public void run(String... args) throws Exception {

        // create and save an astro object
        AstrographicObject astrographicObject = new AstrographicObject();
        astrographicObject.setDataSetName("a name");
        astrographicObject.setDisplayName("name");
        astrographicObject.setCatalogIdList(new ArrayList<>());

        AstrographicObject newObj = astrographicObjectRepository.save(astrographicObject);

        Optional<AstrographicObject> optObj = astrographicObjectRepository.findById(newObj.getId());

        if (optObj.isEmpty()) {
            log.info("nothing found");
        } else {
            AstrographicObject retObj = optObj.get();
            log.info("finished saving objects:" + retObj);
        }

    }
}