document.addEventListener("DOMContentLoaded", function () {
    // confirm("Its loaded")
    countInfinitely();
});

function countInfinitely()
{
    document.querySelector("h1").innerHTML = ""
    count = 10;
    while(true)
    {
        document.querySelector("h1").innerHTML += count-- + '<br\>';
        console.log(count);
        if (count < 0)
            break;
    }

    button = document.createElement('button');
    document.querySelector('#button').appendChild(button);
    button.style.width = '200px';
    button.style.height = '50px';
    button.innerText = "Click Me!";
    count = 10;

    button.onclick = (function() {
    text = document.querySelector('h1').innerHTML;
    document.querySelector('h1').innerHTML = (count*=2) + '<br\>' + text;
});
}

// alert("Watch out!")

