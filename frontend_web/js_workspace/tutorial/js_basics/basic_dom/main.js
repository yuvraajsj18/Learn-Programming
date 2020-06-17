const myForm = document.querySelector("#my-form");
const nameInput = document.querySelector("#name");
const emailInput = document.querySelector("#email");
const msg = document.querySelector(".msg");
const userList = document.querySelector("#users");

myForm.addEventListener('submit', onSubmit);

function onSubmit(e) {
    e.preventDefault();

    if (nameInput.value === '' || emailInput.value === '')
    {
        msg.classList.add('error');
        msg.innerHTML = "Please enter all fields";
        msg.style.display = "block";
        setTimeout(() => msg.style.display = 'none', 3000);
    }
    else
    {
        const li = document.createElement("li");
        li.appendChild(document.createTextNode(`${nameInput.value} : ${emailInput.value}`));
        // li.textContent = `${nameInput.value} : ${emailInput.value}`;
        userList.appendChild(li);
        
        nameInput.value = "";
        emailInput.value = "";
    }
}

body = document.querySelector("body");

body.addEventListener('click', (e) => {
    sq = document.createElement('div');
    sq.style.width = '50px';
    sq.style.height = '50px';
    sq.style.background = "#" + String(Math.floor(Math.random() * 255)) + String(Math.floor(Math.random() * 255)) +   String(Math.floor(Math.random() * 255));   
    e.target.appendChild(sq);
});
