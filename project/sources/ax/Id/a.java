package ax.Id;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.security.SecureRandom;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: ax.Id.a$a, reason: collision with other inner class name */
    public static class C0093a {
        private static final C0093a a = new C0093a();

        private C0093a() {
        }
    }

    public static boolean a(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        g(bArr, i, bArr2, i2, bArr3, i3);
        return !ax.Nd.a.a(bArr3, i3, 32);
    }

    private static int b(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static void c(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = b(bArr, (i2 * 4) + i);
        }
        iArr[0] = iArr[0] & (-8);
        int i3 = iArr[7] & SubsamplingScaleImageView.TILE_SIZE_AUTO;
        iArr[7] = i3;
        iArr[7] = i3 | 1073741824;
    }

    public static void d(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 248);
        byte b = (byte) (bArr[31] & Byte.MAX_VALUE);
        bArr[31] = b;
        bArr[31] = (byte) (b | 64);
    }

    public static void e(byte[] bArr, int i, byte[] bArr2, int i2) {
        h(bArr, i, bArr2, i2);
    }

    private static void f(int[] iArr, int[] iArr2) {
        int[] h = b.h();
        int[] h2 = b.h();
        b.c(iArr, iArr2, h, h2);
        b.G(h, h);
        b.G(h2, h2);
        b.z(h, h2, iArr);
        b.I(h, h2, h);
        b.y(h, 121666, iArr2);
        b.a(iArr2, h2, iArr2);
        b.z(iArr2, h, iArr2);
    }

    public static void g(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int[] iArr = new int[8];
        c(bArr, i, iArr);
        int[] h = b.h();
        b.k(bArr2, i2, h);
        int[] h2 = b.h();
        b.g(h, 0, h2, 0);
        int[] h3 = b.h();
        h3[0] = 1;
        int[] h4 = b.h();
        h4[0] = 1;
        int[] h5 = b.h();
        int[] h6 = b.h();
        int[] h7 = b.h();
        int i4 = 254;
        int i5 = 1;
        while (true) {
            b.c(h4, h5, h6, h4);
            b.c(h2, h3, h5, h2);
            b.z(h6, h2, h6);
            b.z(h4, h5, h4);
            b.G(h5, h5);
            b.G(h2, h2);
            b.I(h5, h2, h7);
            b.y(h7, 121666, h3);
            b.a(h3, h2, h3);
            b.z(h3, h7, h3);
            b.z(h2, h5, h2);
            b.c(h6, h4, h4, h5);
            b.G(h4, h4);
            b.G(h5, h5);
            b.z(h5, h, h5);
            i4--;
            int i6 = (iArr[i4 >>> 5] >>> (i4 & 31)) & 1;
            int i7 = i5 ^ i6;
            b.j(i7, h2, h4);
            b.j(i7, h3, h5);
            if (i4 < 3) {
                break;
            } else {
                i5 = i6;
            }
        }
        for (int i8 = 0; i8 < 3; i8++) {
            f(h2, h3);
        }
        b.u(h3, h3);
        b.z(h2, h3, h2);
        b.B(h2);
        b.p(h2, bArr3, i3);
    }

    public static void h(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] h = b.h();
        int[] h2 = b.h();
        ax.Jd.a.Q(C0093a.a, bArr, i, h, h2);
        b.c(h2, h, h, h2);
        b.u(h2, h2);
        b.z(h, h2, h);
        b.B(h);
        b.p(h, bArr2, i2);
    }
}
