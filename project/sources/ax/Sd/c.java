package ax.Sd;

import ax.Sd.b;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class c extends b {
    private static final ax.Wd.m g = new ax.Wd.c();
    private b.a c;
    private ax.Wd.b b = new ax.Wd.b(g);
    private ax.Td.a d = new ax.Td.a();
    private ax.Ud.c e = new ax.Ud.c();
    private byte[] f = new byte[2];

    public c() {
        j();
    }

    @Override // ax.Sd.b
    public String c() {
        return ax.Rd.b.i;
    }

    @Override // ax.Sd.b
    public float d() {
        return Math.max(this.d.a(), this.e.a());
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
                    byte[] bArr2 = this.f;
                    bArr2[1] = bArr[i];
                    this.d.d(bArr2, 0, b);
                    this.e.d(this.f, 0, b);
                } else {
                    int i5 = i4 - 1;
                    this.d.d(bArr, i5, b);
                    this.e.d(bArr, i5, b);
                }
            }
            i4++;
        }
        this.f[0] = bArr[i3 - 1];
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
        this.e.e();
        Arrays.fill(this.f, (byte) 0);
    }
}
