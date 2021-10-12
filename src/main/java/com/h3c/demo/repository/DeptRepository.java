package com.h3c.demo.repository;

import com.h3c.demo.dto.DeptDTO;
import com.h3c.demo.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Long> {

    /**
     * @return
     */
    @Query(value = "select new com.h3c.demo.dto.DeptDTO(a.parentId, a.deptName) from Dept a")
    List<DeptDTO> selectCustomDept();
}
