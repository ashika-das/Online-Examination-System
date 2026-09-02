public class Exam {
    private int examId;
    private String examName;
    private int duration;

    public Exam(int examId, String examName, int duration) {

        this.examId = examId;
        this.examName = examName;
        this.duration = duration;
    }

    public int getExamId() {
        return examId;
    }

    public String getExamName() {
        return examName;
    }

    public int getDuration() {
        return duration;
    }

}
