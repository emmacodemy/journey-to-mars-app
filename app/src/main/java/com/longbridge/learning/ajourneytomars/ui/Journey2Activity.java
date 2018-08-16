package com.longbridge.learning.ajourneytomars.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.longbridge.learning.ajourneytomars.R;
import com.longbridge.learning.ajourneytomars.model.Page;
import com.longbridge.learning.ajourneytomars.model.Story;

import java.util.Stack;

public class Journey2Activity extends AppCompatActivity {
    private ImageView pageImageView;
    private TextView pageTextView;
    private Button choice1Button;
    private Button choice2Button;
    private String name;
    private Stack<Integer> pageStack;


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
        pageStack.push(pageNo);
        Story story = new Story();
        final Page page = story.getPage(pageNo);
        pageImageView.setImageResource(page.getImageId());
        pageTextView.setText(String.format(getString(page.getTextId(),name)));
        if (page.getFinal() == Boolean.TRUE){
            choice1Button.setVisibility(View.INVISIBLE);
            choice2Button.setText(getString(R.string.play_again));
            choice2Button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    pageStack.clear();
                    loadpage(0);
                }
            });

        }
        else {
            loadChoiceButton(page);
        }


    }

    private void loadChoiceButton(final Page page) {
        choice1Button.setVisibility(View.VISIBLE);
        choice2Button.setVisibility(View.VISIBLE);
        choice1Button.setText(page.getChoice1().getTextId());
        choice2Button.setText(page.getChoice2().getTextId());
        choice1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadpage(page.getChoice1().getNextPage());
            }
        });
        choice2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadpage(page.getChoice2().getNextPage());
            }
        });
    }

    @Override
    public void onBackPressed() {
        pageStack.pop();
        if (pageStack.isEmpty()) {
            super.onBackPressed();
        }
        else {
            loadpage(pageStack.pop());
        }
    }
}
