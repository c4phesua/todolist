package com.pycogroup.todolist.model;


import com.querydsl.core.annotations.QueryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tasks")
@Builder
@QueryEntity
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @Getter
    private ObjectId id;

    @Getter
    @Setter
    private String content;

    @Getter
    @Setter
    private String userId;

    @Getter
    @Setter
    private boolean done;
}
