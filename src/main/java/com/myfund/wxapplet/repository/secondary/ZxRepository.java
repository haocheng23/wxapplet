package com.myfund.wxapplet.repository.secondary;

import com.myfund.wxapplet.entity.secondary.ZxList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ZxRepository extends JpaRepository<ZxList, Integer> {

    /*@Query(value = "select * from zxlist where username = ?1 and fundcode = ?2", nativeQuery = true)
    int findByUsernameAndFundcode(String username, String fundcode);*/


    //取消自选
    @Modifying
    @Transactional
//    @Query(value = "delete from zxlist where username = ?1 and fundcode = ?2", nativeQuery = true)
    int deleteByUsernameAndFundcode(String username, String fundcode);

}
