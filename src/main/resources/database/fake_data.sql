USE noi_that;

INSERT INTO roles (name)
VALUES ('ROLE_ADMIN');

INSERT INTO users (username, password, name, role_id)
VALUES ('admin', '$2a$12$qW.MUPjWWDfscrR5rDcXrev.FWiHiS7Qh0Z9bl.PaZb5WWeGAm.cG', 'admin' , 1);
-- Admin@123 - 12 rounds

INSERT INTO statuses (name)
VALUES ('HIỂN THỊ'),
       ('ẨN'),
       ('KHÔNG KÍCH HOẠT');

INSERT INTO voucher_types (id, name)
VALUES (1, 'SỐ TIỀN CỤ THỂ'),
       (2, 'PHẦN TRĂM');

INSERT INTO voucher_scopes (id, name)
VALUES (1, 'TẤT CẢ'),
       (2, 'DANH MỤC'),
       (3, 'SẢN PHẨM'),
       (4, 'PHIÊN BẢN');