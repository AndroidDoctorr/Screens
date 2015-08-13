package com.elevenfifty.screens.Transformers;

import android.app.Application;

import com.davidstemmer.screenplay.scene.transformer.TweenTransformer;
import com.elevenfifty.screens.R;

/**
 * Created by Andrew on 7/17/2015.
 *
 */

public class SlideTransformer extends TweenTransformer {
    private static final Params params = new Params();

    static {
        params.forwardIn = R.anim.slide_in_right;
        params.backIn = R.anim.slide_in_left;
        params.forwardOut = R.anim.slide_out_left;
        params.backOut = R.anim.slide_out_right;
    }

    public SlideTransformer(Application context) {
        super(context, params);
    }
}
