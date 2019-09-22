package com.example.estate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.os.Bundle;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;

import com.example.estate.DB;


import android.widget.SimpleCursorAdapter;


public class Terjemah extends Activity implements OnClickListener {
	private SQLiteDatabase database=null;
	 String cari;
	 protected ListAdapter adapter;
	 ListView lvCustomList;
	  private Cursor kamuskursor=null;
	Button terjemah;
	TextView hasil;
     EditText inputkamus;
     private SQLiteDatabase db = null;
 	private Cursor kamusCursor = null;
 	private EditText txtIndonesia;
 	private EditText txtInggris;
 	private EditText txtKeterangan;
 	private DB datakamus = null;
 	public static final String INDONESIA = "indonesia";
 	public static final String MINANG = "minang";
 Button btnkembali2;

	


	    
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.terjemahan);
		
		
		datakamus = new DB(this);
		db = datakamus.getWritableDatabase();
		datakamus.createTable(db);
		datakamus.generateData(db);

		
		
        btnkembali2=(Button)findViewById(R.id.btnkembali2);
		terjemah = (Button) findViewById(R.id.btnterjemah );
		inputkamus = (EditText) findViewById(R.id.inputkamus );
		hasil=(TextView) findViewById(R.id.hasil);
hasil.setTextColor(Color.BLACK);


inputkamus.setTextColor(Color.BLACK);

