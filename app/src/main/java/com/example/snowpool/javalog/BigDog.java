package com.example.snowpool.javalog;

import android.util.Log;

/**
 * Created by snowpool on 16/12/18.
 */

public class BigDog extends Dog {
    static String to_jp ="大型犬";

    public BigDog(String name, int age){
        super(name, age);
    }

    public static void introduce(){
        Log.d("javatest","これは大型犬クラスです");
    }
}
