package ax.q1;

import ax.P0.C0912v;
import ax.P0.InterfaceC0902k;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public interface U {

    public static final class a {
        public final int a;
        public final byte[] b;
        public final int c;
        public final int d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.a = i;
            this.b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.b, aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
        }
    }

    int a(InterfaceC0902k interfaceC0902k, int i, boolean z) throws IOException;

    void b(ax.S0.G g, int i, int i2);

    int c(InterfaceC0902k interfaceC0902k, int i, boolean z, int i2) throws IOException;

    void d(long j);

    void e(C0912v c0912v);

    void f(long j, int i, int i2, int i3, a aVar);

    void g(ax.S0.G g, int i);
}
