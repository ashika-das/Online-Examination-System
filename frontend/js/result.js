const score = localStorage.getItem("score");

document.getElementById("score").innerText =
    "Your Score: " + score + " / 5";

if (score >= 3) {

    document.getElementById("status").innerText =
        "Status: PASS 🎉";

} else {

    document.getElementById("status").innerText =
        "Status: FAIL";
}