package com.pahutan.ronaldo.pahutanronaldolabact5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITH", "OnCreate is Running...");
        Intent i = new Intent(this,MyService.class);
        startService(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITH", "OnStart is Running...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITH", "OnResume is Running...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITH", "OnStop is Running...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITH", "OnPause is Running...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITH", "OnRestart is Running...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITH", "OnDestroy is Running...");
    }

    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.btnActivity2){
            i = new Intent(this,Activity2.class);
            startActivity(i);
        }else if(v.getId() == R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:11.0871571,119.3891548,15z"));
            chooser = Intent.createChooser(i,"Select preferred map application.");
            startActivity(chooser);
        }
    }
}
