
package com.techversat.ledimanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import android.app.Activity;
import android.app.ProgressDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class DeviceSelection extends Activity {

	class Receiver extends BroadcastReceiver {
		@Override
		public void onReceive(Context context, Intent intent) {
			
			if (intent.getAction().equals(BluetoothAdapter.ACTION_DISCOVERY_FINISHED)) {
				Log.d(LEDIActivity.TAG, "discovery finished");
				
				pdWait.dismiss();
				
				if (list.size() == 0) {
					sendToast("No watch found");
					finish();
				}
			}
			
			if (intent.getAction().equals(BluetoothDevice.ACTION_FOUND)) {
				Log.d(LEDIActivity.TAG, "device found");
				
				BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
				
				if (device.getBondState() == BluetoothDevice.BOND_BONDED)
					return;
				
				String deviceName = device.getName();
				String deviceMac = device.getAddress();
				
				//int cl = device.getBluetoothClass().getMajorDeviceClass();
				//Log.d(LEDIActivity.TAG, "device class: " + cl);
				
				addToList(deviceMac, deviceName);
			}
		}
	}
	
	ProgressDialog pdWait = null;
	
	Receiver receiver;
	Context context;
	ListView listView;
	//static ArrayList<String> menuList = new ArrayList<String>();
	List<Map<String, String>> list = new ArrayList<Map<String, String>>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		context = this;
		
		pdWait = ProgressDialog.show(this, "Please wait", "Searching Bluetooth devices...");
		pdWait.setCancelable(true);
		pdWait.setOnCancelListener(new OnCancelListener() {			
			public void onCancel(DialogInterface dialog) {
				Log.d(LEDIActivity.TAG, "canceled");
				if (LEDIService.bluetoothAdapter.isDiscovering())
					LEDIService.bluetoothAdapter.cancelDiscovery();
				finish();								
			}
		});
		pdWait.show();
		
		setContentView(R.layout.device_selection);
		//constructMenuList();
		listView = (ListView) findViewById(android.R.id.list);
		//listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menuList));
		
		listView.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				Log.d(LEDIActivity.TAG, "device selected: " + arg2);
				
				Map<String, String> map = list.get(arg2);
				String mac = map.get("mac");
				
				Log.d(LEDIActivity.TAG, "mac selected: " + mac);
				
				LEDIService.Preferences.watchMacAddress = mac;
				LEDIService.saveMac(context, mac);
				
				sendToast("Selected watch set");
			
				finish();
			} 
			
		});
		
		if (LEDIService.bluetoothAdapter == null)
			LEDIService.bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
		
		Set<BluetoothDevice> pairedDevices = LEDIService.bluetoothAdapter.getBondedDevices();
		if (pairedDevices.size() > 0) {
		    for (BluetoothDevice device : pairedDevices) {
		        addToList(device.getAddress(), device.getName());
		    }
		}
		
		receiver = new Receiver();
		IntentFilter intentFilter = new IntentFilter(BluetoothAdapter.ACTION_DISCOVERY_FINISHED);
		intentFilter.addAction(BluetoothDevice.ACTION_FOUND);
		
		registerReceiver(receiver, intentFilter);
		
		LEDIService.bluetoothAdapter.startDiscovery();	
	}
	
	void addToList(String mac, String name) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("mac", mac);
		map.put("name", name);
		list.add(map);
		//menuList.add(mac);
		displayList();
	}
	
	void displayList() {	
		//listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menuList));
		listView.setAdapter(new SimpleAdapter(this, list, R.layout.list_item, new String[] { "name", "mac"}, new int[] { R.id.text1, R.id.text2} ));
	}
	
	public void sendToast(String text) {
		Message m = new Message();
		m.what = 1;
		m.obj = text;
		messageHandler.sendMessage(m);
	}

	private Handler messageHandler = new Handler() {

		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case 1:
				Toast.makeText(context, (CharSequence) msg.obj, Toast.LENGTH_SHORT).show();
				break;
			}
		}
	};
 

	@Override
	protected void onDestroy() {	
		Log.i(LEDIActivity.TAG, "unregistering receiver");
		unregisterReceiver(receiver);
		super.onDestroy();
	}


}
