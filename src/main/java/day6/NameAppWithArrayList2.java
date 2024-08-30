package day6;

import java.util.ArrayList;
import java.util.Scanner;

public class NameAppWithArrayList2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
////        String[] names = new String[5];
//        ArrayList<String> names = new ArrayList<>();
//
////        int[] ages = new int[5];
//        ArrayList<Integer> ages = new ArrayList<>();

        ArrayList<Person3> persons = new ArrayList<>();
        // 이름 짓는 고민 -> 대충 짓고 넘어가면 큰일남..
        // 고민은 많이 해도 괜찮음
        // 변수 -> 명사(저장하려는 값과 관계있어야함), 메서드(동작) -> 동사(동작하는 것과 관계가 있어야 함)

        while (true) {
            System.out.print("명령어 입력 : ");
            String cmd = scanner.nextLine();

            if (cmd.equals("help")) {
                System.out.println("=====================");
                System.out.println("add : 이름 입력");
                System.out.println("list : 이름 목록");
                System.out.println("exit : 이름 종료");
                System.out.println("=====================");
            } else if (cmd.equals("add")) {
                System.out.print("이름을 입력해주세요 : ");
                String name = scanner.nextLine();
                System.out.print("나이를 입력해주세요 : ");
                int age = Integer.parseInt(scanner.nextLine());

//                names.add(name);
//                ages.add(age);
                Person3 person = new Person3();
                person.age = age;
                person.name = name;

                persons.add(person);

                System.out.println(name + "이/가 명부에 저장되었습니다.");
            } else if (cmd.equals("list")) {
                System.out.println("===== 이름 목록 =====");
                for (int i = 0; i < persons.size(); i++) {
                    Person3 person = persons.get(i);
                    System.out.println(i + 1 + ". " + persons.get(i).getName() + ", " + persons.get(i).getAge());
                }
                System.out.println("=====================");
            } else if (cmd.equals("exit")) {
                System.out.println("이름 프로그램이 종료됩니다.");
                break;
            }
        }
    }
}

class Person3 {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}