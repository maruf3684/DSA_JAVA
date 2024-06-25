package DsXXAlgo.Heap;

import java.util.Arrays;

class Heap{
    public int[] arr;
    public int size = 0;
    public int length;
    public Heap(int length) {
        this.arr = new int[length];
        this.length = arr.length;
    }

    public void add(int value){
        if (size >= arr.length) {
            throw new IllegalStateException("Heap is full");
        }
        this.arr[this.size] = value;
        this.size = this.size+1;
        adjustAdding();

    }

    public void remove(){
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }

        int pointer = this.size -1;
        arr[0] = arr[pointer];
        arr[pointer] = 0;
        size= size-1;
        adjustRemove(0);
        print();
    }

    public int get(){
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        return arr[0];
    }

    public void adjustAdding(){
        int pointer = this.size -1;
        while (pointer > 0 && arr[pointer] > arr[getParent(pointer)]){
            pointer = swap(pointer,getParent(pointer));
        }
    }

    public void adjustRemove(int pointer){
        int let_largeast = pointer;
        int left = getLeft(let_largeast);
        int right = getRight(let_largeast);

        if(left<size && arr[left]>arr[let_largeast]){
            let_largeast = left;
        }

        if(right<size && arr[right]>arr[let_largeast]){
            let_largeast = right;
        }

        if(let_largeast != pointer){
            int update_pointer = swap(pointer,let_largeast);
            adjustRemove(update_pointer);
        }

    }

    public int getParent(int index){
        return (index-1)/2;
    }

    public int getLeft(int index){
        return (2*index)+1;
    }

    public int getRight(int index){
        return (2*index)+2;
    }

    public int swap(int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return index2;
    }

    public void print(){
        System.out.println(Arrays.toString(this.arr));
    }
}
public class HeapImplement {
    public static void main(String[] args) {
          Heap heap = new Heap(10);
          heap.add(1);
          heap.add(2);
          heap.add(3);
          heap.add(4);
          heap.add(5);
          heap.add(6);
          heap.add(7);
          heap.add(8);
          heap.add(9);
          heap.add(10);
          heap.print();

          heap.remove();
          heap.remove();
          heap.remove();
          heap.remove();
          heap.remove();
          heap.remove();
          heap.remove();
          heap.remove();
          heap.remove();
          heap.remove();
    }
}
