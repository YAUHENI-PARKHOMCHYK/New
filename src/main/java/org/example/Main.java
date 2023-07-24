package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


    Emploee worker1 = new Emploee("Yauheni","Production","Engineer",2700);
    Emploee worker2 = new Emploee("Natallia","Marketing","Manager",1300);
    Emploee worker3 = new Emploee("Yri","Production","Locksmith",700);
    Emploee worker4 = new Emploee("Valeriy","Production","Locksmith",700);
    Emploee worker5 = new Emploee("Elena","bookkeeping","accountant",2200);


   List<Emploee> staff = Arrays.asList(worker1,worker2,worker3,worker4,worker5);

    Map<String,Long> postWorkers = staff.stream().collect(Collectors.groupingBy((worker)->worker.post, Collectors.counting()));
        System.out.println(postWorkers);

    double salaryMiddle= staff.stream().mapToDouble(Emploee::getSalary).average().orElse(0);
        System.out.println(salaryMiddle);

    List<Emploee> workersSalary = staff.stream().filter(worker->worker.salary>1000).toList();
        System.out.println(workersSalary);

        Map<String,Double> salaryUpp = staff.stream().filter(i->i.department.equals("Marketing")).collect(Collectors.toMap(worker->worker.name, x->x.salary*1.15));
        System.out.println(salaryUpp);


    }
}