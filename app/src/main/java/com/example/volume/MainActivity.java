package com.example.volume;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button mBtnIntentTubeVolume, mBtnIntentCubeVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        mBtnIntentTubeVolume = findViewById(R.id.btn_intent_tube_volume);
        mBtnIntentTubeVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TabungActivity.class);
                startActivity(intent);
            }
        });

        mBtnIntentCubeVolume = findViewById(R.id.btn_intent_cube_volume);
        mBtnIntentCubeVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, KubusActivity.class);
                startActivity(intent);
            }
        });


    }
}
