package com.elevenfifty.screens;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.davidstemmer.screenplay.MutableStage;
import com.davidstemmer.screenplay.flow.Screenplay;

import butterknife.Bind;
import butterknife.ButterKnife;
import flow.Flow;


public class MainActivity extends ActionBarActivity {
    private MutableStage stage;
    private Flow flow;
    private Screenplay screenplay;

    @Bind(R.id.main)
    RelativeLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        stage = ScreensApplication.getStage();
        flow = ScreensApplication.getMainFlow();
        screenplay = ScreensApplication.getScreenplay();

        stage.bind(this, container, flow);
        screenplay.enter();
    }

    @Override
    protected void onDestroy() {
        screenplay.exit();
        stage.unbind();
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        if (!flow.goBack()) {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public Flow getFlow() {
        return flow;
    }
}
