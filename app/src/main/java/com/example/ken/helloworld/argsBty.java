package com.example.ken.helloworld;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class argsBty extends ActionBarActivity {
    private TextView tv;
    private EditText edtContent;
    private Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_args_bty);
        //Intent i= getIntent();
        //tv=(TextView)findViewById(R.id.tv);
        //tv.setText( i.getStringExtra("title"));
        //Intent it= getIntent();
        // Bundle b=it.getExtras();
        //tv=(TextView)findViewById(R.id.tv);
        //tv.setText(String.format("name=%s,time=%d",b.getString("name"),b.getInt("time")));

        //Intent it= getIntent();
        // User user= (User)it.getParcelableExtra("user");
        // tv=(TextView)findViewById(R.id.tv);
        //tv.setText(String.format("UserInfo(name=%s,id=%d)",user.getUserName(),user.getId()));

        btnBack= (Button) findViewById(R.id.btnBack);
        edtContent= (EditText) findViewById(R.id.edtContent);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //定义用于回传的容器
                Intent it= new Intent();
                it.putExtra("data1",edtContent.getText().toString());
                //设置回传函数 重要
                setResult(1,it);
                //一定要finish()
                finish();

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_args_bty, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
