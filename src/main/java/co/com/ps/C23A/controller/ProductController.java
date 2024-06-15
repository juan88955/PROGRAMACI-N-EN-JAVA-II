package co.com.ps.C23A.controller;

import co.com.ps.C23A.domain.Products;
import co.com.ps.C23A.service.IProductService;
import co.com.ps.C23A.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/product")
public class ProductController<Product> {

    private final IProductService productService;
    private Product Product;

    @GetMapping("/name/{name}")
    public ResponseEntity<Object> getProductByName(@PathVariable String name) {
        try {
            return ResponseEntity.ok(productService.findByName(name));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Object> saveProduct(@RequestBody Product product) {
        try {
            return ResponseEntity.ok(productService.save((Products) Product));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Products>> getAllProducts() {
        try {
            return ResponseEntity.ok(productService.findAll());
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Products> getProductById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(productService.findById(id));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<String> deleteProductById(@PathVariable("id") Long id) {
        try {
            productService.delete(id);
            return ResponseEntity.ok("ok");
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping
    public ResponseEntity<Object> updateProduct(@RequestBody ProductService product) {
        try {
            return ResponseEntity.ok(productService.update((Products) Product));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
