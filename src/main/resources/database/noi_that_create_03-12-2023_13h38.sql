CREATE DATABASE IF NOT EXISTS noi_that;
USE noi_that;

ALTER DATABASE noi_that CHARACTER SET UTF8MB4 COLLATE UTF8MB4_UNICODE_CI;

CREATE TABLE IF NOT EXISTS roles
(
    id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS users
(
    id       BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(20)  NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    name VARCHAR(255)  NOT NULL UNIQUE,
    avatar   BLOB,
    role_id  BIGINT,
    FOREIGN KEY (role_id) REFERENCES roles (id)
);

CREATE TABLE IF NOT EXISTS statuses
(
    id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS categories
(
    id        BIGINT AUTO_INCREMENT PRIMARY KEY,
    name      VARCHAR(255) NOT NULL UNIQUE,
    status_id BIGINT,
    FOREIGN KEY (status_id) REFERENCES statuses (id)
);

CREATE TABLE IF NOT EXISTS products
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(255) NOT NULL UNIQUE,
    description TEXT,
    status_id   BIGINT,
    FOREIGN KEY (status_id) REFERENCES statuses (id)
);

CREATE TABLE IF NOT EXISTS categories_products
(
    product_id  BIGINT,
    category_id BIGINT,
    PRIMARY KEY (product_id, category_id),
    FOREIGN KEY (product_id) REFERENCES products (id),
    FOREIGN KEY (category_id) REFERENCES categories (id)
);

CREATE TABLE IF NOT EXISTS product_images
(
    id           BIGINT AUTO_INCREMENT PRIMARY KEY,
    image        BLOB,
    is_thumbnail BOOLEAN DEFAULT FALSE,
    product_id   BIGINT,
    FOREIGN KEY (product_id) REFERENCES products (id),
    status_id    BIGINT,
    FOREIGN KEY (status_id) REFERENCES statuses (id)
);

CREATE TABLE IF NOT EXISTS variants
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    name       VARCHAR(255)   NOT NULL,
    price      DECIMAL(10, 2) NOT NULL,
    product_id BIGINT,
    FOREIGN KEY (product_id) REFERENCES products (id),
    status_id  BIGINT,
    FOREIGN KEY (status_id) REFERENCES statuses (id)
);

CREATE TABLE IF NOT EXISTS variant_images
(
    id           BIGINT AUTO_INCREMENT PRIMARY KEY,
    image        BLOB,
    is_thumbnail BOOLEAN DEFAULT FALSE,
    variant_id   BIGINT,
    FOREIGN KEY (variant_id) REFERENCES variants (id),
    status_id    BIGINT,
    FOREIGN KEY (status_id) REFERENCES statuses (id)
);

CREATE TABLE IF NOT EXISTS variant_materials
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    name       VARCHAR(255) NOT NULL,
    variant_id BIGINT,
    FOREIGN KEY (variant_id) REFERENCES variants (id),
    status_id  BIGINT,
    FOREIGN KEY (status_id) REFERENCES statuses (id)
);

CREATE TABLE IF NOT EXISTS variant_sizes
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    name       VARCHAR(255) NOT NULL,
    variant_id BIGINT,
    FOREIGN KEY (variant_id) REFERENCES variants (id),
    status_id  BIGINT,
    FOREIGN KEY (status_id) REFERENCES statuses (id)
);

CREATE TABLE IF NOT EXISTS variant_colors
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    name       VARCHAR(255) NOT NULL,
    variant_id BIGINT,
    FOREIGN KEY (variant_id) REFERENCES variants (id),
    status_id  BIGINT,
    FOREIGN KEY (status_id) REFERENCES statuses (id)
);

CREATE TABLE IF NOT EXISTS promotions
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    description BLOB,
    time_start  DATETIME,
    time_end    DATETIME,
    status_id   BIGINT,
    FOREIGN KEY (status_id) REFERENCES statuses (id)
);

CREATE TABLE IF NOT EXISTS voucher_types
(
    id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS voucher_scopes
(
    id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS promotion_vouchers
(
    id             BIGINT AUTO_INCREMENT PRIMARY KEY,
    promotion_id   BIGINT NOT NULL,
    type_id        BIGINT NOT NULL,
    discount_value DECIMAL(10, 2),
    scope_id       BIGINT NOT NULL,
    FOREIGN KEY (promotion_id) REFERENCES promotions (id),
    FOREIGN KEY (type_id) REFERENCES voucher_types (id),
    FOREIGN KEY (scope_id) REFERENCES voucher_scopes (id),
    status_id      BIGINT,
    FOREIGN KEY (status_id) REFERENCES statuses (id)
);

CREATE TABLE IF NOT EXISTS vouchers_scopes
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    voucher_id BIGINT NOT NULL,
    scope_id   BIGINT NOT NULL,
    value      BIGINT,
    FOREIGN KEY (voucher_id) REFERENCES promotion_vouchers (id),
    FOREIGN KEY (scope_id) REFERENCES voucher_scopes (id)
);

CREATE TABLE IF NOT EXISTS promotion_images
(
    id           BIGINT AUTO_INCREMENT PRIMARY KEY,
    image        BLOB,
    is_thumbnail BOOLEAN DEFAULT FALSE,
    promotion_id BIGINT,
    FOREIGN KEY (promotion_id) REFERENCES promotions (id),
    status_id    BIGINT,
    FOREIGN KEY (status_id) REFERENCES statuses (id)
);
