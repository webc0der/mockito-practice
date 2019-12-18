package com.learningMockito.mockitoexample.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningMockito.mockitoexample.modal.AlternateFareCache;
import com.learningMockito.mockitoexample.service_interface.FareService;

@RestController
@RequestMapping(path= "/FareCacheDump")
public class FareController {
	
	static final private Logger LOG= LoggerFactory.getLogger(FareController.class);

	@Autowired
	@Qualifier("fareCacheService")
	FareService fareCacheService;
	
	@GetMapping(value = "/FixedSectorWise/{id}")
	public AlternateFareCache initFareCacheDump(@PathVariable String id) {
		LOG.info("REQUESTING FOR SECTORS ID: {}",id);
		return fareCacheService.fareCacheSearch(id);
	}
}
