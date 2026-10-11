/*
 * Decompiled with CFR 0.152.
 */
package ax.f9;

import ax.f9.b;
import java.util.Arrays;

public class a
implements b {
    private byte[] a;
    private byte[] b;
    private int c;

    public a(byte[] byArray, byte[] byArray2, int n8) {
        if (byArray != null && byArray.length != 0) {
            this.a = Arrays.copyOf(byArray, byArray.length);
            this.b = byArray2 == null ? new byte[0] : Arrays.copyOf(byArray2, byArray2.length);
            this.c = n8;
            return;
        }
        throw new IllegalArgumentException("Missing Seed for KDF");
    }

    public int a() {
        return this.c;
    }

    public byte[] b() {
        return this.b;
    }

    public byte[] c() {
        return this.a;
    }
}

