public class Array {
    private int[] items; private int count;

    public Array(int length){
        items = new int[length];
    }
    public void insert(int item){
        //if array is full , resize it

        //Add the new item at the end
        items[count++] = item;

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
