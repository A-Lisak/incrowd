package com.incrowd.incrowd.conf;

import com.incrowd.incrowd.model.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    //
}

