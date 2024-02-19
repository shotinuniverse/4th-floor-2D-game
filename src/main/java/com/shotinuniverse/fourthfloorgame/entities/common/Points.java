package com.shotinuniverse.fourthfloorgame.entities.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Points extends ServicesFields {
    @Field("pointX")
    int pointX;

    @Field("pointY")
    int pointY;

    @Field("width")
    int width;

    @Field("height")
    int height;

    @Field("speedX")
    int speedX;

    @Field("speedY")
    int speedY;
}
