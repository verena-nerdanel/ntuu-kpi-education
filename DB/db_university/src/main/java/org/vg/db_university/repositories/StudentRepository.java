package org.vg.db_university.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vg.db_university.entities.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {

}

