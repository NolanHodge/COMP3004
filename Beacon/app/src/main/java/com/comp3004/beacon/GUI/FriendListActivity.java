package com.comp3004.beacon.GUI;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.comp3004.beacon.FirebaseServices.DatabaseManager;
import com.comp3004.beacon.R;

public class FriendListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_list);


       // DatabaseManager.getInstance().getCurrentUsersFriends();

        
    }
}