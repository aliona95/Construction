package com.example.construction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class CubeVolumeActivity extends AppCompatActivity {

    EditText editText2;
    EditText editText3;
    EditText editText4;

    float firstEdge;
    float secondEdge;
    float thirdEdge;

    float area;

    Button button;
    TextView textView;

    ImageButton imageButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube_volume);

        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);

        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView8);

        imageButtonBack = (ImageButton) findViewById(R.id.imageButton15);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button:
                        // first
                        if (String.valueOf(editText2.getText().toString()).equals("")) {
                            firstEdge = 0;
                        } else {
                            firstEdge = Float.parseFloat(String.valueOf(editText2.getText().toString()));
                        }
                        // second
                        if (String.valueOf(editText3.getText().toString()).equals("")) {
                            secondEdge = 0;
                        } else {
                            secondEdge = Float.parseFloat(String.valueOf(editText3.getText().toString()));
                        }
                        // third
                        if (String.valueOf(editText4.getText().toString()).equals("")) {
                            thirdEdge = 0;
                        } else {
                            thirdEdge = Float.parseFloat(String.valueOf(editText4.getText().toString()));
                        }

                        area = (float) (firstEdge * secondEdge * thirdEdge);

                        textView.setText(String.valueOf(area));
                        break;
                    case R.id.imageButton15:
                        finish();
                        break;
                }
            }
        } ;

        button.setOnClickListener(onClickListener);
        imageButtonBack.setOnClickListener(onClickListener);
    }
}
