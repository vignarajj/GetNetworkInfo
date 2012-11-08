package com.vjj.networkinfoapp;

import android.net.ConnectivityManager;
import android.net.NetworkInfo.State;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ConnectivityManager connection=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
    	final State mobile=connection.getNetworkInfo(0).getState();
    	final State wifi=connection.getNetworkInfo(1).getState();
    	TextView status=(TextView)findViewById(R.id.status);
    	TextView type=(TextView)findViewById(R.id.networktype);
    	status.setText("EDGE or 3G :"+mobile.toString()+"\n"+"WIFI :"+wifi.toString());
    	type.setText("EDGE or 3G :"+connection.getNetworkInfo(0).toString()+"\n"+"WIFI :"+connection.getNetworkInfo(1).toString());
    }
}
