package stack;
// Stack based on the linked list
// The guard is used to determine the empty stack

public class LinkedStack<T> {
    private static class Node<U>{
        U item;
        Node<U> next;
        Node() {item = null; next = null;}
        Node(U item, Node<U> next){
            this.item = item;
            this.next = next;
        }
        boolean end(){return item == null && next == null;}
    }
    private Node<T> top = new Node<>(); // guard
    private void push(T item){
        top = new Node<>(item, top);
    }
    private T pop(){
        T result = top.item;
        if(!top.end())
            top = top.next;
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for(String s : "This is not very long line".split(" "))
            lss.push(s);
        String s;
        while ((s = lss.pop()) != null)
            System.out.println(s);
    }
}
