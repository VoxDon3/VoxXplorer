package ax.T0;

import ax.S0.G;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class e {
    public final int a;

    public static final class b extends e {
        public final long b;
        public final List<c> c;
        public final List<b> d;

        public b(int i, long j) {
            super(i);
            this.b = j;
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        public void b(b bVar) {
            this.d.add(bVar);
        }

        public void c(c cVar) {
            this.c.add(cVar);
        }

        public b d(int i) {
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = this.d.get(i2);
                if (bVar.a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public c e(int i) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                c cVar = this.c.get(i2);
                if (cVar.a == i) {
                    return cVar;
                }
            }
            return null;
        }

        @Override // ax.T0.e
        public String toString() {
            return e.a(this.a) + " leaves: " + Arrays.toString(this.c.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
        }
    }

    public static final class c extends e {
        public final G b;

        public c(int i, G g) {
            super(i);
            this.b = g;
        }
    }

    public static String a(int i) {
        return HttpUrl.FRAGMENT_ENCODE_SET + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public String toString() {
        return a(this.a);
    }

    private e(int i) {
        this.a = i;
    }
}
