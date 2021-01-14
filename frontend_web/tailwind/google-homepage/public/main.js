"use strict";

document.addEventListener("DOMContentLoaded", (e) => {
    document.querySelector('#profile-photo-btn').addEventListener('click', (e) => {
        document.querySelector('#profile-info').classList.toggle('hidden'); 
    });
});