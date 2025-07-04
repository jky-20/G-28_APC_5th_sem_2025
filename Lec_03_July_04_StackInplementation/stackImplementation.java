package Lec_03_July_04_StackInplementation;

class Stack{
    protected int top;
    protected int size;
    protected int[] arr;
    Stack(int size){
        this.top = -1;
        this.size = size;
        this.arr = new int[size];
    }

    void put(int val){
        if(isFull()){
            System.out.println("Can't add element to the stack");
            return;
        }
        top++;
        arr[top] = val;
        System.out.println("Value added to stack");
    }

    void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty, Can't pop index");
            return;
        }
        // int topEle = arr[top];
        top--;
        return;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty, No top element is there");
            return -1;
        }
        return this.arr[top];
    }

    boolean isEmpty(){
        return this.top == -1;
    }
    boolean isFull(){
        return this.top == this.size - 1;
    }
}

class ResizeableStack extends Stack{

    public ResizeableStack() {
        super(3);
    }
    void put(int val){
        if(isFull()){
            resizeArray();
        }
        // top++;
        super.put(val);
    }

    void resizeArray(){
        int updatedSize = 2*size;
        int[] updatedArr = new int[updatedSize];
        for(int i=0 ; i<size ; i++){
            updatedArr[i] = arr[i];
        }
        arr = updatedArr;
        size = updatedSize;
    }
}

public class stackImplementation {
    public static void main(String[] args) {
        
        Stack s1 = new Stack(3);
        s1.put(10);
        s1.put(20);
        s1.put(30);
        s1.put(40);

        ResizeableStack st = new ResizeableStack();
        st.put(10);
        st.put(20);
        st.put(30);
        st.put(40);
        st.put(20);
    }
}
