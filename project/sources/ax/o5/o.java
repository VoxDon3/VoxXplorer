package ax.o5;

import ax.o5.C2727e;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class o {

    @AutoValue.Builder
    public static abstract class a {
        public abstract o a();

        public abstract a b(AbstractC2723a abstractC2723a);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int q;

        b(int i) {
            this.q = i;
        }
    }

    public static a a() {
        return new C2727e.b();
    }

    public abstract AbstractC2723a b();

    public abstract b c();
}
