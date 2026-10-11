package ax.Qb;

import ax.wb.i;

/* loaded from: classes3.dex */
public final class F {

    static final class a extends ax.Gb.m implements ax.Fb.p<ax.wb.i, i.b, ax.wb.i> {
        public static final a q = new a();

        a() {
            super(2);
        }

        @Override // ax.Fb.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ax.wb.i j(ax.wb.i iVar, i.b bVar) {
            return bVar instanceof E ? iVar.p(((E) bVar).H()) : iVar.p(bVar);
        }
    }

    static final class b extends ax.Gb.m implements ax.Fb.p<ax.wb.i, i.b, ax.wb.i> {
        final /* synthetic */ boolean c0;
        final /* synthetic */ ax.Gb.v<ax.wb.i> q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ax.Gb.v<ax.wb.i> vVar, boolean z) {
            super(2);
            this.q = vVar;
            this.c0 = z;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, ax.wb.i] */
        @Override // ax.Fb.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ax.wb.i j(ax.wb.i iVar, i.b bVar) {
            if (!(bVar instanceof E)) {
                return iVar.p(bVar);
            }
            i.b a = this.q.q.a(bVar.getKey());
            if (a != null) {
                ax.Gb.v<ax.wb.i> vVar = this.q;
                vVar.q = vVar.q.m(bVar.getKey());
                return iVar.p(((E) bVar).g(a));
            }
            E e = (E) bVar;
            if (this.c0) {
                e = e.H();
            }
            return iVar.p(e);
        }
    }

    static final class c extends ax.Gb.m implements ax.Fb.p<Boolean, i.b, Boolean> {
        public static final c q = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z, i.b bVar) {
            return Boolean.valueOf(z || (bVar instanceof E));
        }

        @Override // ax.Fb.p
        public /* bridge */ /* synthetic */ Boolean j(Boolean bool, i.b bVar) {
            return a(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final ax.wb.i a(ax.wb.i iVar, ax.wb.i iVar2, boolean z) {
        boolean c2 = c(iVar);
        boolean c3 = c(iVar2);
        if (!c2 && !c3) {
            return iVar.p(iVar2);
        }
        ax.Gb.v vVar = new ax.Gb.v();
        vVar.q = iVar2;
        ax.wb.j jVar = ax.wb.j.q;
        ax.wb.i iVar3 = (ax.wb.i) iVar.v(jVar, new b(vVar, z));
        if (c3) {
            vVar.q = ((ax.wb.i) vVar.q).v(jVar, a.q);
        }
        return iVar3.p((ax.wb.i) vVar.q);
    }

    public static final String b(ax.wb.i iVar) {
        return null;
    }

    private static final boolean c(ax.wb.i iVar) {
        return ((Boolean) iVar.v(Boolean.FALSE, c.q)).booleanValue();
    }

    public static final ax.wb.i d(J j, ax.wb.i iVar) {
        ax.wb.i a2 = a(j.h(), iVar, true);
        return (a2 == Y.a() || a2.a(ax.wb.f.b0) != null) ? a2 : a2.p(Y.a());
    }

    public static final ax.wb.i e(ax.wb.i iVar, ax.wb.i iVar2) {
        return !c(iVar2) ? iVar.p(iVar2) : a(iVar, iVar2, false);
    }

    public static final P0<?> f(ax.yb.e eVar) {
        while (!(eVar instanceof U) && (eVar = eVar.d()) != null) {
            if (eVar instanceof P0) {
                return (P0) eVar;
            }
        }
        return null;
    }

    public static final P0<?> g(ax.wb.e<?> eVar, ax.wb.i iVar, Object obj) {
        if (!(eVar instanceof ax.yb.e) || iVar.a(Q0.q) == null) {
            return null;
        }
        P0<?> f = f((ax.yb.e) eVar);
        if (f != null) {
            f.P0(iVar, obj);
        }
        return f;
    }
}
