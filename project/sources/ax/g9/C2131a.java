package ax.g9;

import ax.d9.d;
import ax.d9.e;
import ax.d9.f;

/* renamed from: ax.g9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2131a implements d {
    private e a;
    private byte[] b = new byte[64];
    private byte[] c = new byte[64];

    public C2131a(e eVar) {
        this.a = eVar;
    }

    @Override // ax.d9.d
    public void a(byte[] bArr) throws f {
        if (bArr == null) {
            throw new f("Missing key data");
        }
        int min = Math.min(bArr.length, 64);
        for (int i = 0; i < min; i++) {
            this.b[i] = (byte) (54 ^ bArr[i]);
            this.c[i] = (byte) (92 ^ bArr[i]);
        }
        while (min < 64) {
            this.b[min] = 54;
            this.c[min] = 92;
            min++;
        }
        c();
    }

    @Override // ax.d9.d
    public void b(byte[] bArr, int i, int i2) {
        this.a.b(bArr, i, i2);
    }

    public void c() {
        this.a.a();
        e eVar = this.a;
        byte[] bArr = this.b;
        eVar.b(bArr, 0, bArr.length);
    }

    @Override // ax.d9.d
    public void d(byte b) {
        this.a.d(b);
    }

    @Override // ax.d9.d
    public void f(byte[] bArr) {
        this.a.f(bArr);
    }

    @Override // ax.d9.d
    public byte[] g() {
        try {
            byte[] c = this.a.c();
            this.a.f(this.c);
            this.a.f(c);
            return this.a.c();
        } finally {
            c();
        }
    }
}
