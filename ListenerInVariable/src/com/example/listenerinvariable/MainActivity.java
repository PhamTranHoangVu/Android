package com.example.listenerinvariable;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.view.View.OnClickListener;
import java.text.DecimalFormat;


public class MainActivity extends Activity {
	private Button btnFar,btnCel,btnClear;
	private EditText txtFar,txtCel;
	private OnClickListener myVarListener =new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			double F; // cần thầy giải thích , vì sao khai báo 2 biến F,C như vậy thì kết quả đúng, còn gán F,C trực tiếp từ control lại sai
			double C; 
			if(arg0 == btnFar)
			{
				F = Double.parseDouble(txtFar.getText()+"");
				DecimalFormat dcf=new DecimalFormat("#.0");
				C = (F-32)*5/9;
				txtCel.setText(dcf.format(C));
			}
			else if(arg0 == btnCel)
			{
				C = Double.parseDouble(txtCel.getText()+"");
				DecimalFormat dcf=new DecimalFormat("#.0");
				F = C*9/5+32;
				txtFar.setText(dcf.format(F));
			}
			else if(arg0 == btnClear)
			{
				txtFar.setText("");
				txtCel.setText("");
				txtFar.requestFocus();
			}
		}
	};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFar = (Button)findViewById(R.id.btnFar);
        btnCel = (Button)findViewById(R.id.btnCel);
        btnClear = (Button)findViewById(R.id.btnClear);
        txtFar = (EditText)findViewById(R.id.editFar);
        txtCel = (EditText)findViewById(R.id.editCel);
        
        btnFar.setOnClickListener(myVarListener);
        btnCel.setOnClickListener(myVarListener);
        btnClear.setOnClickListener(myVarListener);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
