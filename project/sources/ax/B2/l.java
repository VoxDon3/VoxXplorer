package ax.B2;

import android.annotation.SuppressLint;

/* loaded from: classes.dex */
public interface l {

    @SuppressLint({"SyntheticAccessor"})
    public static final b.c a;

    @SuppressLint({"SyntheticAccessor"})
    public static final b.C0055b b;

    public static abstract class b {

        public static final class a extends b {
            private final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public Throwable a() {
                return this.a;
            }

            public String toString() {
                return "FAILURE (" + this.a.getMessage() + ")";
            }
        }

        /* renamed from: ax.B2.l$b$b, reason: collision with other inner class name */
        public static final class C0055b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0055b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        a = new b.c();
        b = new b.C0055b();
    }
}
