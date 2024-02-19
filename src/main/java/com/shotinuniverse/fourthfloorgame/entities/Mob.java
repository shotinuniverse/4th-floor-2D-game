package com.shotinuniverse.fourthfloorgame.entities;

import com.shotinuniverse.fourthfloorgame.entities.common.Points;
import org.springframework.data.mongodb.core.mapping.Field;

public class Mob extends Points {

    @Field
    String name;
    @Field
    boolean moving;
    @Field
    String type;

}
