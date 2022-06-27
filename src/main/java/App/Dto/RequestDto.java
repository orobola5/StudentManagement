package App.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestDto {
    private String id;
    private String name;
    private Integer age;
    private String email;
    private LocalDate dob;
}
