package ax.Vb;

import ax.Qb.M0;
import ax.wb.i;

/* loaded from: classes3.dex */
public final class J {
    public static final F a = new F("NO_THREAD_ELEMENTS");
    private static final ax.Fb.p<Object, i.b, Object> b = a.q;
    private static final ax.Fb.p<M0<?>, i.b, M0<?>> c = b.q;
    private static final ax.Fb.p<N, i.b, N> d = c.q;

    static final class a extends ax.Gb.m implements ax.Fb.p<Object, i.b, Object> {
        public static final a q = new a();

        a() {
            super(2);
        }

        @Override // ax.Fb.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object j(Object obj, i.b bVar) {
            if (!(bVar instanceof M0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    static final class b extends ax.Gb.m implements ax.Fb.p<M0<?>, i.b, M0<?>> {
        public static final b q = new b();

        b() {
            super(2);
        }

        @Override // ax.Fb.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M0<?> j(M0<?> m0, i.b bVar) {
            if (m0 != null) {
                return m0;
            }
            if (bVar instanceof M0) {
                return (M0) bVar;
            }
            return null;
        }
    }

    static final class c extends ax.Gb.m implements ax.Fb.p<N, i.b, N> {
        public static final c q = new c();

        c() {
            super(2);
        }

        @Override // ax.Fb.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N j(N n, i.b bVar) {
            if (bVar instanceof M0) {
                M0<?> m0 = (M0) bVar;
                n.a(m0, m0.M0(n.a));
            }
            return n;
        }
    }

    public static final void a(ax.wb.i iVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (obj instanceof N) {
            ((N) obj).b(iVar);
            return;
        }
        Object v = iVar.v(null, c);
        ax.Gb.l.d(v, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((M0) v).L(iVar, obj);
    }

    public static final Object b(ax.wb.i iVar) {
        Object v = iVar.v(0, b);
        ax.Gb.l.c(v);
        return v;
    }

    public static final Object c(ax.wb.i iVar, Object obj) {
        if (obj == null) {
            obj = b(iVar);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return iVar.v(new N(iVar, ((Number) obj).intValue()), d);
        }
        ax.Gb.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((M0) obj).M0(iVar);
    }
}
