package ax.k2;

import ax.o2.h;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: ax.k2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2395z implements h.c {
    private final String a;
    private final File b;
    private final Callable<InputStream> c;
    private final h.c d;

    public C2395z(String str, File file, Callable<InputStream> callable, h.c cVar) {
        ax.Gb.l.f(cVar, "mDelegate");
        this.a = str;
        this.b = file;
        this.c = callable;
        this.d = cVar;
    }

    @Override // ax.o2.h.c
    public ax.o2.h a(h.b bVar) {
        ax.Gb.l.f(bVar, "configuration");
        return new C2394y(bVar.a, this.a, this.b, this.c, bVar.c.a, this.d.a(bVar));
    }
}
