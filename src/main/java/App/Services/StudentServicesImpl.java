package App.Services;

import App.Data.Models.Student;
import App.Data.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServicesImpl implements StudentServices {
    @Autowired
    private StudentRepository studentRepository;



    @Override
    public List<Student> findByName(String name) {

        return new ArrayList<>(studentRepository.findByName(name));
    }



    @Override
    public Student addStudent(String id, String name, int age, String email)
        {
            return studentRepository.save(new Student(id,name,age,email));

        }

        @Override
    public Optional<Student> findById(String id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student removeStudent(Student student) {
//        return studentRepository.delete(student);
        return  null;

    }


    @Override
    public Student updateFeePaid(int fees) {
        Student student = new Student();
        student.setFeesPaid(fees);
        return studentRepository.save(student);


    }

}
