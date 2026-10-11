package ax.F1;

import ax.F1.c;
import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.r7.AbstractC2980n;
import j$.util.Objects;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements C.a {
    public final List<a> a;

    public static final class a {
        public static final Comparator<a> d = new Comparator() { // from class: ax.F1.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i;
                i = AbstractC2980n.j().e(r1.a, r2.a).e(r1.b, r2.b).d(((c.a) obj).c, ((c.a) obj2).c).i();
                return i;
            }
        };
        public final long a;
        public final long b;
        public final int c;

        public a(long j, long j2, int i) {
            C0968a.a(j < j2);
            this.a = j;
            this.b = j2;
            this.c = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
        }

        public String toString() {
            return d0.G("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
        }
    }

    public c(List<a> list) {
        this.a = list;
        C0968a.a(!d(list));
    }

    private static boolean d(List<a> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).b;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).a < j) {
                return true;
            }
            j = list.get(i).b;
        }
        return false;
    }

    @Override // ax.P0.C.a
    public /* synthetic */ C0912v a() {
        return B.b(this);
    }

    @Override // ax.P0.C.a
    public /* synthetic */ void b(A.b bVar) {
        B.c(this, bVar);
    }

    @Override // ax.P0.C.a
    public /* synthetic */ byte[] c() {
        return B.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((c) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
