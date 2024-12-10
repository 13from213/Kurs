const login = document.getElementById('login-container');
const reg = document.getElementById('reg-container');
const ref1 = document.getElementById('ref1');
const ref2 = document.getElementById('ref2');

ref1.addEventListener('click', changeOne);
ref2.addEventListener("click", changeTwo);

function changeOne(){
    login.style.display = 'block';
    reg.style.display = 'none';
}
function changeTwo(){
    login.style.display = 'none';
    reg.style.display = 'block';
}