package com.example.codelearn;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Createchallenge extends Activity {
	
	String n ;
	Button chphp;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createchallenge);
        
        chphp=(Button) findViewById(R.id.btnchallengephp);
        
        n =getIntent().getExtras().getString("name");
        
        
        Mysqlhelper helper=new Mysqlhelper(Createchallenge.this);
    	
    	final SQLiteDatabase db=helper.getWritableDatabase();
    	
    	chphp.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Createchallenge.this,Phpchallenge.class);
				i.putExtra("name",n);
				startActivity(i);
			}
		});
    	
        
	}

}
