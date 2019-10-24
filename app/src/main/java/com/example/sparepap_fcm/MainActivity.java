package com.example.sparepap_fcm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.pusher.pushnotifications.PushNotifications;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PushNotifications.start(getApplicationContext(), "3c08809f-6bbf-4f7b-b51f-6710275e586e");
        PushNotifications.addDeviceInterest("hello");
    }
}
