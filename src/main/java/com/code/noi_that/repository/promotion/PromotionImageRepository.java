package com.code.noi_that.repository.promotion;

import com.code.noi_that.entity.promotion.PromotionImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionImageRepository extends JpaRepository<PromotionImage, Long> {
}
