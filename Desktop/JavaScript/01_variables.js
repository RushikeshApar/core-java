// variable declaration  type

// * var * 

var firstname = "Rushikesh";

var first_name = "Rushikesh Apar"; // Snake case writing

var firstName = "Rushi"; // camel case writing (always used this)

console.log(firstname);
console.log(first_name);
console.log(firstName);

// * let * 

let petName = "Jimmy"; // mostly used let to declare variables

petName = "Anna"; // here we update the name

// let petName = "Anna"   // this will show the error,we can't declare block scope variable again

console.log(petName);

// *  Const * 

const pi = 3.14; // immutable (once declare const can't change its value )
//  pi = 3.15;    // this will give the error in console
console.log(pi * 10);  // we can perform multiple operation on it 
