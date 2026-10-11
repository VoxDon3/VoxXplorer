package ax.a6;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import ax.Y6.b;
import ax.Y6.f;
import ax.c0.C1787r0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: ax.a6.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1373C implements ax.Y6.b {
    private final Application a;
    private final C1386P b;
    private final C1417p c;
    private final C1379I d;
    private final C0 e;
    private Dialog f;
    private C1384N g;
    private final AtomicBoolean h = new AtomicBoolean();
    private final AtomicReference i = new AtomicReference();
    private final AtomicReference j = new AtomicReference();
    private final AtomicReference k = new AtomicReference();
    boolean l = false;

    public C1373C(Application application, C1391c c1391c, C1386P c1386p, C1417p c1417p, C1379I c1379i, C0 c0) {
        this.a = application;
        this.b = c1386p;
        this.c = c1417p;
        this.d = c1379i;
        this.e = c0;
    }

    private final void l() {
        Dialog dialog = this.f;
        if (dialog != null) {
            dialog.dismiss();
            this.f = null;
        }
        this.b.a(null);
        C1425y c1425y = (C1425y) this.k.getAndSet(null);
        if (c1425y != null) {
            c1425y.b();
        }
    }

    @Override // ax.Y6.b
    public final void a(Activity activity, b.a aVar) {
        C1392c0.a();
        if (!this.h.compareAndSet(false, true)) {
            aVar.a(new F0(3, true != this.l ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").a());
            return;
        }
        this.g.c();
        C1425y c1425y = new C1425y(this, activity);
        this.a.registerActivityLifecycleCallbacks(c1425y);
        this.k.set(c1425y);
        this.b.a(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.g);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            aVar.a(new F0(3, "Activity with null windows is passed in.").a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        C1787r0.b(window, false);
        this.j.set(aVar);
        dialog.show();
        this.f = dialog;
        this.g.d("UMP_messagePresented", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    final C1384N d() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void g(f.b bVar, f.a aVar) {
        C1384N a = ((C1385O) this.e).a();
        this.g = a;
        a.setBackgroundColor(0);
        a.getSettings().setJavaScriptEnabled(true);
        a.getSettings().setAllowFileAccess(false);
        a.getSettings().setAllowContentAccess(false);
        a.setWebViewClient(new C1382L(a, null));
        this.i.set(new C1371A(bVar, aVar, 0 == true ? 1 : 0));
        C1384N c1384n = this.g;
        C1379I c1379i = this.d;
        c1384n.loadDataWithBaseURL(c1379i.a(), c1379i.b(), "text/html", "UTF-8", null);
        C1392c0.a.postDelayed(new Runnable() { // from class: ax.a6.x
            @Override // java.lang.Runnable
            public final void run() {
                C1373C.this.k(new F0(4, "Web view timed out."));
            }
        }, 10000L);
    }

    final void h(int i) {
        l();
        b.a aVar = (b.a) this.j.getAndSet(null);
        if (aVar == null) {
            return;
        }
        this.c.e(i);
        aVar.a(null);
    }

    final void i(F0 f0) {
        l();
        b.a aVar = (b.a) this.j.getAndSet(null);
        if (aVar == null) {
            return;
        }
        aVar.a(f0.a());
    }

    final void j() {
        C1371A c1371a = (C1371A) this.i.getAndSet(null);
        if (c1371a == null) {
            return;
        }
        c1371a.a(this);
    }

    final void k(F0 f0) {
        C1371A c1371a = (C1371A) this.i.getAndSet(null);
        if (c1371a == null) {
            return;
        }
        c1371a.b(f0.a());
    }
}
