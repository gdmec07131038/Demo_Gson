package cn.gdmec.s07131038.demo_gson;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> phones=new ArrayList<String>();
        phones.add("1324654");
        phones.add("545445");
        phones.add("654654654");
        
        Person person=new Person("zhangsan",16,phones);
        
        Gson gson=new Gson();
        
        String s=gson.toJson(person);
        
        Log.i("info", s);
        
        Person person2=gson.fromJson(s, Person.class);
        
        Log.i("info", "通过gson生成Java对象"+person2);
    }
    
    
  
}
