/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.G7.f;
import ax.L7.B;
import ax.L7.C;
import ax.L7.D;
import ax.L7.E;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class G {
    public static G b(a a8, c c8, b b8) {
        return new B(a8, c8, b8);
    }

    public abstract a a();

    public abstract b c();

    public abstract c d();

    @AutoValue
    public static abstract class a {
        public static a b(String string, String string2, String string3, String string4, int n8, f f8) {
            return new C(string, string2, string3, string4, n8, f8);
        }

        public abstract String a();

        public abstract int c();

        public abstract f d();

        public abstract String e();

        public abstract String f();

        public abstract String g();
    }

    @AutoValue
    public static abstract class b {
        public static b c(int n8, String string, int n9, long l8, long l9, boolean bl, int n10, String string2, String string3) {
            return new D(n8, string, n9, l8, l9, bl, n10, string2, string3);
        }

        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract String f();

        public abstract String g();

        public abstract String h();

        public abstract int i();

        public abstract long j();
    }

    @AutoValue
    public static abstract class c {
        public static c a(String string, String string2, boolean bl) {
            return new E(string, string2, bl);
        }

        public abstract boolean b();

        public abstract String c();

        public abstract String d();
    }
}

