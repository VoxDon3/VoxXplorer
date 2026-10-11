/*
 * Decompiled with CFR 0.152.
 */
package ax.Id;

import ax.Id.b;
import java.security.SecureRandom;

public abstract class a {
    public static boolean a(byte[] byArray, int n8, byte[] byArray2, int n9, byte[] byArray3, int n10) {
        a.g(byArray, n8, byArray2, n9, byArray3, n10);
        return ax.Nd.a.a(byArray3, n10, 32) ^ true;
    }

    private static int b(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        return byArray[n8 + 3] << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
    }

    private static void c(byte[] byArray, int n8, int[] nArray) {
        for (int i8 = 0; i8 < 8; ++i8) {
            nArray[i8] = a.b(byArray, i8 * 4 + n8);
        }
        nArray[0] = nArray[0] & 0xFFFFFFF8;
        nArray[7] = n8 = nArray[7] & Integer.MAX_VALUE;
        nArray[7] = n8 | 0x40000000;
    }

    public static void d(SecureRandom secureRandom, byte[] byArray) {
        byte by;
        secureRandom.nextBytes(byArray);
        byArray[0] = (byte)(byArray[0] & 0xF8);
        byArray[31] = by = (byte)(byArray[31] & 0x7F);
        byArray[31] = (byte)(by | 0x40);
    }

    public static void e(byte[] byArray, int n8, byte[] byArray2, int n9) {
        a.h(byArray, n8, byArray2, n9);
    }

    private static void f(int[] nArray, int[] nArray2) {
        int[] nArray3 = b.h();
        int[] nArray4 = b.h();
        b.c(nArray, nArray2, nArray3, nArray4);
        b.G(nArray3, nArray3);
        b.G(nArray4, nArray4);
        b.z(nArray3, nArray4, nArray);
        b.I(nArray3, nArray4, nArray3);
        b.y(nArray3, 121666, nArray2);
        b.a(nArray2, nArray4, nArray2);
        b.z(nArray2, nArray3, nArray2);
    }

    public static void g(byte[] objectArray, int n8, byte[] objectArray2, int n9, byte[] byArray, int n10) {
        int[] nArray = new int[8];
        a.c(objectArray, n8, nArray);
        objectArray = b.h();
        b.k(objectArray2, n9, objectArray);
        int[] nArray2 = b.h();
        int n11 = 0;
        b.g(objectArray, 0, nArray2, 0);
        int[] nArray3 = b.h();
        nArray3[0] = 1;
        int[] nArray4 = b.h();
        nArray4[0] = 1;
        int[] nArray5 = b.h();
        objectArray2 = b.h();
        int[] nArray6 = b.h();
        n9 = 254;
        n8 = 1;
        while (true) {
            b.c(nArray4, nArray5, objectArray2, nArray4);
            b.c(nArray2, nArray3, nArray5, nArray2);
            b.z(objectArray2, nArray2, objectArray2);
            b.z(nArray4, nArray5, nArray4);
            b.G(nArray5, nArray5);
            b.G(nArray2, nArray2);
            b.I(nArray5, nArray2, nArray6);
            b.y(nArray6, 121666, nArray3);
            b.a(nArray3, nArray2, nArray3);
            b.z(nArray3, nArray6, nArray3);
            b.z(nArray2, nArray5, nArray2);
            b.c(objectArray2, nArray4, nArray4, nArray5);
            b.G(nArray4, nArray4);
            b.G(nArray5, nArray5);
            b.z(nArray5, objectArray, nArray5);
            int n12 = nArray[--n9 >>> 5] >>> (n9 & 0x1F) & 1;
            b.j(n8 ^= n12, nArray2, nArray4);
            b.j(n8, nArray3, nArray5);
            if (n9 < 3) {
                for (n8 = n11; n8 < 3; ++n8) {
                    a.f(nArray2, nArray3);
                }
                b.u(nArray3, nArray3);
                b.z(nArray2, nArray3, nArray2);
                b.B(nArray2);
                b.p(nArray2, byArray, n10);
                return;
            }
            n8 = n12;
        }
    }

    public static void h(byte[] byArray, int n8, byte[] byArray2, int n9) {
        int[] nArray = b.h();
        int[] nArray2 = b.h();
        ax.Jd.a.Q(a.a, byArray, n8, nArray, nArray2);
        b.c(nArray2, nArray, nArray, nArray2);
        b.u(nArray2, nArray2);
        b.z(nArray, nArray2, nArray);
        b.B(nArray);
        b.p(nArray, byArray2, n9);
    }

    public static class a {
        private static final a a = new a();

        private a() {
        }
    }
}

