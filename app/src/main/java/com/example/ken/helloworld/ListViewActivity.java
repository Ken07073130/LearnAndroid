package com.example.ken.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    private  String[] strLvList={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
    private ArrayList<Fruit1> fruit1s=new ArrayList<Fruit1>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        /*常规方法填充ListView
        //1.需要一个适配器
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ListViewActivity.this,android.R.layout.simple_list_item_1,strLvList);
        //2.初始化ListView
        ListView listView=(ListView) findViewById(R.id.listViewTest);
        //3.给listview填充适配器
        listView.setAdapter(adapter);*/

        //自定义布局填充
        initFruits();
        FuritsAdaper<Fruit1> adaper=new FuritsAdaper<Fruit1>(ListViewActivity.this,R.layout.mylist_item,fruit1s);
        //2.初始化ListView
        ListView listView=(ListView) findViewById(R.id.listViewTest);
        //3.给listview填充适配器
        listView.setAdapter(adaper);


    }

    public  void initFruits(){
        Fruit1 fruit1=new Fruit1(R.drawable.aaa,"1");
        fruit1s.add(fruit1);
        Fruit1 fruit2=new Fruit1(R.drawable.aaa,"2");
        fruit1s.add(fruit2);
        Fruit1 fruit3=new Fruit1(R.drawable.aaa,"3");
        fruit1s.add(fruit3);
        Fruit1 fruit4=new Fruit1(R.drawable.aaa,"4");
        fruit1s.add(fruit4);
        Fruit1 fruit5=new Fruit1(R.drawable.aaa,"5");
        fruit1s.add(fruit5);
        Fruit1 fruit6=new Fruit1(R.drawable.aaa,"6");
        fruit1s.add(fruit6);
        Fruit1 fruit7=new Fruit1(R.drawable.aaa,"7");
        fruit1s.add(fruit7);
        Fruit1 fruit8=new Fruit1(R.drawable.aaa,"8");
        fruit1s.add(fruit8);
        Fruit1 fruit9=new Fruit1(R.drawable.aaa,"9");
        fruit1s.add(fruit9);
        Fruit1 fruit10=new Fruit1(R.drawable.aaa,"10");
        fruit1s.add(fruit10);
        Fruit1 fruit11=new Fruit1(R.drawable.aaa,"11");
        fruit1s.add(fruit11);
        Fruit1 fruit12=new Fruit1(R.drawable.aaa,"12");
        fruit1s.add(fruit12);

    }
}
