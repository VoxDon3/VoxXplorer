package ax.nb;

import java.io.UnsupportedEncodingException;

/* renamed from: ax.nb.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2647j extends AbstractC2643f {
    private int A;
    private byte[] B;
    private byte[] C;
    C2644g[] D;
    private C2644g z;

    C2647j(C2644g c2644g) {
        this.z = c2644g;
        this.r = new C2639b();
        this.B = new byte[6];
    }

    private int o(byte[] bArr, int i) {
        C2639b c2639b;
        this.D = new C2644g[this.A];
        String str = this.z.a.b;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < this.A; i3++) {
            try {
                int i4 = i2 + 14;
                while (bArr[i4] == 32) {
                    i4--;
                }
                String str2 = C2639b.f;
                try {
                    ax.Rd.c cVar = new ax.Rd.c(null);
                    cVar.d(bArr, i2, (i4 - i2) + 1);
                    cVar.a();
                    String c = cVar.c();
                    if (c != null) {
                        str2 = c;
                    }
                } catch (Exception unused) {
                }
                String str3 = new String(bArr, i2, (i4 - i2) + 1, str2);
                int i5 = bArr[i2 + 15] & 255;
                byte b = bArr[i2 + 16];
                boolean z2 = (b & 128) == 128;
                int i6 = (b & 96) >> 5;
                boolean z3 = (b & 16) == 16;
                boolean z4 = (b & 8) == 8;
                boolean z5 = (b & 4) == 4;
                boolean z6 = (b & 2) == 2;
                if (!z) {
                    C2639b c2639b2 = this.z.a;
                    if (c2639b2.c == i5 && (c2639b2 == (c2639b = C2644g.r) || c2639b2.a.equals(str3))) {
                        C2644g c2644g = this.z;
                        if (c2644g.a == c2639b) {
                            c2644g.a = new C2639b(str3, i5, str);
                        }
                        C2644g c2644g2 = this.z;
                        c2644g2.d = z2;
                        c2644g2.c = i6;
                        c2644g2.e = z3;
                        c2644g2.f = z4;
                        c2644g2.g = z5;
                        c2644g2.h = z6;
                        c2644g2.j = this.B;
                        c2644g2.i = true;
                        this.D[i3] = c2644g2;
                        z = true;
                        i2 += 18;
                    }
                }
                this.D[i3] = new C2644g(new C2639b(str3, i5, str), this.z.b, z2, i6, z3, z4, z5, z6, this.B);
                i2 += 18;
            } catch (UnsupportedEncodingException unused2) {
            }
        }
        return i2 - i;
    }

    @Override // ax.nb.AbstractC2643f
    int a(byte[] bArr, int i) {
        return h(bArr, i);
    }

    @Override // ax.nb.AbstractC2643f
    int g(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = i2 & 255;
        this.A = i3;
        int i4 = i3 * 18;
        int i5 = (this.x - i4) - 1;
        int i6 = i + 1;
        this.A = i2 & 255;
        System.arraycopy(bArr, i4 + i6, this.B, 0, 6);
        int o = i6 + o(bArr, i6);
        byte[] bArr2 = new byte[i5];
        this.C = bArr2;
        System.arraycopy(bArr, o, bArr2, 0, i5);
        return (o + i5) - i;
    }

    @Override // ax.nb.AbstractC2643f
    int j(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.nb.AbstractC2643f
    public String toString() {
        return new String("NodeStatusResponse[" + super.toString() + "]");
    }
}
