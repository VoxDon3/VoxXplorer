package ax.p0;

import android.content.Context;
import ax.Fb.l;
import ax.Gb.m;
import ax.Qb.J;
import ax.o0.C2655b;
import ax.q0.AbstractC2835d;
import ax.q0.C2834c;
import java.io.File;
import java.util.List;

/* renamed from: ax.p0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2752c implements ax.Ib.a<Context, ax.n0.f<AbstractC2835d>> {
    private final String a;
    private final C2655b<AbstractC2835d> b;
    private final l<Context, List<ax.n0.d<AbstractC2835d>>> c;
    private final J d;
    private final Object e;
    private volatile ax.n0.f<AbstractC2835d> f;

    /* renamed from: ax.p0.c$a */
    static final class a extends m implements ax.Fb.a<File> {
        final /* synthetic */ C2752c c0;
        final /* synthetic */ Context q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, C2752c c2752c) {
            super(0);
            this.q = context;
            this.c0 = c2752c;
        }

        @Override // ax.Fb.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context context = this.q;
            ax.Gb.l.e(context, "applicationContext");
            return C2751b.a(context, this.c0.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2752c(String str, C2655b<AbstractC2835d> c2655b, l<? super Context, ? extends List<? extends ax.n0.d<AbstractC2835d>>> lVar, J j) {
        ax.Gb.l.f(str, "name");
        ax.Gb.l.f(lVar, "produceMigrations");
        ax.Gb.l.f(j, "scope");
        this.a = str;
        this.b = c2655b;
        this.c = lVar;
        this.d = j;
        this.e = new Object();
    }

    @Override // ax.Ib.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ax.n0.f<AbstractC2835d> a(Context context, ax.Mb.g<?> gVar) {
        ax.n0.f<AbstractC2835d> fVar;
        ax.Gb.l.f(context, "thisRef");
        ax.Gb.l.f(gVar, "property");
        ax.n0.f<AbstractC2835d> fVar2 = this.f;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    Context applicationContext = context.getApplicationContext();
                    C2834c c2834c = C2834c.a;
                    C2655b<AbstractC2835d> c2655b = this.b;
                    l<Context, List<ax.n0.d<AbstractC2835d>>> lVar = this.c;
                    ax.Gb.l.e(applicationContext, "applicationContext");
                    this.f = c2834c.a(c2655b, lVar.invoke(applicationContext), this.d, new a(applicationContext, this));
                }
                fVar = this.f;
                ax.Gb.l.c(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }
}
