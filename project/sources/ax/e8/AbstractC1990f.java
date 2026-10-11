package ax.e8;

import ax.e8.C1986b;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: ax.e8.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1990f {

    @AutoValue.Builder
    /* renamed from: ax.e8.f$a */
    public static abstract class a {
        public abstract AbstractC1990f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j);
    }

    /* renamed from: ax.e8.f$b */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new C1986b.C0299b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
