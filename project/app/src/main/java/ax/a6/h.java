/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.app.Application;
import ax.a6.A0;
import ax.a6.a;
import ax.a6.g;
import ax.a6.k;

final class h {
    private Application a;

    /* synthetic */ h(k k8) {
    }

    public final a a() {
        A0.b(this.a, Application.class);
        return new g(this.a);
    }

    public final h b(Application application) {
        application.getClass();
        this.a = application;
        return this;
    }
}

