package tdd;

import java.util.ArrayList;
import java.util.List;

public class CircularBufferBk {

    private List<String> list = new ArrayList<>();
    private int num = size();
    public int size() {
        return 6;
    }

    public void add(String o) {
        if (list.size() >= size()){
            int x = num % size();
            list.remove(x);
            list.add(x ,o);
            num++;
        }else {
            list.add(o);
        }
    }

    public String get(int index) {
        return list.get(index);
    }


    public static void main(String[] args) {
        CircularBufferBk c = new CircularBufferBk();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("e");
        c.add("f");

        c.add("g");
        c.add("h");
        c.add("i");
        c.add("j");


        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }
    }
}
