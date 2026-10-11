package com.google.firebase;

import androidx.annotation.Keep;
import ax.D7.C0661c;
import ax.D7.F;
import ax.D7.InterfaceC0663e;
import ax.D7.h;
import ax.D7.r;
import ax.Gb.l;
import ax.Qb.C0944k0;
import ax.Qb.G;
import ax.tb.C3139o;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;

@Keep
/* loaded from: classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a<T> implements h {
        public static final a<T> a = new a<>();

        @Override // ax.D7.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final G a(InterfaceC0663e interfaceC0663e) {
            Object c = interfaceC0663e.c(F.a(ax.C7.a.class, Executor.class));
            l.e(c, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C0944k0.a((Executor) c);
        }
    }

    public static final class b<T> implements h {
        public static final b<T> a = new b<>();

        @Override // ax.D7.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final G a(InterfaceC0663e interfaceC0663e) {
            Object c = interfaceC0663e.c(F.a(ax.C7.c.class, Executor.class));
            l.e(c, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C0944k0.a((Executor) c);
        }
    }

    public static final class c<T> implements h {
        public static final c<T> a = new c<>();

        @Override // ax.D7.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final G a(InterfaceC0663e interfaceC0663e) {
            Object c = interfaceC0663e.c(F.a(ax.C7.b.class, Executor.class));
            l.e(c, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C0944k0.a((Executor) c);
        }
    }

    public static final class d<T> implements h {
        public static final d<T> a = new d<>();

        @Override // ax.D7.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final G a(InterfaceC0663e interfaceC0663e) {
            Object c = interfaceC0663e.c(F.a(ax.C7.d.class, Executor.class));
            l.e(c, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C0944k0.a((Executor) c);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0661c<?>> getComponents() {
        C0661c c2 = C0661c.c(F.a(ax.C7.a.class, G.class)).b(r.i(F.a(ax.C7.a.class, Executor.class))).e(a.a).c();
        l.e(c2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C0661c c3 = C0661c.c(F.a(ax.C7.c.class, G.class)).b(r.i(F.a(ax.C7.c.class, Executor.class))).e(b.a).c();
        l.e(c3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C0661c c4 = C0661c.c(F.a(ax.C7.b.class, G.class)).b(r.i(F.a(ax.C7.b.class, Executor.class))).e(c.a).c();
        l.e(c4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C0661c c5 = C0661c.c(F.a(ax.C7.d.class, G.class)).b(r.i(F.a(ax.C7.d.class, Executor.class))).e(d.a).c();
        l.e(c5, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return C3139o.l(c2, c3, c4, c5);
    }
}
