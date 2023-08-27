When database model changes, generate new tables :

```
psql -U postgres -d home_stock -a -f /Users/Aymeric.Lavedrine/workspace/perso/home-stock/src/main/resources/sql/init.sql
```

Then ```mvn clean install``` to run jooq generation
