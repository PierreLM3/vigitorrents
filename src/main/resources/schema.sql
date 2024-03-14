DROP TABLE IF EXISTS signalement;
DROP TABLE IF EXISTS subscription;

-- ============================================================
--   Table : signalement
-- ============================================================
CREATE TABLE signalement (
    id INT NOT NULL,
    nomTorrent VARCHAR(20),
    latitude DOUBLE,
    longitude DOUBLE,
    hauteur VARCHAR(20),
    vitesse VARCHAR(20),
    transport VARCHAR(20),
    clarte VARCHAR(20),
    commentaire VARCHAR(20),
    PRIMARY KEY (id)
);

-- ============================================================
--   Table : subscription
-- ============================================================
CREATE TABLE subscription (
    id INT NOT NULL,
    nomTorrent VARCHAR(20),
    mobile VARCHAR(20),
    PRIMARY KEY (id)
);
