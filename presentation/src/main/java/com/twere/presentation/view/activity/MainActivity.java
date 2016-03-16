package com.twere.presentation.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity
        extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(MainActivity.this, getStringFromNDK(), Toast.LENGTH_SHORT).show();

    }

    public native String getStringFromNDK();

    static {
        System.loadLibrary("libnatives");
    }

}
