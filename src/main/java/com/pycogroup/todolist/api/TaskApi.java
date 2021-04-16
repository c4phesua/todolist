package com.pycogroup.todolist.api;

import com.pycogroup.todolist.api.model.CreateTaskRequest;
import com.pycogroup.todolist.api.model.ObjectCreationSuccessResponse;
import com.pycogroup.todolist.api.model.ObjectDeleteSuccessResponse;
import com.pycogroup.todolist.api.model.ObjectUpdateSuccessResponse;
import com.pycogroup.todolist.api.model.UpdateTaskStatusRequest;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;

public class TaskApi implements TasksApi {
    @Override
    public ResponseEntity<ObjectCreationSuccessResponse> createTask(@Valid CreateTaskRequest createTaskRequest) {
        return null;
    }

    @Override
    public ResponseEntity<ObjectDeleteSuccessResponse> deleteTask(@Valid String id) {
        return null;
    }

    @Override
    public ResponseEntity<ObjectUpdateSuccessResponse> updateContent(@Valid UpdateTaskStatusRequest updateTaskStatusRequest) {
        return null;
    }

    @Override
    public ResponseEntity<ObjectUpdateSuccessResponse> updateStatus(@Valid UpdateTaskStatusRequest updateTaskStatusRequest) {
        return null;
    }
}
