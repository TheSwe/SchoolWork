function addtocart(game){
    //Takes input game name and adds it to sessionStorage to save it
    //If sessionStorage username is empty creates an empty array and adds the game to it then adds it to sessionStorage
    if (!sessionStorage.getItem("cart")){
        const cart = [game];
        sessionStorage.setItem("cart", cart);
    }
    else if (!sessionStorage.getItem("cart").includes(game)){
        const cart = sessionStorage.getItem("cart").split(",");
        cart.push(game);
        sessionStorage.setItem("cart", cart);
    }
    
}

function displaycart(){
    //Creates array from session storage and displays all games that are in the cart
    const cart = sessionStorage.getItem("cart").split(",");

    let minecraft = document.getElementById("minecraft-cart");
    let overwatch2 = document.getElementById("overwatch-2-cart");
    let terraria = document.getElementById("terraria-cart");
    let seaofthieves = document.getElementById("sea-of-thieves-cart");
    let shapez2 = document.getElementById("shapez-2-cart");
    let supermeatboy = document.getElementById("super-meat-boy-cart");
    let rainbowsixsiege = document.getElementById("rainbow-six-siege-cart");


    for (let i = 0; i < cart.length; i++){
        switch(cart[i]) {
            case "minecraft":
                minecraft.style.display = "inline";
                break;
            case "overwatch-2":
                overwatch2.style.display = "inline";
                break;
            case "terraria":
                terraria.style.display = "inline";
                break;
            case "sea-of-thieves":
                seaofthieves.style.display = "inline";
                break;
            case "shapez-2":
                shapez2.style.display = "inline";
                break;
            case "super-meat-boy":
                supermeatboy.style.display = "inline";
                break;
            case "rainbow-six-siege":
                rainbowsixsiege.style.display = "inline";
                break;
        }
    }
}

function pay(){
    //If user is logged in payment works
    if ("username" in sessionStorage){
        alert("Payment successful")
        return true;
    } else {
        alert("You need to be logged in to purchase")
        return false;
    }
}