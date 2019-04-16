package com.myfund.wxapplet.repository.secondary;

import com.myfund.wxapplet.entity.secondary.ZdRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZdRepository extends JpaRepository<ZdRecord, String> {



//    List findAllByUsernameOrderByZddateDesc(String username);


    @Query(value = "select username,fundcode,fundname,MAX(zddate) zddatenew from zdrecord where username=?1 group by fundcode ORDER BY zddatenew desc", nativeQuery = true)
    List findAllByUsernameOrderByZddateDescGroupbyFundcode(String username);
}
