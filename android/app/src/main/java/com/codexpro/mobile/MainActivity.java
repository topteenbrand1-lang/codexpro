package com.codexpro.mobile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);

        TextView view = new TextView(this);
        view.setText(
            "CodexPro Android\n\n" +
            "Android shell ready.\n" +
            "CodexPro server integration pending."
        );
        view.setTextSize(20);
        view.setPadding(32, 32, 32, 32);
        setContentView(view);
    }
}
