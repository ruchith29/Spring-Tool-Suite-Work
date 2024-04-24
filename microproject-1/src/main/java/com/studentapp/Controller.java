package com.studentapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	@Autowired
	private Student_repository sr;
	
	@GetMapping(value="/")
	public String welcomePage() {
		return "Welcome User!";
	}
	
	
	@GetMapping("/data")
	public List<Student> getData(){
		List<Student> ls=sr.findAll();
		return ls;
		
	}

	@PostMapping("/save")
	public String saveStudent(@RequestBody Student student) {
		
		sr.save(student);
		return "Successfully Saved";
		
	}
	
	@GetMapping("/{student_Id}")
	public List<Student> getValueById(@PathVariable int student_Id){
		List<Student> ls=sr.findAll();
		List<Student> l1=new ArrayList<Student>();
		for(Student l:ls ) {
			if (l.getStudent_Id()==student_Id) {
				l1.add(l);
				break;
			}
		}
		
		return l1;
		
	}
	
	@PutMapping("/update/{student_Id}")
	public String updateStudents(@PathVariable int student_Id,@RequestBody Student student) {
		Student std= sr.findById(student_Id).get();
		std.setStudent_Id(student.getStudent_Id());
		std.setStudent_Name(student.getStudent_Name());
		std.setStudent_Age(student.getStudent_Age());
		sr.save(std);
		return "Updated Successfully";
	}
}
