DROP TABLE IF EXISTS home, category, item;

CREATE TABLE home
(
    id           VARCHAR(50)              NOT NULL,
    name         TEXT                     NOT NULL,
    date_created TIMESTAMP WITH TIME ZONE NOT NULL,
    last_updated TIMESTAMP WITH TIME ZONE NOT NULL,
    CONSTRAINT pk_home_id PRIMARY KEY (id)
);

CREATE TABLE category
(
    id          SERIAL      NOT NULL,
    parent_id   INTEGER,
    home_id     VARCHAR(50) NOT NULL,
    name        TEXT        NOT NULL,
    description TEXT,
    CONSTRAINT pk_category_id PRIMARY KEY (id),
    CONSTRAINT fk_parent_category_id FOREIGN KEY (parent_id) REFERENCES category (id),
    CONSTRAINT fk_home_id FOREIGN KEY (home_id) REFERENCES home (id)
);

CREATE TABLE item
(
    id                  SERIAL                   NOT NULL,
    home_id             VARCHAR(50)              NOT NULL,
    category_id         INTEGER                  NOT NULL,
    name                TEXT                     NOT NULL,
    quantity            INTEGER                  NOT NULL,
    percentage_quantity INTEGER                  NOT NULL,
    stock_limit         INTEGER                  NOT NULL,
    description         TEXT,
    date_created        TIMESTAMP WITH TIME ZONE NOT NULL,
    last_updated        TIMESTAMP WITH TIME ZONE NOT NULL,
    CONSTRAINT pk_item_id PRIMARY KEY (id),
    CONSTRAINT fk_category_id FOREIGN KEY (category_id) REFERENCES category (id),
    CONSTRAINT percentage_quantity_limit CHECK (percentage_quantity > 0 and percentage_quantity < 100),
    CONSTRAINT fk_home_id FOREIGN KEY (home_id) REFERENCES home (id)
);
