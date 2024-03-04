class Student {
    String name;
    int[] grades;

    public Student(String name, int... grades) {
        this.name = name;
        if (grades != null) {
            this.grades = grades.clone();
        } else {
            this.grades = new int[0];
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": [");
        for (int i = 0; i < grades.length; i++) {
            sb.append(grades[i]);
            if (i != grades.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}