
package com.testing.loginsystem.datamodel.request;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends MongoRepository<UserDetails,String> {
    @Query(value="{userName:'?0'}")
    UserDetails find(String userName);

}


