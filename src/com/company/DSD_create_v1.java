package com.company;

public class DSD_create_v1 {
    DSD_create_v1(){
        Node head = new Node(0, null);
        Node tail = head;

        for(int i = 0; i < 9; i++){
            tail.next = new Node(i+1, null);
            tail=tail.next;
        }

        Node ref = head;
        while (ref!=null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
