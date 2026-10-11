package ax.a6;

import android.os.Handler;
import android.webkit.WebView;
import j$.util.Objects;

/* renamed from: ax.a6.N, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1384N extends WebView {
    private final Handler a;
    private final V b;
    private boolean c;

    public C1384N(C1386P c1386p, Handler handler, V v) {
        super(c1386p);
        this.c = false;
        this.a = handler;
        this.b = v;
    }

    static /* bridge */ /* synthetic */ boolean f(C1384N c1384n, String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void c() {
        final V v = this.b;
        Objects.requireNonNull(v);
        this.a.post(new Runnable() { // from class: ax.a6.K
            @Override // java.lang.Runnable
            public final void run() {
                V.this.d();
            }
        });
    }

    public final void d(String str, String str2) {
        final String str3 = str + "(" + str2 + ");";
        this.a.post(new Runnable() { // from class: ax.a6.J
            @Override // java.lang.Runnable
            public final void run() {
                C1394d0.a(C1384N.this, str3);
            }
        });
    }
}
