## 6. **Követelmények:**
**6.1 Funkcionális követelmények**

- Könnyedén kezelhető rendszer
- Letisztult, könnyedén átlátható adatbázis rendszer
- Egyszerű lekérdezések generálása a rendszerből
- Egyszerűsített adatfelvétel és módosítás

**6.2 Nem funkcionális követelmények**

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

12.1. A rendszer bővíthetősége
   - Magát a rendszert úgy próbáljuk meg kialakítani, hogy elrendezésben valamint felépítésben, az esetleges későbbi bővítésre/továbbfejlesztésre alkalmas legyen.

12.2. A rendszer biztonsági funkciói:
   - Mivel a programunk első verzióját csak az alkalmazottaink használják majd, így programunkba különösebb biztonsági funkció beépítését nem tervezzük.

12.3. Adatbázis terv
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



