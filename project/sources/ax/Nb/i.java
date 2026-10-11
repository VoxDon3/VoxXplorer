package ax.Nb;

import ax.Fb.p;
import ax.sb.t;
import ax.xb.C3479b;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements e<T> {
        final /* synthetic */ p a;

        public a(p pVar) {
            this.a = pVar;
        }

        @Override // ax.Nb.e
        public Iterator<T> iterator() {
            return i.a(this.a);
        }
    }

    public static final <T> Iterator<T> a(p<? super g<? super T>, ? super ax.wb.e<? super t>, ? extends Object> pVar) {
        ax.Gb.l.f(pVar, "block");
        f fVar = new f();
        fVar.m(C3479b.a(pVar, fVar, fVar));
        return fVar;
    }

    public static <T> e<T> b(p<? super g<? super T>, ? super ax.wb.e<? super t>, ? extends Object> pVar) {
        ax.Gb.l.f(pVar, "block");
        return new a(pVar);
    }
}
