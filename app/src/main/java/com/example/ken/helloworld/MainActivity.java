package com.example.ken.helloworld;

import android.content.Intent;
import android.net.Uri;
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
        //���ø�����
        super.onCreate(savedInstanceState);
        //�������õ�XML��Ӧ��layout
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textView);

        //����SecondAty ��ʽintent
        findViewById(R.id.btnSenondAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //��ʽ����
                //Intent intent =new Intent(MainActivity.this,SecondAty.class);
                //startActivity(intent);


                //��ʽ����
                //Intent intentHide=new Intent("com.example.activity.ACTION_START");
                //startActivity(intentHide);

                /*��ҳIntent
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.douyu.com/t/lpl"));
                startActivity(intent);*/

                //��������
                //Intent intent=new Intent(MainActivity.this,SecondAty.class);
                //intent.putExtra("extra_data","����DATA��SecondAty");
                //startActivity(intent);

                /*�з���ֵ��
                Intent intent=new Intent(MainActivity.this,SecondAty.class);
                intent.putExtra("extra_data","����DATA��SecondAty");
                startActivityForResult(intent,1);*/

                //����ListView�Ľ���
                Intent intent =new Intent(MainActivity.this,ListViewActivity.class );
                startActivity(intent);

            }
        });




        /*findViewById(R.id.btnAnotherAty).setOnClickListener(new View.OnClickListener() {
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

                //Intent it =new Intent(MainActivity.this,argsBty.class);
                //it.putExtra("user",new User("Future Power",3));
                //startActivity(it);
                //textView= (TextView)
                // findViewById(R.id.textView);
                //startActivityForResult(it,0);

                //�Զ�����ʾIntent
                //Intent i= new Intent(MainActivity.this,myAty.class);
                //startActivity(i);

                //��ʽInent����
                //Intent i = new Intent(myAty.ACTION);
                //startActivity(i);




            }


        });*/

    }

    //��д�����¼�
    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        textView.setText("���صĲ���Ϊ:" + data.getStringExtra("data1"));
    }*/

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                if(resultCode==RESULT_OK){
                    textView.setText("���յ�����ֵΪ1:"+data.getStringExtra("resultString"));
                    break;
                }
            default:
        }
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
