package com.longbridge.learning.ajourneytomars.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.longbridge.learning.ajourneytomars.R;

public class MainActivity extends AppCompatActivity {
    private EditText nameEditText;
    private Button titleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titleButton = (Button) findViewById(R.id.titleButton);
        nameEditText = (EditText) findViewById(R.id.nameEditText);
        titleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameEditText.getText().toString();
                startStory(name);
            }
        });
    }

    private void startStory(String name) {
        Intent intent = new Intent(this,Journey2Activity.class);
        String key = getString(R.string.key_name);
        intent.putExtra(key,name);
        startActivity(intent);
    }
}
