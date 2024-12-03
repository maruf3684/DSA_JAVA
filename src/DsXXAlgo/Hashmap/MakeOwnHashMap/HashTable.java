package DsXXAlgo.Hashmap.MakeOwnHashMap;

import java.util.ArrayList;

public class HashTable {
    private ArrayList<HashEntry> bucket;
    private int size;
    private int slots;

    public HashTable() {
        bucket = new ArrayList<HashEntry>();
        slots = 5;
        size = 0;
        for (int i = 0; i < slots; i++){
            bucket.add(null);
        }
    }

    public int size() { return size; }
    public boolean isEmpty() { return size() == 0;}

    private int getIndex(String key)
    {
        int hashCode = key.hashCode();
        int index = hashCode % slots;
        return index;
    }


    public int get(String key){
        int b_Index = getIndex(key);
        HashEntry entry = bucket.get(b_Index);

        // Find the key in slots
        while (entry != null)
        {
            if (entry.key.equals(key)){
                return entry.value;
            }
            entry = entry.next;
        }

        // If key does not exist
        return -1;
    }

    public void insert(String key, int value){
        int bucket_index = getIndex(key);
        HashEntry entry = bucket.get(bucket_index);

        //if exist then update
        if(entry != null){
            if (entry.key.equals(key))
            {
                entry.value = value;
                return;
            }
            entry = entry.next;
        }

        //main khala
        this.size++;
        HashEntry previous_entry = bucket.get(bucket_index);
        HashEntry new_entry = new HashEntry(key, value);
        new_entry.next = previous_entry;
        bucket.set(bucket_index, new_entry);

        //If 60% of the array gets filled, double the size
        if ((1.0*size)/slots >= 0.6){
            ArrayList <HashEntry> old_bucket = bucket;
            bucket = new ArrayList<>(); //new bucket
            slots = 2 * slots;
            size = 0;

            for (int i = 0; i < slots; i++) {
                bucket.add(null);
            }

            for (HashEntry head_Node : old_bucket){
                while (head_Node != null)
                {
                    insert(head_Node.key, head_Node.value);
                    head_Node = head_Node.next;
                }
            }
        }

    }

    public int delete(String key){
        //Look for the index based on key
        int bucket_index = getIndex(key);
        HashEntry entry = bucket.get(bucket_index);

        // Search the key in slots
        HashEntry prev = null;
        while (entry != null)
        {
            // If the key exists
            if (entry.key.equals(key)){
                break;
            }

            //If the key not found yet
            prev = entry;
            entry = entry.next;
        }

        // If the key does not exist
        if (entry == null){
            //khujte khujte null e chole gase
            return -1;
        }

        //jodi entry pai
        size--;
        // Delete the value by  key
        if (prev != null){
            //chain er majhe or last a paise
            prev.next = entry.next;
        } else{
            //chain er 1st a paise
            bucket.set(bucket_index, entry.next);
        }

        return entry.value;
    }

}
