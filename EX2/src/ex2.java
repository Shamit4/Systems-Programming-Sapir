// 204328611_207845611

import java.io.*;

public class ReportGenerator {

    public static void main(String[] args) {
        try {
            BufferedReader studentsFile =
                new BufferedReader(new FileReader("CS.txt"));

            BufferedReader courseFile =
                new BufferedReader(new FileReader("hedva.txt"));

            PrintWriter report =
                new PrintWriter(new FileWriter("report.txt"));

            String studentLine = studentsFile.readLine();
            String gradeLine = courseFile.readLine();

            while (studentLine != null && gradeLine != null) {

                String[] s = studentLine.split(" ");
                String first = s[0];
                String last = s[1];
                int id1 = Integer.parseInt(s[2]);

                String[] g = gradeLine.split(" ");
                int id2 = Integer.parseInt(g[0]);
                int grade1 = Integer.parseInt(g[1]);
                int grade2 = Integer.parseInt(g[2]);

                if (id1 == id2) {
                    int avg = (grade1 + grade2) / 2;
                    report.println(id1 + " " + first + " " + last + " " + avg);

                    studentLine = studentsFile.readLine();
                    gradeLine = courseFile.readLine();

                } else if (id1 < id2) {
                    studentLine = studentsFile.readLine();
                } else {
                    gradeLine = courseFile.readLine();
                }
            }

            studentsFile.close();
            courseFile.close();
            report.close();

            System.out.println("report.txt נוצר בהצלחה!");

        } catch (Exception e) {
            System.out.println("שגיאה: " + e.getMessage());
        }
    }
}
