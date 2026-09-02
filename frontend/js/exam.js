let time = 5 * 60;

const timer = setInterval(function() {

    let minutes = Math.floor(time / 60);
    let seconds = time % 60;

    seconds = seconds < 10 ? "0" + seconds : seconds;

    document.getElementById("timer").innerText =
        "Time: " + minutes + ":" + seconds;

    time--;

    if (time < 0) {

        clearInterval(timer);

        submitExam();
    }

}, 1000);


document.getElementById("examForm").addEventListener("submit", function(event) {

    event.preventDefault();

    submitExam();

});


function submitExam() {

    clearInterval(timer);

    let score = 0;

    const answers = document.querySelectorAll(
        'input[type="radio"]:checked'
    );

    answers.forEach(function(answer) {

        if (answer.value === "correct") {

            score++;
        }

    });

    localStorage.setItem("score", score);

    window.location.href = "result.html";
}