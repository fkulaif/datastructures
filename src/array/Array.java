public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length]; // create an array of size n
    }

    public void insert(int item){
        // If the array is full, resize it
        if(items.length == count){
            // Create a new array (twice the size)
            int[] newItems = new int[count*2];

            // Copy all the existent items
            for (int i=0; i<count; i++)
                newItems[i] = items[i];

            // Set 'items" to this new array
            items = newItems;
        }
        // Add the new item at the end
        items[count] = item; // items[count++] = item;
        count++;
    }
    public void print(){
        for (int i=0; i<count; i++) // items.length
            System.out.println(items[i]);
    }
}
