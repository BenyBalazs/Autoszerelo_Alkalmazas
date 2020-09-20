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

## 4. **Ütemterv:**

### 4.1. **Mérföldkövek**

A program elkészítésének fő mérföldkövei:

#### 4.1.1. **Tervezés**

- A Trelloban való regisztráció illetve a használatának elkezdése
- A git repository elkészítése
- A tagok git-re való regisztrációja illetve a projekthez felvétele
- A követelményspecifikáció elkészítése
- A funckionális specifikáció elkészítése
- A rendszerterv elkészítése

#### 4.1.2. **Kódolás és tesztelés**
  
- A rendszer tesztjeinek felállítása
- A program adatbázisának elkészítése
- A program controllerének elkészítése
- A program tesztelése a minimális funkciókkal

#### 4.1.3. **További mérföldkövek**

- A felhasználó visszajelzések beletervezése a projektbe
- A kisebb üzleti értékkel rendelkező kényelmi funkciók fejlesztése

## 5. **Üzleti szereplők:**

A programot az éppen használó szerelő és adminisztrációs munkatárs. A szerelő műhely összes alkalmazottjának megvan a végzettsége és a tudása ahhoz, hogy a programot magabiztosan képes legyen használni.

### 5.1. **Üzleti entitások**

- A szoftvert használó adminisztációs munkatársak
- A szoftvert használó szerelők
- Azon munkatársak akik a későbbiekben kerülnek felvételre

## 6. **Követelmények:**
### **6.1 Funkcionális követelmények**

- Könnyedén kezelhető rendszer
- Letisztult, könnyedén átlátható adatbázis rendszer
- Egyszerű lekérdezések generálása a rendszerből
- Egyszerűsített adatfelvétel és módosítás

### **6.2 Nem funkcionális követelmények**

- Egyszerű, könnyen kezelhető felhasználói felület
- Optimalizált betűméretek, színek és típusok

## 7. **Funkcionális terv:**

A program célja az autószerelő múhelyben zajló adminisztrációs folyamatok egyszerűsítése, gyorsítása, a szerelők valamint az irodavezető munkájának megkönnyítése. Jelenleg az adminisztrációs folyamat (új autó felvételétől egészen a megjavított autó átvételéig) papír alapon zajlik, ezen módszert teljes egészében digitalizálni szeretnénk. Ezen korábbi módszerünk elemeit egy az egyben szeretnénk tovább alkalmazni azonban csak és kizárólag számítógépes környezetben, grafikus felületen keresztül.

Ezen elemek a következőek lennének:
- Új autó 
- Szerelés alatt
- Kész autók

## 8. **Rendszerszereplők:**

A rendszerünkben két nagy csoportot különböztetünk meg:
A két csoport a következőképpen alakul:
- Szerelők csoportja
- Adminisztrációs munkatárs(ak) csoportja

Magát a programot, mindkét csoport egyaránt haszálni fogja, azonban az adminisztrációs munkatársak rendelkeznek majd bővebb jogosultságokkal, ők lesznek azok akik mind a szerelőkkel való kapcsolattartásért, mind pedig az autó tulajdonosokkal való kapcsolattartásért egyaránt felelősek lesznek.


## 9. **Rendszerhasználati esetek és lefutásai:**

