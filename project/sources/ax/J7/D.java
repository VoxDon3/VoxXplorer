package ax.J7;

import com.google.auto.value.AutoValue;

/* loaded from: classes3.dex */
public interface D {

    @AutoValue
    public static abstract class a {
        static a a(String str, B b) {
            return new C0758c(str, b.b(), b.a());
        }

        public static a b(String str) {
            return new C0758c(str, null, null);
        }

        public abstract String c();

        public abstract String d();

        public abstract String e();
    }

    a a();
}
