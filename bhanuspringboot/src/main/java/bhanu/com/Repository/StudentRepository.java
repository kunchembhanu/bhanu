package bhanu.com.Repository;

import org.springframework.data.repository.CrudRepository;

import bhanu.com.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
