package com.elevenfifty.screens.Scenes;

import android.app.Application;

import com.elevenfifty.screens.R;
import com.elevenfifty.screens.ScreensApplication;
import com.elevenfifty.screens.Transformers.FadeTransformer;

import flow.Layout;

/**
 *
 * Created by Andrew on 7/17/2015.
 *
 */

@Layout(R.layout.welcome_view)
public class WelcomeScene extends IndexedScene {
    private final FadeTransformer transformer;

    public WelcomeScene(Application application) {
        super(WelcomeScene.class.getName());
        this.transformer = new FadeTransformer(application);
    }

    public WelcomeScene() {
        this(ScreensApplication.getInstance());
    }

    @Override
    public Transformer getTransformer() {
        return transformer;
    }
}
