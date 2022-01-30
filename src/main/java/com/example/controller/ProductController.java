package com.example.controller;

import com.example.common.Result;
import com.example.entity.Product;
import com.example.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
     private ProductService productService;

    @PostMapping
    public Result<Product> save(@RequestBody Product product) {
        return Result.success(productService.save(product));
    }

    @PutMapping
    public Result<?> update(@RequestBody Product product) {
        return Result.success(productService.save(product));
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long id) {
        productService.delete(id);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result<Product> findById(@PathVariable Long id) {
        return Result.success(productService.findById(id));
    }

    @GetMapping
    public Result<List<Product>> findAll() {
        return Result.success(productService.findAll());
    }

    @GetMapping("/page")
    public Result<Page<Product>> findPage(@RequestParam(required = false, defaultValue = "1") Integer pageNum, @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success(productService.findPage(pageNum, pageSize));
    }

}