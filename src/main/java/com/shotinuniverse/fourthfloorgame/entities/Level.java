package com.shotinuniverse.fourthfloorgame.entities;

import com.shotinuniverse.fourthfloorgame.entities.common.ServicesFields;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "levels")
public class Level extends ServicesFields {

    @Field
    String number;
    @Field
    ArrayList<Texture> textures;
    @Field
    ArrayList<Mob> mobs;
    @Field
    ArrayList<Character> characters;

}
