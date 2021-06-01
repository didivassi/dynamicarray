package academy.mindswap;

import academy.mindswap.dinamyc.DynamicArray;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DynamicArray dinamyc=new DynamicArray();

        dinamyc.push("one");
        dinamyc.push("two");
        dinamyc.push("three");
        dinamyc.push("four");
        dinamyc.push("five");
        dinamyc.push(6);
        dinamyc.push(7);
        dinamyc.list();
        System.out.println("removing from position 1");
        dinamyc.remove(1);
        dinamyc.list();
        System.out.println("adding on position 1");
        dinamyc.add("new two",1);
        dinamyc.list();
        System.out.println("shifting");
        dinamyc.shift();
        dinamyc.list();
        System.out.println("unshifting");
        dinamyc.unshift("new one");
        dinamyc.list();
        System.out.println("test pop");
        dinamyc.pop();
        dinamyc.list();
    }
}
