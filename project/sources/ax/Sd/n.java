package ax.Sd;

import ax.Sd.b;

/* loaded from: classes3.dex */
public class n extends b {
    private b.a b;
    private ax.Vd.l c;
    private boolean d;
    private short e;
    private int f;
    private int[] g;
    private int h;
    private int i;
    private b j;

    public n(ax.Vd.l lVar) {
        this.c = lVar;
        this.d = false;
        this.j = null;
        this.g = new int[4];
        j();
    }

    @Override // ax.Sd.b
    public String c() {
        b bVar = this.j;
        return bVar == null ? this.c.a() : bVar.c();
    }

    @Override // ax.Sd.b
    public float d() {
        int i = this.f;
        if (i <= 0) {
            return 0.01f;
        }
        float d = ((((this.g[3] * 1.0f) / i) / this.c.d()) * this.i) / this.h;
        if (d >= 1.0f) {
            return 0.99f;
        }
        return d;
    }

    @Override // ax.Sd.b
    public b.a e() {
        return this.b;
    }

    @Override // ax.Sd.b
    public b.a f(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            short b = this.c.b(bArr[i]);
            if (b < 250) {
                this.h++;
            }
            if (b < 64) {
                this.i++;
                short s = this.e;
                if (s < 64) {
                    this.f++;
                    if (this.d) {
                        int[] iArr = this.g;
                        byte c = this.c.c((b * 64) + s);
                        iArr[c] = iArr[c] + 1;
                    } else {
                        int[] iArr2 = this.g;
                        byte c2 = this.c.c((s * 64) + b);
                        iArr2[c2] = iArr2[c2] + 1;
                    }
                }
            }
            this.e = b;
            i++;
        }
        if (this.b == b.a.DETECTING && this.f > 1024) {
            float d = d();
            if (d > 0.95f) {
                this.b = b.a.FOUND_IT;
            } else if (d < 0.05f) {
                this.b = b.a.NOT_ME;
            }
        }
        return this.b;
    }

    @Override // ax.Sd.b
    public final void j() {
        this.b = b.a.DETECTING;
        this.e = (short) 255;
        for (int i = 0; i < 4; i++) {
            this.g[i] = 0;
        }
        this.f = 0;
        this.h = 0;
        this.i = 0;
    }

    public float l() {
        int i = this.f;
        if (i <= 0) {
            return 0.01f;
        }
        int[] iArr = this.g;
        float d = (((((iArr[3] * 1.0f) + (iArr[2] * 0.5f)) / i) / this.c.d()) * this.i) / this.h;
        if (d >= 1.0f) {
            return 0.99f;
        }
        return d;
    }

    public n(ax.Vd.l lVar, boolean z, b bVar) {
        this.c = lVar;
        this.d = z;
        this.j = bVar;
        this.g = new int[4];
        j();
    }
}
