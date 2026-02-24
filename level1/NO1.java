package level1;
class average {
    public static void main(String[] args) {
        String name =  "Sam";
        float mathsMarks = 94;
        float physicsMarks = 95;
        float chemistryMarks = 96;

        float totalSubjects = 3;

        float totalMarks = mathsMarks + physicsMarks + chemistryMarks;
        double averageMarks = (double) totalMarks / totalSubjects;

        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

              
    }
} 
