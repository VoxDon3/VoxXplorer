package ax.m1;

import android.os.Handler;
import ax.S0.C0968a;
import ax.U0.z;
import ax.m1.e;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface e {

    public interface a {

        /* renamed from: ax.m1.e$a$a, reason: collision with other inner class name */
        public static final class C0368a {
            private final CopyOnWriteArrayList<C0369a> a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: ax.m1.e$a$a$a, reason: collision with other inner class name */
            static final class C0369a {
                private final Handler a;
                private final a b;
                private boolean c;

                public C0369a(Handler handler, a aVar) {
                    this.a = handler;
                    this.b = aVar;
                }

                public void d() {
                    this.c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                C0968a.e(handler);
                C0968a.e(aVar);
                d(aVar);
                this.a.add(new C0369a(handler, aVar));
            }

            public void c(int i, long j, long j2) {
                final int i2;
                final long j3;
                final long j4;
                Iterator<C0369a> it = this.a.iterator();
                while (it.hasNext()) {
                    final C0369a next = it.next();
                    if (next.c) {
                        i2 = i;
                        j3 = j;
                        j4 = j2;
                    } else {
                        i2 = i;
                        j3 = j;
                        j4 = j2;
                        next.a.post(new Runnable() { // from class: ax.m1.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                e.a.C0368a.C0369a.this.b.Q(i2, j3, j4);
                            }
                        });
                    }
                    i = i2;
                    j = j3;
                    j2 = j4;
                }
            }

            public void d(a aVar) {
                Iterator<C0369a> it = this.a.iterator();
                while (it.hasNext()) {
                    C0369a next = it.next();
                    if (next.b == aVar) {
                        next.d();
                        this.a.remove(next);
                    }
                }
            }
        }

        void Q(int i, long j, long j2);
    }

    long a();

    z d();

    void e(Handler handler, a aVar);

    long f();

    void g(a aVar);
}
