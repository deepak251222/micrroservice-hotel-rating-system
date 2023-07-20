package com.spring.payload;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Rating {

    private int ratingId;
    private int userId;
    private int hotelId;
    private int rating;
    private String feedback;
    private Hotel hotel;
}
