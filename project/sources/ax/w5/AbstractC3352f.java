package ax.w5;

import android.app.job.JobInfo;
import ax.w5.C3349c;
import ax.z5.InterfaceC3550a;
import com.google.auto.value.AutoValue;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AutoValue
/* renamed from: ax.w5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3352f {

    /* renamed from: ax.w5.f$a */
    public static class a {
        private InterfaceC3550a a;
        private Map<ax.n5.e, b> b = new HashMap();

        public a a(ax.n5.e eVar, b bVar) {
            this.b.put(eVar, bVar);
            return this;
        }

        public AbstractC3352f b() {
            if (this.a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.b.keySet().size() < ax.n5.e.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<ax.n5.e, b> map = this.b;
            this.b = new HashMap();
            return AbstractC3352f.d(this.a, map);
        }

        public a c(InterfaceC3550a interfaceC3550a) {
            this.a = interfaceC3550a;
            return this;
        }
    }

    @AutoValue
    /* renamed from: ax.w5.f$b */
    public static abstract class b {

        @AutoValue.Builder
        /* renamed from: ax.w5.f$b$a */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j);

            public abstract a c(Set<c> set);

            public abstract a d(long j);
        }

        public static a a() {
            return new C3349c.b().c(Collections.EMPTY_SET);
        }

        abstract long b();

        abstract Set<c> c();

        abstract long d();
    }

    /* renamed from: ax.w5.f$c */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i, long j) {
        return (long) (Math.pow(3.0d, i - 1) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * r7)));
    }

    public static a b() {
        return new a();
    }

    static AbstractC3352f d(InterfaceC3550a interfaceC3550a, Map<ax.n5.e, b> map) {
        return new C3348b(interfaceC3550a, map);
    }

    public static AbstractC3352f f(InterfaceC3550a interfaceC3550a) {
        return b().a(ax.n5.e.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(ax.n5.e.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(ax.n5.e.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(interfaceC3550a).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, ax.n5.e eVar, long j, int i) {
        builder.setMinimumLatency(g(eVar, j, i));
        j(builder, h().get(eVar).c());
        return builder;
    }

    abstract InterfaceC3550a e();

    public long g(ax.n5.e eVar, long j, int i) {
        long a2 = j - e().a();
        b bVar = h().get(eVar);
        return Math.min(Math.max(a(i, bVar.b()), a2), bVar.d());
    }

    abstract Map<ax.n5.e, b> h();
}
