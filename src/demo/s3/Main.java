package demo.s3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        int[] arrInt = new int[3];
        arrInt[0] = 10;
        arrInt[1] = 15;
        int[][] arrInt2 =  new int[3][4];
        arrInt2[0][0] = 3;
        arrInt2[1][3] = 7;

        ArrayList arrL = new ArrayList();
        arrL.add(1);
        arrL.add("Hello");
        for (int i=0;i<arrL.size();i++){
            System.out.println(arrL.get(i));
        }
        arrL.add(null);
        ArrayList<String> arrString =  new ArrayList<String>();
        arrString.add("Xin chao");

        Integer x = new Integer(5);
        x += 4;// su dung y het int

        ArrayList<Integer> arrinteger = new ArrayList<Integer>();
        arrinteger.add(4);

        ArrayList<Dog> arrDog = new ArrayList<Dog>();
        Dog d1 = new Dog();
        arrDog.add(d1);
        Dog d2 = new Dog();
        arrDog.add(d2);

        for(int i=0;i<100;i++){
            arrDog.add(new Dog());
        }
        arrDog.get(100);
        for(int i=0;i<arrDog.size();i++){
            arrDog.get(i).run();
        }
        for(Dog d : arrDog){
            d.run();
        }
    }
}