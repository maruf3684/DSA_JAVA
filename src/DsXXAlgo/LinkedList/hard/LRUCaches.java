import java.util.HashMap;
import java.util.Map;

 class LRUCache {
    int capacity;
    int load;
    LinkListNode head;
    LinkListNode tail;
    Map<Integer,LinkListNode> map;

    class LinkListNode{
        LinkListNode left;
        LinkListNode right;
        Integer key;
        Integer value;

        public LinkListNode(LinkListNode left,LinkListNode right,Integer key,Integer value){
            this.left = left;
            this.right = right;
            this.key = key;
            this.value = value;
        }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.load = 0;
        this.map = new HashMap<>();
        this.head = new LinkListNode(null,null,null,null);
        this.tail = new LinkListNode(null,null,null,null);
        head.right = tail;
        tail.left = head;
    }

    public int get(int key) {
        if (map.containsKey(key)){
            LinkListNode selectedNode = map.get(key);
            selectedNode.left.right = selectedNode.right;
            selectedNode.right.left = selectedNode.left;
            selectedNode.right = head.right;
            selectedNode.left = head;
            head.right.left = selectedNode;
            head.right = selectedNode;
            return selectedNode.value;
        }else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            LinkListNode selectedNode = map.get(key);
            selectedNode.value = value;

            selectedNode.left.right = selectedNode.right;
            selectedNode.right.left = selectedNode.left;
            selectedNode.right = head.right;
            selectedNode.left = head;
            head.right.left = selectedNode;
            head.right = selectedNode;
        }else{
            if(load>=capacity){
                LinkListNode lastNode = tail.left;
                map.remove(lastNode.key);
                lastNode.left.right = tail;
                tail.left = lastNode.left;
            }
            LinkListNode node = new LinkListNode(null,null,key,value);
            node.left = head;
            node.right = head.right;
            node.left.right = node;
            node.right.left = node;
            map.put(node.key,node);
            this.load = this.load + 1;
        }
    }

    public void print(){
        var i = head;
        while (i != null){
            System.out.print(i.key);
            System.out.print("->");
            i=i.right;
        }
        System.out.println();
    }
}

//public void main(String[] args) {
//    LRUCache lRUCache = new LRUCache(2);
//    lRUCache.put(1,1);
//    lRUCache.put(2,2);
//    lRUCache.put(3,3);
//    lRUCache.put(4,4);
//    lRUCache.put(5,5);
//    lRUCache.print();
//    System.out.println(lRUCache.get(3));
//    lRUCache.print();
//}