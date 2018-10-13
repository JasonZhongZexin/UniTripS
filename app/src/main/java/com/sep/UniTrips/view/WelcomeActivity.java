/**
 * Copyright (c) 2018. [Zexin Zhong]
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions an limitations under the License.
 */


package com.sep.UniTrips.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.sep.UniTrips.R;

public class WelcomeActivity extends AppCompatActivity {

    private Button mSignInBtn;
    private Button mSignUpBtn;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        //Remove the title of this page
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        //Remove the status bar of the activity
//        getWindow().setFlags(WindowManager.LayoutParams. FLAG_FULLSCREEN , WindowManager.LayoutParams. FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome);
        mAuth = FirebaseAuth.getInstance();
        mSignInBtn = (Button) findViewById(R.id.signInBtn);
        mSignInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this,SignInActivity.class);
                startActivity(intent);
            }
        });

        mSignUpBtn = (Button) findViewById(R.id.signUpBtn);
        mSignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        //check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }

    //UpdateUI according to the current user
    private void updateUI(FirebaseUser currentUser){
        //check if user is signed in (non-null)
        if(currentUser!=null){
            Intent intent = new Intent(WelcomeActivity.this,MainActivity.class);
            startActivity(intent);
        }
    }
}
