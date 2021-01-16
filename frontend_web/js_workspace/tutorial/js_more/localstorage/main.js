"use strict";

document.addEventListener('DOMContentLoaded', (e) => {
    let lastCountValue = localStorage.getItem('clickCount') ?? 0;


    document.querySelector('#click-count').innerText = lastCountValue;

    document.querySelector('#count-btn').addEventListener('click', (e) => {
        let value = Number(document.querySelector('#click-count').innerText);
        value += 1;
        document.querySelector('#click-count').innerText = value;

        localStorage.setItem('clickCount', value);
    });
});


/*
        Local Storage -
        getItem(key) --> value
        setItem(key, value);
*/