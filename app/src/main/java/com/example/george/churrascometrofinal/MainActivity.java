package com.example.george.churrascometrofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar sbMen, sbWomen, sbKids;
    TextView tvMen, tvWomen, tvKids, outputSausage, outputMeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbMen = findViewById(R.id.seekBarMen);
        sbWomen = findViewById(R.id.seekBarWomen);
        sbKids = findViewById(R.id.seekBarKids);
        tvMen = findViewById(R.id.tvMen);
        tvWomen = findViewById(R.id.tvWomen);
        tvKids = findViewById(R.id.tvKids);
        outputMeat = findViewById(R.id.tvMeat);
        outputSausage = findViewById(R.id.tvSausage);

        sbMen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }


}
