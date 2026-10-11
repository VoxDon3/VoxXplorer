package ax.s5;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: ax.s5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3051d {
    private static final C3051d c = new a().a();
    private final String a;
    private final List<C3050c> b;

    /* renamed from: ax.s5.d$a */
    public static final class a {
        private String a = HttpUrl.FRAGMENT_ENCODE_SET;
        private List<C3050c> b = new ArrayList();

        a() {
        }

        public C3051d a() {
            return new C3051d(this.a, DesugarCollections.unmodifiableList(this.b));
        }

        public a b(List<C3050c> list) {
            this.b = list;
            return this;
        }

        public a c(String str) {
            this.a = str;
            return this;
        }
    }

    C3051d(String str, List<C3050c> list) {
        this.a = str;
        this.b = list;
    }

    public static a c() {
        return new a();
    }

    @ax.X7.d(tag = 2)
    public List<C3050c> a() {
        return this.b;
    }

    @ax.X7.d(tag = 1)
    public String b() {
        return this.a;
    }
}
