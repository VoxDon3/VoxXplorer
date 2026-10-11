/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Z8.a;
import ax.h9.b;
import ax.h9.c;
import java.util.Arrays;

public class x
implements c {
    public static final byte[] h = new byte[]{-3, 83, 77, 66};
    private int a;
    private byte[] b;
    private byte[] c;
    private int d;
    private int e;
    private long f;
    private int g;

    public x() {
    }

    public x(byte[] byArray, int n8, long l8) {
        this.b = new byte[16];
        this.c = byArray;
        this.d = n8;
        this.f = l8;
    }

    public static boolean i(byte[] byArray) {
        return Arrays.equals(h, byArray);
    }

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public void b(a<?> a8) throws a.b {
        this.a = a8.S();
        ax.k9.a.b(a8.G(4), h, "Could not find SMB2 Packet header");
        this.b = a8.G(16);
        this.c = a8.G(16);
        this.d = a8.P();
        a8.U(2);
        this.e = a8.J();
        this.f = a8.A();
        this.g = a8.V();
    }

    @Override
    public int c() {
        return this.g;
    }

    public int d() {
        return this.e;
    }

    public byte[] e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public long g() {
        return this.f;
    }

    public byte[] h() {
        return this.b;
    }

    public void j(byte[] byArray) {
        this.b = byArray;
    }

    public void k(b b8) {
        this.a = b8.S();
        b8.o(h);
        b8.o(this.b);
        b8.o(this.c);
        b8.W(16 - this.c.length);
        b8.u(this.d);
        b8.X();
        b8.s(1);
        b8.k(this.f);
    }
}

