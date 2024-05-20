package org.example.stacks;

import org.example.Employee;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackArray {

    private Employee[] stack;
    private int top;

    public StackArray(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (top == stack.length) {
            // resize array
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length); // --> (0)n
            stack = newArray;
        }
        stack[top++] = employee;  //--> (O) 1
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public int size(){
        return top;
    }

    public void printStack() {
        Arrays.asList(stack).forEach(System.out::println);
    }


    public boolean isEmpty() {
        return top == 0;
    }


    public static void main(String[] args){
        StackArray stack = new StackArray(10);

        stack.push(new Employee("a","a", 123));
        stack.push(new Employee("a","a", 222));
        stack.push(new Employee("a","a", 333));
        stack.push(new Employee("a","a", 444));
        stack.push(new Employee("a","a", 555));

        stack.printStack();

        System.out.println(stack.peek());


    }
}
