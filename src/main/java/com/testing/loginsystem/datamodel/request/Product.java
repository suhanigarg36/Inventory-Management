package com.testing.loginsystem.datamodel.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "products_list")
@NoArgsConstructor
@Entity
public class Product {

    @JsonProperty(value = "productId")
    private String productId;
    private String productName;
    private String productSKUPriceUpdatedDate;
    private String brandId;
    private String industry;
    private String brandName;
    private String companyName;
    private int sgst;
    private String price;
    private String productSkuId;
    private String supplierId;
    private int inventoryAvailable;
    private String barcode;
    private String productSKULastUpdatedDate;
    private String mrp;
    private String purchasePrice;
    private String productLastUpdatedDate;
    private String productAlias;
    private int cgst;
    private String uqocName;
    private int igst;
    private int cess;
    private String sp;
    private String companyId;
    private String industryId;
    private String brandLastUpdatedDate;
    private String productStatus;
    private String entityId;


}
