package ax.x5;

import ax.x5.C3441a;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: ax.x5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3445e {
    static final AbstractC3445e a = a().f(10485760).d(200).b(10000).c(604800000).e(81920).a();

    @AutoValue.Builder
    /* renamed from: ax.x5.e$a */
    static abstract class a {
        a() {
        }

        abstract AbstractC3445e a();

        abstract a b(int i);

        abstract a c(long j);

        abstract a d(int i);

        abstract a e(int i);

        abstract a f(long j);
    }

    AbstractC3445e() {
    }

    static a a() {
        return new C3441a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();
}
