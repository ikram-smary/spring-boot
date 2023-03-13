package com.karrou.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "ikram",
                        "smary",
                        LocalDate.now(),
                        "smariikram@gmail.com",
                        28

                ),
                new Student(
                        "maynou",
                        "sSmary",
                        LocalDate.now(),
                        "smarian@gmail.com",
                        25

                )

        );
    }
}
