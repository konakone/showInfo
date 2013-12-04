package com.example.showinfo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//端末の電話番号情報を管理するオブジェクトコール
		TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
		
		//電話番号
		String number = tm.getLine1Number();
		
		//TextViewに取得した電話番号を設定
		TextView tv = (TextView)findViewById(R.id.lineNumber);
		tv.setText(number);
		
	}
}
