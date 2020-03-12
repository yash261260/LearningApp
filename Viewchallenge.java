package com.example.codelearn;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Viewchallenge extends Activity {
	
	String n;
	Button chphp,chmalay,chrahul;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewchallenge);
        
        n=getIntent().getExtras().getString("name");
        
        
        Mysqlhelper helper=new Mysqlhelper(Viewchallenge.this);
    	
    	final SQLiteDatabase db=helper.getWritableDatabase();
        
    	chphp=(Button) findViewById(R.id.btnchphp);
    	chmalay=(Button) findViewById(R.id.btnchajava);
    	chrahul=(Button) findViewById(R.id.btnchCplus);
    	
    	chphp.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Viewchallenge.this,Anschallenge.class);
				i.putExtra("name",n);
				i.putExtra("chall_name", "anis");
				startActivity(i);
			}
		});
//chphp=(Button) findViewById(R.id.btnchphp);
    	
    	chmalay.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Viewchallenge.this,Anschallenge.class);
				i.putExtra("name",n);
				i.putExtra("chall_name", "malay");
				startActivity(i);
			}
		});
//chphp=(Button) findViewById(R.id.btnchphp);
    	
    	chrahul.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Viewchallenge.this,Anschallenge.class);
				i.putExtra("name",n);
				i.putExtra("chall_name", "rushi");
				startActivity(i);
			}
		});
	}

}
