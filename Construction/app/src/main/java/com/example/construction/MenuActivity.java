package com.example.construction;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    ImageButton imageButtonTriangle;
    ImageButton imageButtonSquare;
    ImageButton imageButtonCircle;
    ImageButton imageButtonRectangle;
    ImageButton imageButtonBall;
    ImageButton imageButtonCone;
    ImageButton imageButtonCube;
    ImageButton imageButtonCylinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        imageButtonTriangle = (ImageButton) findViewById(R.id.imageButton9);
        imageButtonSquare = (ImageButton) findViewById(R.id.imageButton10);
        imageButtonCircle = (ImageButton) findViewById(R.id.imageButton14);
        imageButtonRectangle = (ImageButton) findViewById(R.id.imageButton13);
        imageButtonBall = (ImageButton) findViewById(R.id.imageButton);
        imageButtonCone = (ImageButton) findViewById(R.id.imageButton2);
        imageButtonCube = (ImageButton) findViewById(R.id.imageButton3);
        imageButtonCylinder = (ImageButton) findViewById(R.id.imageButton4);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.imageButton9:
                        Intent i = new Intent(MenuActivity.this, TriangleAreaActivity.class);
                        startActivity(i);
                        break;
                    case R.id.imageButton10:
                        Intent i1 = new Intent(MenuActivity.this, SquareAreaActivity.class);
                        startActivity(i1);
                        break;
                    case R.id.imageButton14:
                        Intent i2 = new Intent(MenuActivity.this, CircleAreaActivity.class);
                        startActivity(i2);
                        break;
                    case R.id.imageButton13:
                        Intent i3 = new Intent(MenuActivity.this, RectangleAreaActivity.class);
                        startActivity(i3);
                        break;
                    case R.id.imageButton:
                        Intent i4 = new Intent(MenuActivity.this, BallVolumeActivity.class);
                        startActivity(i4);
                        break;
                    case R.id.imageButton2:
                        Intent i5 = new Intent(MenuActivity.this, ConeVolumeActivity.class);
                        startActivity(i5);
                        break;
                    case R.id.imageButton3:
                        Intent i6 = new Intent(MenuActivity.this, CubeVolumeActivity.class);
                        startActivity(i6);
                        break;
                    case R.id.imageButton4:
                        Intent i7 = new Intent(MenuActivity.this, CylinderVolumeActivity.class);
                        startActivity(i7);
                        break;
                }
            }
        } ;
        imageButtonTriangle.setOnClickListener(onClickListener);
        imageButtonSquare.setOnClickListener(onClickListener);
        imageButtonCircle.setOnClickListener(onClickListener);
        imageButtonRectangle.setOnClickListener(onClickListener);
        imageButtonBall.setOnClickListener(onClickListener);
        imageButtonCone.setOnClickListener(onClickListener);
        imageButtonCube.setOnClickListener(onClickListener);
        imageButtonCylinder.setOnClickListener(onClickListener);
    }
}
