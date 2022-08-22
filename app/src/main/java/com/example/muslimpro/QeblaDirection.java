package com.example.muslimpro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class QeblaDirection extends AppCompatActivity implements SensorEventListener {

    ImageView emplaaCompass;
    TextView textDegree;
    private static SensorManager sensorManager;
    private static Sensor sensor;
    private float currentDegree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qebla_direction);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView title = (TextView) findViewById(R.id.custom_title);
        title.setText("اتجاه القِبلة");
        setTitle("");
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.arrow_back_icon);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        textDegree = (TextView) findViewById(R.id.degree);
        emplaaCompass = (ImageView) findViewById(R.id.qebla_direction);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION);
        if (sensor != null) {
            sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_FASTEST);
        } else {
            Toast.makeText(getApplicationContext(), "Not supported", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        int degree = Math.round(event.values[0]);
        String direction = "";
        RotateAnimation animation = new RotateAnimation(currentDegree, -degree, Animation.RELATIVE_TO_SELF, 0.5f
                , Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(500);
        animation.setFillAfter(true);
        emplaaCompass.startAnimation(animation);
        currentDegree = -degree;
        float txtDegree = Math.abs(currentDegree);
        if (txtDegree >= 160 && txtDegree <= 200) {
            direction = "S";
        } else if (txtDegree >= 0 && txtDegree <= 20 || txtDegree >= 340 && txtDegree <= 360) {
            direction = "N";
        } else if (txtDegree >= 68 && txtDegree <= 112) {
            direction = "E";
        } else if (txtDegree >= 250 && txtDegree <= 291) {
            direction = "W";
        } else if (txtDegree >= 113 && txtDegree <= 157) {
            direction = "SE";
        } else if (txtDegree >= 202 && txtDegree <= 248) {
            direction = "SW";
        } else if (txtDegree >= 293 && txtDegree <= 338) {
            direction = "NW";
        } else if (txtDegree >= 22 && txtDegree <= 67) {
            direction = "NE";
        }
        if (txtDegree >= 131.0 && txtDegree <= 142.0) {
            textDegree.setTextColor(Color.parseColor("#00D100"));
        } else {
            textDegree.setTextColor(Color.parseColor("#FF0000"));
        }
        textDegree.setText("Degree: " + txtDegree + "° " + direction);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}