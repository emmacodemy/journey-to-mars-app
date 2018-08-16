package com.longbridge.learning.ajourneytomars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
                loadPage(name);
            }
        });
    }

    private void loadPage(String name) {
    }
}
