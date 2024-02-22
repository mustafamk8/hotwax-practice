package com.hotwax.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "order_header")
public class OrderHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID", nullable = false)
    private Long orderId;

    @Column(name = "ORDER_NAME", length = 255)
    private String orderName;

    @Column(name = "PLACED_DATE")
    private LocalDateTime placedDate;

    @Column(name = "APPROVED_DATE")
    private LocalDateTime approvedDate;

    @Column(name = "STATUS_ID", length = 40)
    private String statusId;

    @Column(name = "CURRENCY_UOM_ID", length = 40)
    private String currencyUomId;

    @Column(name = "PRODUCT_STORE_ID", length = 40)
    private String productStoreId;

    @Column(name = "SALES_CHANNEL_ENUM_ID", length = 40)
    private String salesChannelEnumId;

    @Column(name = "GRAND_TOTAL", precision = 24, scale = 4)
    private BigDecimal grandTotal;

    @Column(name = "COMPLETED_DATE")
    private LocalDateTime completedDate;

    @OneToMany(mappedBy = "orderHeaderPart")
    private List<OrderPart> orderParts;

    @OneToMany(mappedBy = "orderHeader")
    private List<OrderItem> orderItems;
    
    
    

	public OrderHeader() {
		// TODO Auto-generated constructor stub
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public LocalDateTime getPlacedDate() {
		return placedDate;
	}

	public void setPlacedDate(LocalDateTime placedDate) {
		this.placedDate = placedDate;
	}

	public LocalDateTime getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(LocalDateTime approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public String getCurrencyUomId() {
		return currencyUomId;
	}

	public void setCurrencyUomId(String currencyUomId) {
		this.currencyUomId = currencyUomId;
	}

	public String getProductStoreId() {
		return productStoreId;
	}

	public void setProductStoreId(String productStoreId) {
		this.productStoreId = productStoreId;
	}

	public String getSalesChannelEnumId() {
		return salesChannelEnumId;
	}

	public void setSalesChannelEnumId(String salesChannelEnumId) {
		this.salesChannelEnumId = salesChannelEnumId;
	}

	public BigDecimal getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(BigDecimal grandTotal) {
		this.grandTotal = grandTotal;
	}

	public LocalDateTime getCompletedDate() {
		return completedDate;
	}

	public void setCompletedDate(LocalDateTime completedDate) {
		this.completedDate = completedDate;
	}

//	public List<OrderPart> getOrderParts() {
//		return orderParts;
//	}
//
//	public void setOrderParts(List<OrderPart> orderParts) {
//		this.orderParts = orderParts;
//	}
//
//	public List<OrderItem> getOrderItems() {
//		return orderItems;
//	}
//
//	public void setOrderItems(List<OrderItem> orderItems) {
//		this.orderItems = orderItems;
//	}
    
    
    
}
