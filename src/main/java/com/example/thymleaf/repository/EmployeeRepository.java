/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/20/2021
 *   Time: 4:10 AM
 *   File: EmployeeRepository.java
 */

package com.example.thymleaf.repository;

import com.example.thymleaf.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public Employee findByName(String name);
}