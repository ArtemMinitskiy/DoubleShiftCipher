import java.util.Arrays;

/**
 * Created by Artem on 27.06.2017.
 */
public class DoubleShiftCipher {
    public static void main(String[] args) {
        String p = "";
        String p2 = "";
        String key = "4132";
        String key2 = "3142";
        String phrase = "прилетаювосьмого";
        StringBuilder instKey = new StringBuilder(key);
        StringBuilder instSentance = new StringBuilder(phrase);
        StringBuilder instKey2 = new StringBuilder(key2);
        //Массив для ключевого слова.
        char[] keyMass = new char[instKey.length()];
        //Массив для незашифрованого послания.
        char[][] table = new char[key.length()][phrase.length()];
        char[][] newTable = new char[key.length()][phrase.length()];
        for (int i = 0, ii = 0; i < key.length(); i++) {
            for (int j = 0; j < key.length(); j++) {
                table[i][j] = instSentance.charAt(ii);
                ii++;
            }
        }
        //Вывод фразы
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][j]);
            }
        }
        System.out.println("");
        for (int i = 0; i < instKey.length(); i++) {
            keyMass[i] = instKey.charAt(i);
        }
        //Сортировка ключа
        Arrays.sort(keyMass);
        System.out.println();
        for (int j = 0; j < instKey.length(); j++) {
            for (int y = 0; y < instKey.length(); y++) {
                if ((int) keyMass[j] == (int) instKey.charAt(y)) {
                    for (int i = 0; i < key.length(); i++) {
                        newTable[j][i] = table[i][y];
                    }
                }
            }
        }
        //Вывод результата
        for (int i = 0; i < key.length(); i++) {
            for (int j = 0; j < key.length(); j++) {
                p += newTable[j][i];
                System.out.print(newTable[j][i]);
            }
            System.out.println();
        }
        System.out.print(p);


        StringBuilder instSentance2 = new StringBuilder(p);
        //Массив для ключевого слова.
        char[] keyMass2 = new char[instKey2.length()];
        //Массив для незашифрованого послания.
        char[][] table2 = new char[key2.length()][p.length()];
        char[][] newTable2 = new char[key2.length()][p.length()];
        for (int i = 0, ii = 0; i < key2.length(); i++) {
            for (int j = 0; j < key2.length(); j++) {
                table2[i][j] = instSentance2.charAt(ii);
                ii++;
            }
        }
        System.out.println();
        for (int i = 0; i < instKey2.length(); i++) {
            keyMass2[i] = instKey2.charAt(i);
        }
        //Сортировка ключа2
        Arrays.sort(keyMass2);
        System.out.println();
        for (int j = 0; j < instKey2.length(); j++) {
            for (int y = 0; y < instKey2.length(); y++) {
                if ((int) keyMass2[j] == (int) instKey2.charAt(y)) {
                    for (int i = 0; i < key2.length(); i++) {
                        newTable2[i][j] = table2[y][i];
                    }
                }
            }
        }
        //Вывод результата
        for (int i = 0; i < key2.length(); i++) {
            for (int j = 0; j < key2.length(); j++) {
                p2 += newTable2[j][i];
                System.out.print(newTable2[j][i]);
            }
            System.out.println();
        }
        System.out.print(p2);
    }
}

