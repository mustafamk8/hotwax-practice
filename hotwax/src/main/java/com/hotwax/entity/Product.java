package com.hotwax.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID", nullable = false)
    private Long productId;

    @ManyToOne
    @JoinColumn(name = "OWNER_PARTY_ID", referencedColumnName = "PARTY_ID")
    private Party ownerParty;

    @Column(name = "PRODUCT_NAME", length = 255)
    private String productName;

    @Column(name = "DESCRIPTION", length = 4095)
    private String description;

    @Column(name = "CHARGE_SHIPPING", length = 1)
    private Character chargeShipping;

    @Column(name = "RETURNABLE", length = 1)
    private Character returnable;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Party getOwnerParty() {
		return ownerParty;
	}

	public void setOwnerParty(Party ownerParty) {
		this.ownerParty = ownerParty;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Character getChargeShipping() {
		return chargeShipping;
	}

	public void setChargeShipping(Character chargeShipping) {
		this.chargeShipping = chargeShipping;
	}

	public Character getReturnable() {
		return returnable;
	}

	public void setReturnable(Character returnable) {
		this.returnable = returnable;
	}
	
	

    

}
