package com.example.q1_410606162;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private RadioButton mLength,mArea;
    private Spinner leftSpin,rightSpin;
    //private Adapter Length_list,Area_list;

    private ArrayAdapter<CharSequence> Length_list =
            ArrayAdapter.createFromResource(this,
                    R.array.length_array,
                    android.R.layout.simple_spinner_item);
    private ArrayAdapter<CharSequence> Area_list =
            ArrayAdapter.createFromResource(this,
                    R.array.area_array,
                    android.R.layout.simple_spinner_item);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLength=findViewById(R.id.len);
        mArea=findViewById(R.id.area);
        leftSpin=findViewById(R.id.leftSpinner);
        rightSpin=findViewById(R.id.rightSpinner);
        //Length_list=

        Length_list.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Area_list.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        leftSpin.setAdapter(Length_list);
        rightSpin.setAdapter(Length_list);





        mLength.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) length);
        mArea.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) area);



    }
    private RadioGroup.OnCheckedChangeListener length = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
           // leftSpin.setAdapter();
            //leftSpin.
            //leftSpin.setAdapter();
            leftSpin.setAdapter(Length_list);

        }
    };
    private RadioGroup.OnCheckedChangeListener area = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            rightSpin.setAdapter(Area_list);
        }
    };
}