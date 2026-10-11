/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.H0;
import ax.pb.f;
import ax.pb.o;
import ax.qb.d;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class a0
extends IOException
implements o,
f,
H0 {
    private Throwable c0;
    private int q;

    a0() {
    }

    a0(int n8, Throwable throwable) {
        super(a0.a(n8));
        this.q = a0.e(n8);
        this.c0 = throwable;
    }

    public a0(int n8, boolean bl) {
        String string = bl ? a0.b(n8) : a0.a(n8);
        super(string);
        if (!bl) {
            n8 = a0.e(n8);
        }
        this.q = n8;
    }

    a0(String string) {
        super(string);
        this.q = -1073741823;
    }

    a0(String string, Throwable throwable) {
        super(string);
        this.c0 = throwable;
        this.q = -1073741823;
    }

    static String a(int n8) {
        if (n8 == 0) {
            return "NT_STATUS_SUCCESS";
        }
        int n9 = 1;
        if ((n8 & 0xC0000000) == -1073741824) {
            int n10 = o.s.length - 1;
            while (n10 >= n9) {
                int n11 = (n9 + n10) / 2;
                int n12 = o.s[n11];
                if (n8 > n12) {
                    n9 = n11 + 1;
                    continue;
                }
                if (n8 < n12) {
                    n10 = n11 - 1;
                    continue;
                }
                return o.t[n11];
            }
        } else {
            int n13 = f.p.length - 1;
            n9 = 0;
            while (n13 >= n9) {
                int n14 = (n9 + n13) / 2;
                int n15 = f.p[n14][0];
                if (n8 > n15) {
                    n9 = n14 + 1;
                    continue;
                }
                if (n8 < n15) {
                    n13 = n14 - 1;
                    continue;
                }
                return f.r[n14];
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0x");
        stringBuilder.append(d.c(n8, 8));
        return stringBuilder.toString();
    }

    static String b(int n8) {
        int n9 = H0.Y.length - 1;
        int n10 = 0;
        while (n9 >= n10) {
            int n11 = (n10 + n9) / 2;
            int n12 = H0.Y[n11];
            if (n8 > n12) {
                n10 = n11 + 1;
                continue;
            }
            if (n8 < n12) {
                n9 = n11 - 1;
                continue;
            }
            return H0.Z[n11];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n8);
        stringBuilder.append("");
        return stringBuilder.toString();
    }

    static int e(int n8) {
        if ((0xC0000000 & n8) != 0) {
            return n8;
        }
        int n9 = f.p.length - 1;
        int n10 = 0;
        while (n9 >= n10) {
            int n11 = (n10 + n9) / 2;
            int[] nArray = f.p[n11];
            int n12 = nArray[0];
            if (n8 > n12) {
                n10 = n11 + 1;
                continue;
            }
            if (n8 < n12) {
                n9 = n11 - 1;
                continue;
            }
            return nArray[1];
        }
        return -1073741823;
    }

    public int c() {
        return this.q;
    }

    public Throwable d() {
        return this.c0;
    }

    @Override
    public String toString() {
        if (this.c0 != null) {
            StringWriter stringWriter = new StringWriter();
            Appendable appendable = new PrintWriter(stringWriter);
            this.c0.printStackTrace((PrintWriter)appendable);
            appendable = new StringBuilder();
            ((StringBuilder)appendable).append(super.toString());
            ((StringBuilder)appendable).append("\n");
            ((StringBuilder)appendable).append(stringWriter);
            return ((StringBuilder)appendable).toString();
        }
        return super.toString();
    }
}

