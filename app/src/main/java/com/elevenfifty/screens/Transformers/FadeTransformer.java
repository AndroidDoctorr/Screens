package com.elevenfifty.screens.Transformers;

import android.app.Application;

import com.davidstemmer.screenplay.scene.transformer.TweenTransformer;
import com.elevenfifty.screens.R;

/**
 * Created by Andrew on 7/17/2015.
 *
 */
public class FadeTransformer extends TweenTransformer {
    private static final Params params = new Params();

    static {
        params.forwardIn = R.anim.fade_in;
        params.backIn = R.anim.fade_in;
        params.forwardOut = R.anim.fade_out;
        params.backOut = R.anim.fade_out;
    }

    public FadeTransformer(Application context) {
        super(context, params);
    }
}
