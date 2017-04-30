package com.example.example1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView    txtCount;
	RadioButton rBtnUp, rBtnDown;
	Button      btnCount; 
	int count = 0; // count
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rBtnUp   = (RadioButton) findViewById(R.id.rBtnUpId);
        rBtnDown = (RadioButton) findViewById(R.id.rBtnDownId);
        txtCount = (TextView)    findViewById(R.id.txtCountId);
        txtCount.setText(String.valueOf(count)); // Display initial count
   
        btnCount = (Button) findViewById(R.id.btnCountId);
        // Process the button on-click event via an anonymous inner class
        btnCount.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
              if (rBtnUp.isChecked()) { // Counting up
                 count++;
              } else if (rBtnDown.isChecked()) { // Counting down
                 count--;
              }
              txtCount.setText(String.valueOf(count));
           }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
