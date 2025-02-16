![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/152855/73064373-5ed69780-3ea1-11ea-8a71-3d370a5e7dd8.png)

# Kilka ważnych informacji

Przed przystąpieniem do rozwiązywania zadań przeczytaj poniższe wskazówki

## Jak zacząć?

1. Stwórz [*fork*](https://guides.github.com/activities/forking/) repozytorium z zadaniami.
2. Sklonuj repozytorium na swój komputer. Użyj do tego komendy `git clone adres_repozytorium`
Adres repozytorium możesz znaleźć na stronie repozytorium po naciśnięciu w guzik "Clone or download".
3. Rozwiąż zadania i skomituj zmiany do swojego repozytorium. Użyj do tego komend `git add nazwa_pliku`.
Jeżeli chcesz dodać wszystkie zmienione pliki użyj `git add .` 
Pamiętaj że kropka na końcu jest ważna!
Następnie skommituj zmiany komendą `git commit -m "nazwa_commita"`
4. Wypchnij zmiany do swojego repozytorium na GitHubie.  Użyj do tego komendy `git push origin master`
5. Stwórz [*pull request*](https://help.github.com/articles/creating-a-pull-request) do oryginalnego repozytorium, gdy skończysz wszystkie zadania.

Poszczególne zadania rozwiązuj w odpowiednich plikach.

# Poniżej znajdziesz wytyczne do zadań

## Zadanie 1 - rozwiązywane z wykładowcą

Utwórz klasę `Product`, dodaj w niej atrybut `name`. 

Dodaj metody `setName` (ustawiającą `name`)  oraz `getName` (zwracającą `name`).


## Zadanie 2

Utwórz klasę `Person`, dodaj w niej atrybuty:

- name,
- surname,
- age,
- gender.

Wszystkie atrybuty mają być prywatne i mają mieć ustawione wartości domyślne.

Dodaj metody:  
- `setName`,
- `setSurname`,
- `setAge`,
- `setGender`,  

które ustawią atrybuty klasy zgodnie z nazwą, na którą wskazują.
Np. `setName` – ustawia atrybut `name`.

W pliku `Main01.java` umieść w metodzie `main` kod, który utworzy obiekt klasy `Person` o nazwie `person`, a następnie
ustawi za pomocą wcześniej utworzonych metod wszystkie atrybuty klasy.


## Zadanie 3

Do klasy `Person` dopisz metodę `getFullName`, która zwróci imię i nazwisko połączone znakiem spacji.


## Zadanie 4

W klasie `Person` napisz metodę `increaseAge`, która inkrementuje zmienną `age` o 1.


## Zadanie 5

Stwórz klasę `Car`, posiadającą następujące atrybuty:

- brand
- model
- price

Stwórz metody dostępowe do ww. atrybutów, tzw. gettery i settery.

Dopisz metodę `toString`, wyświetlającą markę oraz cenę w jednej linii.


---

Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.
