package com.example.snowpool.javalog;

import android.util.Log;

/**
 * Created by snowpool on 16/12/17.
 */

public class Dog extends Animal  implements  Movable{

    static String to_jp="犬";

    String name;
    int age;

    //コンストラクタで初期化
    public Dog(String name, int age){
        this.name=name;
        this.age=age;
    }

    public static void introdude(){
        Log.d("javatest", "これは犬クラスです。");
    }

    public void say(){
//        Log.d("javatest", this.name +"(" + this.age +"歳" + "ワンワン");
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }
}
