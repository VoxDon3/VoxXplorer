package ax.e6;

import android.os.Bundle;
import ax.b6.W0;
import ax.f6.InterfaceC2072t;
import java.util.List;
import java.util.Map;

/* renamed from: ax.e6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1982a {
    private final W0 a;

    /* renamed from: ax.e6.a$a, reason: collision with other inner class name */
    public interface InterfaceC0296a extends InterfaceC2072t {
    }

    public C1982a(W0 w0) {
        this.a = w0;
    }

    public void a(String str, String str2, Bundle bundle) {
        this.a.t(str, str2, bundle);
    }

    public List<Bundle> b(String str, String str2) {
        return this.a.g(str, str2);
    }

    public int c(String str) {
        return this.a.a(str);
    }

    public Map<String, Object> d(String str, String str2, boolean z) {
        return this.a.h(str, str2, z);
    }

    public void e(String str, String str2, Bundle bundle) {
        this.a.C(str, str2, bundle);
    }

    public void f(InterfaceC0296a interfaceC0296a) {
        this.a.p(interfaceC0296a);
    }

    public void g(Bundle bundle) {
        this.a.k(bundle);
    }

    public final void h(boolean z) {
        this.a.w(z);
    }
}
