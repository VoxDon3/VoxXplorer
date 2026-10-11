package ax.n7;

/* loaded from: classes3.dex */
public abstract class e extends AbstractC2585b {
    protected static int b(CharSequence charSequence, int i, int i2) {
        if (i >= i2) {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
        int i3 = i + 1;
        char charAt = charSequence.charAt(i);
        if (charAt < 55296 || charAt > 57343) {
            return charAt;
        }
        if (charAt > 56319) {
            throw new IllegalArgumentException("Unexpected low surrogate character '" + charAt + "' with value " + ((int) charAt) + " at index " + i);
        }
        if (i3 == i2) {
            return -charAt;
        }
        char charAt2 = charSequence.charAt(i3);
        if (Character.isLowSurrogate(charAt2)) {
            return Character.toCodePoint(charAt, charAt2);
        }
        throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt2 + "' with value " + ((int) charAt2) + " at index " + i3);
    }

    private static char[] e(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    protected abstract char[] c(int i);

    protected final String d(String str, int i) {
        int length = str.length();
        char[] a = d.a();
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int b = b(str, i, length);
            if (b < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] c = c(b);
            int i4 = (Character.isSupplementaryCodePoint(b) ? 2 : 1) + i;
            if (c != null) {
                int i5 = i - i2;
                int i6 = i3 + i5;
                int length2 = c.length + i6;
                if (a.length < length2) {
                    a = e(a, i3, ((length2 + length) - i) + 32);
                }
                if (i5 > 0) {
                    str.getChars(i2, i, a, i3);
                    i3 = i6;
                }
                if (c.length > 0) {
                    System.arraycopy(c, 0, a, i3, c.length);
                    i3 += c.length;
                }
                i2 = i4;
            }
            i = f(str, i4, length);
        }
        int i7 = length - i2;
        if (i7 > 0) {
            int i8 = i7 + i3;
            if (a.length < i8) {
                a = e(a, i3, i8);
            }
            str.getChars(i2, length, a, i3);
            i3 = i8;
        }
        return new String(a, 0, i3);
    }

    protected abstract int f(CharSequence charSequence, int i, int i2);
}
