package academy.mindswap.dinamyc;

public class DynamicArray {

    private Object[] arrayObjects;

    public DynamicArray(){
        arrayObjects=new Object[0];
    }

    public void add(Object object){
       // System.out.println(arrayObjects.length);
        int  newLength=arrayObjects.length+1;
        Object[] tempArray=new Object[newLength];
        for (int i = 0; i <arrayObjects.length ; i++) {
            tempArray[i]=arrayObjects[i];
        }
        tempArray[newLength-1]=object;
        arrayObjects=tempArray;
    }

    public void remove(int arrayPosition){
        int  newLength=arrayObjects.length-1;
        Object[] tempArray=new Object[newLength];

        for (int i = 0; i <arrayPosition ; i++) {
            //System.out.println(arrayObjects[i]);
            tempArray[i]=arrayObjects[i];
        }

        for (int i = arrayPosition+1; i <arrayObjects.length ; i++) {
            //7System.out.println(i);
            //System.out.println(arrayObjects[i]);
            tempArray[i-1]=arrayObjects[i];
        }
        arrayObjects=tempArray;
    }


    public void list(){
        for (Object object:arrayObjects) {
            System.out.println(object);
        }
    }

    public void pop(){
        remove(arrayObjects.length-1);
    }

    private void copy(){


    }

}
