Vigi-Torrents

## Commandes utiles
`gcloud sql instances list`

`gcloud sql instances describe vigi-torrents | grep connectionName`

`./gradlew appengineDeploy`

`gcloud app logs tail -s default`

## Résultats
- Accès à Swagger (OpenAPI) en local :

http://localhost:8080/swagger-ui/index.html

- Accès sur Google cloud (lenteurs, j'ai mis les ressources basses pour limiter le coût) :

https://vigi-torrents.ey.r.appspot.com/swagger-ui/index.html

- Console Google cloud

https://console.cloud.google.com/sql/instances/vigi-torrents/overview?project=vigi-torrents

https://console.cloud.google.com/appengine?project=vigi-torrents&serviceId=default
