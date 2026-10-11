package ax.T4;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class g implements Closeable, Flushable, AutoCloseable {
    protected static final ax.b5.h<t> c0;
    protected static final ax.b5.h<t> d0;
    protected static final ax.b5.h<t> e0;
    protected o q;

    public enum a {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false),
        USE_FAST_DOUBLE_WRITER(false),
        WRITE_HEX_UPPER_CASE(true);

        private final int c0 = 1 << ordinal();
        private final boolean q;

        a(boolean z) {
            this.q = z;
        }

        public static int d() {
            int i = 0;
            for (a aVar : values()) {
                if (aVar.h()) {
                    i |= aVar.l();
                }
            }
            return i;
        }

        public boolean h() {
            return this.q;
        }

        public boolean j(int i) {
            return (i & this.c0) != 0;
        }

        public int l() {
            return this.c0;
        }
    }

    static {
        ax.b5.h<t> a2 = ax.b5.h.a(t.values());
        c0 = a2;
        d0 = a2.b(t.CAN_WRITE_FORMATTED_NUMBERS);
        e0 = a2.b(t.CAN_WRITE_BINARY_NATIVELY);
    }

    protected g() {
    }

    public abstract void A(char c) throws IOException;

    public void F(p pVar) throws IOException {
        H(pVar.getValue());
    }

    public abstract void H(String str) throws IOException;

    public abstract void L(char[] cArr, int i, int i2) throws IOException;

    public abstract void W() throws IOException;

    protected void a(String str) throws f {
        throw new f(str, this);
    }

    protected final void b() {
        ax.b5.n.a();
    }

    public o c() {
        return this.q;
    }

    @Deprecated
    public void d0(int i) throws IOException {
        W();
    }

    public g e(o oVar) {
        this.q = oVar;
        return this;
    }

    public abstract g f();

    @Override // java.io.Flushable
    public abstract void flush() throws IOException;

    public abstract void g(boolean z) throws IOException;

    public abstract void j() throws IOException;

    public abstract void m() throws IOException;

    public abstract void o(String str) throws IOException;

    public abstract void o0() throws IOException;

    public abstract void p() throws IOException;

    public abstract void q(double d) throws IOException;

    public abstract void s0(String str) throws IOException;

    public abstract void u(long j) throws IOException;

    public void u0(String str, String str2) throws IOException {
        o(str);
        s0(str2);
    }

    public void v(String str, long j) throws IOException {
        o(str);
        u(j);
    }

    public g d(int i) {
        return this;
    }
}
