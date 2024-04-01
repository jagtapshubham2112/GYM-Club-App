package com.rohansingh.gymmanagement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class AnnouncementsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcements);

        // Get the LinearLayout
        LinearLayout llAnnouncements = findViewById(R.id.llAnnouncements);

        // Sample announcements (you can replace these with your actual announcements)
        String[] announcements = {
                "\nAnnouncement 1: \n \n New Year Membership Offer ** 20% OFF **",
                "Announcement 2: \n \n Gym will be closed on 25th December on occasion of Christmas Holiday\n",
        };

        // Add TextViews dynamically for each announcement
        for (String announcement : announcements) {
            TextView textView = (TextView) LayoutInflater.from(this).inflate(R.layout.item_announcement, llAnnouncements, false);
            textView.setText(announcement);
            llAnnouncements.addView(textView);
        }
    }
}
