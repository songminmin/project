package org.song.mongo.repository;

import java.util.List;

import org.song.common.mongo.entity.MUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class MongoTemplateRepository {
	
	@Autowired
	MongoTemplate mongoTemplate;

	public List<MUser> searchAllUser() {
		return mongoTemplate.find(new Query(), MUser.class);
	}

}
