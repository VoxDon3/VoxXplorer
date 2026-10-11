package ax.q1;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: ax.q1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2860u {
    public static void a(boolean z, String str) throws ax.P0.E {
        if (!z) {
            throw ax.P0.E.a(str, null);
        }
    }

    public static int b(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static boolean c(InterfaceC2858s interfaceC2858s, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return interfaceC2858s.h(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static int d(InterfaceC2858s interfaceC2858s, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int k = interfaceC2858s.k(bArr, i + i3, i2 - i3);
            if (k == -1) {
                break;
            }
            i3 += k;
        }
        return i3;
    }

    public static boolean e(InterfaceC2858s interfaceC2858s, byte[] bArr, int i, int i2) throws IOException {
        try {
            interfaceC2858s.readFully(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean f(InterfaceC2858s interfaceC2858s, int i) throws IOException {
        try {
            interfaceC2858s.n(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
