package ax.n7;

/* renamed from: ax.n7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2586c extends e {
    private static final char[] c = {'+'};
    private static final char[] d = "0123456789ABCDEF".toCharArray();
    private final boolean a;
    private final boolean[] b;

    public C2586c(String str) {
        this(str, false);
    }

    private static boolean[] g(String str) {
        char[] charArray = str.toCharArray();
        int i = 122;
        for (char c2 : charArray) {
            i = Math.max((int) c2, i);
        }
        boolean[] zArr = new boolean[i + 1];
        for (int i2 = 48; i2 <= 57; i2++) {
            zArr[i2] = true;
        }
        for (int i3 = 65; i3 <= 90; i3++) {
            zArr[i3] = true;
        }
        for (int i4 = 97; i4 <= 122; i4++) {
            zArr[i4] = true;
        }
        for (char c3 : charArray) {
            zArr[c3] = true;
        }
        return zArr;
    }

    @Override // ax.n7.AbstractC2585b
    public String a(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean[] zArr = this.b;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return d(str, i);
            }
        }
        return str;
    }

    @Override // ax.n7.e
    protected char[] c(int i) {
        boolean[] zArr = this.b;
        if (i < zArr.length && zArr[i]) {
            return null;
        }
        if (i == 32 && this.a) {
            return c;
        }
        if (i <= 127) {
            char[] cArr = d;
            return new char[]{'%', cArr[i >>> 4], cArr[i & 15]};
        }
        if (i <= 2047) {
            char[] cArr2 = d;
            return new char[]{'%', cArr2[(i >>> 10) | 12], cArr2[(i >>> 6) & 15], '%', cArr2[((i >>> 4) & 3) | 8], cArr2[i & 15]};
        }
        if (i <= 65535) {
            char[] cArr3 = d;
            return new char[]{'%', 'E', cArr3[i >>> 12], '%', cArr3[((i >>> 10) & 3) | 8], cArr3[(i >>> 6) & 15], '%', cArr3[((i >>> 4) & 3) | 8], cArr3[i & 15]};
        }
        if (i <= 1114111) {
            char[] cArr4 = d;
            return new char[]{'%', 'F', cArr4[(i >>> 18) & 7], '%', cArr4[((i >>> 16) & 3) | 8], cArr4[(i >>> 12) & 15], '%', cArr4[((i >>> 10) & 3) | 8], cArr4[(i >>> 6) & 15], '%', cArr4[((i >>> 4) & 3) | 8], cArr4[i & 15]};
        }
        throw new IllegalArgumentException("Invalid unicode character value " + i);
    }

    @Override // ax.n7.e
    protected int f(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            boolean[] zArr = this.b;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }

    @Deprecated
    public C2586c(String str, boolean z) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric ASCII characters are always 'safe' and should not be escaped.");
        }
        if (z && str.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        if (str.contains("%")) {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        }
        this.a = z;
        this.b = g(str);
    }
}
