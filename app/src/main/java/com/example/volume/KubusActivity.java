package com.example.volume;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KubusActivity extends AppCompatActivity {
    private TextView mTxtCubeVolume;
    private EditText mEdtSide;
    private Button mBtnCalculateCubeVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kubus);

        mTxtCubeVolume = findViewById(R.id.txt_cube_volume);
        mEdtSide = findViewById(R.id.edt_side);
        mBtnCalculateCubeVolume = findViewById(R.id.btn_calculate_cube_volume);
        mBtnCalculateCubeVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double side = Double.parseDouble(mEdtSide.getText().toString());
                    mTxtCubeVolume.setText(String.valueOf(calculateVolume(side)));
                }catch (NumberFormatException e) {
                    Toast.makeText(KubusActivity.this, "input cannot be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private double calculateVolume(double side) {
        return side * side * side;
    }

}
