//source:
//https://www.ionos.at/digitalguide/websites/web-entwicklung/java-vs-javascript/
/*
Schwächen:
-Sicherheit: JavaScript-Code ist auch von Seite des Clients einsehbar
-Debugging: schwieriger Fehler zu beheben
-Interpretation: Unterschiedliche Browser können JavaScript auch unterschiedlich interpretieren. Dies kann nur durch umfangreiche Testmaßnahmen mit verschiedenen Browsern verhindert werden
*/

//1. Fehlende Typensicherheit:
let a = 5;
a = "Hello";
console.log(a); // Gibt "Hello" aus, aber es hätte auch zu Problemen führen können, wenn a als Zahl erwartet wurde


//2. Asynchrone Programmierung: (JS verwendet Callback-Funktionen --> Ohne ordnungsgemäße Handhabung können Callbacks zu sogenannten "Callback-Höllen" führen)
// Callback-Hölle Beispiel:
getData(function (err, result) {
    if (err) {
        console.log(err);
    } else {
        getMoreData(result, function (err, moreData) {
            if (err) {
                console.log(err);
            } else {
                getFinalData(moreData, function (err, finalData) {
                    if (err) {
                        console.log(err);
                    } else {
                        console.log(finalData);
                    }
                });
            }
        });
    }
});

//3. "this"-Verhalten:
const obj = {
    name: "JavaScript",
    greet: function () {
        console.log(this.name);
    }
};

const greetFunction = obj.greet;
greetFunction();  // Undefined oder Fehler, weil "this" nicht mehr auf obj verweist


//4. Probleme mit der Namenskonvention:
function greet() {
    console.log("Hello");
}

function greet() {
    console.log("Hi");
}

greet();  // Gibt "Hi" aus, da die letzte Definition die erste überschreibt


//5. Prototypen-basierte Vererbung:
function Animal() { }
Animal.prototype.speak = function () {
    console.log("Animal speaks");
};

function Dog() { }
Dog.prototype = Object.create(Animal.prototype);

const dog = new Dog();
dog.speak();  // Gibt "Animal speaks" aus, was für den Entwickler schwer zu verstehen sein kann