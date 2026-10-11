package ax.Qb;

/* renamed from: ax.Qb.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0945l<T> extends ax.wb.e<T> {

    /* renamed from: ax.Qb.l$a */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC0945l interfaceC0945l, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return interfaceC0945l.n(th);
        }
    }

    void k(T t, ax.Fb.l<? super Throwable, ax.sb.t> lVar);

    Object l(T t, Object obj, ax.Fb.l<? super Throwable, ax.sb.t> lVar);

    boolean n(Throwable th);

    void r(ax.Fb.l<? super Throwable, ax.sb.t> lVar);

    void s(Object obj);
}
