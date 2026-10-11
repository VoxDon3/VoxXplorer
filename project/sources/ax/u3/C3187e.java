package ax.u3;

import okhttp3.HttpUrl;

/* renamed from: ax.u3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3187e {
    private static String a(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        for (int i = 0; i < min; i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                return str.substring(0, i);
            }
        }
        return str.substring(0, min);
    }

    private static String b(String str, String str2, String str3) {
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        int min = Math.min(str.length() - str3.length(), str2.length() - str3.length());
        int i = 0;
        while (str.charAt(length) == str2.charAt(length2) && (i = i + 1) <= min) {
            length--;
            length2--;
            if (length < 0 || length2 < 0) {
                return length < 0 ? str : str2;
            }
        }
        return length == str.length() + (-1) ? HttpUrl.FRAGMENT_ENCODE_SET : str.substring(length + 1);
    }

    public static boolean c(String str, String str2, String str3) {
        if (str.length() == str2.length() && str.equalsIgnoreCase(str2)) {
            return true;
        }
        String a = a(str, str2);
        if (a.length() <= 0) {
            return false;
        }
        String b = b(str, str2, a);
        return d(str.substring(a.length(), str.length() - b.length()), str3) && d(str2.substring(a.length(), str2.length() - b.length()), str3);
    }

    public static boolean d(String str, String str2) {
        return str.length() == 0 || str.contains(str2) || str.matches("-[0-9]+| ?\\([0-9]+\\)");
    }
}
