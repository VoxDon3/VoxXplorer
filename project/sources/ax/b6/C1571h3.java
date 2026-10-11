package ax.b6;

import android.content.Context;
import android.net.Uri;
import ax.q7.InterfaceC2879f;
import okhttp3.HttpUrl;

/* renamed from: ax.b6.h3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1571h3 {
    final String a;
    final Uri b;
    final String c;
    final String d;
    final boolean e;
    final boolean f;
    private final boolean g;
    final boolean h;
    final InterfaceC2879f<Context, Boolean> i;

    public C1571h3(Uri uri) {
        this(null, uri, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, false, null);
    }

    public final Y2<Double> a(String str, double d) {
        return Y2.b(this, str, Double.valueOf(-3.0d), true);
    }

    public final Y2<Long> b(String str, long j) {
        return Y2.c(this, str, Long.valueOf(j), true);
    }

    public final Y2<String> c(String str, String str2) {
        return Y2.d(this, str, str2, true);
    }

    public final Y2<Boolean> d(String str, boolean z) {
        return Y2.a(this, str, Boolean.valueOf(z), true);
    }

    public final C1571h3 e() {
        return new C1571h3(this.a, this.b, this.c, this.d, this.e, this.f, true, this.h, this.i);
    }

    public final C1571h3 f() {
        if (!this.c.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        InterfaceC2879f<Context, Boolean> interfaceC2879f = this.i;
        if (interfaceC2879f == null) {
            return new C1571h3(this.a, this.b, this.c, this.d, true, this.f, this.g, this.h, interfaceC2879f);
        }
        throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }

    private C1571h3(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC2879f<Context, Boolean> interfaceC2879f) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = interfaceC2879f;
    }
}
