package com.aoics.xxsm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class VP1Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vp1_main);



        Button logout = (Button) findViewById(R.id.vp1_logout);
        logout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(VP1Main.this, LoginActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
    protected void onDestory(){
        super.onDestroy();
    }
}
