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

import java.math.BigDecimal;

@Entity
@Table(name = "promotion_vouchers")
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "promotion_id")
    private Promotion promotion;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private VoucherType type;

    @Column(name = "discount_value")
    private BigDecimal discountValue;

    @ManyToOne
    @JoinColumn(name = "scope_id")
    private VoucherScope scope;

    @ManyToOne
    @JoinColumn(name = "status_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Status status;

}
