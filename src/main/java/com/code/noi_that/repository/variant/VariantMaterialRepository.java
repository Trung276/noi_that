package com.code.noi_that.repository.variant;

import com.code.noi_that.entity.variant.VariantMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariantMaterialRepository extends JpaRepository<VariantMaterial, Long> {
}
