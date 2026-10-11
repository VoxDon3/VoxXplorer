package ax.Ad;

import ax.Dd.l;
import ax.vd.C3309f;
import ax.vd.C3317n;
import ax.vd.InterfaceC3304a;
import ax.vd.InterfaceC3307d;
import ax.vd.s;
import ax.vd.t;

/* loaded from: classes3.dex */
public class f extends s implements t {
    private final InterfaceC3304a b;
    private final int c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private int g;

    public f(InterfaceC3304a interfaceC3304a) {
        super(interfaceC3304a);
        this.b = interfaceC3304a;
        int d = interfaceC3304a.d();
        this.c = d;
        this.d = new byte[d];
        this.e = new byte[d];
        this.f = new byte[d];
        this.g = 0;
    }

    private void b() {
        byte b;
        int length = this.e.length;
        do {
            length--;
            if (length < 0) {
                break;
            }
            byte[] bArr = this.e;
            b = (byte) (bArr[length] + 1);
            bArr[length] = b;
        } while (b == 0);
        byte[] bArr2 = this.d;
        if (length < bArr2.length && bArr2.length < this.c) {
            throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
        }
    }

    @Override // ax.vd.InterfaceC3304a
    public void a() {
        ax.Nd.a.g(this.e, (byte) 0);
        byte[] bArr = this.d;
        System.arraycopy(bArr, 0, this.e, 0, bArr.length);
        this.b.a();
        this.g = 0;
    }

    @Override // ax.vd.InterfaceC3304a
    public int d() {
        return this.b.d();
    }

    @Override // ax.vd.InterfaceC3304a
    public void e(boolean z, InterfaceC3307d interfaceC3307d) throws IllegalArgumentException {
        if (!(interfaceC3307d instanceof l)) {
            throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        l lVar = (l) interfaceC3307d;
        byte[] d = ax.Nd.a.d(lVar.a());
        this.d = d;
        int i = this.c;
        if (i < d.length) {
            throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.c + " bytes.");
        }
        int i2 = 8 > i / 2 ? i / 2 : 8;
        if (i - d.length <= i2) {
            if (lVar.b() != null) {
                this.b.e(true, lVar.b());
            }
            a();
        } else {
            throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.c - i2) + " bytes.");
        }
    }

    @Override // ax.vd.InterfaceC3304a
    public String f() {
        return this.b.f() + "/SIC";
    }

    @Override // ax.vd.t
    public int g(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws C3309f {
        byte b;
        if (i + i2 > bArr.length) {
            throw new C3309f("input buffer too small");
        }
        if (i3 + i2 > bArr2.length) {
            throw new C3317n("output buffer too short");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = this.g;
            if (i5 == 0) {
                this.b.h(this.e, 0, this.f, 0);
                byte b2 = bArr[i + i4];
                byte[] bArr3 = this.f;
                int i6 = this.g;
                this.g = i6 + 1;
                b = (byte) (b2 ^ bArr3[i6]);
            } else {
                byte b3 = bArr[i + i4];
                byte[] bArr4 = this.f;
                int i7 = i5 + 1;
                this.g = i7;
                b = (byte) (bArr4[i5] ^ b3);
                if (i7 == this.e.length) {
                    this.g = 0;
                    b();
                }
            }
            bArr2[i3 + i4] = b;
        }
        return i2;
    }

    @Override // ax.vd.InterfaceC3304a
    public int h(byte[] bArr, int i, byte[] bArr2, int i2) throws C3309f, IllegalStateException {
        f fVar;
        if (this.g != 0) {
            fVar = this;
            fVar.g(bArr, i, this.c, bArr2, i2);
        } else {
            fVar = this;
            int i3 = fVar.c;
            if (i + i3 > bArr.length) {
                throw new C3309f("input buffer too small");
            }
            if (i2 + i3 > bArr2.length) {
                throw new C3317n("output buffer too short");
            }
            fVar.b.h(fVar.e, 0, fVar.f, 0);
            for (int i4 = 0; i4 < fVar.c; i4++) {
                bArr2[i2 + i4] = (byte) (bArr[i + i4] ^ fVar.f[i4]);
            }
            b();
        }
        return fVar.c;
    }
}
