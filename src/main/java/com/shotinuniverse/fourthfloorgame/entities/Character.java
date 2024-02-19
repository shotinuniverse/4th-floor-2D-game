package com.shotinuniverse.fourthfloorgame.entities;

import com.shotinuniverse.fourthfloorgame.entities.common.Points;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "characters")
public class Character extends Points {

    @Field
    boolean speed_changes;

}
