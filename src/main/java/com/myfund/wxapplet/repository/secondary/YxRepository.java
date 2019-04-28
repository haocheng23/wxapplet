package com.myfund.wxapplet.repository.secondary;

import com.myfund.wxapplet.entity.secondary.YxStar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface YxRepository extends JpaRepository<YxStar, Integer> {

    //nativeQuery  原生sql查询
    @Query(value = "select fundcode from yxstar", nativeQuery = true)
    List findFundcode();


    /*@Modifying
    @Transactional
    @Query(value = "update yxstar SET fundcode = ?2 WHERE fundcode = ?1", nativeQuery = true)
    int updateYxStar(String oldfundcode, String newfundcode);*/

    @Modifying
    @Transactional
    int deleteByFundcode(String fundcode);
}
