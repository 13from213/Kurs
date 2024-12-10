const newBtn = document.getElementById('new-btn');
const createBlock = document.getElementById('create-block');
const mainBlock = document.getElementById('main-block');
const icon = document.getElementById('icon');

icon.addEventListener('click', closeFun);
newBtn.addEventListener('click', openFun);

function closeFun(){
    createBlock.style.display = 'none';
    mainBlock.style.margin ='auto';
}

function openFun(){
    createBlock.style.display = 'flex';
    mainBlock.style.marginLeft = '3%';
    mainBlock.style.marginRight = '3%';
}