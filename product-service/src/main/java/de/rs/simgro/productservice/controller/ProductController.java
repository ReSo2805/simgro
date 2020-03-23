package de.rs.simgro.productservice.controller;

import de.rs.simgro.productservice.core.util.SimgroError;
import de.rs.simgro.productservice.dto.NewProduct;
import de.rs.simgro.productservice.dto.Product;
import io.vavr.control.Either;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/tenants/{tenantId}/products")
public class ProductController {


    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Either<SimgroError, Product> createProduct(@PathVariable String tenantId,
                                                      @RequestBody NewProduct product) {
        return Either.left(SimgroError.internal());
    }

    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Either<SimgroError, Product> findAllProducts(@PathVariable String tenantId) {
        return Either.left(SimgroError.internal());
    }

    @GetMapping(
            value = "/{productId}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Either<SimgroError, Product> findAllProducts(@PathVariable String tenantId,
                                                        @PathVariable String productId) {
        return Either.left(SimgroError.internal());
    }


}
