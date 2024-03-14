Vigi-Torrents

## Sujet


## Evaluation


## Commandes utiles
`gcloud sql instances list`

`gcloud sql instances describe testeconocom | grep connectionName`

`./gradlew appengineDeploy`

`gcloud app logs tail -s default`

## Résultats
- Accès à Swagger (OpenAPI) en local :

http://localhost:8080/swagger-ui/index.html

- Accès sur Google cloud (lenteurs, j'ai mis les ressources basses pour limiter le coût) :

https://unique-spirit-407416.uc.r.appspot.com/

https://unique-spirit-407416.uc.r.appspot.com/swagger-ui/index.html

- Accès au front sur Netlify :

https://65721f2766f9b3008432e54d--venerable-syrniki-c57acb.netlify.app/

- Console Google cloud

https://console.cloud.google.com/sql/instances/testeconocom/databases?project=unique-spirit-407416

https://console.cloud.google.com/appengine/settings?serviceId=default&project=unique-spirit-407416

## Axes d'amélioration
- Vérifier la longueur des champs dans l'app pour correspondre aux défintions de colonnes dans MySQL
- Tester avec GraalVM pour améliorer les perfs sur GCP
- Ajouter une partie authentification du back
- Ajouter de l'observalibité
- Gestion des erreurs
- La partie front est assez light, peu évolutive
