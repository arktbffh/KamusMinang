package com.example.estate;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class Pembuka extends Activity {


	Button btnkembali;
	
TextView teks;
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pembukaan);

		

		
		btnkembali = (Button) findViewById(R.id.btnkembali);
		
		
	
		
		btnkembali.setOnClickListener(new View.OnClickListener() {

			
			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(i);
				
			}
		});
		finish();
	}

	

	
}
