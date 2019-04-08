package com.myfund.wxapplet.repository.secondary;

import com.myfund.wxapplet.entity.secondary.ZdRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZdRepository extends JpaRepository<ZdRecord, String> {
}
