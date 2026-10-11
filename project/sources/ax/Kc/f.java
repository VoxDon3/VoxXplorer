package ax.Kc;

import java.io.DataInput;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class f {
    public static final byte[] a = new byte[0];

    private static void a(int i) {
        if (i > 8) {
            throw new IllegalArgumentException("Can't read more than eight bytes into a long value");
        }
    }

    public static long b(DataInput dataInput, int i) throws IOException {
        a(i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j |= dataInput.readUnsignedByte() << (i2 * 8);
        }
        return j;
    }

    public static long c(byte[] bArr, int i, int i2) {
        a(i2);
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= (bArr[i + i3] & 255) << (i3 * 8);
        }
        return j;
    }

    public static void d(byte[] bArr, long j, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i + i3] = (byte) (255 & j);
            j >>= 8;
        }
    }
}
