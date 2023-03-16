const form = document.getElementById('form');

form.addEventListener('submit',(e)=>{
    e.preventDefault();
    const ename = document.getElementById('name').value;
    const surname = document.getElementById('surname').value;
    const email = document.getElementById('email').value;
    const password= document.getElementById('password').value;
    const confirm_passsword=document.getElementById('confirm_password').value;

    if (!ename || !surname || !email ||!password || !confirm_passsword){
        alert ('please enter in all fields');
    }else if (password!==confirm_passsword){
        alert('Passwords do not match');
    }else{
        alert('passwords match');
    }
});





