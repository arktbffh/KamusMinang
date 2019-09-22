package com.example.estate;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class Profil extends Activity {
	 
	Button btnkembali;

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentang);

		btnkembali = (Button) findViewById(R.id.btnkembali);

		
		btnkembali.setOnClickListener(new View.OnClickListener() {

			
			@Override
			public void onClick(View view) {
				finish();
				Intent i = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(i);
			}
		});
	}
}
