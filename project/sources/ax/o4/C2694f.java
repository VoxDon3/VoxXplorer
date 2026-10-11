package ax.o4;

import ax.o4.C2690b;
import ax.o4.C2695g;

/* renamed from: ax.o4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2694f {
    C2690b.r a;
    C2693e b;
    String c;
    C2695g.C2697b d;
    String e;
    C2695g.C2697b f;

    public C2694f() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public boolean a() {
        C2690b.r rVar = this.a;
        return rVar != null && rVar.f() > 0;
    }

    public boolean b() {
        return this.b != null;
    }

    public boolean c() {
        return this.c != null;
    }

    public boolean d() {
        return this.e != null;
    }

    public boolean e() {
        return this.d != null;
    }

    public boolean f() {
        return this.f != null;
    }

    public C2694f g(float f, float f2, float f3, float f4) {
        this.f = new C2695g.C2697b(f, f2, f3, f4);
        return this;
    }

    public C2694f(C2694f c2694f) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        if (c2694f == null) {
            return;
        }
        this.a = c2694f.a;
        this.b = c2694f.b;
        this.d = c2694f.d;
        this.e = c2694f.e;
        this.f = c2694f.f;
    }
}
