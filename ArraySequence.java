import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence {

  private int currentIndex;
  private int[] data;

  //construct the sequence by copying values from the other array into the data array
  public ArraySequence(int[] other) {
    currentIndex = 0;
    data = new int[other.length];
    for (int i = 0; i < data.length; i++) {
      data[i] = other[i];
    }
  }

  // public ArraySequence(IntegerSequence otherseq) {
  //
  // }

  public void reset() {
    currentIndex = 0;
  }

  public int length() {
    return data.length;
  }

  public boolean hasNext() {
    return currentIndex < data.length;
  }

  public int next() {
    if (!hasNext()) throw new NoSuchElementException("there ain't more elements left");
    currentIndex++;
    return data[currentIndex-1];
  }
}
