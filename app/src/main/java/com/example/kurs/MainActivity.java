package com.example.kurs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private TextView result;
    private Button toMorseBtn;
    private Button toRussBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
        result = (TextView) findViewById(R.id.result);
        toMorseBtn = (Button) findViewById(R.id.toMorseBtn);
        toRussBtn = (Button) findViewById(R.id.toRussBtn);

        NotificationChannel channel = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            channel = new NotificationChannel("TEST_CHANNEL", "TEST_DESCRIPTION", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);

            // Check if the app has permission to post notifications
            if (notificationManager.getNotificationChannel("TEST_CHANNEL") == null) {
                // Request the user to allow the app to post notifications
                Intent intent = new Intent(Settings.ACTION_APP_NOTIFICATION_SETTINGS);
                intent.putExtra(Settings.EXTRA_APP_PACKAGE, getPackageName());
                startActivity(intent);
            } else {
                // The app has permission to post notifications
                Notification notification = new NotificationCompat.Builder(this, "TEST_CHANNEL")
                        .setContentTitle("Рады тебя снова видеть!")
                        .setContentText("Постарайся узнать сегодня что-то новое)")
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .build();
                notificationManager.notify(42, notification);
            }
        } else {
            // Handle the case for older versions of Android
        }

        toMorseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textConvert = text.getText().toString();
                String convertedText = MorseCode.russToMorse(textConvert);
                result.setText(convertedText);
            }
        });
        toRussBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String textConvert = text.getText().toString();
             String convertedText = MorseCode.morseToRuss(textConvert);
             result.setText(convertedText);
            }
        });
    }
}