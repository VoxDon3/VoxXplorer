package ax.a6;

import android.app.Application;

/* renamed from: ax.a6.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1401h {
    private Application a;

    /* synthetic */ C1401h(C1407k c1407k) {
    }

    public final AbstractC1387a a() {
        A0.b(this.a, Application.class);
        return new C1399g(this.a);
    }

    public final C1401h b(Application application) {
        application.getClass();
        this.a = application;
        return this;
    }
}
