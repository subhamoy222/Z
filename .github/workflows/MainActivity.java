package com.zltech.welcome;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override protected void onCreate(Bundle b) {
        super.onCreate(b);
        TextView t = new TextView(this);
        t.setText("Welcome to\nZL TECHNOLOGIES");
        t.setTextSize(30);
        t.setTypeface(Typeface.DEFAULT_BOLD);
        t.setTextColor(Color.BLACK);
        t.setGravity(Gravity.CENTER);
        t.setBackgroundColor(Color.WHITE);
        setContentView(t);
    }
}
