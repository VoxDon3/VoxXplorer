/*
 * Decompiled with CFR 0.152.
 */
package ax.B2;

import android.annotation.SuppressLint;

public interface l {
    @SuppressLint(value={"SyntheticAccessor"})
    public static final b.c a = new b.c();
    @SuppressLint(value={"SyntheticAccessor"})
    public static final b.b b = new b.b();

    public static abstract class ax.B2.l$b {
        ax.B2.l$b() {
        }

        public static final class a
        extends ax.B2.l$b {
            private final Throwable a;

            public a(Throwable throwable) {
                this.a = throwable;
            }

            public Throwable a() {
                return this.a;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("FAILURE (");
                stringBuilder.append(this.a.getMessage());
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        public static final class b
        extends ax.B2.l$b {
            private b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c
        extends ax.B2.l$b {
            private c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }
    }
}

