package com.example.ken.helloworld;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnAnotherAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //新建容器Intent 参数(主界面类，从界面类)
                //Intent it= new Intent(MainActivity.this,argsBty.class);
                //putExtra函数 参数(Key,Value)
                //it.putExtra("title","Future Power Passed");
                //启动从界面  参数 Intent

                //创建Intent容器
                //Intent it = new Intent(MainActivity.this,argsBty.class);
                //创建Bundle,Bundle是一组Key-Value的Map
                //Bundle b= new Bundle();
                //b.putString("name","Future Power");
               // b.putInt("time",3);
                //Intent容器添加b
                //it.putExtras(b);


                Intent it =new Intent(MainActivity.this,argsBty.class);
                it.putExtra("user",new User("Future Power",3));
                //startActivity(it);
                textView= (TextView) findViewById(R.id.textView);

                startActivityForResult(it,0);

            }


        });
    }

    //重写接收事件
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        textView.setText("传回的参数为:" + data.getStringExtra("data1"));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
