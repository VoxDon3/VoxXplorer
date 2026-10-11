/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import ax.a6.J;
import ax.a6.K;
import ax.a6.P;
import ax.a6.V;

public final class N
extends WebView {
    private final Handler a;
    private final V b;
    private boolean c = false;

    public N(P p8, Handler handler, V v8) {
        super((Context)p8);
        this.a = handler;
        this.b = v8;
    }

    static /* bridge */ /* synthetic */ V a(N n8) {
        return n8.b;
    }

    static /* bridge */ /* synthetic */ void b(N n8, boolean bl) {
        n8.c = true;
    }

    static /* bridge */ /* synthetic */ boolean e(N n8) {
        return n8.c;
    }

    static /* bridge */ /* synthetic */ boolean f(N n8, String string) {
        return string != null && string.startsWith("consent://");
    }

    public final void c() {
        Object object = this.b;
        j.Objects.requireNonNull((Object)object);
        object = new K((V)object);
        this.a.post((Runnable)object);
    }

    public final void d(String object, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append("(");
        stringBuilder.append(string);
        stringBuilder.append(");");
        object = new J(this, stringBuilder.toString());
        this.a.post((Runnable)object);
    }
}

