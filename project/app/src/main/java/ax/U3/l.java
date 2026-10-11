/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import ax.k4.e;
import ax.k4.i;
import java.util.Queue;

public class l<A, B> {
    private final e<b<A>, B> a;

    public l(int n8) {
        this.a = new e<b<A>, B>(this, n8){
            final l e;
            {
                this.e = l8;
                super(n8);
            }

            protected void n(b<A> b8, B b9) {
                b8.c();
            }
        };
    }

    public B a(A object, int n8, int n9) {
        b<A> b8 = b.a(object, n8, n9);
        object = this.a.g(b8);
        b8.c();
        return (B)object;
    }

    public void b(A object, int n8, int n9, B b8) {
        object = b.a(object, n8, n9);
        this.a.k((b<A>)object, b8);
    }

    static final class b<A> {
        private static final Queue<b<?>> d = i.e(0);
        private int a;
        private int b;
        private A c;

        private b() {
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        static <A> b<A> a(A a8, int n8, int n9) {
            b<?> b8;
            b<A> b9 = d;
            synchronized (b9) {
                b8 = b9.poll();
            }
            b9 = b8;
            if (b8 == null) {
                b9 = new b<A>();
            }
            super.b(a8, n8, n9);
            return b9;
        }

        private void b(A a8, int n8, int n9) {
            this.c = a8;
            this.b = n8;
            this.a = n9;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void c() {
            Queue<b<?>> queue = d;
            synchronized (queue) {
                queue.offer(this);
                return;
            }
        }

        public boolean equals(Object object) {
            if (object instanceof b) {
                object = (b)object;
                if (this.b == ((b)object).b && this.a == ((b)object).a && this.c.equals(((b)object).c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.a * 31 + this.b) * 31 + this.c.hashCode();
        }
    }
}

