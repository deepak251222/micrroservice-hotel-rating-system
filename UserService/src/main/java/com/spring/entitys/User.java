package com.spring.entitys;


import com.spring.payload.Rating;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="my_user")
public class User {
  @Id
    private int userId;
    private String name;
    private String email;
    private String about;

    @Transient  //if we not want to store into database
    private List<Rating> rating=new ArrayList<>();
}
