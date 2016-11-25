package com.example.yurynoh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView label_startChkBox, label_animalGroup;
    CheckBox startChkBox, cb2;
    RadioGroup animalGroup;
    Button commit, b2, b3;
    LinearLayout linear1;
    ImageView animalImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiate content component
        label_startChkBox = (TextView) findViewById(R.id.label_startChkBox);
        label_animalGroup = (TextView) findViewById(R.id.label_animalGroup);
        startChkBox = (CheckBox) findViewById(R.id.startChkBox);
        animalGroup = (RadioGroup) findViewById(R.id.animalGroup);
        commit = (Button) findViewById(R.id.commit);
        animalImage = (ImageView) findViewById(R.id.animalImage);
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        b2 = (Button) findViewById(R.id.button);
        b3 = (Button) findViewById(R.id.button2);
        cb2 = (CheckBox) findViewById(R.id.checkBox);

        startChkBox.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    linear1.setVisibility(View.VISIBLE);
                }

                cb2.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            linear1.setVisibility(View.INVISIBLE);
                        }
                    }
                });
                commit.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if (animalGroup.getCheckedRadioButtonId() == R.id.dog) {
                            animalImage.setImageResource(R.drawable.dog);
                        } else if (animalGroup.getCheckedRadioButtonId() == R.id.cat) {
                            animalImage.setImageResource(R.drawable.cat);
                        } else {
                            animalImage.setImageResource(R.drawable.rabbit);
                        }
                    }
                });
                b2.setOnClickListener(new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                        System.exit(0);
                    }
                });
                b3.setOnClickListener(new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        linear1.setVisibility(View.INVISIBLE);
                    }
                });
            }
        });
    }
}






