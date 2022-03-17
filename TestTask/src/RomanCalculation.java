public class RomanCalculation extends Main {

    String[] romanNumerals = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII",
            "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI",
            "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII",
            "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX",
            "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LVIX", "LX", "LXI", "LXII", "LXIII",
            "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV",
            "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV",
            "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI",
            "XCVII", "XCVIII", "XCIX", "C"};

    int firstRomanNumber, secondRomanNumber, result;

    void romanCalculation() {

            for (int t = 0; t < romanNumerals.length; t++) {
                if (line[0].equals(romanNumerals[t])) {
                    firstRomanNumber = t + 1;
                    if (firstRomanNumber > 10) {
                        try {
                            throw new Exception("Калькулятор должен принимать на вход римские числа от I до X включительно, не более.");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.exit(1);
                    }
                }
            }

        for (int j = 0; j < romanNumerals.length; j++) {
            if (line[2].equals(romanNumerals[j])) {
                secondRomanNumber = j + 1;
                if (secondRomanNumber > 10) {
                    try {
                        throw new Exception("Калькулятор должен принимать на вход римские числа от I до X включительно, не более.");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.exit(1);
                }
            }
        }

            if (firstRomanNumber == 0 || secondRomanNumber == 0) {
                try {
                    throw new Exception("Арифметическая операция должна быть только с Римскими цифрами или только с Арабскими цифрами");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.exit(1);
            }
            switch (line[1]) {
                case "+" -> result = firstRomanNumber + secondRomanNumber;
                case "-" -> result = firstRomanNumber - secondRomanNumber;
                case "*" -> result = firstRomanNumber * secondRomanNumber;
                case "/" -> result = firstRomanNumber / secondRomanNumber;
                default -> {
                    try {
                        throw new Exception("Не верный формат арифметической операции.");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.exit(1);
                }
            }

        if (result < 1) {
            try {
                throw new Exception("В римской системи исчисления нет отрицательных чисел.");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.exit(1);
        } else {
            System.out.println(romanNumerals[result - 1]);
            System.exit(1);
        }
    }
}

