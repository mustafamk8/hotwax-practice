package com.hotwax.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "order_part")
public class OrderPart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_PART_ID")
    private Long orderPartId;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
    private OrderHeader orderHeaderPart;

    @Column(name = "ORDER_PART_SEQ_ID", length = 40)
    private String orderPartSeqId;

    @Column(name = "PART_NAME", length = 255)
    private String partName;

    @Column(name = "STATUS_ID", length = 40)
    private String statusId;

    @Column(name = "VENDOR_PARTY_ID", length = 40)
    private String vendorPartyId;

    @Column(name = "CUSTOMER_PARTY_ID", length = 40)
    private String customerPartyId;

    @Column(name = "PART_TOTAL", precision = 24, scale = 4)
    private BigDecimal partTotal;

    @Column(name = "FACILITY_ID", length = 40)
    private String facilityId;

    @Column(name = "SHIPMENT_METHOD_ENUM_ID", length = 40)
    private String shipmentMethodEnumId;
    
    

	public OrderPart() {
		// TODO Auto-generated constructor stub
	}

	public Long getOrderPartId() {
		return orderPartId;
	}

	public void setOrderPartId(Long orderPartId) {
		this.orderPartId = orderPartId;
	}

	

	public OrderHeader getOrderHeaderPart() {
		return orderHeaderPart;
	}

	public void setOrderHeaderPart(OrderHeader orderHeaderPart) {
		this.orderHeaderPart = orderHeaderPart;
	}

	public String getOrderPartSeqId() {
		return orderPartSeqId;
	}

	public void setOrderPartSeqId(String orderPartSeqId) {
		this.orderPartSeqId = orderPartSeqId;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public String getVendorPartyId() {
		return vendorPartyId;
	}

	public void setVendorPartyId(String vendorPartyId) {
		this.vendorPartyId = vendorPartyId;
	}

	public String getCustomerPartyId() {
		return customerPartyId;
	}

	public void setCustomerPartyId(String customerPartyId) {
		this.customerPartyId = customerPartyId;
	}

	public BigDecimal getPartTotal() {
		return partTotal;
	}

	public void setPartTotal(BigDecimal partTotal) {
		this.partTotal = partTotal;
	}

	public String getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}

	public String getShipmentMethodEnumId() {
		return shipmentMethodEnumId;
	}

	public void setShipmentMethodEnumId(String shipmentMethodEnumId) {
		this.shipmentMethodEnumId = shipmentMethodEnumId;
	}

    

}
