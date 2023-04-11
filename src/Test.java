

public class Test {
    public static void main(String[] args) {


        MyDynamicArray myDynamicArray = new MyDynamicArray();
        myDynamicArray.add(2);
        myDynamicArray.add(3);
        myDynamicArray.add(4);
        myDynamicArray.add(5);
        myDynamicArray.add(6);
        myDynamicArray.add(7);
        myDynamicArray.add(8);
        myDynamicArray.add(9);
        myDynamicArray.add(1);
        myDynamicArray.isEmpty();
        myDynamicArray.add(2, 3);
        myDynamicArray.indexOf(2);
        myDynamicArray.clear();
        myDynamicArray.remove(2);
        myDynamicArray.size();

        System.out.println(myDynamicArray);
        System.out.println(myDynamicArray);

    }
}
