package com.company.assignment10;

public class SingleLinkedList<T> {
    Node<T> head;

    SingleLinkedList() {
        this.head = null;
    }

    SingleLinkedList(String data) {
        this.head = new Node(data);
    }

    public SListIterator<T> getIterator() {
        return new SListIterator<T>(head);
    }
}
