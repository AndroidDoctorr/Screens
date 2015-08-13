package com.elevenfifty.screens.Scenes;

import android.app.Application;

import com.elevenfifty.screens.R;
import com.elevenfifty.screens.ScreensApplication;
import com.elevenfifty.screens.Transformers.SlideTransformer;

import flow.Layout;

/**
 *
 * Created by Andrew on 7/17/2015.
 *
 */
@Layout(R.layout.nextpage_view)
public class NextScene extends IndexedScene {
    private final SlideTransformer transformer;

    public NextScene(Application application) {
        super(NextScene.class.getName());
        this.transformer = new SlideTransformer(application);
    }

    public NextScene() {
        this(ScreensApplication.getInstance());
    }

    @Override
    public Transformer getTransformer() {
        return transformer;
    }
}
