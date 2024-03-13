function calculate() {
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;
    let operator = document.getElementById("operator").value;
    let result = 0;
    switch (operator) {
        case "+":
            result = +num1 + +num2; break
        case "-":
            result = +num1 - +num2; break
        case "*":
            result = +num1 * +num2; break
        case "/":
            result = +num1 / +num2; break
    }
    document.getElementById("result").innerHTML = result;
}

