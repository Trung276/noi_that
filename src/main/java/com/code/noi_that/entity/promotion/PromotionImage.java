package com.code.noi_that.entity.promotion;

import com.code.noi_that.entity.status.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "promotion_images")
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class PromotionImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "image")
    private String image;

    @Column(name = "is_thumbnail", nullable = false)
    private Boolean isThumbnail;

    @ManyToOne
    @JoinColumn(name = "promotion_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Promotion promotion;

    @ManyToOne
    @JoinColumn(name = "status_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Status status;
}
