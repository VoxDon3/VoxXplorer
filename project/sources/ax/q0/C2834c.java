package ax.q0;

import ax.Gb.l;
import ax.Gb.m;
import ax.Qb.J;
import ax.o0.C2655b;
import java.io.File;
import java.util.List;

/* renamed from: ax.q0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2834c {
    public static final C2834c a = new C2834c();

    /* renamed from: ax.q0.c$a */
    static final class a extends m implements ax.Fb.a<File> {
        final /* synthetic */ ax.Fb.a<File> q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ax.Fb.a<? extends File> aVar) {
            super(0);
            this.q = aVar;
        }

        @Override // ax.Fb.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File invoke = this.q.invoke();
            String a = ax.Db.b.a(invoke);
            C2839h c2839h = C2839h.a;
            if (l.a(a, c2839h.f())) {
                return invoke;
            }
            throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + c2839h.f()).toString());
        }
    }

    private C2834c() {
    }

    public final ax.n0.f<AbstractC2835d> a(C2655b<AbstractC2835d> c2655b, List<? extends ax.n0.d<AbstractC2835d>> list, J j, ax.Fb.a<? extends File> aVar) {
        l.f(list, "migrations");
        l.f(j, "scope");
        l.f(aVar, "produceFile");
        return new C2833b(ax.n0.g.a.a(C2839h.a, c2655b, list, j, new a(aVar)));
    }
}
