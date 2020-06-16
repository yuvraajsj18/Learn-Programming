const person = {
    firstName: 'John',
    lastName: 'Doe',
    age: 30,
    hobbies: ['music', 'movies', 'sports'],
    address: {
        street: '50 main st',
        city: 'Boston',
        state: 'MA'
    }
}

console.log(person.firstName, person.lastName);

console.log(person.hobbies[1]);

console.log(person.address.city);

console.log(person);


// destructuring

const {firstName, lastName, address: {city}} = person;

console.log(firstName, lastName, `lives in ${city}`)


person.email = "john@gmail.com";

console.log(person);

// array of todos

const todos = [
    {
        id: 1,
        text: "take out trash",
        isCompleted: true
    },
    {
        id: 2,
        text: "Meeting with boss",
        isCompleted: true
    },
    {
        id: 3,
        text: "Dentist appointment",
        isCompleted: false
    },
];

console.log(todos);

console.log(todos[1].text)

const todoJSON = JSON.stringify(todos);
console.log(todoJSON)