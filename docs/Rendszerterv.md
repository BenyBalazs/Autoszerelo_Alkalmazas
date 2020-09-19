## 1. **Bevezetés:**

A rendszerterv elkészítésének célja az, hogy a program fejlesztőinek pontos, részletes és szaknyelvet tartalmazó leírás legyen a kezében ami kitér a rendszerrel kapcsolatos összes fontos szakmai kérdésre. A készítendő alkalmazás egy kisvárosi autószerelő műhely számára készül, annak érdekében, hogy segítse a dolgozók munkáját a mindennapi életben. A program célja, hogy felváltsa a papír alapú nyílvántartást ezáltal meggyorsítva a munka menetét. A költségek számolása és adminisztrációs feladatok ellátása a szoftver feladata. A cég Windows operációs rendszert használ a számítógépeken, így a cél platform is ez. A más platformokon való működés nem elvárt. A megrendelt alkalmazás számítógépes igényeit a cég eszközei kiszolgálják. Az igények egy működő processzor, legalább 2GB ram, integrált videókártya és egy operációs rendszer. Ezen felül még stabil internet szükséges. A megrendelő eszközei ezen feltételeknek megfelelnek.
A szoftver egy MySQL adatbázist használó Java nyelven megírt program, amely a JavaFX segítségével kap egy grafikus felületet. Ennek köszönhetően a dolgozók könnyen átlátható és letisztult felületen tudnak majd dolgozni.

## 2. **A rendszer célja:**

A rendszer célja, hogy az autószerelő műhely analóg nyílvántartását lecserélje digitálisra. Ezáltal egy sokkal modernebb, kényelmesebb és gyorsabb módon mehet a nyílvántartás vezetése, mely nagyban elősegíti a dolgozók munkáját. Ennek köszönhetően sok időt és energiát spórolnak meg, melyet más fontos dolgokra fordíthatnak.

## 3. **A projekt tervezete:**

### 3.1 **A rendszer felépítése**

Az adatbázis kapcsolathoz szükséges egy database osztály,
amely létrehozza, fenntartja, és zárja az adatbáziskapcsolatot.
A felszedett adatokat megfelelően repzezentálva szolgáltatjuk, továbbá a felületen lehetőségük nyílik új autók felvételére, munkafolyamatok módosítására. A grafikus megjelenítést JavaFX segítségével valósítjuk meg. A program controller részének megvalósítását Java programozási nyelven terveztük el. A projekthez továbbá felhasználtuk a Maven nevű projekt menedzsment eszköztárat is.

### 3.2 **Projektmunkások és felelősségeik**

A projektet készítő három személy teljesen egyenjogú szerepkörökkel rendelkezik. Mind hármuk kiveszi a részét a munka minden egyes fázisából és részéből. Mindnyájan egyenrangú fejlesztői a programnak.

Név |   Szerepkör
-----------|---------
Benyovszki Balázs Zoltán  | szoftverfejlesztő
Csontos Róbert  | szoftverfejlesztő
Kis Patrik    | szoftverfejlesztő