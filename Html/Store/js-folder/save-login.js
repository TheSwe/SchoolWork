function login(form) {
    let username = form.username.value;
    sessionStorage.setItem("username", username);
    document.getElementById("navbarname").textContent = username;
}
function navbarname(){
    let name = sessionStorage.getItem("username");
    if (name != null){
        document.getElementById("navbarname").textContent = name
        document.getElementById("navbarname2").textContent = name
    }
}