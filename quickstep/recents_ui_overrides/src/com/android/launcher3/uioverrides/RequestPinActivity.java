package com.android.launcher3.uioverrides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.provider.Settings;
import android.util.Log;
import com.android.launcher3.R;

public class RequestPinActivity extends Activity {
    public static final String TAG = "RequestPinActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.request_pin_activity);

    }

    public void onGoSetting(View v) {
        startActivity(new Intent(Settings.ACTION_SECURITY_SETTINGS));
    }
}
