package com.example.web.rest;

import com.example.web.dto.ProductDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products/clothes")
public class ProductRestController {

    @GetMapping("best")
    public ProductDto getTheBest() {
        ProductDto productDto = new ProductDto();
        productDto.setId(1L);
        productDto.setName("best product");
        return productDto;
    }
}
