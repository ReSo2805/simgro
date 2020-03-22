package de.rs.simgro.productstockservice.service;

import de.rs.simgro.productstockservice.dto.QuantityType;
import de.rs.simgro.productstockservice.dto.ProductStock;
import org.springframework.stereotype.Service;

@Service
public class ProductStockService {

    public ProductStock findProductStockBy(String productId) {
        ProductStock s = new ProductStock();
        s.setProductId(productId);
        s.setQuantityType(QuantityType.BOX);
        s.setQuantity(66.6);
        return s;
    }

}
