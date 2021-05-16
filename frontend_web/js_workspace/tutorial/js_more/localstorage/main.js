"use strict";

// let lastCountValue = localStorage.getItem('clickCount') ?? 0;
// document.querySelector('#count-clicks').innerText = lastCountValue;

document.querySelector('#count-btn').addEventListener('click', (e) => {
    let value = Number(document.querySelector('#count-clicks').innerText);
    value += 1;
    document.querySelector('#count-clicks').innerText = value;

    // localStorage.setItem('clickCount', value);
});

/*
        Local Storage -
        getItem(key) --> value
        setItem(key, value);
*/