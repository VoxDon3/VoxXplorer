package ax.nb;

import ax.jb.C2345a;
import ax.qb.C2896d;
import java.io.UnsupportedEncodingException;

/* renamed from: ax.nb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2639b {
    private static final String e = C2345a.g("jcifs.netbios.scope");
    static final String f = C2345a.h("jcifs.encoding", System.getProperty("file.encoding"));
    public String a;
    public String b;
    public int c;
    int d;

    C2639b() {
    }

    int a(byte[] bArr, int i) {
        int i2;
        int i3 = i + 1;
        int i4 = bArr[i] & 255;
        if (i4 == 0) {
            this.b = null;
            return 1;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer(new String(bArr, i3, i4, f));
            int i5 = i3 + i4;
            while (true) {
                i2 = i5 + 1;
                try {
                    int i6 = bArr[i5] & 255;
                    if (i6 == 0) {
                        break;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(new String(bArr, i2, i6, f));
                    i5 = i6 + i2;
                } catch (UnsupportedEncodingException unused) {
                    i3 = i2;
                    i2 = i3;
                    return i2 - i;
                }
            }
            this.b = stringBuffer.toString();
        } catch (UnsupportedEncodingException unused2) {
        }
        return i2 - i;
    }

    int b(byte[] bArr, int i) {
        byte[] bArr2 = new byte[33];
        int i2 = 15;
        for (int i3 = 0; i3 < 15; i3++) {
            int i4 = i3 * 2;
            byte b = (byte) (((bArr[(i4 + 1) + i] & 255) - 65) << 4);
            bArr2[i3] = b;
            byte b2 = (byte) (((byte) (((bArr[(i4 + 2) + i] & 255) - 65) & 15)) | b);
            bArr2[i3] = b2;
            if (b2 != 32) {
                i2 = i3 + 1;
            }
        }
        try {
            this.a = new String(bArr2, 0, i2, f);
        } catch (UnsupportedEncodingException unused) {
        }
        int i5 = ((bArr[i + 31] & 255) - 65) << 4;
        this.c = i5;
        this.c = i5 | (15 & ((bArr[i + 32] & 255) - 65));
        return a(bArr, i + 33) + 33;
    }

    int c(byte[] bArr, int i) {
        String str = this.b;
        if (str == null) {
            bArr[i] = 0;
            return 1;
        }
        int i2 = i + 1;
        bArr[i] = 46;
        try {
            System.arraycopy(str.getBytes(f), 0, bArr, i2, this.b.length());
        } catch (UnsupportedEncodingException unused) {
        }
        int length = i2 + this.b.length();
        bArr[length] = 0;
        int i3 = length - 1;
        int length2 = i3 - this.b.length();
        int i4 = 0;
        while (true) {
            if (bArr[i3] == 46) {
                bArr[i3] = (byte) i4;
                i4 = 0;
            } else {
                i4++;
            }
            int i5 = i3 - 1;
            if (i3 <= length2) {
                return this.b.length() + 2;
            }
            i3 = i5;
        }
    }

    int d(byte[] bArr, int i) {
        bArr[i] = 32;
        try {
            byte[] bytes = this.a.getBytes(f);
            int i2 = 0;
            while (i2 < bytes.length) {
                int i3 = i2 * 2;
                bArr[i3 + 1 + i] = (byte) (((bytes[i2] & 240) >> 4) + 65);
                bArr[i3 + 2 + i] = (byte) ((15 & bytes[i2]) + 65);
                i2++;
            }
            while (i2 < 15) {
                int i4 = i2 * 2;
                bArr[i4 + 1 + i] = 67;
                bArr[i4 + 2 + i] = 65;
                i2++;
            }
            int i5 = this.c;
            bArr[i + 31] = (byte) (((i5 & 240) >> 4) + 65);
            bArr[i + 32] = (byte) ((i5 & 15) + 65);
        } catch (UnsupportedEncodingException unused) {
        }
        return c(bArr, i + 33) + 33;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2639b)) {
            return false;
        }
        C2639b c2639b = (C2639b) obj;
        return (this.b == null && c2639b.b == null) ? this.a.equals(c2639b.a) && this.c == c2639b.c : this.a.equals(c2639b.a) && this.c == c2639b.c && this.b.equals(c2639b.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() + (this.c * 65599) + (this.d * 65599);
        String str = this.b;
        return (str == null || str.length() == 0) ? hashCode : hashCode + this.b.hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.a;
        if (str == null) {
            str = "null";
        } else if (str.charAt(0) == 1) {
            char[] charArray = str.toCharArray();
            charArray[0] = '.';
            charArray[1] = '.';
            charArray[14] = '.';
            str = new String(charArray);
        }
        stringBuffer.append(str);
        stringBuffer.append("<");
        stringBuffer.append(C2896d.c(this.c, 2));
        stringBuffer.append(">");
        if (this.b != null) {
            stringBuffer.append(".");
            stringBuffer.append(this.b);
        }
        return stringBuffer.toString();
    }

    public C2639b(String str, int i, String str2) {
        this.a = (str.length() > 15 ? str.substring(0, 15) : str).toUpperCase();
        this.c = i;
        this.b = (str2 == null || str2.length() <= 0) ? e : str2;
        this.d = 0;
    }
}
