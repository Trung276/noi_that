package com.code.noi_that.service;

import java.util.List;

public interface GeneralService<D> {
    D create(D entity);

    List<D> getAll();

    D getById(Long id);

    D update(Long id, D entity);

    void delete(Long id);
}
