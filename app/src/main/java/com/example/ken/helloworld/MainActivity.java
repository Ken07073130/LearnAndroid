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
                //�½�����Intent ����(�������࣬�ӽ�����)
                //Intent it= new Intent(MainActivity.this,argsBty.class);
                //putExtra���� ����(Key,Value)
                //it.putExtra("title","Future Power Passed");
                //�����ӽ���  ���� Intent

                //����Intent����
                //Intent it = new Intent(MainActivity.this,argsBty.class);
                //����Bundle,Bundle��һ��Key-Value��Map
                //Bundle b= new Bundle();
                //b.putString("name","Future Power");
               // b.putInt("time",3);
                //Intent�������b
                //it.putExtras(b);


                Intent it =new Intent(MainActivity.this,argsBty.class);
                it.putExtra("user",new User("Future Power",3));
                //startActivity(it);
                textView= (TextView) findViewById(R.id.textView);

                startActivityForResult(it,0);

            }


        });
    }

    //��д�����¼�
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        textView.setText("���صĲ���Ϊ:" + data.getStringExtra("data1"));
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
