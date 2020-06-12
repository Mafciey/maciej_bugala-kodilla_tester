public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int returnLast() {
        //return this.grades[this.size - 1]
        int last;
        last = this.grades[this.size - 1];
        System.out.println(last);
        return last;
    }

    public float average() {
        float avg = 0;
        float suma = 0;
            for (int i = 0; i < this.size; i++) {
                suma = suma + grades[i];
                i++;
            }
            avg = suma / this.size;
            System.out.println(avg);
            return avg;
    }
}