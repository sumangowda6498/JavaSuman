package chapter12CollectionsExercise;

import java.util.Map;

public class Gradebok {
    public static void main(String[] args) {
        Map<String,Integer> gradebook= TestResult.getoriginalgrades();
        Map<String,Integer> test2=TestResult.getMakeupGrade();

      for (var student:test2.entrySet()){
            Integer firstgrade=gradebook.get(student.getKey());
            Integer testgrade=test2.get(student.getKey());

      if (firstgrade<testgrade){
             gradebook.put(student.getKey(),testgrade);
      }
      }
        System.out.println("The final grade");

        gradebook.forEach((k,v)-> System.out.println("Student "+k+" grade: "+v));
    }
}
