package com.ibercode;

public class OrderRequest {
    private String order;

    public OrderRequest() {
    }

    public OrderRequest(String order) {
        this.order = order;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "order='" + order + '\'' +
                '}';
    }
}
