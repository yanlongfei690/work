package io.ylf.jcartadministrationback.dto.out;


public class ReturnListOutDTO {

    private Integer returnId;
    private Long orderId;
    private Integer customerId;
    private String CustomerName;
    private String productCode;
    private String productName;
    private Byte status;
    private Long createTimetamp;
    private Long updateTimetamp;

    public Integer getReturnId() {
        return returnId;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreateTimetamp() {
        return createTimetamp;
    }

    public void setCreateTimetamp(Long createTimetamp) {
        this.createTimetamp = createTimetamp;
    }

    public Long getUpdateTimetamp() {
        return updateTimetamp;
    }

    public void setUpdateTimetamp(Long updateTimetamp) {
        this.updateTimetamp = updateTimetamp;
    }
}
