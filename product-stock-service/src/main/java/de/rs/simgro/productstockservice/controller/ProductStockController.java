package de.rs.simgro.productstockservice.controller;

import de.rs.simgro.productstockservice.dto.ProductStock;
import de.rs.simgro.productstockservice.service.ProductStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/products/{productId}/stock")
public class ProductStockController {

    private final ProductStockService productStockService;

    @Autowired
    public ProductStockController(ProductStockService productStockService) {
        this.productStockService = productStockService;
    }

    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ProductStock findProductStockBy(@PathVariable String productId) {
        return productStockService.findProductStockBy(productId);
    }


}
