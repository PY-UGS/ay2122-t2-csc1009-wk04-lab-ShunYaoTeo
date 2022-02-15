public class StackOfIntegers {
    int[] elements;
    int size = 0;
    int capacity = 16;

    StackOfIntegers() {
        this.capacity = capacity;
        this.elements = new int[capacity];
    }

    boolean empty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    int peak(){

        return this.elements[this.size];
    }

    void push(int value){
        this.elements[this.size] = value;
        this.size ++;
    }

    int pop(){
        this.size --;
        return this.elements[this.size];
    }

    public int getSize() {
        return size;
    }
}