btnkembali2.setOnClickListener(this);
		terjemah.setOnClickListener(new View.OnClickListener() {
		
			
		
		@Override
public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btnterjemah:
				terjemahkan();
				break;
			
			}
		}
		public Pattern ber = Pattern.compile(
			    "ber",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern o = Pattern.compile(
			    "a",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern ing = Pattern.compile(
			    "ing",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern as = Pattern.compile(
			    "as",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern up = Pattern.compile(
			    "up",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern ur = Pattern.compile(
			    "ur",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern ar = Pattern.compile(
			    "ar",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern al = Pattern.compile(
			    "al",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern ung = Pattern.compile(
			    "ung",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern at = Pattern.compile(
			    "at",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern ut = Pattern.compile(
			    "ut",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern is = Pattern.compile(
			    "is",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern ih = Pattern.compile(
			    "ih",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern ap = Pattern.compile(
			    "ap",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern it = Pattern.compile(
			    "it",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern us = Pattern.compile(
			    "us",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern ir = Pattern.compile(
			    "ir",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern uh = Pattern.compile(
			    "uh",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern ben = Pattern.compile(
			    "ben",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern cer = Pattern.compile(
			    "cer",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern de = Pattern.compile(
			    "de",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern ge = Pattern.compile(
			    "ge",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern he = Pattern.compile(
			    "he",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern te = Pattern.compile(
			    "te",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern re = Pattern.compile(
			    "re",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern pe = Pattern.compile(
			    "pe",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern le = Pattern.compile(
			    "le",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern je = Pattern.compile(
			    "je",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern se = Pattern.compile(
			    "se",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern me = Pattern.compile(
			    "me",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern ke = Pattern.compile(
			    "ke",
			    Pattern.CASE_INSENSITIVE
			  );
		private Pattern e = Pattern.compile(
			    "e",
			    Pattern.CASE_INSENSITIVE
			  );
		
		
		
	private void terjemahkan() {
	
		String result = "";
		String result2 = "";
		
		String minang = inputkamus.getText().toString();
		kamusCursor = db.rawQuery("SELECT ID, INDONESIA, MINANG "
				+ "FROM kamus where INDONESIA='" + minang
				+ "' ORDER BY INDONESIA", null);

		if (kamusCursor.moveToFirst()) {
			result = kamusCursor.getString(2);
			for (; !kamusCursor.isAfterLast(); kamusCursor.moveToNext()) {
				result = kamusCursor.getString(2);
			}
		}

		if (result.equals("")) {
							
				String ubah=inputkamus.getText().toString();
				String ubah2=inputkamus.getText().toString();
				String ubah3=inputkamus.getText().toString();
				Matcher matcher = ber.matcher(ubah);
				Matcher matchero = o.matcher(ubah);
				Matcher matchering = ing.matcher(ubah);
				Matcher matcherung = ung.matcher(ubah);
				Matcher matcheras = as.matcher(ubah);
				Matcher matcherup = up.matcher(ubah);
				Matcher matcherur = ur.matcher(ubah);
				Matcher matcherar = ar.matcher(ubah);
				Matcher matcheral = al.matcher(ubah);
				Matcher matcherat = at.matcher(ubah);
				Matcher matcherut = ut.matcher(ubah);
				Matcher matcherus = us.matcher(ubah);
				Matcher matcherir = ir.matcher(ubah);
				Matcher matcherit = it.matcher(ubah);
				Matcher matcherap = ap.matcher(ubah);
				Matcher matcheris = is.matcher(ubah);
				Matcher matcherih = ih.matcher(ubah);
				Matcher matcheruh = uh.matcher(ubah);
				Matcher matcherben = ben.matcher(ubah);
				Matcher matchercer = cer.matcher(ubah);
				Matcher matchere = e.matcher(ubah);
				Matcher matcherde = de.matcher(ubah);
				Matcher matcherge = ge.matcher(ubah);
				Matcher matcherke = ke.matcher(ubah);
				Matcher matcherhe = he.matcher(ubah);
				Matcher matcherse = se.matcher(ubah);
				Matcher matcherje = je.matcher(ubah);
				Matcher matcherme = me.matcher(ubah);
				Matcher matcherpe = pe.matcher(ubah);
				Matcher matcherre = re.matcher(ubah);
				Matcher matchele = le.matcher(ubah);
				Matcher matcherte = te.matcher(ubah);
         		int ukuran = ubah.length();	
         		
         		StringBuilder ebuffer = new StringBuilder(ubah);
         		ebuffer.setCharAt(1, 'a');
         		ubah=ebuffer.toString();
 			   hasil.setText(ebuffer);
         		
		
		
		if (ubah.endsWith("a")){
				
				while (matchero.find()){
 			
//			int ukuran=ubah.length();
		
    	
    	char replaceWith='o';
    	StringBuffer aBuffer =new StringBuffer(ubah);
    	aBuffer.setCharAt(ukuran-1, replaceWith);
 	 ubah=aBuffer.toString();
			   hasil.setText(aBuffer); 
				}
				
				 }else{
					hasil.setText(ubah);
		}
		if (ubah.endsWith("ing")){
			
			while (matchering.find()){
				ubah = ubah.replace("ing", "iang");	       			 

				   hasil.setText(ubah);
		 
			}
			
			 }else{
				hasil.setText(ubah);
		 }
				if (ubah.endsWith("as")){
					
					while (matcheras.find()){
						ubah = ubah.replace("as", "eh");	       			 

						   hasil.setText(ubah);
				 
					}
					
					 }else{
						hasil.setText(ubah);
					 
}
if (ubah.endsWith("is")){
					
					while (matcheris.find()){
						ubah = ubah.replace("is", "ih");	       			 

						   hasil.setText(ubah);
				 
					}
					
					 }else{
						hasil.setText(ubah);
					 
}
if (ubah.endsWith("ih")){
	
	while (matcherih.find()){
		ubah = ubah.replace("ih", "iah");	       			 

		   hasil.setText(ubah);
 
	}
	
	 }else{
		hasil.setText(ubah);
	 
}
if (ubah.startsWith("ben")){
	
	while (matcherben.find()){
		ubah = ubah.replaceFirst("ben", "ban");	       			 

		   hasil.setText(ubah);
 
	}
	
	 }else{
		hasil.setText(ubah);
	 
}
if (ubah.endsWith("ap")){
	
	while (matcherap.find()){
		ubah = ubah.replace("ap", "ok");	       			 

		   hasil.setText(ubah);
 
	}
	
	 }else{
		hasil.setText(ubah);
	 
}
if (ubah.endsWith("ir")){
	
	while (matcherir.find()){
		ubah = ubah.replace("ir", "ia");	       			 

		   hasil.setText(ubah);
 
	}
	
	 }else{
		hasil.setText(ubah);
	 
}
if (ubah.endsWith("it")){
	
	while (matcherit.find()){
		ubah = ubah.replace("it", "ik");	       			 

		   hasil.setText(ubah);
 
	}
	
	 }else{
		hasil.setText(ubah);
	 
}
if (ubah.endsWith("us")){
	
	while (matcherus.find()){
		ubah = ubah.replace("us", "uih");	       			 

		   hasil.setText(ubah);
 
	}
	
	 }else{
		hasil.setText(ubah);
	 
}
if (ubah.endsWith("uh")){
	
	while (matcheruh.find()){
		ubah = ubah.replace("uh", "uah");	       			 

		   hasil.setText(ubah);
 
	}
	
	 }else{
		hasil.setText(ubah);
	 
}
if (ubah.endsWith("ut")){
	
	while (matcherut.find()){
		ubah = ubah.replace("ut", "uik");	       			 

		   hasil.setText(ubah);
 
	}
	
	 }else{
		hasil.setText(ubah);
	 
}
if (ubah.endsWith("up")){
					
					while (matcherup.find()){
						ubah = ubah.replace("up", "uik");	       			 

						   hasil.setText(ubah);
				 
					}
					
					 }else{
						hasil.setText(ubah);
					 }
if (ubah.endsWith("at")){
							
							while (matcherat.find()){
								ubah = ubah.replace("at", "ek");	       			 

								   hasil.setText(ubah);
						 
							}
							
							 }else{
								hasil.setText(ubah);
					 
}
if (ubah.endsWith("ut")){
	
	while (matcherut.find()){
		ubah = ubah.replace("ut", "uik");	       			 

		   hasil.setText(ubah);
	}
	
	 }else{
		hasil.setText(ubah);
	 }
if (ubah.endsWith("ur")){
	
	while (matcherur.find()){
	ubah = ubah.replace("ur", "ua");	       			 

	   hasil.setText(ubah);
 
	}

 }else{
	hasil.setText(ubah);
 
}		if (ubah.endsWith("ar")){
	
	while (matcherar.find()){
	ubah = ubah.replace("ar", "a");	       			 

	   hasil.setText(ubah);
 
	}

 }else{
	hasil.setText(ubah);
 
}	
	if (ubah.endsWith("g")){
		
		while (matcherung.find()){
			ubah= ubah.replace("ung", "uang");	       			 

			   hasil.setText(ubah);
		}

	 }else{
		hasil.setText(ubah);	 	 
}							
	
	if (ubah.endsWith("al")){
		while (matcheral.find()){
		ubah = ubah.replace("al", "a");	       			 
		   hasil.setText(ubah);
		}
	}else{
		hasil.setText(ubah);

	}
	if (ubah.startsWith("cer")){
		while (matchercer.find()){
		ubah = ubah.replace("cer", "car");	       			 
		   hasil.setText(ubah);
		}
	}else{
		hasil.setText(ubah);

	}
	if (ubah.startsWith("de")){
		while (matcherde.find()){
		ubah = ubah.replace("de", "da");	       			 
		   hasil.setText(ubah);
		}
	}else{
		hasil.setText(ubah);

	}
	if (ubah.startsWith("ge")){
		while (matcherge.find()){
		ubah = ubah.replace("ge", "ga");	       			 
		   hasil.setText(ubah);
		}
	}else{
		hasil.setText(ubah);

	}
	if (ubah.startsWith("ke")){
		while (matcherke.find()){
		ubah = ubah.replace("ke", "ka");	       			 
		   hasil.setText(ubah);
		}
	}else{
		hasil.setText(ubah);

	}
	if (ubah.startsWith("te")){
		while (matcherte.find()){
		ubah = ubah.replace("te", "ta");	       			 
		   hasil.setText(ubah);
		}
	}else{
		hasil.setText(ubah);

	}
	if (ubah.startsWith("pe")){
		while (matcherpe.find()){
		ubah = ubah.replace("pe", "pa");	       			 
		   hasil.setText(ubah);
		}
	}else{
		hasil.setText(ubah);

	}
	if (ubah.startsWith("he")){
		while (matcherhe.find()){
		ubah = ubah.replace("he", "ha");	       			 
		   hasil.setText(ubah);
		}
	}else{
		hasil.setText(ubah);

	}
	if (ubah.startsWith("se")){
		while (matcherse.find()){
		ubah = ubah.replace("se", "sa");	       			 
		   hasil.setText(ubah);
		}
	}else{
		hasil.setText(ubah);

	}
	if (ubah.startsWith("le")){
		while (matchele.find()){
		ubah = ubah.replace("le", "la");	       			 
		   hasil.setText(ubah);
		}
	}else{
		hasil.setText(ubah);

	}
	if (ubah.startsWith("me")){
		while (matcherme.find()){
		ubah = ubah.replace("me", "ma");	       			 
		   hasil.setText(ubah);
		}
	}else{
		hasil.setText(ubah);

	}
//	if (ubah.startsWith("je")){
//		while (matcherje.find()){
//		ubah = ubah.replace("je", "ja");	       			 
//		   hasil.setText(ubah);
//		}
//	}else{
//		hasil.setText(ubah);
//
//	}
	if (ubah.startsWith("re")){
		while (matcherre.find()){
		ubah = ubah.replace("re", "ra");	       			 
		   hasil.setText(ubah);
		}
	}else{
		hasil.setText(ubah);

	}
	
	 }else{
				hasil.setText(result);
			}
	}
		}
		);}





	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnkembali2:
			Intent a = new Intent(getApplicationContext(), MainActivity.class);
			startActivity(a);
			finish();
			break;
			
		
	}
	}

}
//	            	String ubah = inputkamus.getText().toString();
//	            	int ukuran=ubah.length();
//	            	String akhiran=ubah.substring(ukuran-1);
//	            	char akhirana='a';
//	            	 char replaceWith='o';
//	                Matcher matcher = fINITIAL_A.matcher(ubah);
//	                Matcher matchero = fINITIAL_o.matcher(ubah);
//	                if (ubah.equals(akhirana)){
//	        
//	         			StringBuffer aBuffer = new StringBuffer(ubah);
//	         			 aBuffer.setCharAt(ukuran-1, replaceWith);
//	         			 ubah=aBuffer.toString();
//	                	}else {
//	                		return ;
//	                	}
//	         		if (matcher.find()){
//	                 			
//	       			 ubah = ubah.replaceFirst("ber", "ba");	       			 
//	       			 hasil.setText(ubah);
//	        			
//	                }else{
//	                	hasil.setText(ubah);
//	                }
//	            } 
//	           
//	            }
//}

//	 private void MachinetranslatorO(){
//		 
//		 char replaceWith='o';
//			
//		 String ubah=inputkamus.getText().toString();
//		 int ukuran=ubah.length();
//		 String ubah2 = ubah.replaceFirst("ber", "ba");
//			StringBuffer aBuffer = new StringBuffer(ubah2);
//			 aBuffer.setCharAt(ukuran-1, replaceWith);
//			 hasil.setText(aBuffer);
//			
//				 
//			
//				 
//	 } ;}
//			 
//	         );   
//	}




//
//	@Override
//	public void onClick(View v) {
//		// TODO Auto-generated method stub
//		
//	}
//	}
		

