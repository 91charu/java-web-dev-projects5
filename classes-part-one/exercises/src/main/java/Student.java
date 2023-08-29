public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Constructors
        public Student(String name, int studentId) {
                this.name = name;
                this.studentId = studentId;
        }

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        // Getters
        public String getName() {
                return name;
        }

        public int getStudentId() {
                return studentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }

        // Setters
        void setName(String name) {
                this.name = name;
        }

        void setStudentId(int studentId) {
                this.studentId = studentId;
        }

        public void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }

        void setGpa(double gpa) {
                this.gpa = gpa;
        }
}
