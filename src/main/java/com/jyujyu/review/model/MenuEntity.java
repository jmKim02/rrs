package com.jyujyu.review.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "menu")
@Entity
public class MenuEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long restaurantId;
    private String name;
    private Integer price;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
}
