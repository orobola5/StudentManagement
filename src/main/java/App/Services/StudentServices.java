package App.Services;


import App.Data.Models.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface StudentServices {
    Student addStudent(String id, String name, int age, String email);

    Optional<Student> findById(String id);

    Student removeStudent(Student student);
    Student updateFeePaid( int fees);
    List<Student> findByName(String name);
}
