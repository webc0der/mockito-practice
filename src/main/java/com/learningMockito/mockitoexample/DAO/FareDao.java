package com.learningMockito.mockitoexample.DAO;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learningMockito.mockitoexample.modal.AlternateFareCache;
import com.learningMockito.mockitoexample.repository.FareCacheRepository;

@Repository
public class FareDao {

	@Autowired
	private FareCacheRepository fareCacheRepository;

	static final private Logger LOG= LoggerFactory.getLogger(FareDao.class);

	public AlternateFareCache fareCacheDump(String id) {//

		try {
			return fareCacheRepository.findById(Long.parseLong(id)).get();
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return null;
		}

	}
}
