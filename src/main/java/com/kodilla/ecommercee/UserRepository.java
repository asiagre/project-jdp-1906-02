package com.kodilla.ecommercee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    User save(User user);
}
