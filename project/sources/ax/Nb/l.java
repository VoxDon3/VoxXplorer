package ax.Nb;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class l extends j {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements e<T> {
        final /* synthetic */ Iterator a;

        public a(Iterator it) {
            this.a = it;
        }

        @Override // ax.Nb.e
        public Iterator<T> iterator() {
            return this.a;
        }
    }

    public static <T> e<T> d(Iterator<? extends T> it) {
        ax.Gb.l.f(it, "<this>");
        return e(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> e<T> e(e<? extends T> eVar) {
        ax.Gb.l.f(eVar, "<this>");
        return eVar instanceof ax.Nb.a ? eVar : new ax.Nb.a(eVar);
    }

    public static <T> e<T> f(final ax.Fb.a<? extends T> aVar) {
        ax.Gb.l.f(aVar, "nextFunction");
        return e(new d(aVar, new ax.Fb.l() { // from class: ax.Nb.k
            @Override // ax.Fb.l
            public final Object invoke(Object obj) {
                Object g;
                g = l.g(ax.Fb.a.this, obj);
                return g;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(ax.Fb.a aVar, Object obj) {
        ax.Gb.l.f(obj, "it");
        return aVar.invoke();
    }
}
