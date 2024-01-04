package com.github.carlwilk32.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.github.carlwilk32.Main;

public class HtmlLauncher extends GwtApplication {

    @Override
    public GwtApplicationConfiguration getConfig() {
        // Resizable application, uses available space in browser
//                return new GwtApplicationConfiguration(true);
        // Fixed size application:
        return new GwtApplicationConfiguration(800, 480);
    }

    @Override
    public ApplicationListener createApplicationListener() {
        return new Main();
    }
}