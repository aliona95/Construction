package com.example.construction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class CircleAreaActivity extends AppCompatActivity {

    EditText editText2;
    float firstEdge;
    float area;
    Button button;
    TextView textView;

    ImageButton imageButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_area);

        editText2 = (EditText) findViewById(R.id.editText2);
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

                        area = (float) (firstEdge * 3.1415);

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
