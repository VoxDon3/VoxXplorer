package ax.xd;

import ax.Dd.k;
import ax.vd.C3309f;
import ax.vd.C3317n;
import ax.vd.InterfaceC3307d;
import ax.vd.t;

/* renamed from: ax.xd.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3492d implements t {
    private byte[] a = null;
    private int b = 0;
    private int c = 0;
    private byte[] d = null;

    private void b(byte[] bArr) {
        this.d = bArr;
        this.b = 0;
        this.c = 0;
        if (this.a == null) {
            this.a = new byte[256];
        }
        for (int i = 0; i < 256; i++) {
            this.a[i] = (byte) i;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            int i5 = bArr[i2] & 255;
            byte[] bArr2 = this.a;
            byte b = bArr2[i4];
            i3 = (i5 + b + i3) & 255;
            bArr2[i4] = bArr2[i3];
            bArr2[i3] = b;
            i2 = (i2 + 1) % bArr.length;
        }
    }

    @Override // ax.vd.t
    public void a() {
        b(this.d);
    }

    @Override // ax.vd.t
    public void e(boolean z, InterfaceC3307d interfaceC3307d) {
        if (interfaceC3307d instanceof k) {
            byte[] a = ((k) interfaceC3307d).a();
            this.d = a;
            b(a);
        } else {
            throw new IllegalArgumentException("invalid parameter passed to RC4 init - " + interfaceC3307d.getClass().getName());
        }
    }

    @Override // ax.vd.t
    public int g(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            throw new C3309f("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new C3317n("output buffer too short");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (this.b + 1) & 255;
            this.b = i5;
            byte[] bArr3 = this.a;
            byte b = bArr3[i5];
            int i6 = (this.c + b) & 255;
            this.c = i6;
            bArr3[i5] = bArr3[i6];
            bArr3[i6] = b;
            bArr2[i4 + i3] = (byte) (bArr3[(bArr3[i5] + b) & 255] ^ bArr[i4 + i]);
        }
        return i2;
    }
}
