package ax.Sd;

import ax.Sd.b;

/* loaded from: classes3.dex */
public class h extends b {
    private int b;
    private int c;
    private byte d;
    private byte e;
    private b f = null;
    private b g = null;

    public h() {
        j();
    }

    protected static boolean l(byte b) {
        int i = b & 255;
        return i == 234 || i == 237 || i == 239 || i == 243 || i == 245;
    }

    protected static boolean m(byte b) {
        int i = b & 255;
        return i == 235 || i == 238 || i == 240 || i == 244;
    }

    @Override // ax.Sd.b
    public String c() {
        int i = this.b - this.c;
        if (i >= 5) {
            return ax.Rd.b.t;
        }
        if (i <= -5) {
            return ax.Rd.b.f;
        }
        float d = this.f.d() - this.g.d();
        return d > 0.01f ? ax.Rd.b.t : d < -0.01f ? ax.Rd.b.f : i < 0 ? ax.Rd.b.f : ax.Rd.b.t;
    }

    @Override // ax.Sd.b
    public float d() {
        return 0.0f;
    }

    @Override // ax.Sd.b
    public b.a e() {
        b.a e = this.f.e();
        b.a aVar = b.a.NOT_ME;
        return (e == aVar && this.g.e() == aVar) ? aVar : b.a.DETECTING;
    }

    @Override // ax.Sd.b
    public b.a f(byte[] bArr, int i, int i2) {
        b.a e = e();
        b.a aVar = b.a.NOT_ME;
        if (e == aVar) {
            return aVar;
        }
        int i3 = i2 + i;
        while (i < i3) {
            byte b = bArr[i];
            if (b == 32) {
                if (this.e != 32) {
                    if (l(this.d)) {
                        this.b++;
                    } else if (m(this.d)) {
                        this.c++;
                    }
                }
            } else if (this.e == 32 && l(this.d) && b != 32) {
                this.c++;
            }
            this.e = this.d;
            this.d = b;
            i++;
        }
        return b.a.DETECTING;
    }

    @Override // ax.Sd.b
    public final void j() {
        this.b = 0;
        this.c = 0;
        this.d = (byte) 32;
        this.e = (byte) 32;
    }

    public void n(b bVar, b bVar2) {
        this.f = bVar;
        this.g = bVar2;
    }
}
