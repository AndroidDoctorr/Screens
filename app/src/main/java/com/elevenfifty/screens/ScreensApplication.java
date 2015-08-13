package com.elevenfifty.screens;

import android.app.Application;

import com.davidstemmer.screenplay.MutableStage;
import com.davidstemmer.screenplay.flow.Screenplay;
import com.elevenfifty.screens.Scenes.WelcomeScene;

import flow.Backstack;
import flow.Flow;

/**
 * Created by Andrew on 7/17/2015.
 *
 */
public class ScreensApplication extends Application {
    public final MutableStage stage = new MutableStage();
    public final Screenplay screenplay = new Screenplay(stage);
    public final Flow mainFlow = new Flow(Backstack.single(new WelcomeScene(this)), screenplay);

    public static ScreensApplication application;

    public void onCreate() {
        application = this;
    }

    public static ScreensApplication getInstance() {
        return application;
    }

    public static MutableStage getStage() {
        return getInstance().stage;
    }

    public static Screenplay getScreenplay() {
        return getInstance().screenplay;
    }

    public static Flow getMainFlow() {
        return getInstance().mainFlow;
    }
}
