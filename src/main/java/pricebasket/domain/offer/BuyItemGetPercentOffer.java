package pricebasket.domain.offer;

import pricebasket.domain.Product;

import java.math.BigDecimal;
import java.util.LinkedHashMap;


public class BuyItemGetPercentOffer implements Offer {

    private String description;

    public BuyItemGetPercentOffer(String description) {

    }

    @Override
    public BigDecimal getOfferDiscount(LinkedHashMap<Product, Integer> productCount) {
        return null;
    }
}
