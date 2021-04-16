package com.pycogroup.todolist.service;

import com.pycogroup.todolist.model.Person;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonService extends MongoRepository<Person, ObjectId> {
}
