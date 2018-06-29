package com.example.levon.datasending;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class LinearActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    private SeekBar redSeek;
    private SeekBar greenSeek;
    private SeekBar blueSeek;
    private LinearLayout linearLayout;
    private TextView textViewRed;
    private TextView textViewGreen;
    private TextView textViewBlue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        redSeek = findViewById(R.id.seekred);
        greenSeek = findViewById(R.id.seekgreen);
        blueSeek = findViewById(R.id.seekblue);
        redSeek.setOnSeekBarChangeListener(this);
        greenSeek.setOnSeekBarChangeListener(this);
        blueSeek.setOnSeekBarChangeListener(this);
        linearLayout = findViewById(R.id.linearbackground);
        textViewRed = findViewById(R.id.textred);
        textViewGreen = findViewById(R.id.textgreen);
        textViewBlue = findViewById(R.id.textblue);
        redSeek.setMax(255);
        greenSeek.setMax(255);
        blueSeek.setMax(255);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        colorChange();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    private void colorChange() {
        int redValue, greenValue, blueValue;
        redValue = redSeek.getProgress();
        String a = String.valueOf(redValue);
        textViewRed.setText(a);
        greenValue = greenSeek.getProgress();
        String b = String.valueOf(greenValue);
        textViewGreen.setText(b);
        blueValue = blueSeek.getProgress();
        String c = String.valueOf(blueValue);
        textViewBlue.setText(c);
        linearLayout.setBackgroundColor(0xff000000 + redValue * 0x10000 + greenValue * 0x100 + blueValue);
    }
}
