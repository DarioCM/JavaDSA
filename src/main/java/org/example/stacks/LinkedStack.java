package org.example.stacks;

import org.example.Employee;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedStack {

    private LinkedList<Employee> stack;

    public LinkedStack(){
        stack = new LinkedList<>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public static void main(String[] args){

        Employee employee = new Employee("","",1);
        Employee employee1 = new Employee("","",2);
        Employee employee2 = new Employee("","",3);
        Employee employee3 = new Employee("","",4);
        Employee employee4 = new Employee("","",5);

    }

}
