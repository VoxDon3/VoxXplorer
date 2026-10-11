package ax.Sd;

import ax.Sd.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class j extends b {
    private b.a b;
    private List<b> c = new ArrayList();
    private b d;
    private int e;

    public j() {
        if (m()) {
            this.c.add(new g());
        }
        this.c.add(new o());
        this.c.add(new a());
        this.c.add(new m());
        this.c.add(new c());
        this.c.add(new d());
        this.c.add(new e());
        j();
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0015 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m() {
        /*
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            java.lang.String r2 = "CN"
            java.lang.String r3 = "zh"
            r4 = 0
            r5 = 1
            if (r0 < r1) goto L33
            android.os.LocaleList r0 = ax.X2.I.a()
            r1 = 0
        L11:
            int r6 = ax.Y.k.a(r0)
            if (r1 >= r6) goto L33
            java.util.Locale r6 = ax.Y.n.a(r0, r1)
            java.lang.String r7 = r6.getLanguage()
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L30
            java.lang.String r6 = r6.getCountry()
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L30
            return r5
        L30:
            int r1 = r1 + 1
            goto L11
        L33:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = r0.getLanguage()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L4c
            java.lang.String r0 = r0.getCountry()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4c
            return r5
        L4c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Sd.j.m():boolean");
    }

    @Override // ax.Sd.b
    public String c() {
        if (this.d == null) {
            d();
            if (this.d == null) {
                this.d = this.c.get(0);
            }
        }
        return this.d.c();
    }

    @Override // ax.Sd.b
    public float d() {
        b.a aVar = this.b;
        if (aVar == b.a.FOUND_IT) {
            return 0.99f;
        }
        if (aVar == b.a.NOT_ME) {
            return 0.01f;
        }
        float f = 0.0f;
        for (b bVar : this.c) {
            if (bVar.g()) {
                float d = bVar.d();
                if (f < d) {
                    this.d = bVar;
                    f = d;
                }
            }
        }
        return f;
    }

    @Override // ax.Sd.b
    public b.a e() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        r7.d = r9;
        r7.b = r3;
     */
    @Override // ax.Sd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ax.Sd.b.a f(byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            byte[] r0 = new byte[r10]
            int r10 = r10 + r9
            r1 = 1
            r2 = 0
            r3 = 1
            r4 = 0
        L7:
            if (r9 >= r10) goto L21
            r5 = r8[r9]
            r6 = r5 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L16
            int r3 = r4 + 1
            r0[r4] = r5
            r4 = r3
            r3 = 1
            goto L1e
        L16:
            if (r3 == 0) goto L1e
            int r3 = r4 + 1
            r0[r4] = r5
            r4 = r3
            r3 = 0
        L1e:
            int r9 = r9 + 1
            goto L7
        L21:
            java.util.List<ax.Sd.b> r8 = r7.c
            java.util.Iterator r8 = r8.iterator()
        L27:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L63
            java.lang.Object r9 = r8.next()
            ax.Sd.b r9 = (ax.Sd.b) r9
            boolean r10 = r9.g()
            if (r10 != 0) goto L3a
            goto L27
        L3a:
            ax.Sd.b$a r10 = r9.f(r0, r2, r4)
            ax.Sd.b$a r3 = ax.Sd.b.a.FOUND_IT
            if (r10 == r3) goto L5f
            r5 = 1065185444(0x3f7d70a4, float:0.99)
            float r6 = r9.d()
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L4e
            goto L5f
        L4e:
            ax.Sd.b$a r3 = ax.Sd.b.a.NOT_ME
            if (r10 != r3) goto L27
            r9.k(r2)
            int r9 = r7.e
            int r9 = r9 - r1
            r7.e = r9
            if (r9 > 0) goto L27
            r7.b = r3
            goto L63
        L5f:
            r7.d = r9
            r7.b = r3
        L63:
            ax.Sd.b$a r8 = r7.b
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Sd.j.f(byte[], int, int):ax.Sd.b$a");
    }

    @Override // ax.Sd.b
    public final void j() {
        this.e = 0;
        for (b bVar : this.c) {
            bVar.j();
            bVar.k(true);
            this.e++;
        }
        this.d = null;
        this.b = b.a.DETECTING;
    }

    public b l() {
        return this.d;
    }
}
