package org.vg.db_university.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.vg.db_university.dto.ScholarshipStatDto;
import org.vg.db_university.entities.ScholarshipEntity;

import java.util.List;

public interface ScholarshipRepository extends CrudRepository<ScholarshipEntity, Integer> {
    @Query(value = "SELECT \n" +
            "students.record_book_id AS id, \n" +
            "name AS name, \n" +
            "count(amount) AS count, \n" +
            "sum(amount) AS sum, \n" +
            "avg(amount) AS average, \n" +
            "min(amount) AS min, \n" +
            "max(amount) AS max \n" +
            "FROM students, scholarship \n" +
            "WHERE students.record_book_id = scholarship.record_book_id \n" +
            "GROUP BY students.record_book_id, name \n" +
            "ORDER BY name", nativeQuery = true)
    List<ScholarshipStatDto> getStatistics();
}

