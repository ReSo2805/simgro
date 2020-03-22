package de.rs.simgro.productstockservice.dto;

import lombok.Data;

@Data
public class ProductStock {
    private String productId;
    private QuantityType quantityType;
    private double quantity;
}
