package com.techversat.ledimanager;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.util.Log;

// import org.techversat.ledimanager.R;
import com.techversat.ledimanager.LEDIService;
import com.techversat.ledimanager.Protocol;
import com.techversat.ledimanager.Settings;
// import org.techversat.ledimanager.Test;
import com.techversat.ledimanager.Utils;
import com.techversat.ledimanager.DeviceSelection;
// import com.techversat.ledimanager.LEDIService.Preferences;
import com.techversat.ledimanager.LEDIService.ConnectionState;
import com.techversat.lediview.VirtualLEDIActivity;


public class LEDIActivity extends Activity {

	public static final String TAG = "LEDI";
	Context context;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		context = this;
		setContentView(R.layout.activity_main);
		setTitle(getString(R.string.app_name));
		Log.i(TAG, "onCreate");
	}

	public void startSearchActivity(View view) {
	    Intent intent = new Intent(this, DeviceSelection.class);
	    startActivity(intent);
	}
	
	public void startLEDIService(View view) {
		TextView tv = (TextView) findViewById(R.id.textView1);
		tv.setText("running LEDI Service");
		startService();
	}
	
	public void startVirtualLEDIActivity(View view) {
		Intent intent = new Intent(this, VirtualLEDIActivity.class);
	    startActivity(intent);
	}
	
	public void stopLEDIService(View view) {
		stopService();
		TextView tv = (TextView) findViewById(R.id.textView1);
		tv.setText("stopped LEDI Service");
	}
	
	public void setLEDITime(View view)
	{
		TextView tv = (TextView) findViewById(R.id.textView1);
		if(LEDIService.connectionState != ConnectionState.CONNECTED)
		{
			tv.setText("Cannot set time. Please establish connection first");
			return;
		}
		tv.setText("setting Time");
		Protocol.sendRtcNow(this);
	}
	
	public void sendLEDIText(View view)
	{
		EditText editText = (EditText) findViewById(R.id.editText1);
		String message = editText.getText().toString();
		Protocol.sendText(this, message);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	protected void onStart() {
		super.onStart();

		LEDIService.loadPreferences(this);
		
		/*
		if (Preferences.idleMusicControls)
			Protocol.enableMediaButtons();
		//else 
			//Protocol.disableMediaButtons();
		
		if (Preferences.idleReplay)
			Protocol.enableReplayButton();
		//else
			//Protocol.disableReplayButton();
		*/
		
		// Protocol.configureMode();
		Log.i(TAG, "onStart");
	}

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
	    case R.id.start:
	    	startService();
	        return true;
	    case R.id.stop:	   
	    	stopService();
	        return true;
	    case R.id.test:
	    	// startActivity(new Intent(this, Test.class));
	        return true;
	    case R.id.settings:	 
	    	startActivity(new Intent(this, Settings.class));
	        return true;  
	    case R.id.about:
	    	showAbout();
	        return true;
	    case R.id.exit:	        
	    	exit();
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
    
	void startService() {
		startService(new Intent(this, LEDIService.class));
	}
	
    void stopService() {
    	stopService(new Intent(this, LEDIService.class));
    }
    
    void exit() {
    	System.exit(0);
    }
    
    void showAbout() {
    	
    	WebView webView = new WebView(this);
		String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" /><title>About</title></head><body>" + 
						"<h1>LEDI</h1>" +
						"<p>Version " + Utils.getVersion(this) + ".</p>" +
						"<p>&copy; Copyright 2012 TechVersat LLC.</p>" +
						"</body></html>";
        webView.loadData(html, "text/html", "utf-8");
        
        new AlertDialog.Builder(this).setView(webView).setCancelable(true).setPositiveButton("OK", new DialogInterface.OnClickListener() {			
			//@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		}).show();        
    }
}
