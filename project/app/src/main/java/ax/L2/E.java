/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import ax.B2.i;
import ax.B2.p;
import ax.K2.m;
import java.util.HashMap;
import java.util.Map;

public class E {
    private static final String e = i.i("WorkTimer");
    final p a;
    final Map<m, b> b = new HashMap<m, b>();
    final Map<m, a> c = new HashMap<m, a>();
    final Object d = new Object();

    public E(p p8) {
        this.a = p8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(m m8, long l8, a a8) {
        Object object = this.d;
        synchronized (object) {
            i i8 = i.e();
            Object object2 = e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Starting timer for ");
            stringBuilder.append(m8);
            i8.a((String)object2, stringBuilder.toString());
            this.b(m8);
            object2 = new b(this, m8);
            this.b.put(m8, (b)object2);
            this.c.put(m8, a8);
            this.a.a(l8, (Runnable)object2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(m m8) {
        Object object = this.d;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.b.remove(m8) == null) break block3;
                        i i8 = i.e();
                        String string = e;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Stopping timer for ");
                        stringBuilder.append(m8);
                        i8.a(string, stringBuilder.toString());
                        this.c.remove(m8);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public static interface a {
        public void a(m var1);
    }

    public static class b
    implements Runnable {
        private final m c0;
        private final E q;

        b(E e8, m m8) {
            this.q = e8;
            this.c0 = m8;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void run() {
            Object object = this.q.d;
            synchronized (object) {
                Throwable throwable2;
                block6: {
                    block5: {
                        block4: {
                            try {
                                if (this.q.b.remove(this.c0) == null) break block4;
                                a a8 = this.q.c.remove(this.c0);
                                if (a8 != null) {
                                    a8.a(this.c0);
                                }
                                break block5;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        i.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.c0));
                    }
                    return;
                }
                throw throwable2;
            }
        }
    }
}

