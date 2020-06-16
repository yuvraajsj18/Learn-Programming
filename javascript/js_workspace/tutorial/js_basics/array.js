const numbers = new Array(1,2,3,4,5);

console.log(numbers);

const fruits = ['apple', 'oranges', 'pears'];

console.log(fruits[1]);

fruits[fruits.length] = 'grapes';

fruits.push('mangoes')
fruits.unshift('strawberries')
fruits.pop();
fruits.shift();

console.log(fruits.splice(fruits.indexOf('oranges'), 1, 'pineapples'));

console.log(fruits);

let newArr = (numbers + fruits).split(",");
newArr = numbers.concat(fruits);
console.log(newArr);
