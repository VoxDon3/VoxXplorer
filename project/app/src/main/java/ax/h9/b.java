/*
 * Decompiled with CFR 0.152.
 */
package ax.h9;

import ax.Z8.a;
import java.util.Arrays;

public class b
extends a<b> {
    private static final byte[] f = new byte[]{0, 0};
    private static final byte[] g = new byte[]{0, 0, 0, 0};

    public b() {
        super(ax.Z8.b.b);
    }

    public b(byte[] byArray) {
        super(byArray, ax.Z8.b.b);
    }

    public a<b> W(int n8) {
        byte[] byArray = new byte[n8];
        Arrays.fill(byArray, (byte)0);
        this.o(byArray);
        return this;
    }

    public a<b> X() {
        this.o(f);
        return this;
    }

    public a<b> Y() {
        this.o(g);
        return this;
    }

    public a<b> Z(String string) {
        return this.q(string, ax.Y8.b.d);
    }

    public a<b> a0(String string) {
        if (string == null) {
            return this.s(0);
        }
        return this.s(string.length() * 2);
    }
}

