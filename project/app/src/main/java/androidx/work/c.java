/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.b;
import ax.B2.u;
import ax.v7.e;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class c {
    private Context a;
    private WorkerParameters b;
    private volatile boolean c;
    private boolean d;

    public c(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.a = context;
                this.b = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    public final Context a() {
        return this.a;
    }

    public Executor c() {
        return this.b.a();
    }

    public e<ax.B2.e> d() {
        ax.M2.c<ax.B2.e> c8 = ax.M2.c.t();
        c8.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return c8;
    }

    public final UUID e() {
        return this.b.c();
    }

    public final b g() {
        return this.b.d();
    }

    public u h() {
        return this.b.e();
    }

    public final boolean i() {
        return this.c;
    }

    public final boolean j() {
        return this.d;
    }

    public void k() {
    }

    public final void l() {
        this.d = true;
    }

    public abstract e<a> m();

    public final void n() {
        this.c = true;
        this.k();
    }

    public static abstract class androidx.work.c$a {
        androidx.work.c$a() {
        }

        public static androidx.work.c$a a() {
            return new a();
        }

        public static androidx.work.c$a b() {
            return new b();
        }

        public static androidx.work.c$a c() {
            return new c();
        }

        public static androidx.work.c$a d(androidx.work.b b8) {
            return new c(b8);
        }

        public static final class a
        extends androidx.work.c$a {
            private final androidx.work.b a;

            public a() {
                this(androidx.work.b.c);
            }

            public a(androidx.work.b b8) {
                this.a = b8;
            }

            public androidx.work.b e() {
                return this.a;
            }

            public boolean equals(Object object) {
                if (this == object) {
                    return true;
                }
                if (object != null && a.class == object.getClass()) {
                    object = (a)object;
                    return this.a.equals(((a)object).a);
                }
                return false;
            }

            public int hashCode() {
                return a.class.getName().hashCode() * 31 + this.a.hashCode();
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failure {mOutputData=");
                stringBuilder.append(this.a);
                stringBuilder.append('}');
                return stringBuilder.toString();
            }
        }

        public static final class b
        extends androidx.work.c$a {
            public boolean equals(Object object) {
                if (this == object) {
                    return true;
                }
                return object != null && b.class == object.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c
        extends androidx.work.c$a {
            private final androidx.work.b a;

            public c() {
                this(androidx.work.b.c);
            }

            public c(androidx.work.b b8) {
                this.a = b8;
            }

            public androidx.work.b e() {
                return this.a;
            }

            public boolean equals(Object object) {
                if (this == object) {
                    return true;
                }
                if (object != null && c.class == object.getClass()) {
                    object = (c)object;
                    return this.a.equals(((c)object).a);
                }
                return false;
            }

            public int hashCode() {
                return c.class.getName().hashCode() * 31 + this.a.hashCode();
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Success {mOutputData=");
                stringBuilder.append(this.a);
                stringBuilder.append('}');
                return stringBuilder.toString();
            }
        }
    }
}

