package week02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("자료구조 입력 (List, Set, Map):");
            String collectionName = sc.nextLine();
            System.out.println("제목:");
            String title = sc.nextLine();

            List<String> lines = readInputLines(sc);

            switch (collectionName) {
                case "List":
                    handleList(title, lines);
                    break;
                case "Set":
                    handleSet(title, lines);
                    break;
                case "Map":
                    handleMap(title, lines);
                    break;
                default:
                    System.out.println("저장 불가.");
                    break;
            }
        } finally {
            sc.close();
        }
    }

    private static List<String> readInputLines(Scanner scanner) {
        List<String> lines = new ArrayList<>();
        System.out.println("내용을 입력하세요 ('끝' 입력시 종료):");
        while (true) {
            String line = scanner.nextLine();
            if (Objects.equals(line, "끝")) {
                break;
            }
            lines.add(line);
        }
        return lines;
    }

    private static void handleList(String title, List<String> lines) {
        ArrayList<String> strList = new ArrayList<>(lines);
        printWithTitle(title, "List로 저장된", strList);
    }

    private static void handleSet(String title, List<String> lines) {
        LinkedHashSet<String> strSet = new LinkedHashSet<>(lines);
        printWithTitle(title, "Set으로 저장된", new ArrayList<>(strSet));
    }

    private static void handleMap(String title, List<String> lines) {
        Map<Integer, String> strMap = new HashMap<>();
        for (int i = 0; i < lines.size(); i++) {
            strMap.put(i + 1, lines.get(i));
        }
        printWithTitle(title, "Map으로 저장된", new ArrayList<>(strMap.values()));
    }

    private static void printWithTitle(String title, String storageType, List<String> data) {
        System.out.println("[ " + storageType + " " + title + " ]");
        for (int i = 0; i < data.size(); i++) {
            System.out.println((i + 1) + ". " + data.get(i));
        }
    }
}
