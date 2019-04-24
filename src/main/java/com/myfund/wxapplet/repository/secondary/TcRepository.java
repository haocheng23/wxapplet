package com.myfund.wxapplet.repository.secondary;

import com.myfund.wxapplet.entity.secondary.Tcrecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TcRepository extends JpaRepository<Tcrecord, Long> {

    /*@Query(value = "insert into tcrecord values(?1,?2,?3,?4)", nativeQuery = true)
    int insertTiaocang();*/
}
