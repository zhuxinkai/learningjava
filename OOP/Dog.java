package com.company;

public class Dog {
    //属性 颜色
    String color;

    //品种
    String type;
    //性别
    int gender;


/*
行为，行为就是方法  void（没有返回值）
看家的行为
 */
public void LookHome(){

    System.out.println("旺财正在看家");

}
    public void Sleep(){

        System.out.println("旺财正在睡觉");

    }

/*

定义了属性，也定义了行为。真正的完成了建立了一个类
 */

public static void main(String[] args){
  //数据类型  变量 = new 数据类型();
    Dog dog = new Dog();
    dog.color = "花狗";
            dog.gender = 1;
    dog.type = "京巴";
    //创建了一只狗，创建的时候只有默认属性。访问对象的属性。
    System.out.println(dog.color);
    System.out.println(dog.gender);
    System.out.println(dog.type);

//调用类的方法  对象.方法（行为）名

    dog.LookHome();
    dog.Sleep();
  //创建另一只狗
    Dog dog1 = new Dog();
    dog1.type = "哈巴";
    dog1.color = "白狗";
    System.out.println(dog1.color);
    System.out.println(dog1.gender);
    System.out.println(dog1.type);
    dog1.LookHome();
    dog1.Sleep();




    }
}


