package ax.Nd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes3.dex */
public final class j {
    private static String a;

    static class a implements PrivilegedAction<String> {
        a() {
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            try {
                a = (String) AccessController.doPrivileged(new a());
            } catch (Exception unused) {
                a = String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
            a = "\n";
        }
    }

    public static char[] a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    public static String b(byte[] bArr) {
        return new String(a(bArr));
    }

    public static String c(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int b = ax.Od.e.b(bArr, cArr);
        if (b >= 0) {
            return new String(cArr, 0, b);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    public static String d() {
        return a;
    }

    public static byte[] e(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static String f(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) (c + ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static void g(char[] cArr, OutputStream outputStream) throws IOException {
        int i;
        int i2;
        int i3 = 0;
        while (i3 < cArr.length) {
            char c = cArr[i3];
            int i4 = c;
            if (c >= 128) {
                if (c < 2048) {
                    i = (c >> 6) | 192;
                } else if (c < 55296 || c > 57343) {
                    outputStream.write((c >> '\f') | 224);
                    i = ((c >> 6) & 63) | 128;
                } else {
                    i3++;
                    if (i3 >= cArr.length) {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                    char c2 = cArr[i3];
                    if (c > 56319) {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                    int i5 = (((c & 1023) << 10) | (c2 & 1023)) + 65536;
                    outputStream.write((i5 >> 18) | 240);
                    outputStream.write(((i5 >> 12) & 63) | 128);
                    outputStream.write(((i5 >> 6) & 63) | 128);
                    i2 = i5;
                    i4 = (i2 & 63) | 128;
                }
                outputStream.write(i);
                i2 = c;
                i4 = (i2 & 63) | 128;
            }
            outputStream.write(i4);
            i3++;
        }
    }

    public static byte[] h(String str) {
        return i(str.toCharArray());
    }

    public static byte[] i(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            g(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    public static String j(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) (c - ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }
}
