package ax.i2;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.C1446g;
import ax.b0.InterfaceC1440a;
import ax.i2.AbstractC2244I;

/* renamed from: ax.i2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2257h {

    /* renamed from: ax.i2.h$a */
    private static final class a<K> extends AbstractC2244I.b<K> {
        final RecyclerView.h<?> a;
        private final p<K> b;
        private final InterfaceC1440a<Runnable> c;

        /* renamed from: ax.i2.h$a$a, reason: collision with other inner class name */
        class RunnableC0334a implements Runnable {
            final /* synthetic */ int q;

            RunnableC0334a(int i) {
                this.q = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a.t(this.q, "Selection-Changed");
            }
        }

        a(AbstractC2244I<K> abstractC2244I, p<K> pVar, RecyclerView.h<?> hVar, InterfaceC1440a<Runnable> interfaceC1440a) {
            abstractC2244I.b(this);
            C1446g.a(pVar != null);
            C1446g.a(hVar != null);
            C1446g.a(interfaceC1440a != null);
            this.b = pVar;
            this.a = hVar;
            this.c = interfaceC1440a;
        }

        @Override // ax.i2.AbstractC2244I.b
        public void a(K k, boolean z) {
            int b = this.b.b(k);
            if (b >= 0) {
                this.c.accept(new RunnableC0334a(b));
                return;
            }
            Log.w("EventsRelays", "Item change notification received for unknown item: " + k);
        }
    }

    public static <K> void a(RecyclerView.h<?> hVar, AbstractC2244I<K> abstractC2244I, p<K> pVar, InterfaceC1440a<Runnable> interfaceC1440a) {
        new a(abstractC2244I, pVar, hVar, interfaceC1440a);
        hVar.J(abstractC2244I.i());
    }
}
