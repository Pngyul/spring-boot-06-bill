package com.pngyul.springboot.mapper;


import com.pngyul.springboot.entities.Bill;
import com.pngyul.springboot.entities.BillProvider;

import java.util.List;

/*
 * Copyright (c) 2019
 * @Author:pngyul@yeah.net
 * @LastModified:2019-03-28 18:38:05
 */


//@Mapper 或 @MapperScan("com.mengxuegu.springboot.mapper")
public interface BillMapper {

    List<BillProvider> getBills(Bill bill);

    BillProvider getBillByBid(Integer bid);

    int addBill(Bill bill);

    int updateBill(Bill bill);

    int deteleBillByBid(Integer bid);

}
