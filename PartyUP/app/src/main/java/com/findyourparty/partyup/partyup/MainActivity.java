package com.findyourparty.partyup.partyup;

/**
 * Created by billy_000 on 10/29/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.parse.ParseAnonymousUtils;
import com.parse.ParseUser;

public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Determine whether the current user is an anonymous user
        if (ParseAnonymousUtils.isLinked(ParseUser.getCurrentUser())) {
            // If user is anonymous, send the user to SignupActivity.class
            Intent intent = new Intent(MainActivity.this,
                    SignupActivity.class);
            startActivity(intent);
            finish();
        } else {
            // If current user is NOT anonymous user
            // Get current user data from Parse.com
            ParseUser currentUser = ParseUser.getCurrentUser();
            if (currentUser != null) {
                // Send logged in users to Welcome.class
                Intent intent = new Intent(MainActivity.this, Welcome.class);
                startActivity(intent);
                finish();
            } else {
                // Send user to SignupActivity.class
                Intent intent = new Intent(MainActivity.this,
                        SignupActivity.class);
                startActivity(intent);
                finish();
            }
        }

/**
 * Trevor's time to shine on 11/2/2015.
 */

        Intent intent = new Intent(MainActivity.this,
                CreatePartyActivity.class);
        startActivity(intent);
        finish();




    }
}
