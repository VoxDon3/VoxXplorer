package ax.q5;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class g {

    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static g a() {
        return new C2870b(a.FATAL_ERROR, -1L);
    }

    public static g d() {
        return new C2870b(a.INVALID_PAYLOAD, -1L);
    }

    public static g e(long j) {
        return new C2870b(a.OK, j);
    }

    public static g f() {
        return new C2870b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
