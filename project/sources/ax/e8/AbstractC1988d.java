package ax.e8;

import ax.e8.C1985a;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: ax.e8.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1988d {

    @AutoValue.Builder
    /* renamed from: ax.e8.d$a */
    public static abstract class a {
        public abstract AbstractC1988d a();

        public abstract a b(AbstractC1990f abstractC1990f);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(b bVar);

        public abstract a f(String str);
    }

    /* renamed from: ax.e8.d$b */
    public enum b {
        OK,
        BAD_CONFIG
    }

    public static a a() {
        return new C1985a.b();
    }

    public abstract AbstractC1990f b();

    public abstract String c();

    public abstract String d();

    public abstract b e();

    public abstract String f();
}
