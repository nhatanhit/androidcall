package com.example.androidcall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class OutgoingCallInterceptor extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		final String oldNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
		String msg = "Intercepted outgoing call. Old number " + oldNumber;
		Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
	}

}
