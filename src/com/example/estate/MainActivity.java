package com.example.estate;





import android.R.color;
import android.app.Activity;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends Activity implements OnClickListener{
	
	Button btnterjemah;
	Button btnprofil;
	Button btnbuka;
	
	
	    
	    
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		
		// Buttons
		btnterjemah = (Button) findViewById(R.id.btnterjemah );
		btnprofil = (Button) findViewById(R.id.btnprofil);
		btnbuka = (Button) findViewById(R.id.btnbuka);
		
				
		btnterjemah.setOnClickListener(this);
		btnprofil.setOnClickListener(this);
		btnbuka.setOnClickListener(this);
		
		btnterjemah.setTextColor(Color.WHITE);
		
		btnprofil.setTextColor(Color.WHITE);
		
		btnbuka.setTextColor(Color.WHITE);
		
		
	}
		
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btnterjemah:
			Intent a = new Intent(this, Terjemah.class);
			startActivity(a);
			break;
		case R.id.btnprofil:
				Intent b = new Intent(this, Profil.class);
				startActivity(b);
			break;
		case R.id.btnbuka:
			Intent c = new Intent(this, Test.class);
			startActivity(c);
		break;
		
			

		
		}


	}
	public void onBackPressed()
	{
		new android.app.AlertDialog.Builder(this)
        .setMessage("keluar aplikasi?")
        .setCancelable(false)
        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
            	finish();
                  System.exit(0);
            }
        })
        .setNegativeButton("tidak", null)
        .show();
	
	
	}
	
}
