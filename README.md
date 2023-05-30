# Spring tudásfelmérő

## Feladatleírás

A feladatotok egy blog webes alkalmazás létrehozása lesz. Minden implementálandó metódust az
`IBlogService` interface tartalmaz, amit implementál az `BlogService` osztály. A model osztályok váza rendelkezésetekre
áll, de a megfelelő annotációk felvételét az adatbázisba mentéshez nektek kell létrehozni.

A feladatotok a `Controller`, `Service`, `Repository` és `Model` rétegek megalkotása, hogy az `IBlogService` -ben deklarált
metódusok megvalósításhoz. 

A megoldás során `PostgreSQL` adatbázist használjatok és a megfelelő kapcsolatról gondoskodjatok az 
`application.properties` fájlon keresztül.

A megoldás során bármilyen segédeszközt használhattok, a feladat megoldása mellett, minden `BlogService` -ben deklarált
metódushoz készítsetek egy dokumentációt, amiben leírjátok, hogy milyen bemenettel tesztelhető Postman-en keresztül.

Az adatbázis feltöltéséhez, használhatjátok az `SpringTestApplication` osztályban létrehozott, `initDatabase()` `Bean`-t,
ahogy órán is csináltuk.

A megoldás során törekedjetek átlátható tiszta kódot írni.