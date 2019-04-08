package com.myfund.wxapplet.repository.secondary;

import com.myfund.wxapplet.entity.secondary.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    /**
     * JpaRepository<T,ID>
     *
     * T:当前需要映射的实体。 ID:当前映射实体中ID的类型
     */

    //修改和删除的时候一定要加@Modifying注解
    /*@Modifying
    @Query("update User set password = :password where username = :username and id = :id")
    int updatePasswordByUsernameAndId(@Param("password")String password,
                                      @Param("username")String username,
                                      @Param("id")String id);*/



    @Transactional
    @Modifying
    @Query("update User set password = ?1 where username = ?2 and id = ?3")
    int updatePasswordByUsernameAndId(String password, String username, String id);




//    String findFundcodeByUsername(String username);
}
