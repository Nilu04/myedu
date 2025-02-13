package com.example.myedu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class leaderboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_leaderboard8);

        // Adjust system bars padding if 'header' exists
        View rootView = findViewById(R.id.header); // Ensure 'header' exists in XML

        if (rootView != null) {
            ViewCompat.setOnApplyWindowInsetsListener(rootView, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        // Navigation to Home
        TextView homeTextView = findViewById(R.id.home);
        if (homeTextView != null) {
            homeTextView.setOnClickListener(view -> {
                Intent intent = new Intent(leaderboard.this, MainActivity4Home.class);
                startActivity(intent);
            });
        }

        // Navigation to Profile
        TextView profileTextView = findViewById(R.id.profile);
        if (profileTextView != null) {
            profileTextView.setOnClickListener(view -> {
                Intent intent = new Intent(leaderboard.this, profile.class);
                startActivity(intent);
            });
        }
    }

    // Dummy methods for button clicks (ensure these methods exist)
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
