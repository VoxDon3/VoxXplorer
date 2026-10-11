/*
 * Decompiled with CFR 0.152.
 */
package ax.i5;

import ax.i5.k;
import java.util.Collection;
import java.util.Locale;

class l {
    public static boolean a(Collection<k> object, k k8) {
        object = object.iterator();
        while (object.hasNext()) {
            if (!((k)object.next()).b().equalsIgnoreCase(k8.b())) continue;
            return true;
        }
        return false;
    }

    private static boolean b(String string) {
        int n8 = string.length();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (l.e(string.charAt(i8))) continue;
            return true;
        }
        return false;
    }

    static k c(String charSequence, Collection<k> collection) {
        CharSequence charSequence2;
        int n8;
        charSequence = ((String)charSequence).toUpperCase(Locale.ROOT).trim();
        int n9 = 0;
        for (n8 = 0; n8 < ((String)charSequence).length() && ((String)charSequence).charAt(n8) == '.'; ++n8) {
        }
        CharSequence charSequence3 = ((String)charSequence).substring(n8);
        charSequence = "";
        n8 = ((String)(charSequence3 = ((String)charSequence3).replace(" ", ""))).lastIndexOf(".");
        if (n8 == -1) {
            charSequence2 = charSequence3;
        } else {
            charSequence2 = ((String)charSequence3).substring(0, n8);
            charSequence = charSequence3 = ((String)charSequence3).substring(n8 + 1);
            if (((String)charSequence3).length() > 3) {
                charSequence = ((String)charSequence3).substring(0, 3);
            }
        }
        charSequence3 = charSequence2;
        if (l.b((String)charSequence2)) {
            charSequence3 = l.f((String)charSequence2);
        }
        charSequence2 = charSequence;
        if (l.b((String)charSequence)) {
            charSequence2 = l.f((String)charSequence);
        }
        if (((String)charSequence3).length() == 0) {
            charSequence = "__";
        } else if (((String)charSequence3).length() == 1) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)charSequence3);
            ((StringBuilder)charSequence).append("_");
            charSequence = ((StringBuilder)charSequence).toString();
        } else if (((String)charSequence3).length() == 2) {
            charSequence = charSequence3;
        } else {
            charSequence = charSequence3;
            if (((String)charSequence3).length() > 2) {
                charSequence = ((String)charSequence3).substring(0, 2);
            }
        }
        if (((String)charSequence2).length() == 0) {
            charSequence3 = "000";
        } else if (((String)charSequence2).length() == 1) {
            charSequence3 = new StringBuilder();
            ((StringBuilder)charSequence3).append((String)charSequence2);
            ((StringBuilder)charSequence3).append("00");
            charSequence3 = ((StringBuilder)charSequence3).toString();
        } else {
            charSequence3 = charSequence2;
            if (((String)charSequence2).length() == 2) {
                charSequence3 = new StringBuilder();
                ((StringBuilder)charSequence3).append((String)charSequence2);
                ((StringBuilder)charSequence3).append("0");
                charSequence3 = ((StringBuilder)charSequence3).toString();
            }
        }
        charSequence2 = new StringBuilder();
        ((StringBuilder)charSequence2).append((String)charSequence);
        ((StringBuilder)charSequence2).append("0000");
        ((StringBuilder)charSequence2).append("~");
        ((StringBuilder)charSequence2).append(0);
        Object object = new k(((StringBuilder)charSequence2).toString(), (String)charSequence3);
        charSequence2 = "0000";
        n8 = n9;
        while (l.a(collection, (k)object)) {
            if (l.d((String)charSequence2, 4) != null) {
                charSequence2 = l.d((String)charSequence2, 4);
            } else {
                if (++n8 >= 10) break;
                charSequence2 = "0000";
            }
            object = new StringBuilder();
            ((StringBuilder)object).append((String)charSequence);
            ((StringBuilder)object).append((String)charSequence2);
            ((StringBuilder)object).append("~");
            ((StringBuilder)object).append(n8);
            object = new k(((StringBuilder)object).toString(), (String)charSequence3);
        }
        return object;
    }

    static String d(String string, int n8) {
        if ((string = Long.toHexString(Long.parseLong(string, 16) + 1L)).length() <= n8) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i8 = 0; i8 < n8 - string.length(); ++i8) {
                stringBuilder.append("0");
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(stringBuilder.toString());
            stringBuilder2.append(string);
            return stringBuilder2.toString();
        }
        return null;
    }

    private static boolean e(char c8) {
        if (c8 >= '0' && c8 <= '9') {
            return true;
        }
        if (c8 >= 'A' && c8 <= 'Z') {
            return true;
        }
        return c8 == '$' || c8 == '%' || c8 == '\'' || c8 == '-' || c8 == '_' || c8 == '@' || c8 == '~' || c8 == '`' || c8 == '!' || c8 == '(' || c8 == ')' || c8 == '{' || c8 == '}' || c8 == '^' || c8 == '#' || c8 == '&';
        {
        }
    }

    private static String f(String string) {
        int n8 = string.length();
        StringBuilder stringBuilder = new StringBuilder(n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            char c8 = string.charAt(i8);
            if (l.e(c8)) {
                stringBuilder.append(c8);
                continue;
            }
            stringBuilder.append("_");
        }
        return stringBuilder.toString();
    }
}

