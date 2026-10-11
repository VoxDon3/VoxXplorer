package ax.Sd;

import ax.Sd.b;

/* loaded from: classes3.dex */
public class f extends b {
    private static final ax.Wd.g f = new ax.Wd.g();
    private static final ax.Wd.h g = new ax.Wd.h();
    private static final ax.Wd.i h = new ax.Wd.i();
    private static final ax.Wd.j i = new ax.Wd.j();
    private ax.Wd.b[] b;
    private int c;
    private b.a d;
    private String e;

    public f() {
        ax.Wd.b[] bVarArr = new ax.Wd.b[4];
        this.b = bVarArr;
        bVarArr[0] = new ax.Wd.b(f);
        this.b[1] = new ax.Wd.b(g);
        this.b[2] = new ax.Wd.b(h);
        this.b[3] = new ax.Wd.b(i);
        j();
    }

    @Override // ax.Sd.b
    public String c() {
        return this.e;
    }

    @Override // ax.Sd.b
    public float d() {
        return 0.99f;
    }

    @Override // ax.Sd.b
    public b.a e() {
        return this.d;
    }

    @Override // ax.Sd.b
    public b.a f(byte[] bArr, int i2, int i3) {
        int i4 = i3 + i2;
        while (i2 < i4 && this.d == b.a.DETECTING) {
            for (int i5 = this.c - 1; i5 >= 0; i5--) {
                int c = this.b[i5].c(bArr[i2]);
                if (c == 1) {
                    int i6 = this.c - 1;
                    this.c = i6;
                    if (i6 <= 0) {
                        b.a aVar = b.a.NOT_ME;
                        this.d = aVar;
                        return aVar;
                    }
                    if (i5 != i6) {
                        ax.Wd.b[] bVarArr = this.b;
                        ax.Wd.b bVar = bVarArr[i6];
                        bVarArr[i6] = bVarArr[i5];
                        bVarArr[i5] = bVar;
                    }
                } else if (c == 2) {
                    this.d = b.a.FOUND_IT;
                    this.e = this.b[i5].a();
                    return this.d;
                }
            }
            i2++;
        }
        return this.d;
    }

    @Override // ax.Sd.b
    public final void j() {
        this.d = b.a.DETECTING;
        int i2 = 0;
        while (true) {
            ax.Wd.b[] bVarArr = this.b;
            if (i2 >= bVarArr.length) {
                this.c = bVarArr.length;
                this.e = null;
                return;
            } else {
                bVarArr[i2].d();
                i2++;
            }
        }
    }
}
