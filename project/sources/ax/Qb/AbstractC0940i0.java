package ax.Qb;

import ax.wb.AbstractC3381b;
import ax.wb.i;
import java.io.Closeable;

/* renamed from: ax.Qb.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0940i0 extends G implements Closeable, AutoCloseable {
    public static final a d0 = new a(null);

    /* renamed from: ax.Qb.i0$a */
    public static final class a extends AbstractC3381b<G, AbstractC0940i0> {

        /* renamed from: ax.Qb.i0$a$a, reason: collision with other inner class name */
        static final class C0180a extends ax.Gb.m implements ax.Fb.l<i.b, AbstractC0940i0> {
            public static final C0180a q = new C0180a();

            C0180a() {
                super(1);
            }

            @Override // ax.Fb.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC0940i0 invoke(i.b bVar) {
                if (bVar instanceof AbstractC0940i0) {
                    return (AbstractC0940i0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
            super(G.c0, C0180a.q);
        }
    }
}
