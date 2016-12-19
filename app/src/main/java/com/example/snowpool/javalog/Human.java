package com.example.snowpool.javalog;

import android.util.Log;

/**
 * Created by snowpool on 16/12/18.
 */

public class Human extends Animal implements Thinkable{

    String hobby;

    public Human(String name,int age,String hobby){
        this.name=name;
        this.age=age;
        this.hobby=hobby;
    }

    public void say(){
        Log.d("javatest","私の名前は"+this.name+"です");
        Log.d("javatest","年は"+this.age+"歳です");
    }

    @Override
    public void think() {
        Log.d("javatest","私は"+this.hobby+"について考える");
    }
}
