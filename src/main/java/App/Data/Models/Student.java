package App.Data.Models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Document("students")
public class Student{
    @NonNull
    @Id
    private String id;
    @NonNull
    private String name;
    @NonNull
    private Integer age;
    @NonNull
    private String email;
    private LocalDate dob;
    private  Integer grade;
    private Integer feesPaid;
    private Integer totalFees;


    }

