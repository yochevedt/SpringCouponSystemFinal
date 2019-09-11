package com.jb.repository.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *This interfaces will extends the jpa repository need to add methods like:
 *findAllby, @Query for sql-commands. 
 * @author yochevedt
 *
 */

public interface CouponDAOjpa extends JpaRepository<Coupons, Long>{

}


