/*
 * Decompiled with CFR 0.152.
 */
package ax.W4;

import ax.W4.c;
import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class d
implements Serializable {
    protected static final d f0 = new d(false, null);
    protected final int c0;
    protected final int d0;
    protected final boolean e0;
    protected final transient Object q;

    protected d(boolean bl, Object object) {
        this(bl, object, -1, -1);
    }

    protected d(boolean bl, Object object, int n8, int n9) {
        this.e0 = bl;
        this.q = object;
        this.c0 = n8;
        this.d0 = n9;
    }

    public static d i(boolean bl, Object object) {
        return new d(bl, object);
    }

    public static d o() {
        return f0;
    }

    protected int a(StringBuilder stringBuilder, String string) {
        stringBuilder.append('\"');
        int n8 = string.length();
        for (int i8 = 0; i8 < n8; ++i8) {
            char c8 = string.charAt(i8);
            if (Character.isISOControl(c8) && this.b(stringBuilder, c8)) continue;
            stringBuilder.append(c8);
        }
        stringBuilder.append('\"');
        return string.length();
    }

    protected boolean b(StringBuilder stringBuilder, int n8) {
        if (n8 != 13 && n8 != 10) {
            stringBuilder.append('\\');
            stringBuilder.append('u');
            stringBuilder.append(c.l(n8 >> 12 & 0xF));
            stringBuilder.append(c.l(n8 >> 8 & 0xF));
            stringBuilder.append(c.l(n8 >> 4 & 0xF));
            stringBuilder.append(c.l(n8 & 0xF));
            return true;
        }
        return false;
    }

    protected String c(CharSequence charSequence, int[] nArray, int n8) {
        this.f(nArray, charSequence.length());
        int n9 = nArray[0];
        return charSequence.subSequence(n9, Math.min(nArray[1], n8) + n9).toString();
    }

    protected String d(byte[] byArray, int[] nArray, int n8) {
        this.f(nArray, byArray.length);
        return new String(byArray, nArray[0], Math.min(nArray[1], n8), StandardCharsets.UTF_8);
    }

    protected String e(char[] cArray, int[] nArray, int n8) {
        this.f(nArray, cArray.length);
        return new String(cArray, nArray[0], Math.min(nArray[1], n8));
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof d)) {
            return false;
        }
        object = (d)object;
        if (this.c0 == ((d)object).c0 && this.d0 == ((d)object).d0) {
            Object object2 = ((d)object).q;
            object = this.q;
            if (object == null) {
                return object2 == null;
            }
            if (object2 == null) {
                return false;
            }
            if (!(object instanceof File || object instanceof URL || object instanceof URI)) {
                return object == object2;
            }
            return object.equals(object2);
        }
        return false;
    }

    protected void f(int[] nArray, int n8) {
        int n9;
        int n10 = nArray[0];
        if (n10 < 0) {
            n9 = 0;
        } else {
            n9 = n10;
            if (n10 >= n8) {
                n9 = n8;
            }
        }
        nArray[0] = n9;
        n10 = nArray[1];
        if (n10 >= 0 && n10 <= (n8 -= n9)) {
            return;
        }
        nArray[1] = n8;
    }

    public StringBuilder g(StringBuilder stringBuilder) {
        Object object = this.l();
        if (object == null) {
            stringBuilder.append("UNKNOWN");
            return stringBuilder;
        }
        Class<?> clazz = object instanceof Class ? (Class<?>)object : object.getClass();
        String string = clazz.getName();
        if (string.startsWith("java.")) {
            clazz = clazz.getSimpleName();
        } else if (object instanceof byte[]) {
            clazz = "byte[]";
        } else {
            clazz = string;
            if (object instanceof char[]) {
                clazz = "char[]";
            }
        }
        stringBuilder.append('(');
        stringBuilder.append((String)((Object)clazz));
        stringBuilder.append(')');
        if (this.m()) {
            int n8 = this.n();
            int n9 = this.k();
            int n10 = this.j();
            int[] nArray = new int[]{n9, n10};
            boolean bl = object instanceof CharSequence;
            string = " chars";
            if (bl) {
                clazz = this.c((CharSequence)object, nArray, n8);
            } else if (object instanceof char[]) {
                clazz = this.e((char[])object, nArray, n8);
            } else if (object instanceof byte[]) {
                clazz = this.d((byte[])object, nArray, n8);
                string = " bytes";
            } else {
                clazz = null;
            }
            if (clazz != null) {
                this.a(stringBuilder, (String)((Object)clazz));
                if (nArray[1] > n8) {
                    stringBuilder.append("[truncated ");
                    stringBuilder.append(nArray[1] - n8);
                    stringBuilder.append(string);
                    stringBuilder.append(']');
                    return stringBuilder;
                }
            }
        } else if (object instanceof byte[]) {
            int n11;
            int n12 = n11 = this.j();
            if (n11 < 0) {
                n12 = ((byte[])object).length;
            }
            stringBuilder.append('[');
            stringBuilder.append(n12);
            stringBuilder.append(" bytes]");
        }
        return stringBuilder;
    }

    public String h() {
        return this.g(new StringBuilder(200)).toString();
    }

    public int hashCode() {
        return j.Objects.hashCode((Object)this.q);
    }

    public int j() {
        return this.d0;
    }

    public int k() {
        return this.c0;
    }

    public Object l() {
        return this.q;
    }

    public boolean m() {
        return this.e0;
    }

    protected int n() {
        return 500;
    }
}

