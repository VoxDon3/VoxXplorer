package ax.Ad;

import ax.Dd.l;
import ax.vd.C3309f;
import ax.vd.InterfaceC3304a;
import ax.vd.InterfaceC3307d;

/* loaded from: classes3.dex */
public class c implements InterfaceC3304a {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private int d;
    private InterfaceC3304a e;
    private boolean f;

    public c(InterfaceC3304a interfaceC3304a) {
        this.e = interfaceC3304a;
        int d = interfaceC3304a.d();
        this.d = d;
        this.a = new byte[d];
        this.b = new byte[d];
        this.c = new byte[d];
    }

    private int b(byte[] bArr, int i, byte[] bArr2, int i2) throws C3309f, IllegalStateException {
        int i3 = this.d;
        if (i + i3 > bArr.length) {
            throw new C3309f("input buffer too short");
        }
        System.arraycopy(bArr, i, this.c, 0, i3);
        int h = this.e.h(bArr, i, bArr2, i2);
        for (int i4 = 0; i4 < this.d; i4++) {
            int i5 = i2 + i4;
            bArr2[i5] = (byte) (bArr2[i5] ^ this.b[i4]);
        }
        byte[] bArr3 = this.b;
        this.b = this.c;
        this.c = bArr3;
        return h;
    }

    private int c(byte[] bArr, int i, byte[] bArr2, int i2) throws C3309f, IllegalStateException {
        if (this.d + i > bArr.length) {
            throw new C3309f("input buffer too short");
        }
        for (int i3 = 0; i3 < this.d; i3++) {
            byte[] bArr3 = this.b;
            bArr3[i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
        }
        int h = this.e.h(this.b, 0, bArr2, i2);
        byte[] bArr4 = this.b;
        System.arraycopy(bArr2, i2, bArr4, 0, bArr4.length);
        return h;
    }

    @Override // ax.vd.InterfaceC3304a
    public void a() {
        byte[] bArr = this.a;
        System.arraycopy(bArr, 0, this.b, 0, bArr.length);
        ax.Nd.a.g(this.c, (byte) 0);
        this.e.a();
    }

    @Override // ax.vd.InterfaceC3304a
    public int d() {
        return this.e.d();
    }

    @Override // ax.vd.InterfaceC3304a
    public void e(boolean z, InterfaceC3307d interfaceC3307d) throws IllegalArgumentException {
        InterfaceC3304a interfaceC3304a;
        boolean z2 = this.f;
        this.f = z;
        if (interfaceC3307d instanceof l) {
            l lVar = (l) interfaceC3307d;
            byte[] a = lVar.a();
            if (a.length != this.d) {
                throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            }
            System.arraycopy(a, 0, this.a, 0, a.length);
            a();
            if (lVar.b() == null) {
                if (z2 != z) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            } else {
                interfaceC3304a = this.e;
                interfaceC3307d = lVar.b();
            }
        } else {
            a();
            if (interfaceC3307d == null) {
                if (z2 != z) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
            interfaceC3304a = this.e;
        }
        interfaceC3304a.e(z, interfaceC3307d);
    }

    @Override // ax.vd.InterfaceC3304a
    public String f() {
        return this.e.f() + "/CBC";
    }

    @Override // ax.vd.InterfaceC3304a
    public int h(byte[] bArr, int i, byte[] bArr2, int i2) throws C3309f, IllegalStateException {
        return this.f ? c(bArr, i, bArr2, i2) : b(bArr, i, bArr2, i2);
    }
}
