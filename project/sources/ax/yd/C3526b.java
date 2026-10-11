package ax.yd;

import ax.Dd.j;
import ax.Dd.k;
import ax.vd.C3309f;
import ax.vd.InterfaceC3310g;
import ax.vd.InterfaceC3311h;
import ax.vd.InterfaceC3315l;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.math.BigInteger;

/* renamed from: ax.yd.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3526b implements InterfaceC3310g {
    private static final BigInteger i = BigInteger.valueOf(2147483647L);
    private static final BigInteger j = BigInteger.valueOf(2);
    private final InterfaceC3315l a;
    private final int b;
    private byte[] c;
    private byte[] d;
    private int e;
    private byte[] f;
    private int g;
    private byte[] h;

    public C3526b(InterfaceC3315l interfaceC3315l) {
        this.a = interfaceC3315l;
        int a = interfaceC3315l.a();
        this.b = a;
        this.h = new byte[a];
    }

    private void c() {
        int i2 = (this.g / this.b) + 1;
        byte[] bArr = this.f;
        int length = bArr.length;
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    if (length != 4) {
                        throw new IllegalStateException("Unsupported size of counter i");
                    }
                    bArr[0] = (byte) (i2 >>> 24);
                }
                bArr[bArr.length - 3] = (byte) (i2 >>> 16);
            }
            bArr[bArr.length - 2] = (byte) (i2 >>> 8);
        }
        bArr[bArr.length - 1] = (byte) i2;
        InterfaceC3315l interfaceC3315l = this.a;
        byte[] bArr2 = this.c;
        interfaceC3315l.b(bArr2, 0, bArr2.length);
        InterfaceC3315l interfaceC3315l2 = this.a;
        byte[] bArr3 = this.f;
        interfaceC3315l2.b(bArr3, 0, bArr3.length);
        InterfaceC3315l interfaceC3315l3 = this.a;
        byte[] bArr4 = this.d;
        interfaceC3315l3.b(bArr4, 0, bArr4.length);
        this.a.c(this.h, 0);
    }

    @Override // ax.vd.InterfaceC3310g
    public int a(byte[] bArr, int i2, int i3) throws C3309f, IllegalArgumentException {
        int i4 = this.g;
        int i5 = i4 + i3;
        if (i5 < 0 || i5 >= this.e) {
            throw new C3309f("Current KDFCTR may only be used for " + this.e + " bytes");
        }
        if (i4 % this.b == 0) {
            c();
        }
        int i6 = this.g;
        int i7 = this.b;
        int i8 = i6 % i7;
        int min = Math.min(i7 - (i6 % i7), i3);
        System.arraycopy(this.h, i8, bArr, i2, min);
        this.g += min;
        int i9 = i3 - min;
        while (true) {
            i2 += min;
            if (i9 <= 0) {
                return i3;
            }
            c();
            min = Math.min(this.b, i9);
            System.arraycopy(this.h, 0, bArr, i2, min);
            this.g += min;
            i9 -= min;
        }
    }

    @Override // ax.vd.InterfaceC3310g
    public void b(InterfaceC3311h interfaceC3311h) {
        if (!(interfaceC3311h instanceof j)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        j jVar = (j) interfaceC3311h;
        this.a.e(new k(jVar.c()));
        this.c = jVar.a();
        this.d = jVar.b();
        int d = jVar.d();
        this.f = new byte[d / 8];
        BigInteger multiply = j.pow(d).multiply(BigInteger.valueOf(this.b));
        this.e = multiply.compareTo(i) == 1 ? SubsamplingScaleImageView.TILE_SIZE_AUTO : multiply.intValue();
        this.g = 0;
    }
}
