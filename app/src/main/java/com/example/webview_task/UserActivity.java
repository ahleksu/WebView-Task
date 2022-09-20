package com.example.webview_task;


/** This class will pass the data using Intent once a list item is clicked */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.webview_task.databinding.ActivityUserBinding;

public class UserActivity extends AppCompatActivity {

    ActivityUserBinding binding;
    String name;
    Button webViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        webViewButton = findViewById(R.id.web_view_button);
        webViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWebView();
            }
        });

        Intent intent = this.getIntent();

        if (intent != null){

            name = intent.getStringExtra("name");
            String fullDescription = intent.getStringExtra("full_desription");
            int imageid = intent.getIntExtra("imageid",R.drawable.a);

            /** This binding will be set the data to all the elements */
            binding.versionName.setText(name);
            binding.versionDescription.setText(fullDescription);
            binding.versionImage.setImageResource(imageid);
        }
    }

    /** This method will open the web view activity upon button click */
    public void openWebView() {
        Intent intent = new Intent(this, WebView.class);
        intent.putExtra("name",name);
        startActivity(intent);

    }


}