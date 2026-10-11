package ax.U3;

import java.util.Queue;

/* loaded from: classes.dex */
public class l<A, B> {
    private final ax.k4.e<b<A>, B> a;

    class a extends ax.k4.e<b<A>, B> {
        a(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.k4.e
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b<A> bVar, B b) {
            bVar.c();
        }
    }

    static final class b<A> {
        private static final Queue<b<?>> d = ax.k4.i.e(0);
        private int a;
        private int b;
        private A c;

        private b() {
        }

        static <A> b<A> a(A a, int i, int i2) {
            b<A> bVar;
            Queue<b<?>> queue = d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a, i, i2);
            return bVar;
        }

        private void b(A a, int i, int i2) {
            this.c = a;
            this.b = i;
            this.a = i2;
        }

        public void c() {
            Queue<b<?>> queue = d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.b == bVar.b && this.a == bVar.a && this.c.equals(bVar.c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
        }
    }

    public l(int i) {
        this.a = new a(i);
    }

    public B a(A a2, int i, int i2) {
        b<A> a3 = b.a(a2, i, i2);
        B g = this.a.g(a3);
        a3.c();
        return g;
    }

    public void b(A a2, int i, int i2, B b2) {
        this.a.k(b.a(a2, i, i2), b2);
    }
}
