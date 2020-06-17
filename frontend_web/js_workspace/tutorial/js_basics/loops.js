// For Loops
for (let i = 0; i < 10; i++)
{   
    console.log(`For loop: ${i}`);
}

// While Loops
let i = 0;
while(i < 10)
{
    console.log(`While loop: ${i++}`);
}

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

// looping through array
for (let i = 0; i < todos.length; i++)
{
    console.log(`Todo ${i + 1} is ${todos[i].text}`);
}

for (let todo of todos)
{
    console.log(todo.text);
}

// forEach, map, filter
todos.forEach(function(todo) {
    console.log("For each " + todo.text);
});

const todoText = todos.map((todo) => {
    return todo.text;
});

console.log(todoText);

const todoCompleted = todos.filter((todo) => {
    return todo.isCompleted === true;
}).map(function (todo){
    return todo.text
})

console.log(todoCompleted);