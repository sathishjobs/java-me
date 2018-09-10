import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class autoboxing {
    public static void main(String[] args){
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayLIst = new ArrayList<>();
        strArrayLIst.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>()
        // if we want to wrap primitive type in array list we need
        // to use autoboxing and unboxing concept to wrap primitive type to object wrapper
        // example 1
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        // example 2
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0;i<=10;i++){
            intArrayList.add(Integer.valueOf(i));
        }
        for(int i=0;i<=10;i++){
            System.out.println(i+"---> "+ intArrayList.get(i).intValue());
        }
    }

}
