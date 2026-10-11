package ax.Sd;

import ax.Sd.b;

/* loaded from: classes3.dex */
public class o extends b {
    private static final ax.Wd.m e = new ax.Wd.n();
    private b.a c;
    private int d = 0;
    private ax.Wd.b b = new ax.Wd.b(e);

    public o() {
        j();
    }

    @Override // ax.Sd.b
    public String c() {
        return ax.Rd.b.u;
    }

    @Override // ax.Sd.b
    public float d() {
        float f = 0.99f;
        if (this.d >= 6) {
            return 0.99f;
        }
        for (int i = 0; i < this.d; i++) {
            f *= 0.5f;
        }
        return 1.0f - f;
    }

    @Override // ax.Sd.b
    public b.a e() {
        return this.c;
    }

    @Override // ax.Sd.b
    public b.a f(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (true) {
            if (i >= i3) {
                break;
            }
            int c = this.b.c(bArr[i]);
            if (c == 1) {
                this.c = b.a.NOT_ME;
                break;
            }
            if (c == 2) {
                this.c = b.a.FOUND_IT;
                break;
            }
            if (c == 0 && this.b.b() >= 2) {
                this.d++;
            }
            i++;
        }
        if (this.c == b.a.DETECTING && d() > 0.95f) {
            this.c = b.a.FOUND_IT;
        }
        return this.c;
    }

    @Override // ax.Sd.b
    public final void j() {
        this.b.d();
        this.d = 0;
        this.c = b.a.DETECTING;
    }
}
