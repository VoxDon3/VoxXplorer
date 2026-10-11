package ax.Ob;

import ax.Gb.y;
import ax.tb.AbstractC3127c;
import java.util.Comparator;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class s extends r {
    public static final String A(String str, char c, char c2, boolean z) {
        ax.Gb.l.f(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            ax.Gb.l.e(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (c.d(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static final String B(String str, String str2, String str3, boolean z) {
        ax.Gb.l.f(str, "<this>");
        ax.Gb.l.f(str2, "oldValue");
        ax.Gb.l.f(str3, "newValue");
        int i = 0;
        int R = u.R(str, str2, 0, z);
        if (R < 0) {
            return str;
        }
        int length = str2.length();
        int b = ax.Lb.f.b(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, R);
            sb.append(str3);
            i = R + length;
            if (R >= str.length()) {
                break;
            }
            R = u.R(str, str2, R + b, z);
        } while (R > 0);
        sb.append((CharSequence) str, i, str.length());
        String sb2 = sb.toString();
        ax.Gb.l.e(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ String C(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return A(str, c, c2, z);
    }

    public static /* synthetic */ String D(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return B(str, str2, str3, z);
    }

    public static boolean E(String str, String str2, int i, boolean z) {
        ax.Gb.l.f(str, "<this>");
        ax.Gb.l.f(str2, "prefix");
        return !z ? str.startsWith(str2, i) : x(str, i, str2, 0, str2.length(), z);
    }

    public static boolean F(String str, String str2, boolean z) {
        ax.Gb.l.f(str, "<this>");
        ax.Gb.l.f(str2, "prefix");
        return !z ? str.startsWith(str2) : x(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean G(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return E(str, str2, i, z);
    }

    public static /* synthetic */ boolean H(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return F(str, str2, z);
    }

    public static String q(char[] cArr) {
        ax.Gb.l.f(cArr, "<this>");
        return new String(cArr);
    }

    public static String r(char[] cArr, int i, int i2) {
        ax.Gb.l.f(cArr, "<this>");
        AbstractC3127c.q.a(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    public static byte[] s(String str) {
        ax.Gb.l.f(str, "<this>");
        byte[] bytes = str.getBytes(d.b);
        ax.Gb.l.e(bytes, "getBytes(...)");
        return bytes;
    }

    public static final boolean t(String str, String str2, boolean z) {
        ax.Gb.l.f(str, "<this>");
        ax.Gb.l.f(str2, "suffix");
        return !z ? str.endsWith(str2) : x(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean u(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return t(str, str2, z);
    }

    public static boolean v(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static Comparator<String> w(y yVar) {
        ax.Gb.l.f(yVar, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        ax.Gb.l.e(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    public static final boolean x(String str, int i, String str2, int i2, int i3, boolean z) {
        ax.Gb.l.f(str, "<this>");
        ax.Gb.l.f(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String z(CharSequence charSequence, int i) {
        ax.Gb.l.f(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int i2 = 1;
        if (i == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (length == 1) {
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append(charSequence);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String sb2 = sb.toString();
        ax.Gb.l.c(sb2);
        return sb2;
    }
}
