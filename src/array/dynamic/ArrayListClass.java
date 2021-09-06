package array.dynamic;

public class ArrayListClass {
    private int arr[];
    private int capacity;
    private int current;

    public ArrayListClass() {
        this.arr = new int[1];
        this.capacity = 1;
        this.current = 0;
    }

    public void push(int data) {
        if ( this.current == this.capacity ) {
            this.capacity *= 2;

            int tmp[] = new int[this.capacity];
            for ( int i = 0; i < this.arr.length; i++ ) {
                tmp[i] = this.arr[i];
            }
            this.arr = tmp;
        }

        this.arr[this.current] = data;
        this.current++;
    }

    public void push(int data, int index) {
        if ( index < this.current && index >= 0 ) {
            this.arr[index] = data;
        } else {
            this.push(data);
        }
    }

    public int getSize() {
        return this.current;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int get(int index) {
        if ( index < this.current ) {
            return this.arr[index];
        }
        return -1;
    }

    public void pop() {
        this.current--;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < this.current; i++) {
            result += (i==0) ? this.arr[i] : ", " + arr[i] ;
        }
        return result + "]\n";
    }

}
