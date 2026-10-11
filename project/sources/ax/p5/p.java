package ax.p5;

import android.util.Base64;
import ax.p5.d;
import com.google.auto.value.AutoValue;
import okhttp3.HttpUrl;

@AutoValue
/* loaded from: classes.dex */
public abstract class p {

    @AutoValue.Builder
    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(ax.n5.e eVar);
    }

    public static a a() {
        return new d.b().d(ax.n5.e.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract ax.n5.e d();

    public boolean e() {
        return c() != null;
    }

    public p f(ax.n5.e eVar) {
        return a().b(b()).d(eVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? HttpUrl.FRAGMENT_ENCODE_SET : Base64.encodeToString(c(), 2));
    }
}
