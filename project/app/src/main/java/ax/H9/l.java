/*
 * Decompiled with CFR 0.152.
 */
package ax.H9;

import ax.H9.c;
import ax.H9.g;
import ax.H9.k;

public class l
extends g {
    public l() {
        this("Output");
    }

    public l(int n8, String string) {
        this(n8, string, 0.0);
    }

    public l(int n8, String string, double d8) {
        super(n8, string, d8);
    }

    public l(String string) {
        this(1, string, 0.0);
    }

    public void q(int n8, k k8, int n9) {
        this.c[n8].f(k8.c[n9]);
    }

    public void r(k k8) {
        this.q(0, k8, 0);
    }

    public void s() {
        c[] cArray = this.c;
        int n8 = cArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            cArray[i8].j();
        }
    }
}

