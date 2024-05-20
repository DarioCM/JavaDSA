package org.example.lists.list;

import org.example.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImpl {



    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1","a",123));
        employeeList.add(new Employee("2","b",455));
        employeeList.add(new Employee("3","c",450));
        employeeList.add(new Employee("4","d",887));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.get(1));

    }


}
