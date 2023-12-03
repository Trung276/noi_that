package com.code.noi_that.repository.promotion;

import com.code.noi_that.entity.promotion.VoucherType;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

@Repository
public interface VoucherTypeRepository extends JpaAttributeConverter<VoucherType, Long> {
}
