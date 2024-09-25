package chapter12CollectionsExercise;

import java.util.Map;

public class Gradebook {
    public static void main(String[] args) {
        Map<String, Integer> gradebook=TestResult.getoriginalgrades();
        Map<String, Integer> test2=TestResult.getMakeupGrade();

        for (var student:test2.entrySet()){
           Integer firstgrade=gradebook.get(student.getKey());
           Integer secondgrde=test2.get(student.getKey());

                if(firstgrade<secondgrde){
                        gradebook.put(student.getKey(),secondgrde);

                    }

        }
        System.out.println("Final grades");
        for(var entry:gradebook.entrySet()){
            System.out.println(entry.getKey()+" :" +
                    " "+entry.getValue());
        }
    }
}
