package com.example.samuel.quizapplication.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.samuel.quizapplication.R;

public class MainActivity extends AppCompatActivity {

    private EditText nameField;
    private Button startQuizButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameField = findViewById(R.id.name);
        startQuizButton = findViewById(R.id.startQuizButton);

        startQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameField.getText().toString();
                startQuiz(name);
            }
        });

    }

    private void startQuiz(String name) {
        Intent intent = new Intent(this, QuizActivity.class);
        Resources resources = getResources();
        String key = "name";
        intent.putExtra(key, name);
        startActivity(intent);
    }
}
