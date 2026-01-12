INSERT INTO customer (username, password, email, enabled, roles)
VALUES (
  'admin',
  '{noop}admin1234',
  'admin@test.com',
  TRUE,
  'ROLE_ADMIN'
);

INSERT INTO customer (username, password, email, enabled, roles)
VALUES (
  'user',
  '{noop}user1234',
  'user@test.com',
  TRUE,
  'ROLE_ADMIN'
);