package com.example.levon.datasending;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button buttonLinear;
    private Button buttonConstraint;
    private Button buttonRelative;
    private Button buttonFrame;
    private Button buttonCoordinator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLinear = findViewById(R.id.buttonlinear);
        buttonConstraint = findViewById(R.id.buttonconstraint);
        buttonRelative = findViewById(R.id.buttonrelative);
        buttonFrame = findViewById(R.id.buttonframe);
        buttonCoordinator = findViewById(R.id.buttoncoordinator);
        buttonLinear.setOnClickListener(this);
        buttonConstraint.setOnClickListener(this);
        buttonRelative.setOnClickListener(this);
        buttonFrame.setOnClickListener(this);
        buttonCoordinator.setOnClickListener(this);
    }

     @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonlinear:
                Intent intentLinear = new Intent(MainActivity.this, LinearActivity.class);
                startActivity(intentLinear);
                break;
            case R.id.buttonconstraint:
                Intent intentConstraint = new Intent(MainActivity.this, ConstraintActivity.class);
                startActivity(intentConstraint);
                break;
            case R.id.buttonrelative:
                Intent intentRelative = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(intentRelative);
                break;
            case R.id.buttonframe:
                Intent intentFrame = new Intent(MainActivity.this, FrameActivity.class);
                startActivity(intentFrame);
                break;
            case R.id.buttoncoordinator:
                Intent intentCoordinator = new Intent(MainActivity.this, CoordinatorActivity.class);
                startActivity(intentCoordinator);
                break;

        }
    }
}
