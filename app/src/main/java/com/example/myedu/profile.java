package com.example.myedu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_profile6);

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
                Intent intent = new Intent(profile.this, MainActivity4Home.class);
                startActivity(intent);
            });
        }

        // Navigation to Leaderboard
        TextView leaderboardTextView = findViewById(R.id.leaderboard);
        if (leaderboardTextView != null) {
            leaderboardTextView.setOnClickListener(view -> {
                Intent intent = new Intent(profile.this, leaderboard.class);
                startActivity(intent);
            });
        }

        // Logout Button
        Button logoutButton = findViewById(R.id.logout);
        if (logoutButton != null) {
            logoutButton.setOnClickListener(view -> {
                Intent intent = new Intent(profile.this, MainActivity2.class);
                // Clear the back stack so the user can't return to the profile activity
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish(); // Optional: Close the profile activity so it's not in the back stack
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
