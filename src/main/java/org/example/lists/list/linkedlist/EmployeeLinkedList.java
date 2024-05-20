package org.example.lists.list.linkedlist;

import org.example.Employee;

public class EmployeeLinkedList {

    private EmployeeNode head;



    public static void main(String[] args) {

        Employee employee1 = new Employee("111", "", 123);
        Employee employee2 = new Employee("222", "", 223);
        Employee employee3 = new Employee("3333", "", 323);
        Employee employee4 = new Employee("444444", "", 423);

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        employeeLinkedList.addToFront(employee1);
        employeeLinkedList.addToFront(employee2);
        employeeLinkedList.addToFront(employee3);
        employeeLinkedList.addToFront(employee4);

        employeeLinkedList.printList();

    }

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
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
