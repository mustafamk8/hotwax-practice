package com.hotwax.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "order_item")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ITEM_ID")
    private Long orderItemId;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
    private OrderHeader orderHeader;

    @Column(name = "ORDER_ITEM_SEQ_ID", length = 40)
    private String orderItemSeqId;

    @Column(name = "PRODUCT_ID", length = 40)
    private String productId;

    @Column(name = "ITEM_DESCRIPTION", length = 255)
    private String itemDescription;

    @Column(name = "QUANTITY", precision = 26, scale = 6)
    private BigDecimal quantity;

    @Column(name = "UNIT_AMOUNT", precision = 25, scale = 5)
    private BigDecimal unitAmount;

    @Column(name = "ITEM_TYPE_ENUM_ID", length = 40)
    private String itemTypeEnumId;

    @Column(name = "PARENT_ITEM_SEQ_ID", length = 40)
    private String parentItemSeqId;
    
    

	public OrderItem() {
		// TODO Auto-generated constructor stub
	}

	public Long getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}

	public OrderHeader getOrderHeader() {
		return orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

	public String getOrderItemSeqId() {
		return orderItemSeqId;
	}

	public void setOrderItemSeqId(String orderItemSeqId) {
		this.orderItemSeqId = orderItemSeqId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getUnitAmount() {
		return unitAmount;
	}

	public void setUnitAmount(BigDecimal unitAmount) {
		this.unitAmount = unitAmount;
	}

	public String getItemTypeEnumId() {
		return itemTypeEnumId;
	}

	public void setItemTypeEnumId(String itemTypeEnumId) {
		this.itemTypeEnumId = itemTypeEnumId;
	}

	public String getParentItemSeqId() {
		return parentItemSeqId;
	}

	public void setParentItemSeqId(String parentItemSeqId) {
		this.parentItemSeqId = parentItemSeqId;
	}

    
    

}
