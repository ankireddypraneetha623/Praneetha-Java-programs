class stack{
    int top;
    int capacity;
    int arr[];
    stack(int capacity){
        this.capacity=capacity;
        top=-1;
        arr=new int[capacity];
    }
    boolean isFull(){
        return top==capacity-1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    void push(int item){
        if(isFull()){
            System.out.print("Overflow");
            return;
        }
        top++;
        arr[top]=item;
        System.out.println("Item pushed");
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -1;
        }
        return arr[top--];
    }
    int peek(){
        if(isEmpty()){
            System.out.print("Empty stack");
            return -1;
        }
        return arr[top];
    }
    void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        System.out.print("Elements:");
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
class stackDemo{
    public static void main(String[]args){
        stack s=new stack(6);
        s.push(1);
        s.push(3);
        s.display();
        System.out.println("Popped="+s.pop());
        System.out.println("Top element:"+s.peek());
        s.push(7);
        s.display();
    }
}