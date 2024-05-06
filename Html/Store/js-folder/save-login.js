function login(form) {
    alert(form.username.value)
    sessionStorage.setItem("username", form.username.value);
}
function loaddata(){
    document.getElementById("output").innerHTML = sessionStorage.getItem("username");
    alert(sessionStorage.getItem("username"))
}
function loadnavbar(){
    alert(sessionStorage.getItem("username"))
    document.getElementById("navbarname").innerHTML = sessionStorage.getItem("username");
}