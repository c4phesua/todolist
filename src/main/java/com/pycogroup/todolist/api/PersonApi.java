package com.pycogroup.todolist.api;

import com.pycogroup.todolist.api.model.CreatePersonRequest;
import com.pycogroup.todolist.api.model.ObjectCreationSuccessResponse;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;

public class PersonApi implements PersonsApi{
    @Override
    public ResponseEntity<ObjectCreationSuccessResponse> createUser(@Valid CreatePersonRequest createPersonRequest) {
        return null;
    }
}
