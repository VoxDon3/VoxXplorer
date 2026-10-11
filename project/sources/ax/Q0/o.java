package ax.Q0;

import ax.P0.C0912v;
import ax.S0.d0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface o {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {
        public static final a e = new a(-1, -1, -1);
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(C0912v c0912v) {
            this(c0912v.H, c0912v.G, c0912v.I);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.a + ", channelCount=" + this.b + ", encoding=" + this.c + ']';
        }

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = d0.L0(i3) ? d0.m0(i3, i2) : -1;
        }
    }

    public static final class b extends Exception {
        public final a q;

        public b(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public b(String str, a aVar) {
            super(str + " " + aVar);
            this.q = aVar;
        }
    }

    void a();

    ByteBuffer b();

    boolean c();

    void d(ByteBuffer byteBuffer);

    boolean e();

    void f();

    void flush();

    a g(a aVar) throws b;
}
