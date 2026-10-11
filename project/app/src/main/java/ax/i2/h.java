/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.g;
import ax.i2.I;
import ax.i2.p;

public class h {
    public static <K> void a(RecyclerView.h<?> h8, I<K> i8, p<K> p8, ax.b0.a<Runnable> a8) {
        new a<K>(i8, p8, h8, a8);
        h8.J(i8.i());
    }

    private static final class a<K>
    extends I.b<K> {
        final RecyclerView.h<?> a;
        private final p<K> b;
        private final ax.b0.a<Runnable> c;

        a(I<K> i8, p<K> p8, RecyclerView.h<?> h8, ax.b0.a<Runnable> a8) {
            i8.b(this);
            boolean bl = false;
            boolean bl2 = p8 != null;
            g.a(bl2);
            bl2 = h8 != null;
            g.a(bl2);
            bl2 = bl;
            if (a8 != null) {
                bl2 = true;
            }
            g.a(bl2);
            this.b = p8;
            this.a = h8;
            this.c = a8;
        }

        @Override
        public void a(K k8, boolean bl) {
            int n8 = this.b.b(k8);
            if (n8 < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Item change notification received for unknown item: ");
                stringBuilder.append(k8);
                Log.w((String)"EventsRelays", (String)stringBuilder.toString());
                return;
            }
            this.c.accept(new Runnable(){
                final a c0;
                final int q;
                {
                    this.c0 = a8;
                    this.q = n8;
                }

                @Override
                public void run() {
                    this.c0.a.t(this.q, "Selection-Changed");
                }
            });
        }
    }
}

