package org.vg.db_university.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity(name = "students")
public class StudentEntity {
    @Id
    @Column(name = "record_book_id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "mass")
    private Integer mass;

    @Column(name = "height")
    private Integer height;

    @Column(name = "average_score")
    private Double averageScore;
}
