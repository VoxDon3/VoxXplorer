package ax.W4;

import j$.util.Objects;
import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public class d implements Serializable {
    protected static final d f0 = new d(false, null);
    protected final int c0;
    protected final int d0;
    protected final boolean e0;
    protected final transient Object q;

    protected d(boolean z, Object obj) {
        this(z, obj, -1, -1);
    }

    public static d i(boolean z, Object obj) {
        return new d(z, obj);
    }

    public static d o() {
        return f0;
    }

    protected int a(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!Character.isISOControl(charAt) || !b(sb, charAt)) {
                sb.append(charAt);
            }
        }
        sb.append('\"');
        return str.length();
    }

    protected boolean b(StringBuilder sb, int i) {
        if (i == 13 || i == 10) {
            return false;
        }
        sb.append('\\');
        sb.append('u');
        sb.append(c.l((i >> 12) & 15));
        sb.append(c.l((i >> 8) & 15));
        sb.append(c.l((i >> 4) & 15));
        sb.append(c.l(i & 15));
        return true;
    }

    protected String c(CharSequence charSequence, int[] iArr, int i) {
        f(iArr, charSequence.length());
        int i2 = iArr[0];
        return charSequence.subSequence(i2, Math.min(iArr[1], i) + i2).toString();
    }

    protected String d(byte[] bArr, int[] iArr, int i) {
        f(iArr, bArr.length);
        return new String(bArr, iArr[0], Math.min(iArr[1], i), StandardCharsets.UTF_8);
    }

    protected String e(char[] cArr, int[] iArr, int i) {
        f(iArr, cArr.length);
        return new String(cArr, iArr[0], Math.min(iArr[1], i));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.c0 != dVar.c0 || this.d0 != dVar.d0) {
            return false;
        }
        Object obj2 = dVar.q;
        Object obj3 = this.q;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return ((obj3 instanceof File) || (obj3 instanceof URL) || (obj3 instanceof URI)) ? obj3.equals(obj2) : obj3 == obj2;
    }

    protected void f(int[] iArr, int i) {
        int i2 = iArr[0];
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= i) {
            i2 = i;
        }
        iArr[0] = i2;
        int i3 = iArr[1];
        int i4 = i - i2;
        if (i3 < 0 || i3 > i4) {
            iArr[1] = i4;
        }
    }

    public StringBuilder g(StringBuilder sb) {
        String str;
        Object l = l();
        if (l == null) {
            sb.append("UNKNOWN");
            return sb;
        }
        Class<?> cls = l instanceof Class ? (Class) l : l.getClass();
        String name = cls.getName();
        if (name.startsWith("java.")) {
            name = cls.getSimpleName();
        } else if (l instanceof byte[]) {
            name = "byte[]";
        } else if (l instanceof char[]) {
            name = "char[]";
        }
        sb.append('(');
        sb.append(name);
        sb.append(')');
        if (m()) {
            int n = n();
            int[] iArr = {k(), j()};
            String str2 = " chars";
            if (l instanceof CharSequence) {
                str = c((CharSequence) l, iArr, n);
            } else if (l instanceof char[]) {
                str = e((char[]) l, iArr, n);
            } else if (l instanceof byte[]) {
                str = d((byte[]) l, iArr, n);
                str2 = " bytes";
            } else {
                str = null;
            }
            if (str != null) {
                a(sb, str);
                if (iArr[1] > n) {
                    sb.append("[truncated ");
                    sb.append(iArr[1] - n);
                    sb.append(str2);
                    sb.append(']');
                    return sb;
                }
            }
        } else if (l instanceof byte[]) {
            int j = j();
            if (j < 0) {
                j = ((byte[]) l).length;
            }
            sb.append('[');
            sb.append(j);
            sb.append(" bytes]");
        }
        return sb;
    }

    public String h() {
        return g(new StringBuilder(200)).toString();
    }

    public int hashCode() {
        return Objects.hashCode(this.q);
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

    protected d(boolean z, Object obj, int i, int i2) {
        this.e0 = z;
        this.q = obj;
        this.c0 = i;
        this.d0 = i2;
    }
}
