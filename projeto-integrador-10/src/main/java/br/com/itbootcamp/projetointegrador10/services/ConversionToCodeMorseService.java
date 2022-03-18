package br.com.itbootcamp.projetointegrador10.services;

public class ConversionToCodeMorseService {

    public static String execute(String text) {
        String[] alphaMorseCode = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        String[] numbersMorseCode = {
                "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."
        };

        String morse = "";

        for(char letter : text.toLowerCase().toCharArray()) {
            int valueAscii = (int) letter;

            if(valueAscii == 32) {
                morse += "   ";
                continue;
            }

            morse += " ";

            if (valueAscii >= 97 && valueAscii <= 122) {
                int position = alphaMorseCode.length  - (122 - valueAscii) - 1;

                morse += alphaMorseCode[position];

            }  else if (valueAscii >= 48 && valueAscii <= 57) {
                int position = numbersMorseCode.length  - (57 - valueAscii) - 1 ;

                morse += numbersMorseCode[position];
            }

        }

        return morse;
    }
}
