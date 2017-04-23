package io.getathena.umptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LessonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);
        getSupportActionBar().setTitle(getIntent().getStringExtra("courseName"));
        Button button = (Button) findViewById(R.id.button);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(LessonsActivity.this,
                        LessonViewActivity.class);
                myIntent.putExtra("lessonName", "Our Place in the Universe");
                startActivity(myIntent);
            }
        });
    }
}
