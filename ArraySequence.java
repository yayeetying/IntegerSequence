import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence {

  int currentIndex;
  int[] data;

  //construct the sequence by copying values from the other array into the data array
  public ArraySequence(int[] other) {
    data = new int[other.length];
    for (int i = 0; i < data.length; i++) {
      data[i] = other[i];
    }
  }

  // public ArraySequence(IntegerSequence otherseq) {
  //
  // }

}
