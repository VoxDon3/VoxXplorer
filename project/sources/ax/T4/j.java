package ax.T4;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class j implements Closeable, AutoCloseable {
    protected static final ax.b5.h<q> c0 = ax.b5.h.a(q.values());
    protected int q;

    public enum a {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true),
        USE_FAST_DOUBLE_PARSER(false),
        USE_FAST_BIG_NUMBER_PARSER(false);

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

    protected j() {
        this.q = e.m0;
    }

    public boolean A(a aVar) {
        return aVar.j(this.q);
    }

    public boolean F(s sVar) {
        return sVar.j().j(this.q);
    }

    public abstract m H() throws IOException;

    public abstract j L() throws IOException;

    protected i a(String str) {
        return new i(this, str).c(null);
    }

    public m b() {
        return j();
    }

    public byte[] c() throws IOException {
        return d(b.a());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public abstract byte[] d(ax.T4.a aVar) throws IOException;

    public boolean e() throws IOException {
        m b = b();
        if (b == m.VALUE_TRUE) {
            return true;
        }
        if (b == m.VALUE_FALSE) {
            return false;
        }
        throw new i(this, String.format("Current token (%s) not of boolean type", b)).c(null);
    }

    public abstract h f();

    public abstract String g() throws IOException;

    public abstract m j();

    public abstract double m() throws IOException;

    public abstract float o() throws IOException;

    public abstract int p() throws IOException;

    public abstract long q() throws IOException;

    public abstract String u() throws IOException;

    public abstract h v();

    protected j(int i) {
        this.q = i;
    }
}
