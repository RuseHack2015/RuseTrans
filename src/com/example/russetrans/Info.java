package com.example.russetrans;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Info extends Activity implements OnClickListener {

	private Button line_2;
	private Button line_9;
	private Button line_13;
	private Button line_21;
	private Button line_24;
	private Button line_25;
	private Button line_27;
	private Button line_29;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_info);

		line_2 = (Button) findViewById(R.id.button2);
		line_2.setOnClickListener((OnClickListener) this);

		line_9 = (Button) findViewById(R.id.button9);
		line_9.setOnClickListener((OnClickListener) this);

		line_13 = (Button) findViewById(R.id.button13);
		line_13.setOnClickListener((OnClickListener) this);

		line_21 = (Button) findViewById(R.id.button21);
		line_21.setOnClickListener((OnClickListener) this);

		line_24 = (Button) findViewById(R.id.button24);
		line_24.setOnClickListener((OnClickListener) this);

		line_25 = (Button) findViewById(R.id.button25);
		line_25.setOnClickListener((OnClickListener) this);

		line_27 = (Button) findViewById(R.id.button27);
		line_27.setOnClickListener((OnClickListener) this);

		line_29 = (Button) findViewById(R.id.button29);
		line_29.setOnClickListener((OnClickListener) this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (v.equals(line_2)) {
			
			Intent in = new Intent(Info.this,ClickPoint.class);
startActivity(in);		
			
			
		}

		if (v.equals(line_9)) {

		}

		if (v.equals(line_13)) {

		}

		if (v.equals(line_21)) {

		}

		if (v.equals(line_24)) {

		}
		
		if (v.equals(line_25)) {

		}
		
		if (v.equals(line_27)) {

		}

		if (v.equals(line_29)) {

		}

	}
}
