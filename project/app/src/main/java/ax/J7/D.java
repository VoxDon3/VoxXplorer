/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import ax.J7.B;
import ax.J7.c;
import com.google.auto.value.AutoValue;

public interface D {
    public a a();

    @AutoValue
    public static abstract class a {
        static a a(String string, B b8) {
            return new c(string, b8.b(), b8.a());
        }

        public static a b(String string) {
            return new c(string, null, null);
        }

        public abstract String c();

        public abstract String d();

        public abstract String e();
    }
}

