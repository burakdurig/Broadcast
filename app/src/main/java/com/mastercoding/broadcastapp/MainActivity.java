package com.mastercoding.broadcastapp;

import android.content.IntentFilter;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter intentFilter = new IntentFilter("android.intent.action.AIRPLANE_MODE");
        AirplaneModeReceiver br = new AirplaneModeReceiver();
        registerReceiver(br, intentFilter);
        // broadcast in teh Android Manifest targets APis < 26. the Mainactivity >26.


    }
}