package br.com.invelox.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cursos")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 150, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String category;

}