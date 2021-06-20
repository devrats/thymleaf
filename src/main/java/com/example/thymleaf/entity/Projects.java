/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/20/2021
 *   Time: 4:01 AM
 *   File: Projects.java
 */

package com.example.thymleaf.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pId;
    private String name;
    private int duration;
    private double valuation;
    @ManyToOne
    private Employee employee;

    public Projects(String name, int duration, double valuation, Employee employee) {
        this.name = name;
        this.duration = duration;
        this.valuation = valuation;
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "pId=" + pId +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", valuation=" + valuation +
                ", employee=" + employee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Projects)) return false;
        Projects projects = (Projects) o;
        return getpId() == projects.getpId() && getDuration() == projects.getDuration() && Double.compare(projects.getValuation(), getValuation()) == 0 && Objects.equals(getName(), projects.getName()) && Objects.equals(getEmployee(), projects.getEmployee());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getpId(), getName(), getDuration(), getValuation(), getEmployee());
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getValuation() {
        return valuation;
    }

    public void setValuation(double valuation) {
        this.valuation = valuation;
    }

    public Projects() {
    }

    public Projects(String name, int duration, double valuation) {
        this.name = name;
        this.duration = duration;
        this.valuation = valuation;
    }

    public Projects(int pId, String name, int duration, double valuation) {
        this.pId = pId;
        this.name = name;
        this.duration = duration;
        this.valuation = valuation;
    }
}