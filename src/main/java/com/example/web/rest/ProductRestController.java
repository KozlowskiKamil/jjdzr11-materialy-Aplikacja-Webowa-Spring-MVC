package com.example.web.rest;

import com.example.web.dto.ProductDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
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

    @GetMapping("t-shirts/{id}")
    public ProductDto getProduct(@PathVariable Long id,
                                 @RequestParam(required = false, name = "text", defaultValue = "cool t-shirt") String name) {
        ProductDto productDto = new ProductDto();
        productDto.setId(id);
        productDto.setName(name);
        return productDto;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("t-shirts")
    public ProductDto saveProduct(@RequestBody ProductDto productDto) {
        // some code to save product
        return productDto;
    }
}
