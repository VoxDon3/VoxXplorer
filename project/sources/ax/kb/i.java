package ax.kb;

import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
public class i extends j {
    static final char[] h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public i(String str) {
        char[] charArray = str.toCharArray();
        this.b = f(charArray, 0, 8);
        this.c = d(f(charArray, 9, 4));
        this.d = d(f(charArray, 14, 4));
        this.e = c(f(charArray, 19, 2));
        this.f = c(f(charArray, 21, 2));
        byte[] bArr = new byte[6];
        this.g = bArr;
        bArr[0] = c(f(charArray, 24, 2));
        this.g[1] = c(f(charArray, 26, 2));
        this.g[2] = c(f(charArray, 28, 2));
        this.g[3] = c(f(charArray, 30, 2));
        this.g[4] = c(f(charArray, 32, 2));
        this.g[5] = c(f(charArray, 34, 2));
    }

    private static byte c(int i) {
        return (byte) (i & 255);
    }

    private static short d(int i) {
        return (short) (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }

    public static String e(int i, int i2) {
        char[] cArr = new char[i2];
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                return new String(cArr);
            }
            cArr[i3] = h[i & 15];
            i >>>= 4;
            i2 = i3;
        }
    }

    public static int f(char[] cArr, int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 < cArr.length && i4 < i2; i6++) {
            int i7 = i5 << 4;
            char c = cArr[i6];
            switch (c) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    i3 = c - '0';
                    break;
                default:
                    switch (c) {
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                            i3 = c - '7';
                            break;
                        default:
                            switch (c) {
                                case 'a':
                                case 'b':
                                case 'c':
                                case 'd':
                                case 'e':
                                case 'f':
                                    i3 = c - 'W';
                                    break;
                                default:
                                    throw new IllegalArgumentException(new String(cArr, i, i2));
                            }
                    }
            }
            i5 = i7 + i3;
            i4++;
        }
        return i5;
    }

    public String toString() {
        return e(this.b, 8) + '-' + e(this.c, 4) + '-' + e(this.d, 4) + '-' + e(this.e, 2) + e(this.f, 2) + '-' + e(this.g[0], 2) + e(this.g[1], 2) + e(this.g[2], 2) + e(this.g[3], 2) + e(this.g[4], 2) + e(this.g[5], 2);
    }
}
