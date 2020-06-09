package com.company;

public class S3L {

    static Node head = null;

    S3L(){
        createHead(100);
        createHead(200);
        createTail(300);
        System.out.println(toString());
        Insert(1, 500);
        Insert(4, 999);
        Remove(3);
        System.out.println(toStringRec(head));
        System.out.println(toString());
        removeLast();
        removeFirst();
        System.out.println(toString());
    }

    public void createHead(int value){
        head = new Node(value, head);
    }

    public void createTail(int value){
        if (head != null){
            Node ref = head;
            while (true)
                if (ref.next == null){
                    ref.next = new Node(value, null);
                    break;
                }
                else
                    ref = ref.next;
        }
        else
            createHead(value);
    }

    public void Insert(int index, int value){
        Node ref = head;
        int counter = 0;
        while (ref != null)
            if (counter == index-1){
                Node next = ref.next;
                ref.next = new Node(value, next);
                break;
            }
            else{
                ref = ref.next;
                counter++;
            }
    }

    @Override
    public String toString() {
        String result = "";
        if (head != null){
            Node ref = head;
            while (ref != null){
                result += ref.value;
                ref = ref.next;
            }
        }
        return result;
    }

    public void removeFirst(){
        head = head.next;
    }

    public void removeLast(){
        Node ref = head;
        while (ref != null){
            if (ref.next.next == null){
                ref.next = null;
                break;
            }
            else
                ref = ref.next;
        }
    }

    public void Remove(int index){
        Node ref = head;
        int counter = 0;
        while (ref != null)
            if (counter == index-1){
                ref.next = ref.next.next;
                break;
            }
            else{
                ref = ref.next;
                counter++;
            }
    }

    public static String toStringRec(Node ref){
        if (ref != null)
            if (ref.next != null)
                return ref.value + toStringRec(ref.next);
            else
                return "" + ref.value;
        else
            return null;
    }
}
