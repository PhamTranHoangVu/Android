package com.example.pheptinh;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.view.View.OnClickListener;
import java.text.DecimalFormat;
public class MainActivity extends Activity {

	EditText editA,editB,editKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       editA=(EditText)findViewById(R.id.editA);
       editB=(EditText)findViewById(R.id.editB);
       editKQ =(EditText)findViewById(R.id.editKQ);
       Button btn =(Button) findViewById(R.id.button1);
       btn.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			RadioButton raCong =(RadioButton) findViewById(R.id.raCong);
			RadioButton raTru =(RadioButton) findViewById(R.id.raTru);
			RadioButton raNhan =(RadioButton) findViewById(R.id.raNhan);
			RadioButton raChia =(RadioButton) findViewById(R.id.raChia);
			int a= Integer.parseInt(editA.getText().toString());
			int b=Integer.parseInt(editB.getText().toString());
			if(raCong.isChecked())
			{
				editKQ.setText( (a+b)+"");
			}
			if(raTru.isChecked())
			{
				editKQ.setText( (a-b)+"");
			}
			if(raNhan.isChecked())
			{
				editKQ.setText( (a*b)+"");
			}
			if(raChia.isChecked())
			{
				DecimalFormat dcf=new DecimalFormat("#.0");
				editKQ.setText( dcf.format((a/b)));
			}
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
