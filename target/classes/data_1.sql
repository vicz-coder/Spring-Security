INSERT INTO users (username, password, enabled)
VALUES ('admin', '{noop}admin123', true);

INSERT INTO users (username, password, enabled)
VALUES ('user', '{noop}user123', true);

INSERT INTO authorities (username, authority)
VALUES ('admin', 'ROLE_ADMIN');

INSERT INTO authorities (username, authority)
VALUES ('user', 'ROLE_USER');
