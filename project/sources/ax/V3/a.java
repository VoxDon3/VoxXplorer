package ax.V3;

import ax.M3.i;
import ax.M3.j;
import ax.N3.h;
import ax.U3.g;
import ax.U3.l;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import java.io.InputStream;

/* loaded from: classes.dex */
public class a implements m<g, InputStream> {
    public static final i<Integer> b = i.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    private final l<g, g> a;

    /* renamed from: ax.V3.a$a, reason: collision with other inner class name */
    public static class C0214a implements n<g, InputStream> {
        private final l<g, g> a = new l<>(500);

        @Override // ax.U3.n
        public m<g, InputStream> b(q qVar) {
            return new a(this.a);
        }
    }

    public a(l<g, g> lVar) {
        this.a = lVar;
    }

    @Override // ax.U3.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<InputStream> a(g gVar, int i, int i2, j jVar) {
        l<g, g> lVar = this.a;
        if (lVar != null) {
            g a = lVar.a(gVar, 0, 0);
            if (a == null) {
                this.a.b(gVar, 0, 0, gVar);
            } else {
                gVar = a;
            }
        }
        return new m.a<>(gVar, new h(gVar, ((Integer) jVar.c(b)).intValue()));
    }

    @Override // ax.U3.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(g gVar) {
        return true;
    }
}
