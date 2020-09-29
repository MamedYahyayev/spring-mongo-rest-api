package az.maqa.spring.mongo.repository;

import az.maqa.spring.mongo.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {



}
