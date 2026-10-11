package ax.i5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
class l {
    public static boolean a(Collection<k> collection, k kVar) {
        Iterator<k> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next().b().equalsIgnoreCase(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!e(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    static k c(String str, Collection<k> collection) {
        String trim = str.toUpperCase(Locale.ROOT).trim();
        int i = 0;
        int i2 = 0;
        while (i2 < trim.length() && trim.charAt(i2) == '.') {
            i2++;
        }
        String substring = trim.substring(i2);
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        String replace = substring.replace(" ", HttpUrl.FRAGMENT_ENCODE_SET);
        int lastIndexOf = replace.lastIndexOf(".");
        if (lastIndexOf != -1) {
            String substring2 = replace.substring(0, lastIndexOf);
            String substring3 = replace.substring(lastIndexOf + 1);
            if (substring3.length() > 3) {
                substring3 = substring3.substring(0, 3);
            }
            str2 = substring3;
            replace = substring2;
        }
        if (b(replace)) {
            replace = f(replace);
        }
        if (b(str2)) {
            str2 = f(str2);
        }
        if (replace.length() == 0) {
            replace = "__";
        } else if (replace.length() == 1) {
            replace = replace + "_";
        } else if (replace.length() != 2 && replace.length() > 2) {
            replace = replace.substring(0, 2);
        }
        if (str2.length() == 0) {
            str2 = "000";
        } else if (str2.length() == 1) {
            str2 = str2 + "00";
        } else if (str2.length() == 2) {
            str2 = str2 + "0";
        }
        k kVar = new k(replace + "0000~0", str2);
        String str3 = "0000";
        while (a(collection, kVar)) {
            if (d(str3, 4) == null) {
                i++;
                if (i >= 10) {
                    break;
                }
                str3 = "0000";
            } else {
                str3 = d(str3, 4);
            }
            kVar = new k(replace + str3 + "~" + i, str2);
        }
        return kVar;
    }

    static String d(String str, int i) {
        String hexString = Long.toHexString(Long.parseLong(str, 16) + 1);
        if (hexString.length() > i) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i - hexString.length(); i2++) {
            sb.append("0");
        }
        return sb.toString() + hexString;
    }

    private static boolean e(char c) {
        if (c < '0' || c > '9') {
            return (c >= 'A' && c <= 'Z') || c == '$' || c == '%' || c == '\'' || c == '-' || c == '_' || c == '@' || c == '~' || c == '`' || c == '!' || c == '(' || c == ')' || c == '{' || c == '}' || c == '^' || c == '#' || c == '&';
        }
        return true;
    }

    private static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (e(charAt)) {
                sb.append(charAt);
            } else {
                sb.append("_");
            }
        }
        return sb.toString();
    }
}
