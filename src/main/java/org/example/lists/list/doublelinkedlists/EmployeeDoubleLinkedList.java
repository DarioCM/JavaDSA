package org.example.lists.list.doublelinkedlists;

import org.example.Employee;
import org.example.lists.list.linkedlist.EmployeeNode;

public class EmployeeDoubleLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;


    public static void main(String[] args) {

        Employee employee1 = new Employee("111", "", 123);
        Employee employee2 = new Employee("222", "", 223);
        Employee employee3 = new Employee("3333", "", 323);
        Employee employee4 = new Employee("444444", "", 423);

        EmployeeDoubleLinkedList employeeDoubleLinkedList = new EmployeeDoubleLinkedList();
        employeeDoubleLinkedList.addToFront(employee1);
        employeeDoubleLinkedList.addToFront(employee3);
        employeeDoubleLinkedList.addToFront(employee4);

        employeeDoubleLinkedList.printList();
        employeeDoubleLinkedList.addToEnd(employee2);

        employeeDoubleLinkedList.printList();

    }

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;

    }

    public EmployeeNode removeFromFront() {
        if (head == null) {
            return null;
        }

        EmployeeNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if (head == null) {
            return null;
        }

        EmployeeNode removedNode = tail;

        if (tail.getNext() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print("null");
    }

}

