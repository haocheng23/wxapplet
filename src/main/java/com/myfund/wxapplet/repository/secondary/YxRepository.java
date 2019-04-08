package com.myfund.wxapplet.repository.secondary;

import com.myfund.wxapplet.entity.secondary.YxStar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YxRepository extends JpaRepository<YxStar, Integer> {

    @Query(value = "select fundcode from yxstar", nativeQuery = true)
    List findFundcode();
}
