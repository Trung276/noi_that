package com.code.noi_that.repository.promotion;

import com.code.noi_that.entity.promotion.VoucherScope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoucherScopeRepository extends JpaRepository<VoucherScope, Long> {
}
