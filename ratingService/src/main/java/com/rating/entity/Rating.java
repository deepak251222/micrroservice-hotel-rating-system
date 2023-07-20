package com.rating.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="rating")
public class Rating {
 @Id
    private int ratingId;
    private int userId;
    private int hotelId;
    private int rating;
    private String feedback;
}
