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
@Table(name = "variant_materials")
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class VariantMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "is_visible", nullable = false)
    private Boolean isVisible;

    @ManyToOne
    @JoinColumn(name = "variant_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Variant variant;

    @ManyToOne
    @JoinColumn(name = "status_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Status status;
}
