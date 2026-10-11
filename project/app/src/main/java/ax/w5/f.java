/*
 * Decompiled with CFR 0.152.
 */
package ax.w5;

import android.app.job.JobInfo;
import ax.n5.e;
import ax.w5.c;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AutoValue
public abstract class f {
    private long a(int n8, long l8) {
        long l9 = l8 > 1L ? l8 : 2L;
        double d8 = Math.max(1.0, Math.log(10000.0) / Math.log(l9 * (long)(--n8)));
        return (long)(Math.pow(3.0, n8) * (double)l8 * d8);
    }

    public static a b() {
        return new a();
    }

    static f d(ax.z5.a a8, Map<e, b> map) {
        return new ax.w5.b(a8, map);
    }

    public static f f(ax.z5.a a8) {
        return f.b().a(e.q, b.a().b(30000L).d(86400000L).a()).a(e.d0, b.a().b(1000L).d(86400000L).a()).a(e.c0, b.a().b(86400000L).d(86400000L).c(f.i(c.c0)).a()).c(a8).b();
    }

    private static <T> Set<T> i(T ... TArray) {
        return java.util.DesugarCollections.unmodifiableSet(new HashSet<T>(Arrays.asList(TArray)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains((Object)c.q)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains((Object)c.d0)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains((Object)c.c0)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, e e8, long l8, int n8) {
        builder.setMinimumLatency(this.g(e8, l8, n8));
        this.j(builder, this.h().get((Object)e8).c());
        return builder;
    }

    abstract ax.z5.a e();

    public long g(e object, long l8, int n8) {
        long l9 = this.e().a();
        object = this.h().get(object);
        return Math.min(Math.max(this.a(n8, ((b)object).b()), l8 - l9), ((b)object).d());
    }

    abstract Map<e, b> h();

    public static class a {
        private ax.z5.a a;
        private Map<e, b> b = new HashMap<e, b>();

        public a a(e e8, b b8) {
            this.b.put(e8, b8);
            return this;
        }

        public f b() {
            if (this.a != null) {
                if (this.b.keySet().size() >= e.values().length) {
                    Map<e, b> map = this.b;
                    this.b = new HashMap<e, b>();
                    return f.d(this.a, map);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
            throw new NullPointerException("missing required property: clock");
        }

        public a c(ax.z5.a a8) {
            this.a = a8;
            return this;
        }
    }

    @AutoValue
    public static abstract class b {
        public static a a() {
            return new c.b().c(Collections.EMPTY_SET);
        }

        abstract long b();

        abstract Set<c> c();

        abstract long d();

        @AutoValue.Builder
        public static abstract class a {
            public abstract b a();

            public abstract a b(long var1);

            public abstract a c(Set<c> var1);

            public abstract a d(long var1);
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        private static final c[] e0;
        public static final /* enum */ c q;

        static {
            c c8;
            c c9;
            c c10;
            q = c10 = new c();
            c0 = c9 = new c();
            d0 = c8 = new c();
            e0 = new c[]{c10, c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])e0.clone();
        }
    }
}

