package com.example.volume;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TabungActivity extends AppCompatActivity {
    private TextView mTxtTubeVolume;
    private EditText mEdtRadius, mEdtHeight;
    private Button mBtnCalculateTubeVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabung);

        mTxtTubeVolume = findViewById(R.id.txt_tube_volume);
        mEdtHeight = findViewById(R.id.edt_height);
        mEdtRadius = findViewById(R.id.edt_radius);
        mBtnCalculateTubeVolume = findViewById(R.id.btn_calculate_tube_volume);
        mBtnCalculateTubeVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double radius = Double.parseDouble(mEdtRadius.getText().toString());
                    double height = Double.parseDouble(mEdtHeight.getText().toString());
                    mTxtTubeVolume.setText(String.valueOf(calculateVolume(radius, height)));
                }catch (NumberFormatException e) {
                    Toast.makeText(TabungActivity.this, "input cannot be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
}
