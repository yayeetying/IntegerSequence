import java.util.Arrays;
import java.util.NoSuchElementException;

public class Tester2 {
  public static void main(String[] argsssss) {

    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);

    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    System.out.println();
    System.out.println();

    IntegerSequence r = new Range(10,20);
    IntegerSequence bas = new ArraySequence(r);

    System.out.println("ArraySequence(seq):");
    while(bas.hasNext()){
      System.out.print(bas.next()+", ");
    }
    System.out.println();
    System.out.println();

    IntegerSequence bas2 = new ArraySequence(r); //should be automatically resetted
    System.out.println("ArraySequence(seq x2):");
    while(bas2.hasNext()){
      System.out.print(bas2.next()+", ");
    }
    System.out.println();
    System.out.println();

    IntegerSequence santa = new Range(-3,5);
    while (santa.hasNext()) {
      System.out.print(santa.next() + ", ");
    }
    System.out.println(); //santa is used
    IntegerSequence lol = new ArraySequence(santa);
    System.out.println("ArraySequence for santa");
    while (lol.hasNext()) {
      System.out.print(lol.next() + ", ");
    }
    System.out.println(); //santa should be regernerated
    IntegerSequence rofl = new ArraySequence(santa);
    System.out.println("ArraySequence for santa again");
    while (rofl.hasNext()) {
      System.out.print(rofl.next() + ", ");
    }
    System.out.println(); //santa should be regernerated once again
    System.out.println("Range santa");
    while (santa.hasNext()) {
      System.out.print(santa.next() + ", ");
    }
    System.out.println();
    System.out.println("Range santa again");
    while (santa.hasNext()) {
      System.out.print(santa.next() + ", ");
    }
    System.out.println();
    System.out.println("~~~~~~~");
    IntegerSequence ree = new Range(-10,10);
    for (int i = 0; i < 10; i++) { //ree is only partially used up
      System.out.print(ree.next() + ", ");
    }
    System.out.println();
    IntegerSequence tee = new ArraySequence(ree); //tee should start from beginning
    while (tee.hasNext()) {
      System.out.print(tee.next() + ", ");
    }
    System.out.println();




  }
}
