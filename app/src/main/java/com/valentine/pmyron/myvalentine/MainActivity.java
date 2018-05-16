package com.valentine.pmyron.myvalentine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void postMessage(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        ArrayList<String> phrases = new ArrayList<String>();
        phrases.add("You are the Moira to my Johnny Rose");
        phrases.add("You are my favorite person");
        phrases.add("I just like to be near you");
        phrases.add("I freakin love you");
        phrases.add("Thank you for being such a good wife and mom");
        phrases.add("You are a sexy beast");
        phrases.add("I think you're cute");
        phrases.add("I feel happy when I think about you");
        phrases.add("We make such a good team together");
        phrases.add("Everyone just kinda seems to like you");
        phrases.add("You make any room brighter just by walking in");
        phrases.add("I'm the luckiest dude because you're my valentine");
        phrases.add("You look nice today");
        phrases.add("You have a gorgeous smile");
        phrases.add("You're super hot");

        String message = phrases.get(new Random().nextInt(phrases.size()));
//        intent.putExtra(Intent.EXTRA_TEXT, message);
        intent.putExtra("message", message);
        Log.e("valentine main", "message: " + message);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}
