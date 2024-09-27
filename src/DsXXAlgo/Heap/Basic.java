package DsXXAlgo.Heap;

public class Basic {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<Integer>();
        heap.insert(50);
        heap.insert(30);
        heap.insert(40);
        heap.insert(10);
        heap.insert(5);
        heap.insert(20);
        heap.insert(30);
        heap.insert(60);

        heap.print();
        System.out.println(heap.heapSort());
    }
}
