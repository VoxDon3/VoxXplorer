/*
 * Decompiled with CFR 0.152.
 */
package ax.Kc;

import java.io.DataInput;
import java.io.IOException;

public final class f {
    public static final byte[] a = new byte[0];

    private static void a(int n8) {
        if (n8 <= 8) {
            return;
        }
        throw new IllegalArgumentException("Can't read more than eight bytes into a long value");
    }

    public static long b(DataInput dataInput, int n8) throws IOException {
        f.a(n8);
        long l8 = 0L;
        for (int i8 = 0; i8 < n8; ++i8) {
            l8 |= (long)dataInput.readUnsignedByte() << i8 * 8;
        }
        return l8;
    }

    public static long c(byte[] byArray, int n8, int n9) {
        f.a(n9);
        long l8 = 0L;
        for (int i8 = 0; i8 < n9; ++i8) {
            l8 |= ((long)byArray[n8 + i8] & 0xFFL) << i8 * 8;
        }
        return l8;
    }

    public static void d(byte[] byArray, long l8, int n8, int n9) {
        for (int i8 = 0; i8 < n9; ++i8) {
            byArray[n8 + i8] = (byte)(0xFFL & l8);
            l8 >>= 8;
        }
    }
}

