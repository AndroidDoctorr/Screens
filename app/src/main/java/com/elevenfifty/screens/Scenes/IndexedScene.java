package com.elevenfifty.screens.Scenes;

import com.davidstemmer.screenplay.scene.StandardScene;

/**
 *
 * Created by Andrew on 7/17/2015.
 *
 */
public abstract class IndexedScene extends StandardScene {
    public final String id;

    protected IndexedScene(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        IndexedScene that = (IndexedScene)o;

        if (id != null ? !id.equals(that.id) : that.id != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
        /* if id != null then return id.hashCode() else return 0;*/
    }
}
