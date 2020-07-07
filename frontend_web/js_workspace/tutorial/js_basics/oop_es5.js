// OOP the ES5 way


// construct object using ctor functions
// ctor with prototypes
function Person(firstName, lastName, dob)   // ctor function
{
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = new Date(dob);
    // adding methods to Person object
    // this.getBirthYear = () => this.dob.getFullYear();
    // this.getFullName = function() {
    //     return `${this.firstName} ${this.lastName}`;
    // }
}

// prototypes
Person.prototype.getBirthYear = function() {
    return this.dob.getFullYear();
}

Person.prototype.getFullName = function() {
    return `${this.firstName} ${this.lastName}`;
}

// Instantiate an object
const person1 = new Person('John', 'Doe', '04/03/1991');   // new 

console.log(person1);

const person2 = new Person('Mary', 'Smith', '12/02/1999');
console.log(person2.firstName);
// console.log(person2.dob.getFullYear());
console.log(person2.getBirthYear());
console.log(person2.getFullName());

// prototypes
console.log(person2);
