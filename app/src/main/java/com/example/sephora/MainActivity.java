package com.example.sephora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Button 1

        Button aboutBtn = (Button) findViewById(R.id.aboutBtn);
        aboutBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SephoraInformation.class);
                startActivity(intent);

            }
        });


//        Button 2

        Button callUsBtn = (Button) findViewById(R.id.CallUsBtn);
        callUsBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String phoneNum = "920011359";
                Uri uri = Uri.parse("tel:" + phoneNum);

                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);

            }
        });



//      Button 3
        Button workHoursBtn = (Button) findViewById(R.id.WorkHoursBtn);
        workHoursBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WorkHours.class);
                startActivity(intent);
                return true;
            }

        });

        workHoursBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Please , Click a long press!",Toast.LENGTH_SHORT).show();
            }
        });

    }

}