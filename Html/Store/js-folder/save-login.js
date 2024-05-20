function login(form) {
    let username = form.username.value;
    let password = form.password.value;
    const users = sessionStorage.getItem("users").split(",");
    const passwords = sessionStorage.getItem("passwords").split(",");

    if (users.includes(username)) {
        let index = users.indexOf(username);
        if (password === myValues[index]){
            sessionStorage.setItem("username", username);
            document.getElementById("navbarname").textContent = username;
            document.getElementById("navbarname2").textContent = username;
        }
    }
}
function navbarname(){
    let name = sessionStorage.getItem("username");
    if (name != null){
        document.getElementById("navbarname").textContent = name;
        document.getElementById("navbarname2").textContent = name;
    }
}
function register(form){
    if (!sessionStorage.getItem("users")){
        const users = [form.username.value];
        sessionStorage.setItem("users", users);

        const passwords = [form.password.value];
        sessionStorage.setItem("passwords", passwords);
    }
    else if (!sessionStorage.getItem("users").includes(form.username.value+",")) {
        const users = sessionStorage.getItem("users").split(",");
        users.push(form.username.value);
        sessionStorage.setItem("users", users);

        const passwords = sessionStorage.getItem("passwords").split(",");
        passwords.push(form.password.value);
        sessionStorage.setItem("passwords", passwords);
    }
    else {
        alert("Username already taken");
    }
    
}