Autók hozzáadása a rendszerhez:
![Autók hozzáadása a rendszerhez](https://raw.githubusercontent.com/BenyBalazs/Autoszerelo_Alkalmazas/master/docs/kepek/autofelvetel.png?token=AKLXTH3CWUPR7OWX3VUGAHS7N6ALU)

Autó státuszának módosítása a rendszerben:
![Autó státuszának módosítása a rendszerben](https://raw.githubusercontent.com/BenyBalazs/Autoszerelo_Alkalmazas/master/docs/kepek/statusz%20v%C3%A1lt%C3%A1s.png?token=AKLXTH2WPDHDKABXWRYSRRK7N6AUM)

### 9.1 **Hardver és hálózati topológia:**
A számítógépnek amin ezt a szoftvert használni kívánják el kell érnie a MySQL adatbázis ami lehet lokális is, de internetre telepített is ezért javasolt az internetelérés biztosítása azon a számítógépen melyen a szoftvert használni kívánják.

A gépeknek nem feltétlenül kell erősnek lenniük azomban a szoftver használatához ssd javasolt. 

Az alacson rendszerigény a következő: 
- 2GB RAM
- Működő processzor
- Integrált működő videókártya
- ssd
- megjelenítő

A szoftver célplatformja a Microsoft Windwos 10 operációs rendszer. Azomban a Java platformfüggetlen megvalósítása miatt a program képes futni a Java 15-el kompatibilis Linux rendszereken is.

## 10. **Fejlesztői eszközök:**

A project során használt fejlesztői eszközök az alábbiak.

- Java 15
- Maven 3
- MySQL
- JavaFx

## 11. **Keretrendszer:**

- Entity
- Spring Boot
- Afterburner.fx

## 12. **Architekturális terv:**

A rendszert felépítő szoftverkomponensek, a Java , Maven, Sql (mysql). Ezen szoftverkomponensek Java FX keretén belül kerülnek használatra.
Az alrendszerek definiálása után, tulajdonságaikat felhasználva vezérlési és kommunikációs folyamatokat lehet létrehozni. A rendszer szerepe 
az autók felvétele (irodavezető feladata) valamint a szerelők (autó javítási fázisai - javításra vár, javítás alatt, elkészült autó) közti kommunikáció megkönnyítése, elektronikus úton lehetővé tétele.
Fontos továbbá a korai fejlesztési fázisok döntéseinek támogatása, a követelményrendszer függvényében. Ehhez szükségünk van különböző forrásokra mint pl: az autószerelő műhelynek üzleti valamint jelenlegi technológiai hátterére.
Fejlesztőink ezen céljai valamint stratégiái által befolyásolt követelményei vezetnek különböző architektúrákhoz.
Mint általában minden folyamatot , ezen folyamatot is egy ciklus körül képzeljünk el, mint a:
- Szereplők
- Követelmények
- Technológiai környezet
- Tervező(k) technológiával kapcsolatos tapasztalatai.

Architektúra elemek:
 . Architektúrális minta
   - elemek, kapcsolatok, kényszerek
   - pl: kliens, adatbázis-szerver kapcsolat (minta)
 . Referencia modell
   - egyszerű funkcionális elosztás, adatfolyam kezelő megoldások
   - pl: adatbázis kezelő rendszer
 . Referencia architektúra
   - referencia modell leképezése a szoftver elemeire
   - pl: ISO-OSI architektúra

### 12.1. A rendszer bővíthetősége
   - Magát a rendszert úgy próbáljuk meg kialakítani, hogy elrendezésben valamint felépítésben, az esetleges későbbi bővítésre/továbbfejlesztésre alkalmas legyen.

### 12.2. A rendszer biztonsági funkciói:
   - Mivel a programunk első verzióját csak az alkalmazottaink használják majd, így programunkba különösebb biztonsági funkció beépítését nem tervezzük.

### 12.3. Adatbázis terv
   A program adatbázisát 1 táblában foglaltuk össze, amely a cars nevet kapta.
   Ebben a következő adatokat tároljuk:
   - Car_ID (elsődleges kulcs) 
   - Name
   - Phone_Number
   - Licence_Plate_Number
   - Description
   - Brand_and_type
   - State
   - Cost_of_repair
   
![er modell](https://raw.githubusercontent.com/BenyBalazs/Autoszerelo_Alkalmazas/master/docs/kepek/er%20diagram.png?token=AKMQSYNEBVWJNXZYDEHLQK27ODZHS)

|Cars|
|------|
|Car_ID|
|Name|
|Phone_Number|
|Licence_Plate_Number|
|Description|
|Brand_and_type|
|State|
|Cost_of_repair|

## 13. **Implementációs terv:**

A tervezés folyamán egy grafikus megjelenítési formát célszerű használni jelen esetben ez az UML az úgynevezett Unified Modeling Language osztálydiagrammjai lesznek. Célszerű használni továbbá a Rendszerhasználati esetek alatt található use case diagrammokat is. 

### 13.1. **Perzisztencia-osztályok:**

Az adatbáziskezelésben a perzisztenciát a java nyelvhez készített hybernate programkönyvtárat használjuk amit a Maven plugin importálásával adunk hozzá a programhoz. Perzisztencia osztályok: -DBUtils -HibernateUtils

### 13.2. **Üzleti logika osztályai:**

Az üzleti logika a háromrétegű adatkezelő alkalmazások középső rétege, amely meghatározza az alkalmazás működésének logikáját. A háromrétegű architektúra az alkalmazást három különálló rétegre osztja fel. E rétegek komponensei önállóan léteznek, és együttműködésük során egyidejűleg több különböző alkalmazásnak is a részei lehetnek. Az adatbázislogika az adatok nyers tárolását végzi. Semmilyen információval nem rendelkezik az adatok feldolgozásával vagy megjelenítésével kapcsolatban. Az ügyviteli (üzleti) logika az alkalmazás logikáját, működési szabályait határozza meg. Semmilyen információval nem rendelkezik az adatok tárolásával vagy megjelenítésével kapcsolatban. A felhasználói interfész feladata az ügyviteli logika által küldött adatok formázása és megjelenítése. Biztosítja a felhasználó hozzáférését az ügyviteli logika szolgáltatásaihoz. Sohasem kerül közvetlen kapcsolatba az adatbázissal, és nem végez semmilyen műveletet az adatokon.

## 14. **Tesztterv:**

 Kód | Leírás |
| --- | ----------- |
| T1 | A program leindítása |
| T2 | Adatbázisból egy létező elemre való rákeresés |
| T3 | Adatbázisból egy nem létező elemre való keresés |
| T4 | Autó hozzáadása az adatbázisho |
| T5 | Egy autó állapotának a módosítás |
| T6 | Egy autó eltávolítása az adatbázisból |

