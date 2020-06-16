// OOP the ES6 way using classes

class Person
{
    static a = 10;
    constructor(firstName, lastName, dob)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = new Date(dob);
    }
    getBirthYear() {
        return this.dob.getFullYear();
    }
    getFullName() {
        return `${this.firstName} ${this.lastName}`;
    }
}

const person2 = new Person('Mary', 'Smith', '12/02/1999');
console.log(person2.getFullName());
console.log(person2.getBirthYear());
console.log(person2);

console.log(Person.a);