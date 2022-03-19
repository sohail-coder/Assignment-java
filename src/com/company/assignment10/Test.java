package com.company.assignment10;

public class Test {
    public static void main(String[] args) {
        SingleLinkedList<Integer> numbers = new SingleLinkedList<>();
        SListIterator it = numbers.getIterator();
        it.insert(1);
        it.insert(2);
        it.insert(3);
        it.display();
        it.delete(3);
        it.delete(2);
        it.display();
    }
}
