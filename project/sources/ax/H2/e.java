package ax.H2;

import android.os.Build;
import ax.B2.i;
import ax.B2.j;
import ax.Gb.l;
import ax.K2.v;

/* loaded from: classes.dex */
public final class e extends c<ax.G2.b> {
    public static final a f = new a(null);
    private static final String g;

    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    static {
        String i = i.i("NetworkMeteredCtrlr");
        l.e(i, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        g = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ax.I2.h<ax.G2.b> hVar) {
        super(hVar);
        l.f(hVar, "tracker");
    }

    @Override // ax.H2.c
    public boolean b(v vVar) {
        l.f(vVar, "workSpec");
        return vVar.j.d() == j.METERED;
    }

    @Override // ax.H2.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(ax.G2.b bVar) {
        l.f(bVar, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar.a() && bVar.b()) ? false : true;
        }
        i.e().a(g, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !bVar.a();
    }
}
