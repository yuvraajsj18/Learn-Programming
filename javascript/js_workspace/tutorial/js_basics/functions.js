function addNums(num1 = 1, num2 = 1)
{
    return num1 + num2;
}

console.log(addNums);
console.log(addNums());
console.log(addNums(5,5));

// arrow functions
const addNumsAgain = (num1 = 1, num2 = 1) => {
    return num1 + num2;
}

console.log(addNumsAgain);
console.log(addNumsAgain());
console.log(addNumsAgain(5,5));

// one expression in body does not require curly braces and no need to use return keyword in that case.
const twice = (num1 = 1) => num1 * 2;
console.log(twice(4));