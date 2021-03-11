package Learn;

class Animal2{
    Animal2(){System.out.println("动物可以移动");}
}

class Dog2 extends Animal2{
    Dog2(){System.out.println("狗可以跑和走");}
}

public class L38{
    public static void main(String args[]){
        System.out.println("Animal2 a = new Animal2(); // Animal 对象");
        Animal2 a = new Animal2(); // Animal 对象
        System.out.println("Dog2 b = new Dog2(); // Dog 对象");
        Dog2 b = new Dog2(); // Dog 对象

    }
}