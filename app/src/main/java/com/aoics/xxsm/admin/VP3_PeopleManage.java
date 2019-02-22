package com.aoics.xxsm.admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.aoics.xxsm.R;
import com.aoics.xxsm.Test;
import com.aoics.xxsm.data.People;

import org.litepal.LitePal;
import org.litepal.tablemanager.Connector;

import java.util.ArrayList;
import java.util.List;

public class VP3_PeopleManage extends AppCompatActivity {
    ArrayList<String> data = new ArrayList<String> ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vp3_peom);

        Button back = findViewById(R.id.vp3_return30);
        Button createDatabase = findViewById(R.id.cre_dat);
        Button peo_ins = findViewById(R.id.peo_insert);
        Button peo_del = findViewById(R.id.peo_delete);
        Button peo_sea = findViewById(R.id.peo_search);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Intent intent = new Intent(VP3_PeopleManage.this, VP3Main.class);
                //startActivity(intent);
                finish();
            }
        });

        createDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Connector.getDatabase();
            }
        });

        peo_ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(VP3_PeopleManage.this, VP3_PeopleManage_Insert.class);
                startActivity(intent);
                //finish();
            }
        });

        peo_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(VP3_PeopleManage.this, VP3_PeopleManage_Delete.class);
                startActivity(intent);
                //finish();
            }
        });

        peo_sea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                List<People> iii = LitePal.findAll(People.class);
                for (People mm: iii){
//                    Log.d("Test",""+mm.getId());
//                    Log.d("Test","工号"+mm.getEmpno());
//                    Log.d("Test","姓名"+mm.getName());
//                    Log.d("Test","密码"+mm.getPsw());
                    data.add("工号:"+mm.getEmpno()+"@姓名:"+mm.getName());
                }
                ArrayAdapter<String> adapter = new ArrayAdapter<>(VP3_PeopleManage.this, android.R.layout.simple_list_item_1, data);
                ListView listView = findViewById(R.id.peolist);
                listView.setAdapter(adapter);
            }

        });
    }
}
