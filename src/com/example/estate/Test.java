package com.example.estate;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;

public class Test extends Activity {
	 
	Button btnkembali;
	TextView teks;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pembukaan);

		btnkembali = (Button) findViewById(R.id.btnkembali);

		teks = (TextView) findViewById(R.id.teks);
		teks.setTextColor(Color.BLACK);
		teks.setMovementMethod(new ScrollingMovementMethod());
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
