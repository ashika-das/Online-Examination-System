document.getElementById("loginForm").addEventListener("submit", function(event) {

    event.preventDefault();

    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    const storedStudent = localStorage.getItem("student");

    if (storedStudent === null) {

        document.getElementById("message").innerText =
            "No account found. Please register first.";

        return;
    }

    const student = JSON.parse(storedStudent);

    if (email === student.email && password === student.password) {

        localStorage.setItem("loggedIn", "true");

        window.location.href = "dashboard.html";

    } else {

        document.getElementById("message").innerText =
            "Invalid email or password.";
    }

});