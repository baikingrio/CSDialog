package org.csodev.csdialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	 @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Button btn1 = (Button) this.findViewById(R.id.btn1);
		Button btn2 = (Button) this.findViewById(R.id.btn2);
		Button btn3 = (Button) this.findViewById(R.id.btn3);
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				CSProgressDialog csDialog = new CSProgressDialog(MainActivity.this);
				csDialog.setCancelable(true);//�����ؼ��Ƿ�ر�
				csDialog.show();
			}
		});
		btn2.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View view) {

						CSOKDialog.createBuilder(MainActivity.this).setMsg("����һ����Ϣ").show();
						
					}
				});
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				final CSOKCancelDialog okCancelDialog = CSOKCancelDialog.createBuilder(MainActivity.this).setMsg("����һ����Ϣ");
				okCancelDialog.setOKOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View view) {
						okCancelDialog.dismiss();
						//TODO...
					}
				});
				okCancelDialog.show();
			}
		});
		
	 
		
	}

}
