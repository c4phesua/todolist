package com.pycogroup.todolist.service;

import com.pycogroup.todolist.model.Task;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TaskService extends MongoRepository<Task, ObjectId> {
    List<Task> findAllByUserId(String userId);

    void deleteById(ObjectId id);
}
