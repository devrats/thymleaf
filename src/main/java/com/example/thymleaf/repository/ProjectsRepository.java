/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/20/2021
 *   Time: 4:10 AM
 *   File: ProjectsRepository.java
 */

package com.example.thymleaf.repository;

import com.example.thymleaf.entity.Projects;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProjectsRepository extends JpaRepository<Projects, Integer> {
    @Query("from Projects as p where p.employee.eId =:x")
    public Page<Projects> findByUser(@Param("x") int id, Pageable pageable);
}