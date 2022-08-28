import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        //Added new
        System.out.println("Hello, World!");
        gameStart game1= new gameStart();
        game1.startMessage();

        ArrayList<egg> myList= new ArrayList<egg>();
        egg egg1= new egg();

        egg1.size=5;
        myList.add(egg1);
        
        egg egg2= new egg();
        myList.add(egg2);
        
        System.out.println("The size of the list is: " + myList.size());     
        System.out.println("does egg1 exist in it?  " + myList.contains(egg1));
        System.out.println("The index of the egg1 is: " + myList.indexOf(egg1));
        System.out.println("Is the ArrayList Empty? " + myList.isEmpty());
        myList.remove(egg1);
        System.out.println("does egg1 exist in it?  " + myList.contains(egg1));
        System.out.println("The index of the egg1 is: " + myList.indexOf(egg1));
        System.out.println("The index of the egg1 is: " + myList.indexOf(egg2));
        myList.add(egg1);
        System.out.println("The index of the egg1 is: " + myList.indexOf(egg1));
        myList.add(egg1);
        System.out.println("The index of the egg1 is: " + myList.indexOf(egg1));
        myList.remove(egg2);
        myList.add(egg1);
        System.out.println("The index of the egg1 is: " + myList.indexOf(egg1));
        myList.add(egg2);
        myList.add(egg1);
        System.out.println("The index of the egg2 is: " + myList.indexOf(egg2));
        Object o= myList.get(2);
        System.out.println(o);    



    }
}
