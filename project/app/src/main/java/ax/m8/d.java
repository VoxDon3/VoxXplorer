/*
 * Decompiled with CFR 0.152.
 */
package ax.m8;

import ax.m8.b;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class d {
    public static final ax.U7.a a = new ax.W7.d().j(ax.m8.a.a).i();

    public static a a() {
        return new b.b();
    }

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract long e();

    public abstract String f();

    @AutoValue.Builder
    public static abstract class a {
        public abstract d a();

        public abstract a b(String var1);

        public abstract a c(String var1);

        public abstract a d(String var1);

        public abstract a e(long var1);

        public abstract a f(String var1);
    }
}

