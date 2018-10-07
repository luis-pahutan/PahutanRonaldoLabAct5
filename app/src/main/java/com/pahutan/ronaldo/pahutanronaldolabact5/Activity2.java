package com.pahutan.ronaldo.pahutanronaldolabact5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Activity2 extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
    }

    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.btnActivity1){
            i = new Intent(this,MainActivity.class);
            startActivity(i);
        }else if(v.getId() == R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:2.8823567,73.5722208,17z"));
            chooser = Intent.createChooser(i,"Select preferred map application.");
            startActivity(chooser);
        }
    }
}
