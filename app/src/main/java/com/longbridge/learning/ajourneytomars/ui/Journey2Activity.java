package com.longbridge.learning.ajourneytomars.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.longbridge.learning.ajourneytomars.R;

public class Journey2Activity extends AppCompatActivity {
    private ImageView pageImageView;
    private TextView pageTextView;
    private Button choice1Button;
    private Button choice2Button;
    private String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey2);
        pageImageView = (ImageView) findViewById(R.id.pageImageView);
        pageTextView = (TextView) findViewById(R.id.pageTextView);
        choice1Button = (Button) findViewById(R.id.choice1Button);
        choice2Button = (Button) findViewById(R.id.choice2Button);
        Intent intent = getIntent();
        name = intent.getStringExtra(getString(R.string.key_name));
        if (name == null || name.isEmpty()){
            name = "friend";
        }
        loadpage(0);


    }

    private void loadpage(int pageNo) {


    }
}
