package com.company;

public class DogSelfPractice {
int jender;
String color;
String type;



public static void sleep(){
    System.out.println("旺财正在睡觉");



}

public static void hockhome(){

    System.out.println("旺财正在看家");

}


public static void main(String [] arrgy)
    {
        Dog dog = new Dog();
        dog.color = "red";
        dog.gender = 1;
        dog.type = "小花狗";
        System.out.println(dog.type);
        System.out.println(dog.color);
        System.out.println(dog.gender);
        dog.LookHome();
        dog.Sleep();


      Dog dog2 =new Dog();
      dog2.color = "绿色";
      dog2.gender = 0;
      dog2.type = "阿拉斯加犬";

        System.out.println(dog2.type);
        System.out.println(dog2.color);
        System.out.println(dog2.gender);
        dog2.Sleep();
        dog2.LookHome();


        Dog dog3 = dog2;
        dog3.color = "从来未有的颜色";
        System.out.println(dog3.color);
        System.out.println(dog2.color);


        




    }

}
