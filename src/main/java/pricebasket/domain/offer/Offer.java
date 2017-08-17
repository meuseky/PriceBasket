package pricebasket.domain.offer;


import pricebasket.domain.Product;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public interface Offer {
    BigDecimal getOfferDiscount(LinkedHashMap<Product, Integer> productCount);
}
