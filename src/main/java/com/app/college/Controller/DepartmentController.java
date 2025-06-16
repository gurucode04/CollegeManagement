package com.app.college.Controller;

import java.util.List;

import javax.management.relation.RelationNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.college.Entity.Department;
import com.app.college.Service.DepartmentService;

@RestController
@RequestMapping("/api/Departments") //Base URL
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<Department> create(@RequestBody Department department){
        return new ResponseEntity<>(departmentService.createDepartment(department), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> get(@PathVariable Long id){
        return ResponseEntity.ok(departmentService.getDepartment(id));
    }

    @GetMapping
    public List<Department> getAll(){
        return departmentService.getAllDepartments();
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Department> update(@PathVariable Long id, @RequestBody Department department){
        return ResponseEntity.ok(departmentService.updateDepartment(id, department));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) throws RelationNotFoundException{
        departmentService.deleteDepartment(id);
        return ResponseEntity.noContent().build();
    }

}
