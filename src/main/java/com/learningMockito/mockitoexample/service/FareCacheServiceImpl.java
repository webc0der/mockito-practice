package com.learningMockito.mockitoexample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningMockito.mockitoexample.DAO.FareDao;
import com.learningMockito.mockitoexample.modal.AlternateFareCache;
import com.learningMockito.mockitoexample.service_interface.FareService;

//FareCacheServiceImpl is SUT(System Under Test)
@Service(value = "fareCacheService")
public class FareCacheServiceImpl implements FareService {

	private static final Logger LOG= LoggerFactory.getLogger(FareCacheServiceImpl.class);
	
	@Autowired
	private FareDao fareCacheDao;
	
	@Override
	public AlternateFareCache fareCacheSearch(String id) {
		LOG.info(": : ::in fare cache serach:: : :");
		try {
			return fareCacheDao.fareCacheDump(id);
		} catch (Exception e) {
			LOG.error("UNABLE MAP FARE CAHCE REQUEST PARAMETERS {}",e.getMessage());
			return null;
		}
	}
}
