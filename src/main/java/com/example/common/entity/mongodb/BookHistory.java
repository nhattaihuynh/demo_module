package com.example.common.entity.mongodb;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Setter
@Getter
@Document(collection = "book_his")
public class BookHistory extends History{

    @Field
    private String sku;

    @Field
    private Integer quantity;
}
