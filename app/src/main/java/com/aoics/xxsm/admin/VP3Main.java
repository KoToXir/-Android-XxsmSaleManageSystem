package com.aoics.xxsm.admin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.aoics.xxsm.LoginActivity;
import com.aoics.xxsm.R;

public class VP3Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vp3_main);

        Button logout = findViewById(R.id.vp3_logout);
        Button status = findViewById(R.id.sys_status);
        Button people = findViewById(R.id.peo_man);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(VP3Main.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(VP3Main.this, VP3_stauts.class);
                startActivity(intent);
                //finish();
            }
        });

        people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(VP3Main.this, VP3_PeopleManage.class);
                startActivity(intent);
                //finish();
            }
        });
    }
}
