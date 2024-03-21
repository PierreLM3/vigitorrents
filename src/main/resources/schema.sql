DROP TABLE IF EXISTS signalement;
DROP TABLE IF EXISTS subscription;

-- ============================================================
--   Table : signalement
-- ============================================================
CREATE TABLE signalement (
    id INT NOT NULL AUTO_INCREMENT,
    nom_torrent VARCHAR(200),
    latitude DOUBLE,
    longitude DOUBLE,
    hauteur VARCHAR(200),
    vitesse VARCHAR(200),
    transport VARCHAR(200),
    clarte VARCHAR(200),
    commentaire VARCHAR(2000),
    heure VARCHAR(200),
    evenement VARCHAR(200),
    media VARCHAR(2000),
    PRIMARY KEY (id)
);

-- ============================================================
--   Table : subscription
-- ============================================================
CREATE TABLE subscription (
    id INT NOT NULL AUTO_INCREMENT,
    nom_torrent VARCHAR(200),
    mobile VARCHAR(200),
    PRIMARY KEY (id)
);
