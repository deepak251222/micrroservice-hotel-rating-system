package com.spring.payload;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Hotel {
    private int hotelId;
    private String name;
    private String location;
    private String about;
}
