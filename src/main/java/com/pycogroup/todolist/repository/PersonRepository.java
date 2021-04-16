package com.pycogroup.todolist.repository;

import com.pycogroup.todolist.model.Person;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, ObjectId> {
}
