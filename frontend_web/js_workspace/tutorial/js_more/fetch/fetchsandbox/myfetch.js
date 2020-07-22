document.querySelector('#getText').addEventListener('click', getText);

function getText() {
    fetch('sample.txt')
    .then(res => res.text())
    .then(data => {
        document.querySelector('#output').innerHTML = `<div class="alert alert-info">${data}</div>`;
    })
    .catch(error => console.log(error));
}

document.querySelector("#getUsers").addEventListener('click', getUsers)

function getUsers() {
    fetch('users.json')
    .then(res => res.json())
    .then(data => {
        let output = '<h2>Useres</h2>';
        data.forEach((user) => {
            output += `<ul class = "list-group m-2"> 
                        <li class="list-group-item">ID: ${user.id}</li>
                        <li class="list-group-item">Name: ${user.name}</li>
                        <li class="list-group-item">Email: ${user.email}</li>
                    </ul>`
        });
        document.querySelector('#output').innerHTML = output;
    })
    .catch(error => console.log(error));
}

document.querySelector('#getPosts').addEventListener('click', getPosts);

function getPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
    .then(res => res.json())
    .then(data => {
        let output = '<h2 class="text-center display-3">Posts</h2>';
        data.forEach((post) => {
            output += `
                    <div class = "card m-3">
                        <h2 class="card-header">${post.title}</h2>
                        <p class="card-body">${post.body}</p>
                    </div>
                    `;
        });
        document.querySelector('#output').innerHTML = output;
    })
    .catch(error => console.log(error));
}

document.querySelector("#addPost").addEventListener('submit', addPost);

function addPost(e) {
    e.preventDefault();

    let title = document.querySelector("#title").value;
    let body = document.querySelector("#body").value;

    fetch('https://jsonplaceholder.typicode.com/posts', {
        method: 'POST',
        headers: {
            'Accept': 'application/json, text/plain, */*',
            'Content-type': 'application/json'
        },
        body: JSON.stringify({
            title: title,
            body: body
        })
    })
    .then(res => res.json())
    .then(data => console.log(data));
}