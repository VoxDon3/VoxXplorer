/*
 * Decompiled with CFR 0.152.
 */
package ax.t8;

public final class d {
    private static final int a = d.a();

    private static int a() {
        return d.c(System.getProperty("java.version"));
    }

    private static int b(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n8 = 0;
        while (true) {
            char c8;
            if (n8 >= string.length() || !Character.isDigit(c8 = string.charAt(n8))) break;
            stringBuilder.append(c8);
            ++n8;
            continue;
            break;
        }
        try {
            n8 = Integer.parseInt(stringBuilder.toString());
            return n8;
        }
        catch (NumberFormatException numberFormatException) {
            return -1;
        }
    }

    static int c(String string) {
        int n8;
        int n9 = n8 = d.e(string);
        if (n8 == -1) {
            n9 = d.b(string);
        }
        if (n9 == -1) {
            return 6;
        }
        return n9;
    }

    public static boolean d() {
        return a >= 9;
    }

    private static int e(String stringArray) {
        int n8;
        block3: {
            try {
                stringArray = stringArray.split("[._]");
                n8 = Integer.parseInt(stringArray[0]);
                if (n8 != 1) break block3;
            }
            catch (NumberFormatException numberFormatException) {
                return -1;
            }
            if (stringArray.length <= 1) break block3;
            n8 = Integer.parseInt(stringArray[1]);
            return n8;
        }
        return n8;
    }
}

