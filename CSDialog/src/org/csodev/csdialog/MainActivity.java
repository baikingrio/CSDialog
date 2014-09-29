package org.csodev.csdialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	 @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		/**
		 * 1��progress dialog
		 */
		CSProgressDialog csDialog = new CSProgressDialog(this);
		csDialog.setCancelable(true);//�����ؼ��Ƿ�ر�
		csDialog.show();
		csDialog.dismiss();
		
		/**
		 * 2������һ����ť��dialog
		 */
		CSOKDialog.createBuilder(this).setMsg("����һ����Ϣ").show();
		
		/**
		 * 3:������ť��diallog
		 */
		final CSOKCancelDialog okCancelDialog = CSOKCancelDialog.createBuilder(this).setMsg("����һ����Ϣ");
		okCancelDialog.setOKOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				okCancelDialog.dismiss();
				//TODO...
			}
		});
		okCancelDialog.show();
		
	}

}
