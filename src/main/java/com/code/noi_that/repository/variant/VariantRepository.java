package com.code.noi_that.repository.variant;

import com.code.noi_that.entity.variant.Variant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariantRepository extends JpaRepository<Variant, Long> {
}
