package com.example.myedu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4_home);

        // Ensure 'header' view exists in XML
        View rootView = findViewById(R.id.header);
        if (rootView != null) {
            // Adjust padding to account for system bars (status and navigation)
            ViewCompat.setOnApplyWindowInsetsListener(rootView, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        // Navigation for different sections
        TextView categoryTextView = findViewById(R.id.category);
        categoryTextView.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4Home.this, Maincategory.class);
            startActivity(intent);
        });

        TextView courseTextView = findViewById(R.id.course);
        courseTextView.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4Home.this, MainActivity4course.class);
            startActivity(intent);
        });

        TextView leaderboardTextView = findViewById(R.id.leaderboard);
        leaderboardTextView.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4Home.this, leaderboard.class);
            startActivity(intent);
        });

        TextView profileTextView = findViewById(R.id.profile);
        profileTextView.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4Home.this, profile.class);
            startActivity(intent);
        });

        // Category ImageViews (Fixed)
        ImageView category1ImageView = findViewById(R.id.category1);
        if (category1ImageView != null) {
            category1ImageView.setOnClickListener(view -> {
                Intent intent = new Intent(MainActivity4Home.this, Maincategory.class);
                startActivity(intent);
            });
        }

        ImageView category2ImageView = findViewById(R.id.category2);
        if (category2ImageView != null) {
            category2ImageView.setOnClickListener(view -> {
                Intent intent = new Intent(MainActivity4Home.this, Maincategory.class);
                startActivity(intent);
            });
        }

        ImageView category3ImageView = findViewById(R.id.category3);
        if (category3ImageView != null) {
            category3ImageView.setOnClickListener(view -> {
                Intent intent = new Intent(MainActivity4Home.this, Maincategory.class);
                startActivity(intent);
            });
        }

        ImageView category4ImageView = findViewById(R.id.category4);
        if (category4ImageView != null) {
            category4ImageView.setOnClickListener(view -> {
                Intent intent = new Intent(MainActivity4Home.this, Maincategory.class);
                startActivity(intent);
            });
        }

        ImageView course1ImageView = findViewById(R.id.course1);
        if (course1ImageView != null) {
            course1ImageView.setOnClickListener(view -> {
                Intent intent = new Intent(MainActivity4Home.this, MainActivity4course.class);
                startActivity(intent);
            });
        }
        ImageView course2ImageView = findViewById(R.id.course2);
        if ( course2ImageView != null) {
            course2ImageView.setOnClickListener(view -> {
                Intent intent = new Intent(MainActivity4Home.this, MainActivity4course.class);
                startActivity(intent);
            });
        }
        ImageView  course3ImageView = findViewById(R.id.course3);
        if ( course3ImageView != null) {
            course3ImageView.setOnClickListener(view -> {
                Intent intent = new Intent(MainActivity4Home.this, MainActivity4course.class);
                startActivity(intent);
            });
        }
    }

    // Dummy methods for button clicks (ensure these methods exist in XML with corresponding onClick attributes)
    public void openCourseCategories(View view) {
        Toast.makeText(this, "Opening Course Categories", Toast.LENGTH_SHORT).show();
    }

    public void openLiveClasses(View view) {
        Toast.makeText(this, "Opening Live Classes", Toast.LENGTH_SHORT).show();
    }

    public void openCourseDetails(View view) {
        Toast.makeText(this, "Opening Course Details", Toast.LENGTH_SHORT).show();
    }

    public void openLeaderboard(View view) {
        Toast.makeText(this, "Opening Leaderboard", Toast.LENGTH_SHORT).show();
    }

    public void openProfile(View view) {
        Toast.makeText(this, "Opening Profile", Toast.LENGTH_SHORT).show();
    }
}
