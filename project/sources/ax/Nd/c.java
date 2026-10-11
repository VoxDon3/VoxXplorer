package ax.Nd;

/* loaded from: classes3.dex */
public class c {
    private static boolean a(String str, int i) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        return parseInt >= 0 && parseInt <= i;
    }

    public static boolean b(String str) {
        int indexOf;
        if (str.length() == 0) {
            return false;
        }
        String str2 = str + ".";
        int i = 0;
        int i2 = 0;
        while (i < str2.length() && (indexOf = str2.indexOf(46, i)) > i) {
            if (i2 == 4) {
                return false;
            }
            try {
                int parseInt = Integer.parseInt(str2.substring(i, indexOf));
                if (parseInt >= 0 && parseInt <= 255) {
                    i = indexOf + 1;
                    i2++;
                }
            } catch (NumberFormatException unused) {
            }
            return false;
        }
        return i2 == 4;
    }

    public static boolean c(String str) {
        int indexOf = str.indexOf("/");
        String substring = str.substring(indexOf + 1);
        return indexOf > 0 && b(str.substring(0, indexOf)) && (b(substring) || a(substring, 32));
    }

    public static boolean d(String str) {
        int indexOf;
        if (str.length() == 0) {
            return false;
        }
        String str2 = str + ":";
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (i < str2.length() && (indexOf = str2.indexOf(58, i)) >= i) {
            if (i2 == 8) {
                return false;
            }
            if (i != indexOf) {
                String substring = str2.substring(i, indexOf);
                if (indexOf != str2.length() - 1 || substring.indexOf(46) <= 0) {
                    try {
                        int parseInt = Integer.parseInt(str2.substring(i, indexOf), 16);
                        if (parseInt >= 0 && parseInt <= 65535) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    return false;
                }
                if (!b(substring)) {
                    return false;
                }
                i2++;
            } else {
                if (indexOf != 1 && indexOf != str2.length() - 1 && z) {
                    return false;
                }
                z = true;
            }
            i = indexOf + 1;
            i2++;
        }
        return i2 == 8 || z;
    }

    public static boolean e(String str) {
        int indexOf = str.indexOf("/");
        String substring = str.substring(indexOf + 1);
        return indexOf > 0 && d(str.substring(0, indexOf)) && (d(substring) || a(substring, 128));
    }
}
