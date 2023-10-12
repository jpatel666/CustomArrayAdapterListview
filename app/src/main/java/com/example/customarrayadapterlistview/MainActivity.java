package com.example.customarrayadapterlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String appname[] ={"Amazon","Amazon Prime","Facebook Lite","Instagram","Messenger","Netflix","Pinterest","Snapchat","Spotify","Telegram","Tiktok","Whatsapp Messenger","Zoom","Amazon","Amazon Prime","Facebook Lite","Instagram","Messenger","Netflix","Pinterest","Snapchat","Spotify","Telegram","Tiktok","Whatsapp Messenger","Zoom","Amazon","Amazon Prime","Facebook Lite","Instagram","Messenger","Netflix","Pinterest","Snapchat","Spotify","Telegram","Tiktok","Whatsapp Messenger","Zoom","Amazon","Amazon Prime","Facebook Lite","Instagram","Messenger","Netflix","Pinterest","Snapchat","Spotify","Telegram","Tiktok","Whatsapp Messenger","Zoom"};
    int appicon[] = {R.drawable.amazon,R.drawable.amazonprime,R.drawable.facebooklite,R.drawable.instagram,R.drawable.messenger,R.drawable.netflix,R.drawable.pinterest,R.drawable.snapchat,R.drawable.spotify,R.drawable.telegram,R.drawable.tiktok,R.drawable.whatsappmessenger,R.drawable.zoom,R.drawable.amazon,R.drawable.amazonprime,R.drawable.facebooklite,R.drawable.instagram,R.drawable.messenger,R.drawable.netflix,R.drawable.pinterest,R.drawable.snapchat,R.drawable.spotify,R.drawable.telegram,R.drawable.tiktok,R.drawable.whatsappmessenger,R.drawable.zoom,R.drawable.amazon,R.drawable.amazonprime,R.drawable.facebooklite,R.drawable.instagram,R.drawable.messenger,R.drawable.netflix,R.drawable.pinterest,R.drawable.snapchat,R.drawable.spotify,R.drawable.telegram,R.drawable.tiktok,R.drawable.whatsappmessenger,R.drawable.zoom,R.drawable.amazon,R.drawable.amazonprime,R.drawable.facebooklite,R.drawable.instagram,R.drawable.messenger,R.drawable.netflix,R.drawable.pinterest,R.drawable.snapchat,R.drawable.spotify,R.drawable.telegram,R.drawable.tiktok,R.drawable.whatsappmessenger,R.drawable.zoom};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        AppAdapter appAdapter = new AppAdapter(MainActivity.this,appname,appicon);  //Alt+Enter
        listView.setAdapter(appAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, appname[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}