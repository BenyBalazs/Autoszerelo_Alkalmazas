## Tesztelési Jegyzőkönyv

 Kód | Elvárt Teljesítmény | Teszt sikeressége | Tesztelő |
| --- | ----------- | ----------- | ----------- |
| T1 | A program hibátlanul elindul. | Sikeres | BenyBalazs |
| T2 | A program kezdőképernyőjén a grafikai elemek hibátlanul megjelennek. | Sikeres | BenyBalazs |
| T3 | A ablakot nem lehet átméretezni. | Sikeres | BenyBalazs |
| T4 | Az ablakot le lehet tenni tálcára. | Sikeres | BenyBalazs |
| T5 | Az ablakot be lehet zárni. | Sikeres | BenyBalazs |
| T6 | Bezárásnál a program leáll. | Sikeres | BenyBalazs |
| T7 | Új autó menüpontotra rákattintva megnyílik az autó hozzáadás menü. | Sikeres | BenyBalazs |
| T8 | A menü alatt a grafikai elemek megjelennek. | Sikeres | BenyBalazs |
| T9 | Minden mező kitölthető. | Sikeres | BenyBalazs |
| T10 | Üres kitöltés esetén nem vihető be adat. | Sikeres | BenyBalazs |
| T11 | Ha bárhol van üres mező akkor sem rögzíthető az adat. | Sikeres | BenyBalazs |
| T12 | Ha nem rögzíthető az adat akkor a hibaüzenet meg is jelenik. | Sikeres | BenyBalazs |
| T13 | Ha a telefonszám rossz formátumú nem menthető az adat. | Sikeres | BenyBalazs |
| T14 | Ha nem jó formátumú a rendszám az adat nem menthető. | Sikeres | BenyBalazs |
| T15 | Ha a rendszám jó és a telefonszám nem akkor az adat nem menthető. | Sikeres | BenyBalazs |
| T16 | Ha a telefonszám jó de a rendszám nem akkor az adat nem menthető. | Sikeres | BenyBalazs |
| T17 | A program ezekről a hibákról tájékoztatja a felhasználót. | Sikeres | BenyBalazs |
| T18 | A mentés gombra rákattintva és hibátlan adatokkal a program menti az adatokat az adatbázisba. | Sikeres | BenyBalazs |
| T19 | A program erről értesíti a fellhasználót. | Sikeres | BenyBalazs |
| T20 | Mentés után a program kiüríti a beviteli mezőket. | Sikeres | BenyBalazs |
| T21 | A szerelés alatt gombra megjelenik a szerelés alatt layout. | Sikeres | Csontos Róbert |
| T22 | A szerelés alatt layouton a szerelésre vár gombra megjelenik a szerelésre váró autók listája. | Sikeres | Csontos Róbert |
| T23 | A szerelés alatt layouton a szerelésre alatt gombra megjelenik a szerelés alatt álló autók listája. | Sikeres | Csontos Róbert |
| T24 | A szerelés alatt layouton a szerkesztés gombra kattintva megjelenik egy alert, hogy válasszon ki egy autót  szerkesztésre. | Sikeres | Csontos Róbert |
| T25 | A szerelés alatt layouton a szerkesztés gombra kattintva megjelenik egy szerkesztő ablak ha van kiválasztva autó. | Sikeres | Csontos Róbert |
| T26 | A szerelés alatt layouton a listában ha kattintok egy listaelemre, akkor kijelölődik. | Sikeres | Csontos Róbert |
| T27 | A szerkesztés gombra kattintva megjenik a szerkesztés layout, betöltve a kijelölt autót. | Sikeres | Csontos Róbert |
| T28 | A szerkesztés layouton lehetőség van a tulaj nevét módosítani elírás esetén. | Sikeres | Csontos Róbert |
| T29 | A szerkesztés layouton lehetőség van a tulaj telefonszámát módosítani elírás esetén. | Sikeres | Csontos Róbert |
| T30 | A szerkesztés layouton lehetőség van az autó márkáját és típusát módosítani elírás esetén. | Sikeres | Csontos Róbert |
| T31 | A szerkesztés layouton lehetőség van a rendszámot módosítani elírás esetén. | Sikeres | Csontos Róbert |
| T32 | A szerkesztés layouton lehetőség van a hiba leírását módosítani elírás esetén. | Sikeres | Csontos Róbert |
| T33 | A szerkesztés layouton lehetőség van a javítás költségeit hozzáadni. | Sikeres | Csontos Róbert |
| T34 | A szerkesztés layouton lehetőség van a munka állapotát módosítani. | Sikeres | Csontos Róbert |
| T35 | A szerkesztés layouton hibás telefonszám megadása esetén a módosítások nem kerülnek mentésre. | Sikeres | Csontos Róbert |
| T36 | A szerkesztés layouton hibás rendszám megadása esetén a módosítások nem kerülnek mentésre. | Sikeres | Csontos Róbert |
| T37 | A szerkesztés layouton ha új autó kerül megnyitásra, akkor a költség alapértelmezetten nulla. | Sikeres | Csontos Róbert |
| T38 | A szerkesztés layouton ha új autó kerül megnyitásra, akkor a munka állapota alapértelmezetten szerelésre vár. | Sikeres | Csontos Róbert |
| T39 | A szerkesztés layout ha megvan nyitva, akkor a fő ablak fagyasztásra kerül. | Sikeres | Csontos Róbert |
| T40 | A szerkesztés layouton a mentésre kattintva, mentésre kerülnek a változások valid adatok esetén. | Sikeres | Csontos Róbert |
| T41 | A program, a bal oldali menüben a "kész autók" gombra kattintva átirányít a megfelelő kezelőfelületre. | Sikeres | Pattesz1998 |
| T42 | A kész autók gombra kattintva az elkészült autók listázásra kerülnek. | Sikeres | Pattesz1998 |
| T43 | Az adatok megfelelő módon, hiba nélkül lekérésre kerülnek az adatbázisból. | Sikeres | Pattesz1998 |
| T44 | Az adatok táblázatba rendezve megjelennek a program kezelőfelületén található fehér területben | Sikeres | Pattesz1998 |
| T45 | Nem létező elem esetén üres listát ad vissza aprogram. | Sikeres | Pattesz1998 |
| T46 | Amennyiben az autó státusza fizetve -re változik, akkor a fizetett autók gomb megfelelően működik | Sikeres | Pattesz1998 |
| T47 | A fizetett autók gombra kattintva, amennyiben az autó státusza még nincs átállítva a megfelelő státuszra, akkor nem jelenik meg a listában. | Sikeres | Pattesz1998 |
| T48 | A szerkesztés gombra kattintva szerkeszthetjük, az előzetesen felvett adatokat | Sikeres | Pattesz1998 |
| T49 | A sikeres szerkesztés után a lekért adatok megfelelően a megfelelő helyen jelennek meg a továbbiakban. | Sikeres | Pattesz1998 | 
| T50 | A szerkesztés gombnál az adatok helytelen megadása esetén hibaüzenetet kapunk | Sikeres | Pattesz1998 |
| T51 | Amennyiben hibásan javítjuk az adatokat, abban az esetben az adatok nem tárolódnak az adatbázisban. | Sikeres | Pattesz1998 |
| T52 | A telefonszám esetén +36 al kezdődő, az előzővel megegyező formátumú számra módosíthatunk szükség esetén. | Sikeres | Pattesz1998 |
| T53 | Nem megfelelő formátumú telefonszám esetén felugró ablakban hibaüzenetet kapunk | Sikeres | Pattesz1998 |
| T54 | A program lehetőséget ad arra, hogy bármikor az autó elkészülte után módosíthassuk az adatokat. | Sikeres | Pattesz1998 |
| T55 | Az autó elkészülte után, az esetleges árváltozás esetén lehetőségünk van az árat utólag szerkeszteni. | Sikeres | Pattesz1998 |
| T56 | A törlés gomb megnyomására, amennyiben a javítás meghiúsult visszajelzést kapunk a törlés tényéről. | Sikeres | Pattesz1998 |
| T57 | A funkció gombok csak akkor működnek, ha legalább egy elem ki van választva a listában. | Sikeres | Pattesz1998 |
| T58 | A törlés gomb lenyomásakor az adott , kijelölt sor törlődik az adatbázisból. | Sikeres | Pattesz1998 |
| T59 | Az autó állapotát sikeresen lehet módosítani a szerkesztő ablakban és a program visszajelzést küld. | Sikeres | Pattesz1998 |
| T60 | Sikeres változtatást követően kész autók esetében a kész autók oldalon megfelelően jelennek meg az adatok. | Sikeres | Pattesz1998 |
