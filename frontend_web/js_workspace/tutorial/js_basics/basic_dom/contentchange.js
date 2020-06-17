const ul = document.querySelector('.items');

// ul.remove();    // ul .items is removed from the page
// ul.lastElementChild.remove();
ul.firstElementChild.textContent = 'Hello';
ul.children[1].innerText = "Im second child";
ul.lastElementChild.innerHTML = '<h1>Hello</h1>';
console.log(ul.children[1].nodeName);


// changing styles

const btn = document.querySelector('.btn');
btn.style.background = "green";