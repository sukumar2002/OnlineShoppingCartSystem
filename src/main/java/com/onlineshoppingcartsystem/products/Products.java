package com.onlineshoppingcartsystem.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Products {
    private String productName;
    private String productId;
    private double productPrice;
    private int productStock;
}
