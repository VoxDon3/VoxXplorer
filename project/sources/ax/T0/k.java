package ax.T0;

import ax.S0.C0968a;
import ax.S0.G;
import ax.S0.d0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class k {
    private final b a;
    private final ArrayDeque<G> b = new ArrayDeque<>();
    private final ArrayDeque<a> c = new ArrayDeque<>();
    private final PriorityQueue<a> d = new PriorityQueue<>();
    private int e = -1;
    private a f;

    private static final class a implements Comparable<a> {
        public long c0 = -9223372036854775807L;
        public final List<G> q = new ArrayList();

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.c0, aVar.c0);
        }

        public void h(long j, G g) {
            C0968a.a(j != -9223372036854775807L);
            C0968a.g(this.q.isEmpty());
            this.c0 = j;
            this.q.add(g);
        }
    }

    public interface b {
        void a(long j, G g);
    }

    public k(b bVar) {
        this.a = bVar;
    }

    private G c(G g) {
        G g2 = this.b.isEmpty() ? new G() : this.b.pop();
        g2.X(g.a());
        System.arraycopy(g.f(), g.g(), g2.f(), 0, g2.a());
        return g2;
    }

    private void e(int i) {
        while (this.d.size() > i) {
            a aVar = (a) d0.i(this.d.poll());
            for (int i2 = 0; i2 < aVar.q.size(); i2++) {
                this.a.a(aVar.c0, aVar.q.get(i2));
                this.b.push(aVar.q.get(i2));
            }
            aVar.q.clear();
            a aVar2 = this.f;
            if (aVar2 != null && aVar2.c0 == aVar.c0) {
                this.f = null;
            }
            this.c.push(aVar);
        }
    }

    public void a(long j, G g) {
        int i = this.e;
        if (i == 0 || (i != -1 && this.d.size() >= this.e && j < ((a) d0.i(this.d.peek())).c0)) {
            this.a.a(j, g);
            return;
        }
        G c = c(g);
        a aVar = this.f;
        if (aVar != null && j == aVar.c0) {
            aVar.q.add(c);
            return;
        }
        a aVar2 = this.c.isEmpty() ? new a() : this.c.pop();
        aVar2.h(j, c);
        this.d.add(aVar2);
        this.f = aVar2;
        int i2 = this.e;
        if (i2 != -1) {
            e(i2);
        }
    }

    public void b() {
        this.d.clear();
    }

    public void d() {
        e(0);
    }

    public int f() {
        return this.e;
    }

    public void g(int i) {
        C0968a.g(i >= 0);
        this.e = i;
        e(i);
    }
}
