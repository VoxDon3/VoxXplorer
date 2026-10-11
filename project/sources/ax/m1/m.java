package ax.m1;

import ax.S0.C0968a;
import ax.i1.C2205B;
import ax.i1.C2234y;
import java.io.IOException;

/* loaded from: classes.dex */
public interface m {

    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public boolean a(int i) {
            return i == 1 ? this.a - this.b > 1 : this.c - this.d > 1;
        }
    }

    public static final class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            C0968a.a(j >= 0);
            this.a = i;
            this.b = j;
        }
    }

    public static final class c {
        public final C2234y a;
        public final C2205B b;
        public final IOException c;
        public final int d;

        public c(C2234y c2234y, C2205B c2205b, IOException iOException, int i) {
            this.a = c2234y;
            this.b = c2205b;
            this.c = iOException;
            this.d = i;
        }
    }

    void a(long j);

    long b(c cVar);

    int c(int i);

    b d(a aVar, c cVar);
}
