// String Indexing

let firstName = "Rushikesh";

// R u s h i k e s h
// 0 1 2 3 4 5 6 7 8

console.log(firstName.length); // total char numbers

console.log(firstName.length - 1); // (n-1)last index of string

console.log(firstName[7]); // char at

// strings are immutable to change it you have to create new string

let lastName = "  Apar  ";
console.log(lastName.length);

// creating new string for trim the blank spaces
let newString = lastName.trim();
console.log(newString);
console.log(newString.length);

// converting lower case to upper case
console.log(firstName.toUpperCase());
console.log(lastName.toLocaleUpperCase());

// converting upper case to lower case
console.log(firstName.toLowerCase());
console.log(lastName.toLowerCase());

// slice
newString = firstName.slice(0, 4); // slice (start_index , last_index)
console.log("slice --> 0 to 5 =", newString);

// typeof

console.log(typeof firstName);

let rollNo = 200;
console.log(typeof rollNo);

// type casting

console.log("type casting");

// convert string to number
let str1 = "rushi"; // let  str1 = + "rushi";
str1 = Number(str1);
console.log("typeof str1 is ", typeof str1);

// convert number to string
let num1 = 25; //num1 = num1 + ""
num1 = String(num1);
console.log("typeof str2 is ", typeof num1);

// String concatenation

let String1 = "Rushikesh";

let String2 = "Apar";

let fullName = String1 + " " + String2; 
console.log(fullName);