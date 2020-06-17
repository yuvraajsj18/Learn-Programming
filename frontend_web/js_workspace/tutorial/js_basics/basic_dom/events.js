// events

const btn = document.querySelector('.btn');

// btn.addEventListener('click', (e) => {
//     e.preventDefault();
//     console.log(e);
//     console.log(e.target.className);
// });

btn.addEventListener('click', (e) =>  {
    e.preventDefault();
    document.querySelector('#my-form').style.background = "#ccc";
    document.querySelector('body').classList.add('bg-dark');
    document.querySelector('.items').lastElementChild.innerHTML = "<h1>Hello</h1>";
});

btn.addEventListener('mouseover', (e) => {
    e.preventDefault();
    btn.style.background = 'blue';
});

btn.addEventListener('mouseout', (e) => {
    e.preventDefault();
    btn.style.background = 'yellow';
    btn.style.color = 'black';
});