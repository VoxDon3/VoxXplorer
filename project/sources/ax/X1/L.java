package ax.X1;

import android.util.SparseArray;
import ax.q1.InterfaceC2859t;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public interface L {

    public static final class a {
        public final String a;
        public final int b;
        public final byte[] c;

        public a(String str, int i, byte[] bArr) {
            this.a = str;
            this.b = i;
            this.c = bArr;
        }
    }

    public static final class b {
        public final int a;
        public final String b;
        public final int c;
        public final List<a> d;
        public final byte[] e;

        public b(int i, String str, int i2, List<a> list, byte[] bArr) {
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list);
            this.e = bArr;
        }

        public int a() {
            int i = this.c;
            if (i != 2) {
                return i != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    public interface c {
        SparseArray<L> a();

        L b(int i, b bVar);
    }

    public static final class d {
        private final String a;
        private final int b;
        private final int c;
        private int d;
        private String e;

        public d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        private void d() {
            if (this.d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i = this.d;
            this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
            this.e = this.a + this.d;
        }

        public String b() {
            d();
            return this.e;
        }

        public int c() {
            d();
            return this.d;
        }

        public d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            this.a = str;
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
            this.e = HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    void a(ax.S0.M m, InterfaceC2859t interfaceC2859t, d dVar);

    void b();

    void c(ax.S0.G g, int i) throws ax.P0.E;
}
