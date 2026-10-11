package ax.wd;

import ax.vd.InterfaceC3313j;

/* renamed from: ax.wd.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3385b implements InterfaceC3313j, ax.Nd.f {
    private final byte[] a;
    private int b;
    private long c;

    protected AbstractC3385b() {
        this.a = new byte[4];
        this.b = 0;
    }

    @Override // ax.vd.InterfaceC3312i
    public void a() {
        this.c = 0L;
        this.b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    @Override // ax.vd.InterfaceC3312i
    public void b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        if (this.b != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= max) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.a;
                int i5 = this.b;
                int i6 = i5 + 1;
                this.b = i6;
                int i7 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (i6 == 4) {
                    o(bArr2, 0);
                    this.b = 0;
                    i3 = i7;
                    break;
                }
                i4 = i7;
            }
        }
        int i8 = ((max - i3) & (-4)) + i3;
        while (i3 < i8) {
            o(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.a;
            int i9 = this.b;
            this.b = i9 + 1;
            bArr3[i9] = bArr[i3 + i];
            i3++;
        }
        this.c += max;
    }

    @Override // ax.vd.InterfaceC3312i
    public void d(byte b) {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            o(bArr, 0);
            this.b = 0;
        }
        this.c++;
    }

    @Override // ax.vd.InterfaceC3313j
    public int h() {
        return 64;
    }

    protected void k(AbstractC3385b abstractC3385b) {
        byte[] bArr = abstractC3385b.a;
        System.arraycopy(bArr, 0, this.a, 0, bArr.length);
        this.b = abstractC3385b.b;
        this.c = abstractC3385b.c;
    }

    public void l() {
        long j = this.c << 3;
        byte b = Byte.MIN_VALUE;
        while (true) {
            d(b);
            if (this.b == 0) {
                n(j);
                m();
                return;
            }
            b = 0;
        }
    }

    protected abstract void m();

    protected abstract void n(long j);

    protected abstract void o(byte[] bArr, int i);

    protected AbstractC3385b(AbstractC3385b abstractC3385b) {
        this.a = new byte[4];
        k(abstractC3385b);
    }
}
