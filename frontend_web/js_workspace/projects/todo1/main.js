// make static methods private idiot

// Contains attributes of form
const todoForm = {
    form: document.querySelector('#todo-form'),
    taskInput: document.querySelector('#task-input'),
    addBtn: document.querySelector('#add-btn'),
};

// contains the html element of todos list and an array containing the all tasks in todo list
todoList = {
    listElement: document.querySelector('todo-list'),
    listArray: new Array(),
    number_of_tasks: 0,
};


// represent todo list item with its task its completion and controls
class TodoListItem {
    static li_classes = ['todo-list-item','list-group-item', 'rounded-lg', 'd-flex', 'align-items-center', 'justify-content-between', 'animate__animated', 'animate__fadeInDown'];

    constructor(id, task, isDone = false) {
        this.id = id;
        this.task = task;
        this.isDone = isDone;

        this.li = document.createElement('li');
        // add classes to li
        this.li.classList.add(this.constructor.li_classes);

        // add task to the list item
        this.taskElement = this.constructor.makeTask(this.task);
        this.li.appendChild(this.taskElement);

        this.controls = new Controls(li, id);
    }

    // creates span element with task in it
    static makeTask(task) {
        const span = document.createElement('span');
        span.classList.add('todo-list-task', 'lead');
        span.innerText = task;

        return span;
    }
}

class Controls {
    // needs id to create a unique label for each checkbox
    constructor(li, id) {
        this.li = li;
        this.id = id;
        this.controlElement = this.constructor.createControlDiv();
        
        this.doneCheckbox = this.constructor.createDoneCheckbox(this.li, this.id);
    }

    static createControlDiv() {
        const div = document.createElement('div');
        div.classList.add('controls');
    }

    static createDoneCheckbox(li, id) {
        // container for checkbox
        const checkbox = document.createElement('div');
        checkbox.classList.add('custom-control', 'd-inline', 'custom-checkbox');

        // creates checkbox input
        const input = document.createElement('input');
        input.setAttribute('type', 'checkbox');
        input.classList.add('custom-control-input', 'done-checkbox');
        input.setAttribute('name', 'done-btn');
        input.id = `done-${id}`

        // event listener for checkbox
        input.addEventListener('click', this.constructor.doneEvent);

        // checkbox label
        const label = document.createElement('label');
        label.classList.add('custom-control-label', 'done-label');
    }

    // handles done checkbox click events
    static doneEvent(e) {
        
    } 
}
