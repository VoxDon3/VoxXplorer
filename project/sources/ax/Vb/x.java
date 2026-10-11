package ax.Vb;

import ax.sb.C3069a;

/* loaded from: classes3.dex */
public final class x {

    static final class a extends ax.Gb.m implements ax.Fb.l<Throwable, ax.sb.t> {
        final /* synthetic */ E c0;
        final /* synthetic */ ax.wb.i d0;
        final /* synthetic */ ax.Fb.l<E, ax.sb.t> q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ax.Fb.l<? super E, ax.sb.t> lVar, E e, ax.wb.i iVar) {
            super(1);
            this.q = lVar;
            this.c0 = e;
            this.d0 = iVar;
        }

        public final void a(Throwable th) {
            x.b(this.q, this.c0, this.d0);
        }

        @Override // ax.Fb.l
        public /* bridge */ /* synthetic */ ax.sb.t invoke(Throwable th) {
            a(th);
            return ax.sb.t.a;
        }
    }

    public static final <E> ax.Fb.l<Throwable, ax.sb.t> a(ax.Fb.l<? super E, ax.sb.t> lVar, E e, ax.wb.i iVar) {
        return new a(lVar, e, iVar);
    }

    public static final <E> void b(ax.Fb.l<? super E, ax.sb.t> lVar, E e, ax.wb.i iVar) {
        O c = c(lVar, e, null);
        if (c != null) {
            ax.Qb.I.a(iVar, c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> O c(ax.Fb.l<? super E, ax.sb.t> lVar, E e, O o) {
        try {
            lVar.invoke(e);
            return o;
        } catch (Throwable th) {
            if (o != null && o.getCause() != th) {
                C3069a.a(o, th);
                return o;
            }
            return new O("Exception in undelivered element handler for " + e, th);
        }
    }

    public static /* synthetic */ O d(ax.Fb.l lVar, Object obj, O o, int i, Object obj2) {
        if ((i & 2) != 0) {
            o = null;
        }
        return c(lVar, obj, o);
    }
}
