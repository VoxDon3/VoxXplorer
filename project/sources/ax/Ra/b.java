package ax.Ra;

import ax.Ra.e;
import java.util.Set;

/* loaded from: classes3.dex */
public class b {
    private com.google.gson.a a;
    private d b;
    private final e.g c;

    public b() {
        e.g gVar = new e.g();
        this.c = gVar;
        gVar.b = true;
        gVar.d = false;
        gVar.c = false;
    }

    public a a() {
        if (this.a == null) {
            this.a = new com.google.gson.a();
        }
        return new a(this.a.b(), this.b, this.c);
    }

    public b b(Set<String> set) {
        e.g gVar = this.c;
        gVar.i = set;
        gVar.j = true;
        return this;
    }

    public b c(Set<String> set) {
        e.g gVar = this.c;
        gVar.h = set;
        gVar.a = true;
        return this;
    }

    public b d(boolean z) {
        e.g gVar = this.c;
        gVar.f = z;
        if (z) {
            gVar.d = z;
        }
        return this;
    }

    public b e(boolean z) {
        this.c.c = z;
        return this;
    }

    public b f(d dVar) {
        this.b = dVar;
        return this;
    }

    public b g(com.google.gson.a aVar) {
        this.a = aVar;
        return this;
    }
}
