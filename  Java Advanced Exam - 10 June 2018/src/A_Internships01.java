import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Collections;

public class A_Internships01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int countProblems = Integer.parseInt(reader.readLine());
        int countCandidates = Integer.parseInt(reader.readLine());

        ArrayDeque<String> problems = new ArrayDeque<>();
        for (int i = 0; i < countProblems; i++) {
            String inputProblems = reader.readLine();
            problems.add(inputProblems);
        }
        ArrayDeque<String> candidates = new ArrayDeque<>();
        for (int i = 0; i < countCandidates; i++) {
            String inputCandidates = reader.readLine();
            String[] toCheckName = inputCandidates.split(" ");

            String nameFirst = toCheckName[0];
            String nameLast = toCheckName[1];
            if (nameFirst.charAt(0) == Character.toUpperCase(nameFirst.charAt(0))
                    && nameLast.charAt(0) == Character.toUpperCase(nameLast.charAt(0))) {
                candidates.addLast(inputCandidates);
            }
        }

        while ((problems.size() > 0) && (candidates.size() > 0)) {
            if (candidates.size() == 1){
                break;
            }

            String currentProblem = problems.pollLast();
            String currentCandidate = candidates.pollFirst();
            int sumProblemsLetter = 0;
            int sumCandidatesLetter = 0;

            for (int i = 0; i < currentCandidate.length(); i++) {
                sumCandidatesLetter += currentCandidate.charAt(i);
            }

            for (int i = 0; i < currentProblem.length(); i++) {
                sumProblemsLetter += currentProblem.charAt(i);
            }

            if (sumCandidatesLetter > sumProblemsLetter) {
                candidates.addLast(currentCandidate);
                System.out.printf("%s solved %s.%n", currentCandidate, currentProblem);
            } else {
                problems.addFirst(currentProblem);
                System.out.printf("%s failed %s.%n", currentCandidate, currentProblem);
            }
        }
        int count = 0;
        for (String candidate : candidates) {
            count++;
            if (candidates.size() > 1) {
                if (count == candidates.size()) {
                    System.out.printf(candidate + "%n");
                } else {
                    System.out.printf("%s, ", candidate);
                }
            }else{
                System.out.printf("%s gets the job!",candidate);
            }
        }

    }
}
