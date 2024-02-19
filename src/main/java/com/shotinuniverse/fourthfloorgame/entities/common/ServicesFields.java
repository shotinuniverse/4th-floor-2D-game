package com.shotinuniverse.fourthfloorgame.entities.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class ServicesFields {

    @Id
    @Field(name="_id")
    protected int _id;

    @Field(name="_class")
    protected String _class;

}
