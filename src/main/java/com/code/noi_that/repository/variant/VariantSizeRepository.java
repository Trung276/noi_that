package com.code.noi_that.repository.variant;

import com.code.noi_that.entity.variant.VariantSize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariantSizeRepository extends JpaRepository<VariantSize, Long> {
}
