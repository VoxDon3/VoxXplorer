package ax.o5;

import ax.o5.g;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class q {

    @AutoValue.Builder
    public static abstract class a {
        public abstract q a();

        public abstract a b(byte[] bArr);

        public abstract a c(byte[] bArr);
    }

    public static a a() {
        return new g.b();
    }

    public abstract byte[] b();

    public abstract byte[] c();
}
