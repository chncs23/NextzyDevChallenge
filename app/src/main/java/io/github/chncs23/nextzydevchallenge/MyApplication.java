package io.github.chncs23.nextzydevchallenge;

import android.app.Application;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by CHNCS23 on 23/10/2559.
 */

public class MyApplication extends Application {

    private static final String DEFAULT_FONT_PATH = "fonts/CSChatThaiUI.ttf";
    @Override public void onCreate() {
        super.onCreate();
        setupDefaultFont();
    }

    private void setupDefaultFont() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder().setDefaultFontPath(DEFAULT_FONT_PATH).build());
    }
}
