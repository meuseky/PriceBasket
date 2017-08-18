package pricebasket.domain.offer;

import pricebasket.domain.Product;

import java.math.BigDecimal;
import java.util.LinkedHashMap;


public class BuyItemGetPercentOffer implements Offer {

    private String description;
    private String inputProduct;
    private Integer inputAmount;
    private String outputProduct;
    private Integer outputAmount;
    private BigDecimal discountPercent;

    public BuyItemGetPercentOffer(String description, String inputProduct, Integer inputAmount,
                                  String outputProduct, Integer outputAmount) {
        description = this.description;
        inputProduct = this.inputProduct;
        inputAmount = this.inputAmount;
        outputProduct = this.outputProduct;
        outputAmount = this.outputAmount;
    }

    @Override
    public BigDecimal getOfferDiscount(LinkedHashMap<Product, Integer> productCount) {

        return null;
    }
}
