package com.valentine.pmyron.myvalentine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = findViewById(R.id.textView2);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if(b!=null)
        {
            String message =(String) b.get("message");
            Log.e("valentine 2nd act", "message: " + message);

            // Capture the layout's TextView and set the string as its text
            textView.setText(message);
        }

    }
}
