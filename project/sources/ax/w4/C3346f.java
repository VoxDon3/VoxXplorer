package ax.w4;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.Collection;

/* renamed from: ax.w4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3346f {
    public static final Charset a = Charset.forName("UTF-8");
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        return b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", bArr);
    }

    public static String b(String str, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("'data' can't be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("'digits' can't be null");
        }
        if (str.length() != 64) {
            throw new IllegalArgumentException("'digits' must be 64 characters long: " + f(str));
        }
        StringBuilder sb = new StringBuilder(((bArr.length + 2) / 3) * 4);
        int i = 0;
        while (i + 3 <= bArr.length) {
            byte b2 = bArr[i];
            int i2 = i + 2;
            byte b3 = bArr[i + 1];
            i += 3;
            byte b4 = bArr[i2];
            int i3 = (b2 & 255) >>> 2;
            sb.append(str.charAt(i3));
            sb.append(str.charAt(((b2 & 3) << 4) | ((b3 & 255) >>> 4)));
            sb.append(str.charAt(((b3 & 15) << 2) | ((b4 & 255) >>> 6)));
            sb.append(str.charAt(b4 & 63));
        }
        int length = bArr.length - i;
        if (length != 0) {
            if (length == 1) {
                byte b5 = bArr[i];
                sb.append(str.charAt((b5 & 255) >>> 2));
                sb.append(str.charAt((b5 & 3) << 4));
                sb.append("==");
            } else {
                if (length != 2) {
                    throw new AssertionError("data.length: " + bArr.length + ", i: " + i);
                }
                int i4 = i + 1;
                byte b6 = bArr[i];
                byte b7 = bArr[i4];
                sb.append(str.charAt((b6 & 255) >>> 2));
                sb.append(str.charAt(((b6 & 3) << 4) | ((b7 & 255) >>> 4)));
                sb.append(str.charAt((b7 & 15) << 2));
                sb.append('=');
            }
        }
        return sb.toString();
    }

    public static char c(int i) {
        return b[i];
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder(str.length() * 2);
        sb.append('\"');
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == 0) {
                sb.append("\\000");
            } else if (charAt == '\r') {
                sb.append("\\t");
            } else if (charAt == '\"') {
                sb.append("\\\"");
            } else if (charAt == '\\') {
                sb.append("\\\\");
            } else if (charAt == '\t') {
                sb.append("\\r");
            } else if (charAt == '\n') {
                sb.append("\\n");
            } else if (charAt < ' ' || charAt > '~') {
                sb.append("\\u");
                sb.append(c((charAt >> '\f') & 15));
                sb.append(c((charAt >> '\b') & 15));
                sb.append(c((charAt >> 4) & 15));
                sb.append(c(charAt & 15));
            } else {
                sb.append(charAt);
            }
        }
        sb.append('\"');
        return sb.toString();
    }

    public static String e(Collection<String> collection, String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String str2 : collection) {
            if (i > 0) {
                sb.append(str);
            }
            sb.append(str2);
            i++;
        }
        return sb.toString();
    }

    public static String f(String str) {
        return d(str);
    }

    public static byte[] g(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw C3344d.a("UTF-8 should always be supported", e);
        }
    }

    public static String h(byte[] bArr) {
        return b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", bArr);
    }

    public static String i(byte[] bArr) throws CharacterCodingException {
        return j(bArr, 0, bArr.length);
    }

    public static String j(byte[] bArr, int i, int i2) throws CharacterCodingException {
        return a.newDecoder().decode(ByteBuffer.wrap(bArr, i, i2)).toString();
    }
}
