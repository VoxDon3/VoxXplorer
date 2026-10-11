package com.voxdon.xplorer.activity;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import ax.Ha.c;
import ax.Q2.f;
import ax.Q2.g;
import ax.W2.h;
import ax.X2.Q;
import ax.X2.v;
import ax.X2.y;
import ax.a3.G;
import ax.b3.C1488c;
import ax.c0.C1760d0;
import ax.c0.F0;
import ax.c3.C1832u;
import ax.c3.K;
import ax.d3.AbstractC1927n;
import ax.d3.E;
import ax.d3.InterfaceC1931s;
import ax.n.ActivityC2561c;
import ax.t3.j;
import ax.t3.k;
import ax.u3.C3180B;
import ax.u3.C3189g;
import ax.u3.z;
import com.voxdon.xplorer.file.C3588g;
import com.voxdon.xplorer.service.CommandService;
import com.voxdon.xplorer.R;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class a extends ActivityC2561c implements ax.R2.a, InterfaceC1931s {
    private static final Logger h = g.a(a.class);
    private static boolean i;
    private f a;
    private int b;
    private String c;
    private long e;
    private boolean f;
    private boolean d = true;
    private BroadcastReceiver g = new C0511a();

    /* renamed from: com.voxdon.xplorer.activity.a$a, reason: collision with other inner class name */
    class C0511a extends BroadcastReceiver {
        C0511a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("local.intent.action.THEME_CHANGED".equals(intent.getAction())) {
                ax.P.b.r(a.this);
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        final /* synthetic */ View a;

        b(View view) {
            this.a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            a.this.I(this.a);
            boolean unused = a.i = true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(View view) {
        int f;
        F0 G = C1760d0.G(view);
        if (G != null && (f = C3180B.f(this, G.f(F0.m.h()).d)) > 10 && f < 25) {
            k.a c = j.c(this);
            k.a aVar = k.a.DRAWER_ONLY_HOME;
            if (c != aVar) {
                j.q(this, aVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0176, code lost:
    
        if (r12 == (-1)) goto L84;
     */
    @android.annotation.TargetApi(21)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void O(int r12, android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.activity.a.O(int, android.content.Intent):void");
    }

    private void S() {
        if (this instanceof com.voxdon.xplorer.activity.b) {
            AbstractC1927n d0 = ((com.voxdon.xplorer.activity.b) this).d0();
            if (d0 instanceof E) {
                ((E) d0).W8();
            }
        }
    }

    @Override // ax.d3.InterfaceC1931s
    public boolean A(e eVar, String str, boolean z) {
        if (n()) {
            return false;
        }
        C3180B.d0(getSupportFragmentManager(), eVar, str, z);
        return true;
    }

    protected void J() {
        if (z.w(this) != this.f) {
            int i2 = j.i(this);
            if (i2 == 0 || i2 == -1) {
                ax.P.b.r(this);
            }
        }
    }

    public void L() {
        Fragment k0 = getSupportFragmentManager().k0("guide_document_tree");
        if (k0 instanceof e) {
            ((e) k0).O2();
        }
    }

    public boolean M() {
        return getSupportFragmentManager().k0("guide_document_tree") != null;
    }

    public void N(K k) {
        if (CommandService.y(k)) {
            Toast.makeText(this, R.string.error_device_is_in_use, 1).show();
            return;
        }
        if (Q.R1() && k.d() != f.u0) {
            Q.l(37);
            Intent intent = new Intent("android.provider.action.DOCUMENT_ROOT_SETTINGS");
            String Z = ax.Z2.j.F().Z(k);
            if (Z != null) {
                intent.setDataAndType(Uri.parse("content://com.android.externalstorage.documents/root/" + Z), "vnd.android.document/root");
                if (C3180B.K(this, intent)) {
                    try {
                        C1832u.q0(this, intent, 50201);
                        return;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }
        }
        try {
            C1832u.q0(this, new Intent("android.settings.MEMORY_CARD_SETTINGS"), 50201);
        } catch (ActivityNotFoundException unused2) {
            Toast.makeText(this, R.string.no_application, 1).show();
        } catch (NullPointerException | SecurityException unused3) {
            Toast.makeText(this, R.string.error, 1).show();
        }
    }

    K Q(Intent intent) {
        AbstractC1927n d0;
        K L;
        K h2;
        if (!Q.V1()) {
            return null;
        }
        if (intent != null && intent.getData() != null && (h2 = C3588g.h(this, intent.getData())) != null) {
            return h2;
        }
        if (!(this instanceof com.voxdon.xplorer.activity.b) || (d0 = ((com.voxdon.xplorer.activity.b) this).d0()) == null || (L = f.L(d0.A3())) == null || L.e() == null) {
            return null;
        }
        return L;
    }

    public void R(int i2, K k, String str, boolean z, boolean z2) {
        K L = f.L(k);
        if (L == null) {
            c.h().b("ILLEGAL LOCATION FOR TREEDOCUMENT").g("loc:" + k.toString()).j().h();
            return;
        }
        if (!z && Q.L1() && str == null && f.c0(L.d())) {
            String Z = ax.Z2.j.F().Z(L);
            Intent c = Z != null ? y.c(s(), Z) : null;
            if (c == null && f.i0(L.d()) && L.e() != null) {
                c = y.b(s(), L.e());
            }
            if (c != null) {
                try {
                    this.a = L.d();
                    this.b = L.b();
                    this.c = str;
                    if (i2 == 0) {
                        this.d = false;
                    } else {
                        this.d = true;
                    }
                    C1832u.q0(this, c, 50101);
                    return;
                } catch (ActivityNotFoundException e) {
                    e.printStackTrace();
                } catch (NullPointerException e2) {
                    e2.printStackTrace();
                } catch (SecurityException e3) {
                    e3.printStackTrace();
                }
            }
        }
        G g = new G();
        Bundle bundle = new Bundle();
        if (i2 != 0) {
            bundle.putInt("ERROR_CAUSE", i2);
        }
        bundle.putBoolean("SHOW_CANCEL", z2);
        bundle.putSerializable("LOCATION", L.d());
        bundle.putInt("LOCATION_KEY", L.b());
        bundle.putString("TREE_PATH", str);
        g.v2(bundle);
        A(g, "guide_document_tree", true);
    }

    public void T(int i2) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().v(new ColorDrawable(i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean U(ax.c3.K r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.activity.a.U(ax.c3.K, java.lang.String):boolean");
    }

    @Override // ax.d3.InterfaceC1931s
    public Context b() {
        return this;
    }

    @Override // ax.d3.InterfaceC1931s
    public void l(h hVar, boolean z) throws C1488c {
        CommandService.M(this, null, hVar, z, true);
    }

    @Override // ax.R2.a
    public boolean n() {
        return getSupportFragmentManager().Q0();
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 50101) {
            O(i3, intent);
        } else {
            if (i2 != 50201) {
                return;
            }
            ax.Z2.j.F().K0();
        }
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        ax.Q2.b.f(this, true);
        super.onCreate(bundle);
        if (Q.N1()) {
            v.s(getWindow(), ax.Q.b.c(this, R.color.statusbar_color));
        }
        C3189g.a().d("local.intent.action.THEME_CHANGED", this.g);
        this.f = z.w(this);
    }

    @Override // ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        C3189g.a().h(this.g);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.e = System.currentTimeMillis();
    }

    @Override // ax.n.ActivityC2561c, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (Q.R0() && k.v() && !i) {
            View findViewById = findViewById(android.R.id.content);
            findViewById.addOnAttachStateChangeListener(new b(findViewById));
        }
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.a = (f) bundle.getSerializable("DOCUMENT_TREE_REQUEST_LOCATION");
        this.b = bundle.getInt("DOCUMENT_TREE_REQUEST_LOCATION_KEY");
        this.c = bundle.getString("DOCUMENT_TREE_REQUEST_ROOT_TREE_PATH");
    }

    @Override // androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            bundle.putSerializable("DOCUMENT_TREE_REQUEST_LOCATION", this.a);
            bundle.putInt("DOCUMENT_TREE_REQUEST_LOCATION_KEY", this.b);
            bundle.putString("DOCUMENT_TREE_REQUEST_ROOT_TREE_PATH", this.c);
        } catch (IllegalStateException e) {
            c.h().d("BaseAppCompatActivity onSaveInstanceState Error").l(e).h();
        }
    }

    @Override // ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // ax.R2.a
    public ActivityC2561c s() {
        return this;
    }
}
