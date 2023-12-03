package com.code.noi_that.entity.variant;

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
@Table(name = "variant_colors")
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class VariantColor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "is_visible", nullable = false)
    private Boolean isVisible;

    @Column(name = "is_thumbnail", nullable = false)
    private Boolean isThumbnail;

    @ManyToOne
    @JoinColumn(name = "variant_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Variant variant;

    @ManyToOne
    @JoinColumn(name = "status_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Status status;
}
