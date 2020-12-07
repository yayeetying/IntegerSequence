import java.util.Arrays;
import java.util.NoSuchElementException;

public class Tester {
  public static void main(String[] argsssss) {

    IntegerSequence r = new Range(10,15);
    System.out.println("length of r is: " + r.length());
    while(r.hasNext()) {
      System.out.print(r.next());
      if (r.hasNext()) System.out.print(", ");
    }

    System.out.println();
    System.out.println();
    IntegerSequence n = new Range(-20,-13);
    try {
      for (int i = 0; i < 9; i++) { //lets get that exception
        System.out.print(n.next());
        if (n.hasNext()) System.out.print(", ");
      }
    }
    catch (NoSuchElementException e) {
      System.out.println(" wanted a bit too much for christmas");
    }
    System.out.println();

    IntegerSequence a = new Range(-20,-20);
    IntegerSequence u = new Range(0,0);
    IntegerSequence g = new Range(20,20);
    IntegerSequence h = new Range(-3,5);
    IntegerSequence t = new Range(0,25);
    IntegerSequence y = new Range(-15,0);


    IntegerSequence[] all = new IntegerSequence[]{n,a,u,g,h,t,y};
    for (int i = 0; i < all.length; i++) {
      System.out.println("length of " + all[i] + " is: " + all[i].length());
      while (all[i].hasNext()) {
        System.out.print(all[i].next());
        if (all[i].hasNext()) System.out.print(", ");
      }
      System.out.println();
      System.out.println();
    }

    u.reset();
    y.reset();

    try {
      for (int i = 0; i < 2; i++) { //lets get that exception
        System.out.print(u.next());
        if (u.hasNext()) System.out.print(", ");
      }
    }
    catch (NoSuchElementException e) {
      System.out.println(" wanted a bit too much for christmas");
    }
    System.out.println();


    try {
      for (int i = 0; i <= 16; i++) { //lets get that exception
        System.out.print(y.next());
        if (y.hasNext()) System.out.print(", ");
      }
    }
    catch (NoSuchElementException e) {
      System.out.println(" wanted a bit too much for christmas");
    }
    System.out.println();

  }
}
