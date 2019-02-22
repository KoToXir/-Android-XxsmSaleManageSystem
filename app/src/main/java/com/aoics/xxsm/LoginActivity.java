package com.aoics.xxsm;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.aoics.xxsm.admin.VP3Main;

public class LoginActivity extends AppCompatActivity {

    private String username="";
    private String password="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button login_vp12 = findViewById(R.id.login_vp12);
        Button login_vp3 = findViewById(R.id.login_vp3);
        Button aboutus = findViewById(R.id.about);
        Button stest = findViewById(R.id.test);
        final EditText nameText =findViewById(R.id.nameedit);
        final EditText passText =findViewById(R.id.passedit);


        //username = nameText.getText().toString();
        //password = passText.getText().toString();


        login_vp12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                username = nameText.getText().toString();
                password = passText.getText().toString();
                Log.d("LoginActivity",username);
                Log.d("LoginActivity",password);

                if("1".equals(username)&&"1".equals(password)) {
                    Intent intent = new Intent(LoginActivity.this, VP1Main.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(LoginActivity.this, "Error Key! "+username+"+"+password, Toast.LENGTH_LONG).show();
                }
            }
        });


        login_vp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                username = nameText.getText().toString();
                password = passText.getText().toString();
                //Log.d("LoginActivity",username);
                //Log.d("LoginActivity",password);

                if(1>0) {//"3".equals(username)&&"3".equals(password)
                    Intent intent = new Intent(LoginActivity.this, VP3Main.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(LoginActivity.this, "Error Key! "+username+"+"+password, Toast.LENGTH_LONG).show();
                }
            }
        });

        stest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(LoginActivity.this, Test.class);
                startActivity(intent);
                //finish();
            }
        });

        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.qfnucloud.cn"));
                startActivity(intent);
                //finish();
            }
        });
    }
}
