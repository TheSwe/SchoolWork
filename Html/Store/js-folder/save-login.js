function login(formName) {
    //gets user password combinations from sessionstorage and login form
    const form = document.getElementById(formName);
    let username = form.username.value;
    let password = form.password.value;
    const users = sessionStorage.getItem("users").split(",");
    const passwords = sessionStorage.getItem("passwords").split(",");

    //Checks if username matches
    if (users.includes(username)) {
        let index = users.indexOf(username);
        //Checks if password matches username of same index
        if (password === passwords[index]){
            sessionStorage.setItem("username", username);
            document.getElementById("navbarname").textContent = username;
            document.getElementById("navbarname2").textContent = username;
            //Only lets form submit if username and password are correct
            return true;
        }
    }
    alert("Username or password is incorrect");
    return false;
}
function navbarname(){
    let name = sessionStorage.getItem("username");
    //updates username on page load if it exists
    if (name != null){
        document.getElementById("navbarname").textContent = name;
        document.getElementById("navbarname2").textContent = name;
    }
}
function register(formName){
    
    const form = document.getElementById(formName);
    //checks if passwords are the same
    if (form.password.value != form.passwordconfirm.value){
        alert("Passwords must match");
        return false;
    }
    //checks if username is taken and only adds if it is'nt
    //could be improved by splitting into arrays before checks to avoid bugs with checking against string
    if (!sessionStorage.getItem("users")){
        const users = [form.username.value];
        sessionStorage.setItem("users", users);

        const passwords = [form.password.value];
        sessionStorage.setItem("passwords", passwords);
        return true;
    }
    //, included to disregard partial username matches
    else if (!sessionStorage.getItem("users").includes(form.username.value+",")) {
        const users = sessionStorage.getItem("users").split(",");
        users.push(form.username.value);
        sessionStorage.setItem("users", users);

        const passwords = sessionStorage.getItem("passwords").split(",");
        passwords.push(form.password.value);
        sessionStorage.setItem("passwords", passwords);
        return true;
    }
    else {
        alert("Username already taken");
        return false;
    }
    
}