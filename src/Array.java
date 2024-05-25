public class Array {
    private int[] items; private int count;

    public Array(int length){
        items = new int[length];
    }
    public void insert(int item) {
        // If the array is full, resize it
        if (count == items.length) {
            // Create a new array with double the size
            int[] newArray = new int[items.length * 2];

            // Copy the elements from the old array to the new array
            for (int i = 0; i < items.length; i++) {
                newArray[i] = items[i];
            }

            // Assign the new array to the items array
            items = newArray; //var items now pointing to larger array thar var newArray was pointing to
        }

        // Add the new item at the end
        items[count++] = item;
    }

    public void removeAt(int index) {

        for (int i = index ; index < count; index++) {
            items[index] = items[index + 1];
        }
    }

    public void print (){
        for (int i = 0; i < count ; i++) {
            System.out.println(items[i]);
            //count se zyada bada i jaa sakta bhale, since array length can be bigger than count
            //bas print nahi hoga, count will be print stopper

            //yaha code fatt rha tha
            // remember, a computer will never do
            // that which it is not instructed.
            // System.out.println(items[count]);

        }
    }

}
