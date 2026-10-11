package ax.W2;

import ax.W2.h;
import ax.c3.d0;
import com.voxdon.xplorer.file.C3596o;

/* loaded from: classes.dex */
public class m extends h {
    private C3596o d;
    private String e;
    private String f;
    private boolean g;

    public static m n() {
        return new m();
    }

    @Override // ax.W2.h
    protected j b() {
        return new n(f(), this.d, d0.Q(this.e, this.f), this.g);
    }

    public void k(C3596o c3596o, String str, boolean z, h.a aVar) {
        this.d = c3596o;
        this.e = str;
        this.g = z;
        i(aVar);
        j(h.c.FILLED);
    }

    public String l() {
        return this.f;
    }

    public String m() {
        return this.e;
    }

    public void o(String str) {
        this.f = str;
    }
}
