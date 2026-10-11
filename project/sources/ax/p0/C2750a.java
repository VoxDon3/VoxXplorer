package ax.p0;

import android.content.Context;
import ax.Fb.l;
import ax.Gb.m;
import ax.Qb.J;
import ax.Qb.K;
import ax.Qb.L0;
import ax.Qb.Y;
import ax.o0.C2655b;
import ax.q0.AbstractC2835d;
import ax.tb.C3139o;
import java.util.List;

/* renamed from: ax.p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2750a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ax.p0.a$a, reason: collision with other inner class name */
    public static final class C0411a extends m implements l<Context, List<? extends ax.n0.d<AbstractC2835d>>> {
        public static final C0411a q = new C0411a();

        C0411a() {
            super(1);
        }

        @Override // ax.Fb.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<ax.n0.d<AbstractC2835d>> invoke(Context context) {
            ax.Gb.l.f(context, "it");
            return C3139o.j();
        }
    }

    public static final ax.Ib.a<Context, ax.n0.f<AbstractC2835d>> a(String str, C2655b<AbstractC2835d> c2655b, l<? super Context, ? extends List<? extends ax.n0.d<AbstractC2835d>>> lVar, J j) {
        ax.Gb.l.f(str, "name");
        ax.Gb.l.f(lVar, "produceMigrations");
        ax.Gb.l.f(j, "scope");
        return new C2752c(str, c2655b, lVar, j);
    }

    public static /* synthetic */ ax.Ib.a b(String str, C2655b c2655b, l lVar, J j, int i, Object obj) {
        if ((i & 2) != 0) {
            c2655b = null;
        }
        if ((i & 4) != 0) {
            lVar = C0411a.q;
        }
        if ((i & 8) != 0) {
            j = K.a(Y.b().p(L0.b(null, 1, null)));
        }
        return a(str, c2655b, lVar, j);
    }
}
