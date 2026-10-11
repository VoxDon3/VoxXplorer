package ax.q5;

import ax.q5.C2869a;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class f {

    @AutoValue.Builder
    public static abstract class a {
        public abstract f a();

        public abstract a b(Iterable<ax.p5.i> iterable);

        public abstract a c(byte[] bArr);
    }

    public static a a() {
        return new C2869a.b();
    }

    public abstract Iterable<ax.p5.i> b();

    public abstract byte[] c();
}
