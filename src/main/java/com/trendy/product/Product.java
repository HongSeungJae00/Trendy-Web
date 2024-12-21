package com.trendy.product;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Table(name = "product") // 테이블 이름 매핑
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", updatable = false)
    private Long id;

    @Column(name = "product_name", nullable = false)
    private String name;
    
    @Column(name = "model_no", unique = true)
    private String modelNo;
    
    @Column(nullable = false)
    private int price;

    @Column(name = "image_url")
    private String imageUrl;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Brand brand; // ENUM 타입 매핑

    @Column
    private String color;

    @Column(nullable = false)
    private int size;

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    @Column(name = "created_by")
    private CreatedBy createdBy;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    public enum Brand {
        Nike, Adidas, Asics, New_Balance, Reebok, Others
    }

    public enum Gender {
        male, female
    }

    public enum CreatedBy {
        admin, seller
    }
}
