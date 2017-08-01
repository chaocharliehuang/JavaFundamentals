import java.util.ArrayList;
public class ExceptionsGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        // for (int i = 0; i < myList.size(); i++) {
        //     try {
        //         Integer castedValue = (Integer) myList.get(i);
        //     } catch (ClassCastException e) {
        //         System.out.println(myList.get(i) + " ERROR ON INDEX{" + i + "}");
        //     }
        // }
    }
}