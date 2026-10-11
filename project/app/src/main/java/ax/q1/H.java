/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.E1.h;
import ax.P0.C;
import ax.S0.G;
import ax.q1.s;
import java.io.EOFException;
import java.io.IOException;

public final class H {
    private final G a = new G(10);

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public C a(s s8, h.a a8) throws IOException {
        Object var6_5;
        Object var6_4 = null;
        int n8 = 0;
        while (true) {
            int n9;
            block4: {
                int n10;
                block3: {
                    try {
                        s8.p(this.a.f(), 0, 10);
                        this.a.b0(0);
                        if (this.a.P() != 0x494433) break;
                        this.a.c0(3);
                        n10 = this.a.L();
                        n9 = n10 + 10;
                        if (var6_5 != null) break block3;
                    }
                    catch (EOFException eOFException) {
                        break;
                    }
                    byte[] byArray = new byte[n9];
                    System.arraycopy(this.a.f(), 0, byArray, 0, 10);
                    s8.p(byArray, 10, n10);
                    C c8 = new h(a8).e(byArray, n9);
                    break block4;
                }
                s8.j(n10);
            }
            n8 += n9;
        }
        s8.m();
        s8.j(n8);
        return var6_5;
    }
}

