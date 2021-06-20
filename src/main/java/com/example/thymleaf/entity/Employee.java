/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/20/2021
 *   Time: 4:01 AM
 *   File: Employee.java
 */

package com.example.thymleaf.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eId;
    private String name;
    private String job;
    private long phone;
    private int salary;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "employee")
    private List<Projects> projects;

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", projects=" + projects +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return geteId() == employee.geteId() && getPhone() == employee.getPhone() && getSalary() == employee.getSalary() && Objects.equals(getName(), employee.getName()) && Objects.equals(getJob(), employee.getJob()) && Objects.equals(getProjects(), employee.getProjects());
    }

    @Override
    public int hashCode() {
        return Objects.hash(geteId(), getName(), getJob(), getPhone(), getSalary(), getProjects());
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }

    public Employee() {
    }

    public Employee(String name, String job, long phone, int salary, List<Projects> projects) {
        this.name = name;
        this.job = job;
        this.phone = phone;
        this.salary = salary;
        this.projects = projects;
    }

    public Employee(int eId, String name, String job, long phone, int salary, List<Projects> projects) {
        this.eId = eId;
        this.name = name;
        this.job = job;
        this.phone = phone;
        this.salary = salary;
        this.projects = projects;
    }
}