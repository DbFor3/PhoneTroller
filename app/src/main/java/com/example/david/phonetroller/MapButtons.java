package com.example.david.phonetroller;

import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by David on 4/8/2017.
 */

public class MapButtons extends AppCompatActivity {

    //declare radio groups and radio buttons
    private RadioGroup aGroup;
    private RadioGroup bGroup;
    private RadioGroup xGroup;
    private RadioGroup yGroup;
    private RadioGroup ltGroup;
    private RadioGroup rtGroup;

    //a radio buttons
    private RadioButton atoAButton;
    private RadioButton atoXButton;
    private RadioButton atoYButton;
    private RadioButton atoLTButton;
    private RadioButton atoRTButton;
    private RadioButton atoBButton;


    //b radio buttons
    private RadioButton btoAButton;
    private RadioButton btoXButton;
    private RadioButton btoYButton;
    private RadioButton btoLTButton;
    private RadioButton btoRTButton;
    private RadioButton btoBButton;

    //x radio buttons
    private RadioButton xtoAButton;
    private RadioButton xtoXButton;
    private RadioButton xtoYButton;
    private RadioButton xtoLTButton;
    private RadioButton xtoRTButton;
    private RadioButton xtoBButton;

    //y radio buttons
    private RadioButton ytoAButton;
    private RadioButton ytoXButton;
    private RadioButton ytoYButton;
    private RadioButton ytoLTButton;
    private RadioButton ytoRTButton;
    private RadioButton ytoBButton;

    //Lt radio buttons
    private RadioButton lttoAButton;
    private RadioButton lttoXButton;
    private RadioButton lttoYButton;
    private RadioButton lttoLTButton;
    private RadioButton lttoRTButton;
    private RadioButton lttoBButton;

    //Rt radio buttons
    private RadioButton rttoAButton;
    private RadioButton rttoXButton;
    private RadioButton rttoYButton;
    private RadioButton rttoLTButton;
    private RadioButton rttoRTButton;
    private RadioButton rttoBButton;

    //updateButton
    private Button updateButton;

    //wiill need to alter functionality of buttons in MainActivity


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_button_map);

      //initialize radio groups
        aGroup = (RadioGroup) findViewById(R.id.abuttonmap);
        bGroup = (RadioGroup) findViewById(R.id.bbuttonmap);
        xGroup = (RadioGroup) findViewById(R.id.xbuttonmap);
        yGroup = (RadioGroup) findViewById(R.id.ybuttonmap);
        ltGroup = (RadioGroup) findViewById(R.id.ltbuttonmap);
        rtGroup = (RadioGroup) findViewById(R.id.rtbuttonmap);

        //initialize radio buttons for each button group

        //a button group

        atoAButton =(RadioButton) findViewById(R.id.abutton_aradio);
        atoBButton =(RadioButton) findViewById(R.id.bbutton_aradio);
        atoXButton =(RadioButton)findViewById(R.id.xbutton_aradio);
        atoYButton =(RadioButton) findViewById(R.id.ybutton_aradio);
        atoLTButton = (RadioButton)findViewById(R.id.ltbutton_aradio);
        atoRTButton = (RadioButton)findViewById(R.id.rtbutton_aradio);


        //b button group

        btoBButton = (RadioButton)findViewById(R.id.bbutton_bradio);
        btoAButton = (RadioButton)findViewById(R.id.abutton_bradio);
        btoXButton = (RadioButton) findViewById(R.id.xbutton_bradio);
        btoYButton = (RadioButton)findViewById(R.id.ybutton_bradio);
        btoLTButton = (RadioButton)findViewById(R.id.ltbutton_bradio);
        btoRTButton = (RadioButton)findViewById(R.id.rtbutton_bradio);


        //x button group
        xtoXButton = (RadioButton)findViewById(R.id.xbutton_xradio);
        xtoAButton = (RadioButton)findViewById(R.id.abutton_xradio);
        xtoBButton = (RadioButton)findViewById(R.id.bbutton_xradio);
        xtoYButton = (RadioButton)findViewById(R.id.ybutton_xradio);
        xtoLTButton = (RadioButton)findViewById(R.id.ltbutton_xradio);
        xtoRTButton =(RadioButton)findViewById(R.id.rtbutton_xradio);

        //y button group

        ytoYButton = (RadioButton)findViewById(R.id.ybutton_yradio);
        ytoAButton = (RadioButton)findViewById(R.id.abutton_yradio);
        ytoBButton = (RadioButton)findViewById(R.id.bbutton_yradio);
        ytoXButton = (RadioButton)findViewById(R.id.xbutton_yradio);
        ytoLTButton = (RadioButton)findViewById(R.id.ltbutton_yradio);
        ytoRTButton = (RadioButton)findViewById(R.id.rtbutton_yradio);

        //lt button group

        lttoLTButton = (RadioButton)findViewById(R.id.ltbutton_ltradio);
        lttoAButton = (RadioButton)findViewById(R.id.abutton_ltradio);
        lttoBButton= (RadioButton)findViewById(R.id.bbutton_ltradio);
        lttoXButton = (RadioButton)findViewById(R.id.xbutton_ltradio);
        lttoYButton =(RadioButton)findViewById(R.id.ybutton_ltradio);
        lttoRTButton = (RadioButton)findViewById(R.id.rtbutton_ltradio);


        //rt button group
        rttoRTButton = (RadioButton)findViewById(R.id.rtbutton_rtradio);
        rttoAButton = (RadioButton)findViewById(R.id.abutton_rtradio);
        rttoBButton = (RadioButton)findViewById(R.id.bbutton_rtradio);
        rttoXButton = (RadioButton)findViewById(R.id.xbutton_rtradio);
        rttoYButton = (RadioButton)findViewById(R.id.ybutton_rtradio);
        rttoLTButton = (RadioButton)findViewById(R.id.ltbutton_rtradio);


        //update button button when clicked updates checks all radio buttons
        updateButton = (Button)findViewById(R.id.updateButton);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            //if statements to check what is checked to map buttons correctly
            //setting up for someone to come finish once we have functioning buttons

                // agroup
                 if(atoAButton.isChecked()){
                 //do something
                 } else if (atoBButton.isChecked()){
                 //do somehting
                 } else if (atoXButton.isChecked()){
                 //do something
                 } else if (atoYButton.isChecked()){
                     //do something
                 } else if (atoLTButton.isChecked()){
                  //do something
                } else if (atoRTButton.isChecked()){
                  //do something
             }
                //continues like below for the rest of the buttons
                //b group

                //xgroup

                //y group

                //ltgroup


                //rtgroup


            }
        });


    }
}
