package com.trendy.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private String modelNo;
    private int price;
    private String imageUrl;
    private String brand; // ENUM 타입 문자열로 처리
    private String color;
    private int size;
    private String gender; // ENUM 타입 문자열로 처리
    private String createdBy; // ENUM 타입 문자열로 처리
}
