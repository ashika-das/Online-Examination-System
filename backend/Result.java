public class Result {

    private int resultId;
    private int studentId;
    private int examId;
    private int score;

    public Result(int resultId, int studentId,
                  int examId, int score) {

        this.resultId = resultId;
        this.studentId = studentId;
        this.examId = examId;
        this.score = score;
    }

    public int getResultId() {
        return resultId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getExamId() {
        return examId;
    }

    public int getScore() {
        return score;
    }
}