package com.aoics.xxsm.admin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.aoics.xxsm.R;
import com.aoics.xxsm.data.People;

import org.litepal.LitePal;
import org.litepal.crud.LitePalSupport;

public class VP3_PeopleManage_Delete extends AppCompatActivity {

    private String realempno = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vp3_peoma_del);

        Button back = findViewById(R.id.vp3_return32);
        final Button deletePeople = findViewById(R.id.peo_deling);
        final EditText empnoText =findViewById(R.id.empnoEditD);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Intent intent = new Intent(VP3_PeopleManage.this, VP3Main.class);
                //startActivity(intent);
                finish();
            }
        });

        deletePeople.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Connector.getDatabase();
                realempno = empnoText.getText().toString();
                LitePal.deleteAll(People.class,"empno = ?",realempno);
                Toast.makeText(VP3_PeopleManage_Delete.this, "删除成功!"+realempno, Toast.LENGTH_LONG).show();
            }
        });
    }
}
