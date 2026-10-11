/*
 * Decompiled with CFR 0.152.
 */
package ax.m1;

import android.os.Handler;
import ax.U0.z;
import ax.m1.d;
import java.util.concurrent.CopyOnWriteArrayList;

public interface e {
    public long a();

    public z d();

    public void e(Handler var1, a var2);

    public long f();

    public void g(a var1);

    public static interface ax.m1.e$a {
        public void Q(int var1, long var2, long var4);

        public static final class ax.m1.e$a$a {
            private final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList();

            public static /* synthetic */ void a(a a8, int n8, long l8, long l9) {
                a8.b.Q(n8, l8, l9);
            }

            public void b(Handler handler, ax.m1.e$a a8) {
                ax.S0.a.e(handler);
                ax.S0.a.e(a8);
                this.d(a8);
                this.a.add(new a(handler, a8));
            }

            public void c(int n8, long l8, long l9) {
                for (a a8 : this.a) {
                    if (a8.c) continue;
                    a8.a.post((Runnable)new d(a8, n8, l8, l9));
                }
            }

            public void d(ax.m1.e$a a8) {
                for (a a9 : this.a) {
                    if (a9.b != a8) continue;
                    a9.d();
                    this.a.remove(a9);
                }
            }

            private static final class a {
                private final Handler a;
                private final ax.m1.e$a b;
                private boolean c;

                public a(Handler handler, ax.m1.e$a a8) {
                    this.a = handler;
                    this.b = a8;
                }

                public void d() {
                    this.c = true;
                }
            }
        }
    }
}

