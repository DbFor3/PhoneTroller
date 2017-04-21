package com.example.david.phonetroller;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    //declare the buttons for the project
    private Button mBackButton;
    private Button mSettingsButton;
    private Button mStartButton;
    private ImageButton mAButton;
    private ImageButton mBButton;
    private ImageButton mXButton;
    private ImageButton mYButton;
    private Button mLTButton;
    private Button mRTButton;
    private ImageButton mLeftDpadButton;
    private ImageButton mRightDpadButton;
    private ImageButton mUpDpadButton;
    private ImageButton mDownDpadButton;

    //Landscape to portait buttons
    private Button switchToPortrait;
    private Button switchToLandscape;




    //Textview to display environment sensor data
    private TextView currentX, currentY, currentZ;

    //get the environment sensors
    private SensorManager sensorManager;
    private Sensor accelerometer;
    private Sensor sensor;
    private float lastX, lastY, lastZ;

    //these values we need to use to gage the user turning their phone as if it was a steering wheel
    public static float deltaX = 0;
    public static float deltaY = 0;
    public static float deltaZ = 0;

    //boolean to hold if phone is in portait or landscape
    public static boolean isPortrait = false;
    public static boolean isLandscape = true;

    //Turn text View
    private TextView turnTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();

        //initialize Buttons
        switchToLandscape = (Button) findViewById(R.id.landscapeButton);
        switchToPortrait = (Button) findViewById(R.id.portaitButton);

        switchToLandscape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

            }
        });

        switchToPortrait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }
        });



        //If orientation is in portait mode
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                    isPortrait = true;

        } else
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            isLandscape = true;
        }

        /*
        //checking to see if device has accelerometer
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        if (sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) != null) {
            // success! we have an accelerometer

            accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
            sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_GAME);
        } else {
            // fail! we dont have an accelerometer!
        }*/

        //declaring Sensor Manager and sensor type
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);



        //initiate the buttons and set on click listeners

        mBackButton = (Button) findViewById(R.id.back_button);
        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mSettingsButton = (Button) findViewById(R.id.settings_button);
        mSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, MapButtons.class);
                startActivity(i);
            }
        });

        mStartButton = (Button) findViewById(R.id.start_button);
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mUpDpadButton = (ImageButton) findViewById(R.id.up_dpad_button);
        mUpDpadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mDownDpadButton = (ImageButton) findViewById(R.id.down_dpad_button);
        mDownDpadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mLeftDpadButton = (ImageButton) findViewById(R.id.left_dpad_button);
        mLeftDpadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*if (isPortrait == true) {
                    while (deltaX > 0) {
                        turnTextView.setText("TURNING Left!");
                    } turnTextView.setText("");
                } else if (isLandscape == true) {
                    while (deltaY > 0) {
                        turnTextView.setText("TURNING Left!");
                    } turnTextView.setText("");
                }*/

            }
        });

        mRightDpadButton = (ImageButton) findViewById(R.id.right_dpad_button);
        mRightDpadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
                if (isPortrait == true) {
                    while (deltaX > 0) {
                        turnTextView.setText("TURNING Right!");
                    }turnTextView.setText("");
                } else if (isLandscape == true) {
                    while (deltaY > 0) {
                        turnTextView.setText("TURNING Right!");
                    }  turnTextView.setText("");
                }*/

            }
        });

        mAButton = (ImageButton) findViewById(R.id.a_button);
        mAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mBButton = (ImageButton) findViewById(R.id.b_button);
        mBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        mXButton = (ImageButton) findViewById(R.id.x_button);
        mXButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mYButton = (ImageButton) findViewById(R.id.y_button);
        mYButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mLTButton = (Button) findViewById(R.id.lt_button);
        mLTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mRTButton = (Button) findViewById(R.id.rt_button);
        mRTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


    @Override
    public void onAccuracyChanged(Sensor arg0, int arg1) {
    }

    @Override
    public void onSensorChanged(SensorEvent event) {

        // cleans the current values
        displayCleanValues();
        // displays the current x,y,z accelerometer values
        displayCurrentValues();
        deltaX = event.values[0];
        deltaY = event.values[1];
        deltaZ  = event.values[2];

        if(isPortrait==true) {
            if (Math.abs(deltaX) > Math.abs(deltaY)) {
                if (deltaX < 0) {

                    turnTextView.setText("TURNING RIGHT!");
                }
                if (deltaX > 0) {

                    turnTextView.setText("TURNING LEFT!");
                }
            } else {
                if (deltaY < 0) {

                    //turnTextView.setText("You tilt the device up");
                }
                if (deltaY > 0) {

                    //turnTextView.setText("You tilt the device down");
                }
            }
            if (deltaX > (-2) && deltaX < (2) && deltaY > (-2) && deltaY < (2)) {

                turnTextView.setText("");
            }
        }


        if(isLandscape==true){
            if (Math.abs(deltaX) > Math.abs(deltaY)) {
                if (deltaX < 0) {

                    //turnTextView.setText("TURNING RIGHT!");
                }
                if (deltaX > 0) {

                    //turnTextView.setText("TURNING LEFT ");
                }
            } else {
                if (deltaY < 0) {

                    turnTextView.setText("TURNING LEFT!");
                }
                if (deltaY > 0) {

                    turnTextView.setText("TURNING RIGHT!");
                }
            }
            if (deltaX > (-2) && deltaX < (2) && deltaY > (-2) && deltaY < (2)) {

                turnTextView.setText("");
            }
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //unregister Sensor listener
        sensorManager.unregisterListener(this);
    }




    /*
    //onResume() register the accelerometer for listening the events
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_GAME);
    }

    //onPause() unregister the accelerometer for stop listening the events
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    public void onSensorChanged(SensorEvent event) {

        /**once we find out the values of x y z that simulates the user turning the phone
         we will put the code for the left or right dpad button getting pressed here to
         turn the in game car
         */
        // cleans the current values
        //displayCleanValues();
        // displays the current x,y,z accelerometer values
        //displayCurrentValues();

/*
        // get the change of the x,y,z values of the accelerometer
        deltaX = Math.abs(lastX - event.values[0]);
        deltaY = Math.abs(lastY - event.values[1]);
        deltaZ = Math.abs(lastZ - event.values[2]);

        // if the change is below 2, it is just plain noise
        if (deltaX < 2)
            deltaX = 0;

        if (deltaY < 2)
            deltaY = 0;

/*

        if (isPortrait == true) {
            if (deltaX > 2) {
                turnTextView.setText("TURNING!");
            }else turnTextView.setText("");
        } else if (isLandscape == true) {
            if (deltaY > 2) {
                turnTextView.setText("TURNING!");
            } else turnTextView.setText("");
        }
    }*/


    public void initializeViews() {
        currentX = (TextView) findViewById(R.id.x_sensor);
        currentY = (TextView) findViewById(R.id.y_sensor);
        currentZ = (TextView) findViewById(R.id.z_sensor);
        turnTextView = (TextView) findViewById(R.id.turnText);
    }
    public void displayCleanValues() {
        currentX.setText("0.0");
        currentY.setText("0.0");
        currentZ.setText("0.0");
    }
    // display the current x,y,z accelerometer values
    public void displayCurrentValues() {
        currentX.setText(Float.toString(deltaX));
        currentY.setText(Float.toString(deltaY));
        currentZ.setText(Float.toString(deltaZ));
    }


}

