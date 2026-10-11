/*
 * Decompiled with CFR 0.152.
 */
package ax.T4;

import ax.b5.c;
import java.io.Serializable;
import java.util.Arrays;

public final class a
implements Serializable {
    private final transient char[] c0;
    private final transient byte[] d0;
    final String e0;
    private final char f0;
    private final int g0;
    private final boolean h0;
    private final a i0;
    private final transient int[] q;

    public a(a a8, String string, int n8) {
        this(a8, string, a8.h0, a8.f0, n8);
    }

    public a(a a8, String string, boolean bl, char c8, int n8) {
        this(a8, string, bl, c8, a8.i0, n8);
    }

    private a(a object, String object2, boolean bl, char c8, a a8, int n8) {
        int[] nArray = new int[128];
        this.q = nArray;
        char[] cArray = new char[64];
        this.c0 = cArray;
        byte[] byArray = new byte[64];
        this.d0 = byArray;
        this.e0 = object2;
        object2 = ((a)object).d0;
        System.arraycopy(object2, 0, byArray, 0, ((Object)object2).length);
        object2 = ((a)object).c0;
        System.arraycopy(object2, 0, cArray, 0, ((Object)object2).length);
        object = ((a)object).q;
        System.arraycopy(object, 0, nArray, 0, ((Object)object).length);
        this.h0 = bl;
        this.f0 = c8;
        this.g0 = n8;
        this.i0 = a8;
    }

    public a(String object, String string, boolean bl, char c8, int n8) {
        int[] nArray = new int[128];
        this.q = nArray;
        char[] cArray = new char[64];
        this.c0 = cArray;
        this.d0 = new byte[64];
        this.e0 = object;
        this.h0 = bl;
        this.f0 = c8;
        this.g0 = n8;
        int n9 = string.length();
        if (n9 == 64) {
            n8 = 0;
            string.getChars(0, n9, cArray, 0);
            Arrays.fill(nArray, -1);
            while (n8 < n9) {
                char c9 = this.c0[n8];
                this.d0[n8] = (byte)c9;
                this.q[c9] = n8++;
            }
            if (bl) {
                this.q[c8] = -2;
            }
            object = bl ? a.c0 : a.q;
            this.i0 = object;
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Base64Alphabet length must be exactly 64 (was ");
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append(")");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    protected void a() throws IllegalArgumentException {
        throw new IllegalArgumentException(this.j());
    }

    protected void b() throws IllegalArgumentException {
        throw new IllegalArgumentException(this.l());
    }

    protected void c(char c8, int n8, String string) throws IllegalArgumentException {
        CharSequence charSequence;
        if (c8 <= ' ') {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Illegal white space character (code 0x");
            ((StringBuilder)charSequence).append(Integer.toHexString(c8));
            ((StringBuilder)charSequence).append(") as character #");
            ((StringBuilder)charSequence).append(n8 + 1);
            ((StringBuilder)charSequence).append(" of 4-char base64 unit: can only used between units");
            charSequence = ((StringBuilder)charSequence).toString();
        } else if (this.m(c8)) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Unexpected padding character ('");
            ((StringBuilder)charSequence).append(this.i());
            ((StringBuilder)charSequence).append("') as character #");
            ((StringBuilder)charSequence).append(n8 + 1);
            ((StringBuilder)charSequence).append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
            charSequence = ((StringBuilder)charSequence).toString();
        } else if (Character.isDefined(c8) && !Character.isISOControl(c8)) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Illegal character '");
            ((StringBuilder)charSequence).append(c8);
            ((StringBuilder)charSequence).append("' (code 0x");
            ((StringBuilder)charSequence).append(Integer.toHexString(c8));
            ((StringBuilder)charSequence).append(") in base64 content");
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Illegal character (code 0x");
            ((StringBuilder)charSequence).append(Integer.toHexString(c8));
            ((StringBuilder)charSequence).append(") in base64 content");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        CharSequence charSequence2 = charSequence;
        if (string != null) {
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append((String)charSequence);
            ((StringBuilder)charSequence2).append(": ");
            ((StringBuilder)charSequence2).append(string);
            charSequence2 = ((StringBuilder)charSequence2).toString();
        }
        throw new IllegalArgumentException((String)charSequence2);
    }

    public boolean d() {
        return this.i0 != a.q;
    }

    public void e(String string, c c8) throws IllegalArgumentException {
        int n8 = string.length();
        int n9 = 0;
        while (n9 < n8) {
            int n10 = n9 + 1;
            char c9 = string.charAt(n9);
            if (c9 > ' ') {
                int n11 = this.f(c9);
                if (n11 < 0) {
                    this.c(c9, 0, null);
                }
                if (n10 >= n8) {
                    this.a();
                }
                int n12 = n9 + 2;
                c9 = string.charAt(n10);
                if ((n10 = this.f(c9)) < 0) {
                    this.c(c9, 1, null);
                }
                n11 = n11 << 6 | n10;
                if (n12 >= n8) {
                    if (!this.k()) {
                        c8.b(n11 >> 4);
                        return;
                    }
                    this.a();
                }
                n10 = n9 + 3;
                c9 = string.charAt(n12);
                if ((n12 = this.f(c9)) < 0) {
                    if (n12 != -2) {
                        this.c(c9, 2, null);
                    }
                    if (!this.d()) {
                        this.b();
                    }
                    if (n10 >= n8) {
                        this.a();
                    }
                    n9 += 4;
                    c9 = string.charAt(n10);
                    if (!this.m(c9)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("expected padding character '");
                        stringBuilder.append(this.i());
                        stringBuilder.append("'");
                        this.c(c9, 3, stringBuilder.toString());
                    }
                    c8.b(n11 >> 4);
                    continue;
                }
                n12 = n11 << 6 | n12;
                if (n10 >= n8) {
                    if (!this.k()) {
                        c8.d(n12 >> 2);
                        return;
                    }
                    this.a();
                }
                n9 += 4;
                c9 = string.charAt(n10);
                if ((n10 = this.f(c9)) < 0) {
                    if (n10 != -2) {
                        this.c(c9, 3, null);
                    }
                    if (!this.d()) {
                        this.b();
                    }
                    c8.d(n12 >> 2);
                    continue;
                }
                c8.c(n12 << 6 | n10);
                continue;
            }
            n9 = n10;
        }
        return;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object != null && object.getClass() == a.class) {
            object = (a)object;
            if (((a)object).f0 == this.f0 && ((a)object).g0 == this.g0 && ((a)object).h0 == this.h0 && ((a)object).i0 == this.i0 && this.e0.equals(((a)object).e0)) {
                return true;
            }
        }
        return false;
    }

    public int f(char c8) {
        if (c8 <= '\u007f') {
            return this.q[c8];
        }
        return -1;
    }

    public int g(int n8) {
        if (n8 <= 127) {
            return this.q[n8];
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
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", this.h(), Character.valueOf(this.i()));
    }

    public boolean k() {
        return this.i0 == a.c0;
    }

    protected String l() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", this.h());
    }

    public boolean m(char c8) {
        return c8 == this.f0;
    }

    public boolean n(int n8) {
        return n8 == this.f0;
    }

    public String toString() {
        return this.e0;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        private static final a[] e0;
        public static final /* enum */ a q;

        static {
            a a8;
            a a9;
            a a10;
            q = a10 = new a();
            c0 = a9 = new a();
            d0 = a8 = new a();
            e0 = new a[]{a10, a9, a8};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])e0.clone();
        }
    }
}

