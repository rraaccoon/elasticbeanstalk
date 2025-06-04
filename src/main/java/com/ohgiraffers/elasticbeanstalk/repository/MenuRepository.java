package com.ohgiraffers.elasticbeanstalk.repository;

import com.ohgiraffers.elasticbeanstalk.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
