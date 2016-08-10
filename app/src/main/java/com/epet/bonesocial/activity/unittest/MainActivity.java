package com.epet.bonesocial.activity.unittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	private EditText mEditText;
	private TextView mTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mTextView = (TextView) findViewById(R.id.textView);
		mEditText = (EditText) findViewById(R.id.editText);
		Toast.makeText(MainActivity.this,"我已经被提交上去了",Toast.LENGTH_SHORT);
	}

	public void sayHello(View view) {
		mTextView.setText("Hello, "+mEditText.getText().toString()+"!");
		Toast.makeText(MainActivity.this, "This is uncommitted change", Toast.LENGTH_SHORT).show();
	}

}
