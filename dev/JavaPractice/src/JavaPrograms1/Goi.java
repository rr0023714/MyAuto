package JavaPrograms1;

import java.util.ArrayList;
import java.util.Collections;
public class Goi
{
     public static void main(String [] args)
     {
          ArrayList<String> al1= new ArrayList<String>();
          ArrayList<Integer> il1= new ArrayList<Integer>();
          al1.add("hi");
          al1.add("How are you");
          al1.add("Good Morning");
          al1.add("bye");
          al1.add("Good night");

          ArrayList<String> al2= new ArrayList<String>();
          al2.add("Howdy");
          al2.add("Good Evening");
          al2.add("bye");
          al2.add("Good night");

          //Storing the comparison output in ArrayList<String>
          ArrayList<String> al3= new ArrayList<String>();
          for (String temp : al1)
              al3.add(al2.contains(temp) ? "Yes" : "No");
          System.out.println(al3);

          //Storing the comparison output in ArrayList<Integer>
          ArrayList<Integer> al4= new ArrayList<Integer>();
          for (String temp2 : al1)
               al4.add(al2.contains(temp2) ? 1 : 0);
          System.out.println(al4);
          
          il1.add(25);
          il1.add(154);
          il1.add(24);
          il1.add(22);
          il1.add(32);
          il1.add(45);
          System.out.println(il1);
          Collections.sort(il1);
          System.out.println("After sorting");
          for(int counter : il1){
        	  System.out.println(counter);
          }
          System.out.println(il1);
          Collections.sort(al1);

          System.out.println("Reverse Sort");
          Collections.reverse(il1);
          for(int counter: il1){
        	  System.out.println(counter);
          }
          Collections.reverse(al1);
          System.out.println(al1);
          System.out.println(il1);
     }
}