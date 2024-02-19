package com.shotinuniverse.fourthfloorgame.entities;

import com.shotinuniverse.fourthfloorgame.entities.common.ServicesFields;
import com.shotinuniverse.fourthfloorgame.entities.common.Points;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Texture extends Points {

    @Field
    String name;

}
