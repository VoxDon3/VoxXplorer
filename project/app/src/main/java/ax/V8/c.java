/*
 * Decompiled with CFR 0.152.
 */
package ax.V8;

import ax.V8.a;
import ax.V8.b;
import ax.W8.g;
import ax.Z8.a;
import java.util.Random;

public class c {
    private Random a;
    private ax.d9.g b;

    public c(Random random, ax.d9.g g8) {
        this.a = random;
        this.b = g8;
    }

    public byte[] a(String string, String string2, String string3) {
        return this.b(string, string2, string3);
    }

    public byte[] b(String object, String object2, String object3) {
        object = ax.V8.b.b(this.b, ax.V8.b.h((String)object));
        object2 = ax.V8.b.h(((String)object2).toUpperCase());
        object3 = ax.V8.b.h((String)object3);
        return ax.V8.b.a(this.b, (byte[])object, (byte[])object2, (byte[])object3);
    }

    public a c(String object, String object2, char[] cArray, ax.W8.b b8, long l8, g g8) {
        byte[] byArray = new byte[8];
        this.a.nextBytes(byArray);
        byte[] byArray2 = this.b(String.valueOf(cArray), (String)object, (String)object2);
        object = this.d(this.a(String.valueOf(cArray), (String)object, (String)object2), b8.c(), byArray);
        object2 = this.e(byArray2, b8.c(), byArray, l8, g8);
        return new a((byte[])object2, (byte[])object, this.f(byArray2, ax.Nd.a.f((byte[])object2, 0, 16)));
    }

    public byte[] d(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        a.c c8 = new a.c(ax.Z8.b.b);
        c8.o(ax.V8.b.a(this.b, byArray, byArray2, byArray3));
        c8.o(byArray3);
        return c8.f();
    }

    public byte[] e(byte[] byArray, byte[] byArray2, byte[] byArray3, long l8, g g8) {
        byArray3 = this.i(byArray3, l8, g8);
        byArray = this.h(byArray, byArray2, byArray3);
        byArray2 = new byte[byArray.length + byArray3.length];
        System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
        System.arraycopy(byArray3, 0, byArray2, byArray.length, byArray3.length);
        return byArray2;
    }

    public byte[] f(byte[] byArray, byte[] byArray2) {
        return ax.V8.b.a(this.b, byArray, new byte[][]{byArray2});
    }

    public byte[] g(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        return byArray;
    }

    byte[] h(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        return ax.V8.b.a(this.b, byArray, byArray2, byArray3);
    }

    byte[] i(byte[] byArray, long l8, g g8) {
        a.c c8 = new a.c(ax.Z8.b.b);
        c8.j((byte)1);
        c8.j((byte)1);
        c8.s(0);
        c8.u(0L);
        c8.k(l8);
        c8.o(byArray);
        c8.u(0L);
        if (g8 != null) {
            g8.f(c8);
        }
        c8.u(0L);
        return c8.f();
    }
}

