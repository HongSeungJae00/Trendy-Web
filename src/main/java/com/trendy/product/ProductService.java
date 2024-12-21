package com.trendy.product;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@Transactional
public class ProductService {
    private final ProductRepository productRepository;

    public Product createProduct(ProductDTO productDTO) {
        Product product = Product.builder()
            .name(productDTO.getName())
            .modelNo(productDTO.getModelNo())
            .price(productDTO.getPrice())
            .imageUrl(productDTO.getImageUrl())
            .brand(Product.Brand.valueOf(productDTO.getBrand())) // 문자열을 ENUM으로 변환
            .color(productDTO.getColor())
            .size(productDTO.getSize())
            .gender(productDTO.getGender() != null ? Product.Gender.valueOf(productDTO.getGender()) : null)
            .createdBy(productDTO.getCreatedBy() != null ? Product.CreatedBy.valueOf(productDTO.getCreatedBy()) : null)
            .createdAt(LocalDateTime.now())
            .updatedAt(LocalDateTime.now())
            .build();

        return productRepository.save(product);
    }
}
