package ax.Zb;

import ax.sb.t;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: ax.Zb.a$a, reason: collision with other inner class name */
    public static final class C0236a {
        public static /* synthetic */ void a(a aVar, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            aVar.c(obj);
        }
    }

    Object a(Object obj, ax.wb.e<? super t> eVar);

    boolean b();

    void c(Object obj);
}
