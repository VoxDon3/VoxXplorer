/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Q8.A;
import ax.Y8.c;
import ax.Z8.a;
import ax.h9.c;
import java.util.Arrays;

public class b
implements c {
    private static final byte[] f = new byte[]{-4, 83, 77, 66};
    private int a;
    private int b;
    private A c;
    private int d;
    private int e;

    public static boolean d(byte[] byArray) {
        return Arrays.equals(f, byArray);
    }

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public void b(a<?> a8) throws a.b {
        A a9;
        this.a = a8.S();
        ax.k9.a.b(a8.G(4), f, "Could not find SMB2 Packet header");
        this.b = a8.P();
        this.c = a9 = (A)c.a.f(a8.J(), A.class, null);
        boolean bl = a9 != null && a9 != A.c0;
        ax.k9.a.a(bl, "The CompressionAlgorithm field of the SMB2_COMPRESSION_TRANSFORM_HEADER should contain a valid value.");
        a8.U(2);
        this.d = a8.P();
        this.e = a8.V();
    }

    @Override
    public int c() {
        return this.e;
    }
}

