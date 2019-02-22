package com.aoics.xxsm.admin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.aoics.xxsm.LoginActivity;
import com.aoics.xxsm.R;
import com.aoics.xxsm.data.People;

import org.litepal.tablemanager.Connector;

public class VP3_PeopleManage_Insert extends AppCompatActivity {

    private String realempno = "";
    private String realname = "";
    private String realpass = "";
    private int reallevel = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vp3_peoma_ins);

        Button back = findViewById(R.id.vp3_return31);
        Button insertPeople = findViewById(R.id.peo_insing);
        final EditText empnoText =findViewById(R.id.empnoEditI);
        final EditText nameText =findViewById(R.id.realnameEditI);
        final EditText passText =findViewById(R.id.realpassEditI);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Intent intent = new Intent(VP3_PeopleManage.this, VP3Main.class);
                //startActivity(intent);
                finish();
            }
        });

        insertPeople.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Connector.getDatabase();
                realempno = empnoText.getText().toString();
                realname = nameText.getText().toString();
                realpass = passText.getText().toString();
                if("a".equals(realempno.substring(0,1))){
                    //Log.d("VP3_PeopleManage_Insert","员工");
                    reallevel = 1;
                }else if("b".equals(realempno.substring(0,1))){
                    reallevel = 2;
                }else if("c".equals(realempno.substring(0,1))){
                    reallevel = 3;
                }

                People inspeo = new People();
                inspeo.setEmpno(realempno);
                inspeo.setName(realname);
                inspeo.setPsw(realpass);
                inspeo.setLevel(reallevel);
                inspeo.save();
                Toast.makeText(VP3_PeopleManage_Insert.this, "添加成功!"+realempno+"@"+realname, Toast.LENGTH_LONG).show();
            }
        });
    }
}
