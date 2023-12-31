/*1. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it*/


import java.util.*;

class ArrayShuffle {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    Random rand = new Random();
    for (int i = 0; i < arr.length; i++) {
      int randomIndexToShuffle = rand.nextInt(arr.length);
      int temp = arr[randomIndexToShuffle];
      arr[randomIndexToShuffle] = arr[i];
      arr[i] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}
