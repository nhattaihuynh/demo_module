package com.example.common.entity.mongodb;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Setter
@Getter
public class History {

    @Id
    private String id;

    private String createdBy;

    private String action;

    private Date createdDate;

    private Date updatedDate;

    private String entity;
    

}
