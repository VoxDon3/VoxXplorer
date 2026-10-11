package ax.T4;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements Serializable {
    private final transient char[] c0;
    private final transient byte[] d0;
    final String e0;
    private final char f0;
    private final int g0;
    private final boolean h0;
    private final EnumC0195a i0;
    private final transient int[] q;

    /* renamed from: ax.T4.a$a, reason: collision with other inner class name */
    public enum EnumC0195a {
        PADDING_FORBIDDEN,
        PADDING_REQUIRED,
        PADDING_ALLOWED
    }

    public a(String str, String str2, boolean z, char c, int i) {
        int[] iArr = new int[128];
        this.q = iArr;
        char[] cArr = new char[64];
        this.c0 = cArr;
        this.d0 = new byte[64];
        this.e0 = str;
        this.h0 = z;
        this.f0 = c;
        this.g0 = i;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < length; i2++) {
            char c2 = this.c0[i2];
            this.d0[i2] = (byte) c2;
            this.q[c2] = i2;
        }
        if (z) {
            this.q[c] = -2;
        }
        this.i0 = z ? EnumC0195a.PADDING_REQUIRED : EnumC0195a.PADDING_FORBIDDEN;
    }

    protected void a() throws IllegalArgumentException {
        throw new IllegalArgumentException(j());
    }

    protected void b() throws IllegalArgumentException {
        throw new IllegalArgumentException(l());
    }

    protected void c(char c, int i, String str) throws IllegalArgumentException {
        String str2;
        if (c <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c) + ") as character #" + (i + 1) + " of 4-char base64 unit: can only used between units";
        } else if (m(c)) {
            str2 = "Unexpected padding character ('" + i() + "') as character #" + (i + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c) || Character.isISOControl(c)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(c) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + c + "' (code 0x" + Integer.toHexString(c) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new IllegalArgumentException(str2);
    }

    public boolean d() {
        return this.i0 != EnumC0195a.PADDING_FORBIDDEN;
    }

    public void e(String str, ax.b5.c cVar) throws IllegalArgumentException {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt > ' ') {
                int f = f(charAt);
                if (f < 0) {
                    c(charAt, 0, null);
                }
                if (i2 >= length) {
                    a();
                }
                int i3 = i + 2;
                char charAt2 = str.charAt(i2);
                int f2 = f(charAt2);
                if (f2 < 0) {
                    c(charAt2, 1, null);
                }
                int i4 = (f << 6) | f2;
                if (i3 >= length) {
                    if (!k()) {
                        cVar.b(i4 >> 4);
                        return;
                    }
                    a();
                }
                int i5 = i + 3;
                char charAt3 = str.charAt(i3);
                int f3 = f(charAt3);
                if (f3 < 0) {
                    if (f3 != -2) {
                        c(charAt3, 2, null);
                    }
                    if (!d()) {
                        b();
                    }
                    if (i5 >= length) {
                        a();
                    }
                    i += 4;
                    char charAt4 = str.charAt(i5);
                    if (!m(charAt4)) {
                        c(charAt4, 3, "expected padding character '" + i() + "'");
                    }
                    cVar.b(i4 >> 4);
                } else {
                    int i6 = (i4 << 6) | f3;
                    if (i5 >= length) {
                        if (!k()) {
                            cVar.d(i6 >> 2);
                            return;
                        }
                        a();
                    }
                    i += 4;
                    char charAt5 = str.charAt(i5);
                    int f4 = f(charAt5);
                    if (f4 < 0) {
                        if (f4 != -2) {
                            c(charAt5, 3, null);
                        }
                        if (!d()) {
                            b();
                        }
                        cVar.d(i6 >> 2);
                    } else {
                        cVar.c((i6 << 6) | f4);
                    }
                }
            } else {
                i = i2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == a.class) {
            a aVar = (a) obj;
            if (aVar.f0 == this.f0 && aVar.g0 == this.g0 && aVar.h0 == this.h0 && aVar.i0 == this.i0 && this.e0.equals(aVar.e0)) {
                return true;
            }
        }
        return false;
    }

    public int f(char c) {
        if (c <= 127) {
            return this.q[c];
        }
        return -1;
    }

    public int g(int i) {
        if (i <= 127) {
            return this.q[i];
        }
        return -1;
    }

    public String h() {
        return this.e0;
    }

    public int hashCode() {
        return this.e0.hashCode();
    }

    public char i() {
        return this.f0;
    }

    public String j() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", h(), Character.valueOf(i()));
    }

    public boolean k() {
        return this.i0 == EnumC0195a.PADDING_REQUIRED;
    }

    protected String l() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", h());
    }

    public boolean m(char c) {
        return c == this.f0;
    }

    public boolean n(int i) {
        return i == this.f0;
    }

    public String toString() {
        return this.e0;
    }

    public a(a aVar, String str, int i) {
        this(aVar, str, aVar.h0, aVar.f0, i);
    }

    public a(a aVar, String str, boolean z, char c, int i) {
        this(aVar, str, z, c, aVar.i0, i);
    }

    private a(a aVar, String str, boolean z, char c, EnumC0195a enumC0195a, int i) {
        int[] iArr = new int[128];
        this.q = iArr;
        char[] cArr = new char[64];
        this.c0 = cArr;
        byte[] bArr = new byte[64];
        this.d0 = bArr;
        this.e0 = str;
        byte[] bArr2 = aVar.d0;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = aVar.c0;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = aVar.q;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.h0 = z;
        this.f0 = c;
        this.g0 = i;
        this.i0 = enumC0195a;
    }
}
