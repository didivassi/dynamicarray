package academy.mindswap;

import academy.mindswap.dinamyc.DynamicArray;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DynamicArray dinamyc=new DynamicArray();

        String teste = "lalalal";
        int teste2=2;

        dinamyc.add("inicio");
        dinamyc.add("meio");
        dinamyc.add("meioooo");
        dinamyc.add("meioooo0000");
        dinamyc.add("fim");

        dinamyc.remove(1);

        dinamyc.list();
        System.out.println("test pop");
        dinamyc.pop();
        dinamyc.list();
    }
}
