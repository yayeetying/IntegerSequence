//implement interface as a Range object;
//Range is an IntegerSequence that is a contiguous range from a to b inclusive [a,b]
//Range does not allow non-consecutive values
//use a start/end value; keep track of the current value
//throw a NoSuchElementException when user tries to get next value but no values are left

import java.util.NoSuchElementException;

public class Range implements IntegerSequence {

  private int start, end, current;
  //start: the starting value (inclusive) which must be <= end
  //end: the ending value (also inclusive)

  //constructor
  public Range(int start, int end) {
    if (start > end) throw new IllegalArgumentException("you can't start > end duhh");
    this.start = start;
    this.end = end;
    current = start;
  }

  // public int getStart() {
  //   return start;
  // }
  // public int getEnd() {
  //   return end;
  // }
  // public int getCurrent() {
  //   return current;
  // }

  public void reset() {
    current = start;
  }

  public int length() {
    return end-start+1;
  }

  //when current is no longer a valid element in the range, it should return false
  public boolean hasNext() {
    return current <= end;
  }

  //throws NoSuchElementException when hasNext() is false
  //this will return the current values
  //will also increase current value by one (doesn't return this increased value yet)
  //ie. if current is 5: next() will make current 6, and return 5
  public int next() {
    if (!hasNext()) throw new NoSuchElementException("there ain't more elements left");
    current++;
    return current-1;
  }



}
