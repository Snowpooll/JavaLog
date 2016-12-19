package com.example.snowpool.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Dog dog = new Dog("ポチ",3);
//
//        dog.say();
//
//        Log.d("javatest","犬の名前は"+dog.name+"です");
//        Log.d("javatest","犬の年齢は"+dog.age+"です");
//
//        Dog dog2 = new Dog("ハチ",10);
//        dog2.say();
//        Log.d("javatest","犬の名前は"+dog2.name+"です");
//        Log.d("javatest","犬の年齢は"+dog2.age+"です");
        Dog dog = new Dog("ポチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

//        dog.say();  // ポチが吠えます（ログ出力）
        dog.move();

        Human human = new Human("snow",14,"Android");
        human.say();
        human.think();

//        Log.d("javatest",Dog.to_jp +"のクラス変数");
//        Log.d("javatest", "犬の名前は" + dog.name + "です。");
//        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");
//
//        dog.introdude();
//
//        Dog dog2 = new Dog("ハチ", 10);   // 名前をハチ、年齢10歳で、Dogインスタンスを作る
//        dog2.say();  // ハチが吠えます（ログ出力）
//        Log.d("javatest", "犬の名前は" + dog2.name + "です。");
//        Log.d("javatest", "犬の年齢は" + dog2.age + "歳です。");
//
//        BigDog bigDog = new BigDog("ヨーゼフ",15);
//        bigDog.say();
//        Log.d("javatest","犬の名前は"+bigDog.name+"です");
//        Log.d("javatest","犬の年齢は"+bigDog.age+"です");



//        int num=10+ 5 - 2 * 4 / 2;
//        Log.d("javatest","10 + 5 - 2 * 4 / 2 = " + String.valueOf(num));
//
//        boolean flag1 = true;
//        boolean flag2 = false;
//        Log.d("javatest","flag1 && flag2 =" + String.valueOf(flag1 && flag2));
//        Log.d("javatest","flag1 || flag2 =" + String.valueOf(flag1 || flag2));
//
//        int num2 =10;
//        int num3 =20;
//        Log.d("javatest","num2 < num3 "+String.valueOf(num2 < num3));

//        int num=60;
//        if(num>=90){
//            Log.d("javatest","優");
//        }else if (num >=75){
//            Log.d("javatest","良");
//        }else if (num >=60){
//            Log.d("javatest","可");
//        }else{
//            Log.d("javatest","不可");
//        }
//
//        int drink=1;
//        switch (drink){
//            case 0:
//                Log.d("javatest","コーヒーを注文しました");
//                break;
//            case 1:
//                Log.d("javatest","紅茶を注文しました");
//                break;
//            case 2:
//                Log.d("javatest","ミルクを注文しました");
//                break;
//            default:
//                Log.d("javatest","オーダーミス");
//                break;
//        }

//        for(int i=1; i<6; i++){
//            Log.d("javatest","for 文の" + String.valueOf(i) + "回目");
//        }
//
//        int num=1;
//        while (num < 6){
//            Log.d("javatest","while 文の" + String.valueOf(num) + "回目");
//            num++;
//        }
//
//        int[] points = new int[5];
//        points[0]=10;
//        points[1]=6;
//        points[2]=15;
//        points[3]=23;
//        points[4]=17;
//
//        for(int i=0; i<points.length;i++){
//            Log.d("javatest",String.valueOf(points[i]));
//        }
//
//        int t = total(50,1000);
//        Log.d("javatest",String.valueOf(t));
//    }
//
//    private int  total(int first, int last){
//        int sum=0;
//        for(int i=first;i<last; i++){
//            sum=sum+i;
//        }
//
//        return sum;
    }
}
