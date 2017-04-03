package com.grocery.dao;

import java.util.List;

import com.grocery.model.CartInfo;
import com.grocery.model.OrderDetailInfo;
import com.grocery.model.OrderInfo;
import com.grocery.model.PaginationResult;



public interface OrderDAO {
	public void saveOrder(CartInfo cartInfo);
	 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}
