package org.vg.db_university.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity(name = "scholarship")
public class ScholarshipEntity {
    @Id
    @Column(name = "id")
    private Integer id;

//    @Column(name = "record_book_id")
//    private Integer studentId;

    @ManyToOne
    @JoinColumn(name = "record_book_id", nullable = false)
    private StudentEntity student;

    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "amount")
    private Double amount;
}
