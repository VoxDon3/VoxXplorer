package ax.Sd;

import ax.Sd.b;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class g extends b {
    private static final ax.Wd.m f = new ax.Wd.f();
    private b.a c;
    private ax.Wd.b b = new ax.Wd.b(f);
    private ax.Ud.f d = new ax.Ud.f();
    private byte[] e = new byte[2];

    public g() {
        j();
    }

    @Override // ax.Sd.b
    public String c() {
        return ax.Rd.b.h;
    }

    @Override // ax.Sd.b
    public float d() {
        return this.d.a();
    }

    @Override // ax.Sd.b
    public b.a e() {
        return this.c;
    }

    @Override // ax.Sd.b
    public b.a f(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        int i4 = i;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            int c = this.b.c(bArr[i4]);
            if (c == 1) {
                this.c = b.a.NOT_ME;
                break;
            }
            if (c == 2) {
                this.c = b.a.FOUND_IT;
                break;
            }
            if (c == 0) {
                int b = this.b.b();
                if (i4 == i) {
                    byte[] bArr2 = this.e;
                    bArr2[1] = bArr[i];
                    this.d.d(bArr2, 0, b);
                } else {
                    this.d.d(bArr, i4 - 1, b);
                }
            }
            i4++;
        }
        this.e[0] = bArr[i3 - 1];
        if (this.c == b.a.DETECTING && this.d.c() && d() > 0.95f) {
            this.c = b.a.FOUND_IT;
        }
        return this.c;
    }

    @Override // ax.Sd.b
    public final void j() {
        this.b.d();
        this.c = b.a.DETECTING;
        this.d.e();
        Arrays.fill(this.e, (byte) 0);
    }
}
