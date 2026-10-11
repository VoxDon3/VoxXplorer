package ax.o5;

import ax.o5.h;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class r {

    @AutoValue.Builder
    public static abstract class a {
        public abstract r a();

        public abstract a b(Integer num);
    }

    public static a a() {
        return new h.b();
    }

    public abstract Integer b();
}
