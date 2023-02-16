public class HiddenNumbers {

    public static void main(String[] args) {

        System.out.println("Введите простое выражение из двух чисел с операцией +, -, * или / и результатом (через =)");
        System.out.println("В каждой части выражения одна из цифр может быть заменена на #");
        System.out.println("Например, '45# + #2 = 464', '2#2 - 1# = 222' или '15# + #50 = 3#1'");
        String str = SimpleCalc.getString();
//        System.out.println(str);

        int sign_code = findSign(str);

        String[] qwe = findParts(str, sign_code);

        findAnswers(qwe, sign_code);

    }

    public static int findSign(String str) {
        int sign_code = 0;
        if (str.contains("+")) {
            sign_code = 1;
        } else if (str.contains("-")) {
            sign_code = 2;
        } else if (str.contains("*")) {
            sign_code = 3;
        } else if (str.contains("/")) {
            sign_code = 4;
        } else {
            System.out.println("Недопустимое выражение");
        }

        return sign_code;
    }

    public static String[] findParts(String str, int sign_code) {
        String q = "", w = "", e = "";
        String[] firstPart = str.split("=");
        e = firstPart[1];

        String[] secondPart = firstPart[0].split("[-+*/]");

        q = secondPart[0];
        w = secondPart[1];

        String[] arr1 = {q, w, e};
        return arr1;
    }


    public static void findAnswers(String[] parts, int sign_code) {
        int[] unknownParts = {1, 1, 1};
        for (int i = 0; i < 3; i++) {
            if (parts[i].contains("#"))
                unknownParts[i] = 9;

        }

        int q = 0, w = 0, e = 0;

        for (int i = 0; i <= unknownParts[0]; i++) {
            String strQ = "";
            if (unknownParts[0] == 1)
                strQ = parts[0];
            else {
                String[] arrQ = parts[0].split("#");
                strQ = arrQ[0] + Integer.toString(i);
                if (arrQ.length > 1)
                    strQ = strQ + arrQ[1];
            }
            q = Integer.parseInt(strQ);


            for (int j = 0; j <= unknownParts[1]; j++) {
                String strW = "";
                if (unknownParts[1] == 1)
                    strW = parts[1];
                else {
                    String[] arrW = parts[1].split("#");
                    strW = arrW[0] + Integer.toString(j);
                    if (arrW.length > 1)
                        strW = strW + arrW[1];
                }
                w = Integer.parseInt(strW);


                for (int k = 0; k <= unknownParts[2]; k++) {
                    String strE = "";
                    if (unknownParts[2] == 1)
                        strE = parts[2];
                    else {
                        String[] arrE = parts[2].split("#");
                        strE = arrE[0] + Integer.toString(k);
                        if (arrE.length > 1)
                            strE = strE + arrE[1];
                    }
                    e = Integer.parseInt(strE);

                    switch (sign_code) {

                        case 1:
                            if (q + w == e)
                                System.out.println(q + " + " + w + " = " + e);
                        case 2:
                            if (q - w == e)
                                System.out.println(q + " - " + w + " = " + e);
                        case 3:
                            if (q * w == e)
                                System.out.println(q + " * " + w + " = " + e);
                        case 4:
                            if (q / w == e)
                                System.out.println(q + " / " + w + " = " + e);
                    }


                }
            }
        }

    }
}

