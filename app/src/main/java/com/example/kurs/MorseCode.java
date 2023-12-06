package com.example.kurs;

import java.util.HashMap;

import java.util.HashMap;

public class MorseCode {
    static String[] RUSS = {"А", "Б", "В", "Г", "Д", "Е", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я", ".", ",", "?", "!", "+", "-", "=", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    static String[] MORSE = {".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---", ".-.", ".-..", "--", "-.", "---", ".--.", ".-.", "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----", "--.-", ".--.-.", "-.--", "-..-", "..-..", "..--", ".-.-", ".-.-.-", "--..-", "..--..", "-.-.-", ".-.-.", "-....-", "-...-", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};

    public static HashMap<String, String> RUSS_TO_MORSE = new HashMap<>();
    public static HashMap<String, String> MORSE_TO_RUSS = new HashMap<>();

    static {
        for (int i = 0; i < RUSS.length && i < MORSE.length; i++) {
            RUSS_TO_MORSE.put(RUSS[i], MORSE[i]);
            MORSE_TO_RUSS.put(MORSE[i], RUSS[i]);
        }
    }

    public static String morseToRuss(String morseCode) {
        StringBuilder builder = new StringBuilder();
        String[] words = morseCode.trim().split(" ");

        for (String word : words) {
            String russ = MORSE_TO_RUSS.get(word);  // используем word как ключ
            builder.append(russ != null ? russ : " "); // если слово не найдено, добавляем пробел
        }
        return builder.toString();
    }

    public static String russToMorse(String russCode) {
        russCode = russCode.toUpperCase();
        StringBuilder builder = new StringBuilder();
        String[] words = russCode.trim().split(" ");

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                String morse = RUSS_TO_MORSE.get(word.substring(i, i + 1)); // получаем символ и преобразуем его в морзе
                builder.append(morse != null ? morse : " "); // если символ не найден, добавляем пробел
            }
            builder.append(" ");  // добавляем пробел между словами
        }
        return builder.toString();
    }
}
