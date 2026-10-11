/*
 * Decompiled with CFR 0.152.
 */
package ax.T0;

import ax.S0.G;
import ax.S0.d0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public final class k {
    private final b a;
    private final ArrayDeque<G> b;
    private final ArrayDeque<a> c;
    private final PriorityQueue<a> d;
    private int e;
    private a f;

    public k(b b8) {
        this.a = b8;
        this.b = new ArrayDeque();
        this.c = new ArrayDeque();
        this.d = new PriorityQueue();
        this.e = -1;
    }

    private G c(G g8) {
        G g9 = this.b.isEmpty() ? new G() : this.b.pop();
        g9.X(g8.a());
        System.arraycopy(g8.f(), g8.g(), g9.f(), 0, g9.a());
        return g9;
    }

    private void e(int n8) {
        while (this.d.size() > n8) {
            a a8 = d0.i(this.d.poll());
            for (int i8 = 0; i8 < a8.q.size(); ++i8) {
                this.a.a(a8.c0, a8.q.get(i8));
                this.b.push(a8.q.get(i8));
            }
            a8.q.clear();
            a a9 = this.f;
            if (a9 != null && a9.c0 == a8.c0) {
                this.f = null;
            }
            this.c.push(a8);
        }
    }

    public void a(long l8, G object) {
        int n8 = this.e;
        if (n8 != 0 && (n8 == -1 || this.d.size() < this.e || l8 >= d0.i(this.d.peek()).c0)) {
            G g8 = this.c((G)object);
            object = this.f;
            if (object != null && l8 == ((a)object).c0) {
                ((a)object).q.add(g8);
                return;
            }
            object = this.c.isEmpty() ? new a() : this.c.pop();
            ((a)object).h(l8, g8);
            this.d.add((a)object);
            this.f = object;
            n8 = this.e;
            if (n8 != -1) {
                this.e(n8);
            }
            return;
        }
        this.a.a(l8, (G)object);
    }

    public void b() {
        this.d.clear();
    }

    public void d() {
        this.e(0);
    }

    public int f() {
        return this.e;
    }

    public void g(int n8) {
        boolean bl = n8 >= 0;
        ax.S0.a.g(bl);
        this.e = n8;
        this.e(n8);
    }

    private static final class a
    implements Comparable<a> {
        public long c0 = -9223372036854775807L;
        public final List<G> q = new ArrayList<G>();

        public int d(a a8) {
            return Long.compare(this.c0, a8.c0);
        }

        public void h(long l8, G g8) {
            boolean bl = l8 != -9223372036854775807L;
            ax.S0.a.a(bl);
            ax.S0.a.g(this.q.isEmpty());
            this.c0 = l8;
            this.q.add(g8);
        }
    }

    public static interface b {
        public void a(long var1, G var3);
    }
}

