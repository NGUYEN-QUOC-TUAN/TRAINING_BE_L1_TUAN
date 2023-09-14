package com.example.tranding_l1_tuan_2003.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String code;
    private String email;
    private String phone;
    private Integer age;
}
