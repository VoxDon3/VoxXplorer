/*
 * Decompiled with CFR 0.152.
 */
package ax.Id;

import ax.Id.d;
import ax.Jd.b;
import java.security.SecureRandom;

public abstract class c {
    public static boolean a(byte[] byArray, int n8, byte[] byArray2, int n9, byte[] byArray3, int n10) {
        c.g(byArray, n8, byArray2, n9, byArray3, n10);
        return ax.Nd.a.a(byArray3, n10, 56) ^ true;
    }

    private static int b(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        return byArray[n8 + 3] << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
    }

    private static void c(byte[] byArray, int n8, int[] nArray) {
        for (int i8 = 0; i8 < 14; ++i8) {
            nArray[i8] = c.b(byArray, i8 * 4 + n8);
        }
        nArray[0] = nArray[0] & 0xFFFFFFFC;
        nArray[13] = nArray[13] | Integer.MIN_VALUE;
    }

    public static void d(SecureRandom secureRandom, byte[] byArray) {
        secureRandom.nextBytes(byArray);
        byArray[0] = (byte)(byArray[0] & 0xFC);
        byArray[55] = (byte)(byArray[55] | 0x80);
    }

    public static void e(byte[] byArray, int n8, byte[] byArray2, int n9) {
        c.h(byArray, n8, byArray2, n9);
    }

    private static void f(int[] nArray, int[] nArray2) {
        int[] nArray3 = d.g();
        int[] nArray4 = d.g();
        d.a(nArray, nArray2, nArray3);
        d.J(nArray, nArray2, nArray4);
        d.H(nArray3, nArray3);
        d.H(nArray4, nArray4);
        d.A(nArray3, nArray4, nArray);
        d.J(nArray3, nArray4, nArray3);
        d.z(nArray3, 39082, nArray2);
        d.a(nArray2, nArray4, nArray2);
        d.A(nArray2, nArray3, nArray2);
    }

    public static void g(byte[] objectArray, int n8, byte[] objectArray2, int n9, byte[] byArray, int n10) {
        int[] nArray = new int[14];
        c.c(objectArray, n8, nArray);
        objectArray = d.g();
        d.j(objectArray2, n9, objectArray);
        int[] nArray2 = d.g();
        int n11 = 0;
        d.f(objectArray, 0, nArray2, 0);
        int[] nArray3 = d.g();
        nArray3[0] = 1;
        int[] nArray4 = d.g();
        nArray4[0] = 1;
        int[] nArray5 = d.g();
        int[] nArray6 = d.g();
        objectArray2 = d.g();
        n9 = 447;
        n8 = 1;
        while (true) {
            d.a(nArray4, nArray5, nArray6);
            d.J(nArray4, nArray5, nArray4);
            d.a(nArray2, nArray3, nArray5);
            d.J(nArray2, nArray3, nArray2);
            d.A(nArray6, nArray2, nArray6);
            d.A(nArray4, nArray5, nArray4);
            d.H(nArray5, nArray5);
            d.H(nArray2, nArray2);
            d.J(nArray5, nArray2, objectArray2);
            d.z(objectArray2, 39082, nArray3);
            d.a(nArray3, nArray2, nArray3);
            d.A(nArray3, objectArray2, nArray3);
            d.A(nArray2, nArray5, nArray2);
            d.J(nArray6, nArray4, nArray5);
            d.a(nArray6, nArray4, nArray4);
            d.H(nArray4, nArray4);
            d.H(nArray5, nArray5);
            d.A(nArray5, objectArray, nArray5);
            int n12 = nArray[--n9 >>> 5] >>> (n9 & 0x1F) & 1;
            d.i(n8 ^= n12, nArray2, nArray4);
            d.i(n8, nArray3, nArray5);
            if (n9 < 2) {
                for (n8 = n11; n8 < 2; ++n8) {
                    c.f(nArray2, nArray3);
                }
                d.v(nArray3, nArray3);
                d.A(nArray2, nArray3, nArray2);
                d.C(nArray2);
                d.p(nArray2, byArray, n10);
                return;
            }
            n8 = n12;
        }
    }

    public static void h(byte[] byArray, int n8, byte[] byArray2, int n9) {
        int[] nArray = d.g();
        int[] nArray2 = d.g();
        b.M(a.a, byArray, n8, nArray, nArray2);
        d.v(nArray, nArray);
        d.A(nArray, nArray2, nArray);
        d.H(nArray, nArray);
        d.C(nArray);
        d.p(nArray, byArray2, n9);
    }

    public static class a {
        private static final a a = new a();

        private a() {
        }
    }
}

