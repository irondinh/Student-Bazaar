package com.example.william.studentbazaar;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


/**
 * Created by William Truong on 4/13/18.
 */

public class MainScreenActivity extends AppCompatActivity  {

    private Button mFormClub;
    private Button mSearchItems;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_screen);
        Bundle intent = getIntent().getExtras();

        mFormClub = (Button)findViewById(R.id.form_club_button);

        mFormClub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainScreenActivity.this, CreateClubActivity.class);
//                intent.putExtra("IS_First_Time",false);
                startActivity(intent);
            }
        });


    }

}
