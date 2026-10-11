package ax.v8;

import j$.util.DesugarTimeZone;
import java.util.TimeZone;

/* renamed from: ax.v8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3290a {
    private static final TimeZone a = DesugarTimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int b(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2 A[Catch: IllegalArgumentException -> 0x004e, NumberFormatException -> 0x0051, IndexOutOfBoundsException -> 0x0054, TryCatch #2 {IndexOutOfBoundsException -> 0x0054, NumberFormatException -> 0x0051, IllegalArgumentException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x005e, B:20:0x006e, B:21:0x0070, B:23:0x007c, B:24:0x007f, B:26:0x0085, B:30:0x008f, B:35:0x009f, B:37:0x00a7, B:42:0x00dc, B:44:0x00e2, B:46:0x00e8, B:47:0x0195, B:52:0x00f2, B:53:0x010d, B:54:0x010e, B:57:0x012a, B:59:0x0137, B:62:0x0140, B:64:0x015f, B:67:0x016e, B:68:0x0190, B:70:0x0193, B:71:0x0119, B:72:0x01c6, B:73:0x01cd, B:74:0x00bf, B:75:0x00c2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c6 A[Catch: IllegalArgumentException -> 0x004e, NumberFormatException -> 0x0051, IndexOutOfBoundsException -> 0x0054, TryCatch #2 {IndexOutOfBoundsException -> 0x0054, NumberFormatException -> 0x0051, IllegalArgumentException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x005e, B:20:0x006e, B:21:0x0070, B:23:0x007c, B:24:0x007f, B:26:0x0085, B:30:0x008f, B:35:0x009f, B:37:0x00a7, B:42:0x00dc, B:44:0x00e2, B:46:0x00e8, B:47:0x0195, B:52:0x00f2, B:53:0x010d, B:54:0x010e, B:57:0x012a, B:59:0x0137, B:62:0x0140, B:64:0x015f, B:67:0x016e, B:68:0x0190, B:70:0x0193, B:71:0x0119, B:72:0x01c6, B:73:0x01cd, B:74:0x00bf, B:75:0x00c2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date c(java.lang.String r18, java.text.ParsePosition r19) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.v8.C3290a.c(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int d(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }
}
