package Spark3.CollectionDemo;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(); ///default size 10 hga ///ab next list bnegi to currentcapacity*1.5+1
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(10);

        System.out.println(arr);
        System.out.println(arr.get(2));

        ///khdki acapacity k sath b bana sktey hai
        List<Integer>arr2=new ArrayList<>(20); ///ArrayList mein aisa ek constructor hga jo capacity set krra hga


    }

}
