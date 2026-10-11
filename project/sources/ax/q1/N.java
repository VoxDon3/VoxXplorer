package ax.q1;

import ax.S0.C0968a;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public interface N {

    public static final class a {
        public final O a;
        public final O b;

        public a(O o) {
            this(o, o);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a.equals(aVar.a) && this.b.equals(aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.a);
            if (this.a.equals(this.b)) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str = ", " + this.b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public a(O o, O o2) {
            this.a = (O) C0968a.e(o);
            this.b = (O) C0968a.e(o2);
        }
    }

    public static class b implements N {
        private final long a;
        private final a b;

        public b(long j) {
            this(j, 0L);
        }

        @Override // ax.q1.N
        public boolean i() {
            return false;
        }

        @Override // ax.q1.N
        public a l(long j) {
            return this.b;
        }

        @Override // ax.q1.N
        public long n() {
            return this.a;
        }

        public b(long j, long j2) {
            this.a = j;
            this.b = new a(j2 == 0 ? O.c : new O(0L, j2));
        }
    }

    boolean i();

    a l(long j);

    long n();
}
