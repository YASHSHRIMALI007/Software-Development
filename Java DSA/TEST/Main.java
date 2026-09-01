import java.util.*;

public class Main {

  public static void main(String[] args) {

    // Array
    int[] arr = { 5, 2, 8, 1, 9 };

    System.out.println("Original Array:");
    printArray(arr);

    Arrays.sort(arr);

    System.out.println("Sorted Array:");
    printArray(arr);

    // String
    String str = "hello";

    System.out.println("\nString: " + str);
    System.out.println("Length: " + str.length());

    // ArrayList
    ArrayList<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(20);
    list.add(30);

    System.out.println("\nArrayList: " + list);

    // Stack
    Stack<Integer> stack = new Stack<>();

    stack.push(10);
    stack.push(20);
    stack.push(30);

    System.out.println("\nStack: " + stack);
    System.out.println("Pop: " + stack.pop());
    System.out.println("Top: " + stack.peek());

    // Queue
    Queue<Integer> queue = new LinkedList<>();

    queue.offer(10);
    queue.offer(20);
    queue.offer(30);

    System.out.println("\nQueue: " + queue);
    System.out.println("Remove: " + queue.poll());
    System.out.println("Front: " + queue.peek());

    // HashMap
    HashMap<Integer, String> map = new HashMap<>();

    map.put(1, "Apple");
    map.put(2, "Banana");
    map.put(3, "Mango");

    System.out.println("\nHashMap: " + map);
    System.out.println("Value for key 2: " + map.get(2));
  }

  // Print array
  static void printArray(int[] arr) {

    for (int x : arr) {
      System.out.print(x + " ");
    }

    System.out.println();
  }
}
