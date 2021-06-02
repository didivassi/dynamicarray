package academy.mindswap.dinamyc;

public class DynamicArray<T> {

    private Object[] arrayObjects;

    public DynamicArray(){
        arrayObjects=new Object[0];
    }

    public void push(T object){
        add(object,arrayObjects.length);
       /*
       Old add method
       int  newLength=arrayObjects.length+1;
        Object[] tempArray=new Object[newLength];
        for (int i = 0; i <arrayObjects.length ; i++) {
            tempArray[i]=arrayObjects[i];
        }
        tempArray[newLength-1]=object;
        arrayObjects=tempArray;*/

    }

    public void pop(){
        remove(arrayObjects.length-1);
    }

    public void shift(){
        remove(0);
    }

    public void unshift(T object){
        add(object,0);
    }

    public void add(T object,  int arrayPosition) {

        int  newLength=arrayObjects.length+1;
        Object[] tempArray=new Object[newLength];

        for (int i = 0; i <arrayPosition ; i++) {

            tempArray[i]=arrayObjects[i];
        }
        tempArray[arrayPosition]=object;
        for (int i = arrayPosition+1; i <newLength; i++) {
            tempArray[i]=arrayObjects[i-1];
        }
        arrayObjects=tempArray;
    }

    public void remove(int arrayPosition) {

        int  newLength=arrayObjects.length-1;
        Object[] tempArray=new Object[newLength];

        for (int i = 0; i <arrayPosition ; i++) {
            tempArray[i]=arrayObjects[i];
        }

        for (int i = arrayPosition+1; i <arrayObjects.length ; i++) {
            tempArray[i-1]=arrayObjects[i];
        }
        arrayObjects=tempArray;
    }

    public int length(){
        return arrayObjects.length;
    }

    private boolean existingIndex(int index) throws ArrayIndexOutOfBoundsException{
        System.out.println(index>arrayObjects.length-1);
        if(index>arrayObjects.length-1){
            //System.out.println("non existing index");
            throw new ArrayIndexOutOfBoundsException();
           // return false;
        }
        return true;
    }
    public void list(){
        for (Object object:arrayObjects) {
            System.out.println(object);
        }
    }




}
