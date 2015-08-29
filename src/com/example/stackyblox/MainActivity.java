package com.example.stackyblox;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button = (Button) findViewById(R.id.start);
		button.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		        // Do something in response to button click
				Intent intentGame = new Intent(MainActivity.this, GameScreen.class);
				startActivity(intentGame);
		    }
		});
		Button button2 = (Button) findViewById(R.id.settings);
		button2.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		        // Do something in response to button click
		    }
		});
		Button button3 = (Button) findViewById(R.id.extras);
		button3.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		        // Do something in response to button click
		    }
		});
		
		
	}
}
