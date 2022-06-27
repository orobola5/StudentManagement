package App.Controller;


import App.Data.Models.Student;
import App.Dto.RequestDto;
import App.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentServices studentServices;


    @PostMapping("/student")
    public String addStudent(@RequestBody RequestDto requestDto){
       studentServices.addStudent(requestDto.getId(),requestDto.getName(),
               requestDto.getAge(),requestDto.getEmail());

        return "added successfully";
    }

    @GetMapping("/student/{name}")
    public List<Student> findByName(@PathVariable String name) {
       return studentServices.findByName(name);

    }
}
