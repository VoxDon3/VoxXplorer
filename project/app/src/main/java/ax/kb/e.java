/*
 * Decompiled with CFR 0.152.
 */
package ax.kb;

import ax.kb.d;
import ax.pb.H0;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class e
extends IOException
implements d,
H0 {
    private Throwable c0;
    private int q;

    e(int n8) {
        super(e.a(n8));
        this.q = n8;
    }

    public e(String string) {
        super(string);
    }

    static String a(int n8) {
        int n9 = d.n.length;
        int n10 = 0;
        while (n9 >= n10) {
            int n11 = (n10 + n9) / 2;
            int n12 = d.n[n11];
            if (n8 > n12) {
                n10 = n11 + 1;
                continue;
            }
            if (n8 < n12) {
                n9 = n11 - 1;
                continue;
            }
            return d.o[n11];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0x");
        stringBuilder.append(ax.qb.d.c(n8, 8));
        return stringBuilder.toString();
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

