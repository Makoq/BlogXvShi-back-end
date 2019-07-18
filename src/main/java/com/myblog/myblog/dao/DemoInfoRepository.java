package com.myblog.myblog.dao;
import com.myblog.myblog.entity.blogEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface DemoInfoRepository extends MongoRepository<blogEntity,String>{

}
