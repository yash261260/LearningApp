package com.example.codelearn;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class Learn extends Activity {
	
	Button php;
	//TextView tv;
	//String  cont_no;
	String n;
	
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.learn);
	        
    n=getIntent().getExtras().getString("name");
	        
	        
	        Mysqlhelper helper=new Mysqlhelper(Learn.this);
	    	
	    	final SQLiteDatabase db=helper.getWritableDatabase();
	        
	        php=(Button) findViewById(R.id.btnphp);
	        
	        php.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent i=new Intent(Learn.this,Learnon.class);
					i.putExtra("name",n);
					startActivity(i);
					
					
				}
			});
	        
	 }

}

