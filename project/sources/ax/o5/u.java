package ax.o5;

import ax.o5.k;
import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
/* loaded from: classes.dex */
public abstract class u {

    @AutoValue.Builder
    public static abstract class a {
        public abstract u a();

        public abstract a b(o oVar);

        public abstract a c(List<t> list);

        abstract a d(Integer num);

        abstract a e(String str);

        public abstract a f(x xVar);

        public abstract a g(long j);

        public abstract a h(long j);

        public a i(int i) {
            return d(Integer.valueOf(i));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new k.b();
    }

    public abstract o b();

    public abstract List<t> c();

    public abstract Integer d();

    public abstract String e();

    public abstract x f();

    public abstract long g();

    public abstract long h();
}
