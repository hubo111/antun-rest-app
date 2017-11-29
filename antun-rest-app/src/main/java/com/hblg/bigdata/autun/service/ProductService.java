package com.hblg.bigdata.autun.service;

import com.hblg.bigdata.autun.domain.Product;

public interface ProductService {

	Product findByChannelCode(String productCode);
	
}
