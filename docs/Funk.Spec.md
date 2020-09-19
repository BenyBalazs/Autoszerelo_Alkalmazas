## 1. **Bevezetés:**

Cégünk telephelye Debrecentől 15 km-re található, egy kisebb városban. Mivel a környéken nem található olyan autószerelő műhely, mely ilyen széleskörű szolgáltatásokat nyújt, ezért cégünk vezetése a előrelépés mellett döntött, ennek megfelelően egy gyors és hatékony számítógépes rendszer fejlesztését tervezzük. Ezen igényekre támaszkodva terveztük meg magát a programot, mely terveink szerint nagyban megkönnyíti majd az autószerelő műhelyben zajló adminisztrációs folyamatokat.
Szerelőink képesek legyenek a programon keresztül adminisztrálni a szerelési fázisnak megfelelelő munkafolyamatokat.

## 2. **Használati esetek:**

- A rendszerrel szeretnénk nyilvántartani a hozzánk szerelésre beérkezett autókat ezzel megkönnyítve a munkatársaik számára az adminisztrációt. A program a garázs központi számítógépén futna így minden szerelő alkalmazottunk hozzá tud majd férni. A rendszerben legyen az autóknak többféle választható stílusa melyek az alábbiak legyenek: szerelésre vár, javítás alatt áll az autó, elkészült. Az autó elkészült, átvehető állapotban van további teendő nics vele értesíteni kell az adminisztrációs munkatársnak az ügyfelet arról, hogy átveheti autóját ebben a státuszban kerüljön kiszámításra a végösszeg. Fizetve: az ügyfél kifizette valamint elvitte az autót ez a könyvelő munkatársunknak fog majd segíteni. 

- A nyilvántartó rendszerünkben legyen lehetőség a részletes adattárolásra. Az autónak részletenes szeretnénk tárolni azadatait: rendszám, alvázszám (ne legyen kötelező mező), márka, és tulajdonos. A hibához egy rövid leírást is szeretnénk rögzíteni. A tulajdonosról is szeretnénk adatokat tárolni itt elsősoprban név, telefonszám. 

- Az autó státusza folyamatosan manuálisan módosítható legyen. Képesek legyünk váltani a külömböző státuszok között. Szeretnénk nyilvántartani az autó végleges költségét ez magában foglal mindent az alkatrészeket és a szerelési költséget valamint a hasznot is.

- A program minden elkészült autónál megadja a szerelés végső árát.

- Azonban a legfontosabb az lenne, hogy egy egyszerűen kezelhető és bárki által könnyen tanulható program készüljön.

## 3. **Jelenlegi helyzet**

A jelenlegi analóg, vagyis papír és ceruzán alapuló könyvelés megérett arra a szintre, hogy modernizálja magát és belépjen a 21. századba. Ez által meggyorsítva a mostani rendszert. Erre azért van szükség, hogy a dolgozók munkáját megkönnyítse, és a könyvelési folyamatok ne vagyenek el annyi időt a dolgozók munkaidejéből. Az alkalmazás nagyban segíti a szerelők mindennapjait, azáltal, hogy könnyen meg tudják nézni a rendszerben, melyik autó az amelyik javításra vár, és melyik az amelyiken már dolgozik valaki. Mivel manapság már egyre több a használt autó a forgalomban, így egyre több autó van jelen a műhelyben is. A javítási folyamatok jobb átláthatósága és kezelhetősége érdekében pedig, a papír alapú könyvelés már nem egy fenntartható állapot.


### 3.1 **A rendszernek nem célja**

- A GDPR előírásainak megfelelni.
- A dolgozók nyílvántartása.
- Biztonsági funkciók használata, az adatok illetéktelen hozzáféréstől való megvédése érdekében.
- Az alkaltrészek olyan fajata nyomonkövetése, hogy van-e raktáron vagy rendelni kell.

## 4. **Jelenlegi üzleti folyamatok modellje**

Az adatok tárolására relációs adatbázis táblákat használunk, melyek a jelenlegi célnak tökéletesen megfelelnek. A szoftver menüsorából az alábbi opciók érhetők el:

- **Új autó:** Az 'Új autó' menüpontban lesz lehetőség új autók felvételére, a hiba leírás megadására, valamint a tulaj nevének és telefonszámának megadására.
- **Szerelés alatt:** Ebben a menüpontban lesz lehetőség a folyamat státuszin változtatni a javításra váró, javítás alatt és elkészült státuszok között. Szintén itt lesz lehetőség, hogy a költségeket megahatározzuk melyek a javítás során keletkeznek.
- **Kész autók:** Ez a menüpont egy lekérdező felület lesz, ahol meg lehet nézni, hogy mely autók állnak készen arra, hogy a tulaj átvegye, és itt a végösszeg is megtekinthető lesz. Amint pedig a fizetés megtörtént itt lehet megadni a fizetve státuszt is.

## 5. **Igényelt üzleti folyamatok:**

Programunk alapvetően három menüt jelenít meg, ezen menük: új autó, szerelés alatt (legörüldő menüsoron keresztül ki tudjuk választani az éppen aktuális munkafolyamatot.), valamint a kész autók.

A folyamatok közül, mindegyik  kiemelt jelentőséggel bíró, ezért ezeket a menüsort rögtön az alkalmazás indítása után grafikus felületen megjelenítjük a felhasználó számára, ezáltal a program használata egyszerű, és felhasználóbarát lesz.

Az új autó menühöz kapcsolódó táblában fogjuk tárolni az autónak, valamint a tulajdonosának adatait, a szerelés alatt menühöz kapcsolodó táblában tároljuk majd a különböző munkafolyamatokat (szerelésre vár,szerelés alatt, átvételre kész), míg a kész autók menühöz tartozó táblában a fizetési állapotra vonatkozó adatokat tároljuk el (pl: kifizetve, átvételre kész stb..)

## 6. **Képernyőtervek:**

- A cél, hogy a javafx felhasználásaval minnél egyszerűbb és letisztultabb felhasználói felület kerüljön elkészítésre. A program alapját egy megjelenítési panel fogja alkotni ahol lehetséges lesz majd szűrni a külömböző állapotokban lévő autók közül és innen lehet majd megnyitni az ablakokat ahol hozzá lehet adni valamint szerkeszteni lehet majd az autókat. 

    - A kezdőképernyőn lehetőségünk lesz az új autók felvételéhez amik felvétel után azonnal feltöltődnek az adatbázisba.
    - Folyamatban illetve még nem elvállalt autók menüpontja itt lehetséges listázni a még nem lekezdett, a javítás alatt lévő illetve a már elkészült autókat. Itt az elkészült autókat vissza lehet helyezni javításra várt státuszba esetleges hiba esetén.
    - A teljesen megjavított autók listája. Itt lehetséges az autó fizetett állapotba való állítása amikor az ügyfél eljön és kifizeti a javítás költségét.
