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

