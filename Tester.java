public class Tester {
  public static void main(String[] argsssss) {

    IntegerSequence r = new Range(10,15);
    System.out.println("length of r is: " + r.length());
    while(r.hasNext()) {
      System.out.print(r.next());
      if (r.hasNext()) System.out.print(", ");
    }
    System.out.println();

  }
}
