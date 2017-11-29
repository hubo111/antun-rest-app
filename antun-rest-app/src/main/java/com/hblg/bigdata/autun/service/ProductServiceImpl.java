package com.hblg.bigdata.autun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hblg.bigdata.autun.domain.Product;
import com.hblg.bigdata.autun.domain.ProductExample;
import com.hblg.bigdata.autun.domain.ProductExample.Criteria;
import com.hblg.bigdata.autun.mapper.ProductMapper;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductMapper productMapper;

	@Override
	public Product findByChannelCode(String productCode) {
		ProductExample productExample = new ProductExample();
		Criteria createCriteria = productExample.createCriteria();
		createCriteria.andCodeEqualTo(productCode);
		List<Product> selectByExample = productMapper.selectByExample(productExample);
		if(selectByExample.isEmpty())
			return null;
		return selectByExample.get(0);
		
	}
}
	
	
