console.log(window);

// Single element selectors

form = document.getElementById('my-form'); // old style
console.log(form);

container = document.querySelector('h1');   // selects the first one
console.log(container);

// Multiple element selectors

console.log(document.querySelectorAll('.item'));    // gives a node list like an array

console.log(document.getElementsByClassName('item'));    // old style, gives an html collection
console.log(document.getElementsByTagName('li'));


// looping through items
const items = document.querySelectorAll('.item');

items.forEach((item) => console.log(item));