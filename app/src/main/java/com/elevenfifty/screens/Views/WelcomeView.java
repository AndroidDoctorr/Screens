package com.elevenfifty.screens.Views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.elevenfifty.screens.MainActivity;
import com.elevenfifty.screens.R;
import com.elevenfifty.screens.Scenes.NextScene;
import com.elevenfifty.screens.ScreensApplication;

import butterknife.Bind;
import butterknife.ButterKnife;
import flow.Flow;

/**
 * Created by Andrew on 7/17/2015.
 */
public class WelcomeView extends LinearLayout {
    @Bind(R.id.text_view)
    TextView textView;

    @Bind(R.id.button)
    Button button;

    private final Flow flow;

    public WelcomeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.flow = ((MainActivity)getContext()).getFlow();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);

        textView.setText("Screen 1");

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                flow.goTo(new NextScene(ScreensApplication.getInstance()));
            }
        });
    }
}
