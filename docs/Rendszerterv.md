
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

## 13. **Implementációs terv:**

A tervezés folyamán egy grafikus megjelenítési formát célszerű használni jelen esetben ez az UML az úgynevezett Unified Modeling Language osztálydiagrammjai lesznek. Célszerű használni továbbá a Rendszerhasználati esetek alatt található use case diagrammokat is. 

## 13.1. **Perzisztencia-osztályok:**

Az adatbáziskezelésben a perzisztenciát a java nyelvhez készített hybernate programkönyvtárat használjuk amit a Maven plugin importálásával adunk hozzá a programhoz. Perzisztencia osztályok: -DBUtils -HibernateUtils

## 13.2. **Üzleti logika osztályai:**

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

