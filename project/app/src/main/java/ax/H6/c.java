/*
 * Decompiled with CFR 0.152.
 */
package ax.H6;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import ax.H6.e;
import ax.n.s;
import ax.n.u;

public final class c {
    private final d a = ax.H6.c.a();
    private final ax.H6.b b;
    private final View c;

    public c(ax.H6.b b8, View view) {
        this.b = b8;
        this.c = view;
    }

    private static d a() {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 34) {
            return new c();
        }
        if (n8 >= 33) {
            return new b();
        }
        return null;
    }

    private void c(boolean bl) {
        d d8 = this.a;
        if (d8 != null) {
            d8.b(this.b, this.c, bl);
        }
    }

    public void b() {
        this.c(false);
    }

    public void d() {
        d d8 = this.a;
        if (d8 != null) {
            d8.a(this.c);
        }
    }

    private static class b
    implements d {
        private OnBackInvokedCallback a;

        private b() {
        }

        @Override
        public void a(View view) {
            if (this.a == null || (view = ax.H6.d.a(view)) == null) {
                return;
            }
            s.a((OnBackInvokedDispatcher)view, this.a);
            this.a = null;
        }

        @Override
        public void b(ax.H6.b b8, View view, boolean bl) {
            if (this.a != null || (view = ax.H6.d.a(view)) == null) {
                return;
            }
            b8 = this.c(b8);
            this.a = b8;
            int n8 = bl ? 1000000 : 0;
            u.a((OnBackInvokedDispatcher)view, n8, (OnBackInvokedCallback)b8);
        }

        OnBackInvokedCallback c(ax.H6.b b8) {
            j.Objects.requireNonNull((Object)b8);
            return new e(b8);
        }

        boolean d() {
            return this.a != null;
        }
    }

    private static class c
    extends b {
        private c() {
        }

        @Override
        OnBackInvokedCallback c(ax.H6.b b8) {
            return new OnBackAnimationCallback(){
                final ax.H6.b a;
                final c b;
                {
                    this.b = c8;
                    this.a = b8;
                }

                public void onBackCancelled() {
                    if (!this.b.d()) {
                        return;
                    }
                    this.a.d();
                }

                public void onBackInvoked() {
                    this.a.c();
                }

                public void onBackProgressed(BackEvent backEvent) {
                    if (!this.b.d()) {
                        return;
                    }
                    this.a.b(new ax.i.b(backEvent));
                }

                public void onBackStarted(BackEvent backEvent) {
                    if (!this.b.d()) {
                        return;
                    }
                    this.a.a(new ax.i.b(backEvent));
                }
            };
        }
    }

    private static interface d {
        public void a(View var1);

        public void b(ax.H6.b var1, View var2, boolean var3);
    }
}

