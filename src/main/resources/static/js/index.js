
const login = document.getElementById("login-form");
const register = document.getElementById("register-form");
//改变表单
function changeForm(isLogin) {
    if (isLogin){
       login.style.display = "none";
       register.style.display = "inline";
    }else {
        register.style.display = "none";
        login.style.display = "inline";
    }
}