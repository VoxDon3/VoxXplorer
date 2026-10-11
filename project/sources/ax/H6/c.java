package ax.H6;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import ax.i.C2186b;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class c {
    private final d a = a();
    private final ax.H6.b b;
    private final View c;

    private static class b implements d {
        private OnBackInvokedCallback a;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
        
            r2 = r2.findOnBackInvokedDispatcher();
         */
        @Override // ax.H6.c.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(android.view.View r2) {
            /*
                r1 = this;
                android.window.OnBackInvokedCallback r0 = r1.a
                if (r0 != 0) goto L5
                goto Lb
            L5:
                android.window.OnBackInvokedDispatcher r2 = ax.H6.d.a(r2)
                if (r2 != 0) goto Lc
            Lb:
                return
            Lc:
                android.window.OnBackInvokedCallback r0 = r1.a
                ax.n.s.a(r2, r0)
                r2 = 0
                r1.a = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.H6.c.b.a(android.view.View):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
        
            r3 = r3.findOnBackInvokedDispatcher();
         */
        @Override // ax.H6.c.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b(ax.H6.b r2, android.view.View r3, boolean r4) {
            /*
                r1 = this;
                android.window.OnBackInvokedCallback r0 = r1.a
                if (r0 == 0) goto L5
                goto Lb
            L5:
                android.window.OnBackInvokedDispatcher r3 = ax.H6.d.a(r3)
                if (r3 != 0) goto Lc
            Lb:
                return
            Lc:
                android.window.OnBackInvokedCallback r2 = r1.c(r2)
                r1.a = r2
                if (r4 == 0) goto L18
                r4 = 1000000(0xf4240, float:1.401298E-39)
                goto L19
            L18:
                r4 = 0
            L19:
                ax.n.u.a(r3, r4, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.H6.c.b.b(ax.H6.b, android.view.View, boolean):void");
        }

        OnBackInvokedCallback c(final ax.H6.b bVar) {
            Objects.requireNonNull(bVar);
            return new OnBackInvokedCallback() { // from class: ax.H6.e
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    b.this.c();
                }
            };
        }

        boolean d() {
            return this.a != null;
        }
    }

    /* renamed from: ax.H6.c$c, reason: collision with other inner class name */
    private static class C0088c extends b {

        /* renamed from: ax.H6.c$c$a */
        class a implements OnBackAnimationCallback {
            final /* synthetic */ ax.H6.b a;

            a(ax.H6.b bVar) {
                this.a = bVar;
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackCancelled() {
                if (C0088c.this.d()) {
                    this.a.d();
                }
            }

            @Override // android.window.OnBackInvokedCallback
            public void onBackInvoked() {
                this.a.c();
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackProgressed(BackEvent backEvent) {
                if (C0088c.this.d()) {
                    this.a.b(new C2186b(backEvent));
                }
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackStarted(BackEvent backEvent) {
                if (C0088c.this.d()) {
                    this.a.a(new C2186b(backEvent));
                }
            }
        }

        private C0088c() {
            super();
        }

        @Override // ax.H6.c.b
        OnBackInvokedCallback c(ax.H6.b bVar) {
            return new a(bVar);
        }
    }

    private interface d {
        void a(View view);

        void b(ax.H6.b bVar, View view, boolean z);
    }

    public c(ax.H6.b bVar, View view) {
        this.b = bVar;
        this.c = view;
    }

    private static d a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return new C0088c();
        }
        if (i >= 33) {
            return new b();
        }
        return null;
    }

    private void c(boolean z) {
        d dVar = this.a;
        if (dVar != null) {
            dVar.b(this.b, this.c, z);
        }
    }

    public void b() {
        c(false);
    }

    public void d() {
        d dVar = this.a;
        if (dVar != null) {
            dVar.a(this.c);
        }
    }
}
