package ax.X4;

import java.util.Arrays;

/* loaded from: classes.dex */
abstract class f {
    static final byte[] a;

    static {
        byte[] bArr = new byte[256];
        a = bArr;
        Arrays.fill(bArr, (byte) -1);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            a[c] = (byte) (c - '0');
        }
        for (char c2 = 'A'; c2 <= 'F'; c2 = (char) (c2 + 1)) {
            a[c2] = (byte) (c2 - '7');
        }
        for (char c3 = 'a'; c3 <= 'f'; c3 = (char) (c3 + 1)) {
            a[c3] = (byte) (c3 - 'W');
        }
        for (char c4 = '.'; c4 <= '.'; c4 = (char) (c4 + 1)) {
            a[c4] = -4;
        }
    }

    f() {
    }

    protected static char a(CharSequence charSequence, int i, int i2) {
        if (i < i2) {
            return charSequence.charAt(i);
        }
        return (char) 0;
    }

    protected static int b(char c) {
        if (c < 128) {
            return a[c];
        }
        return -1;
    }
}
