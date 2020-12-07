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
    this.start = start;
    this.end = end;
    current = start-1;
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
    current = start-1;
  }

  public int length() {
    return end-start+1;
  }

}
