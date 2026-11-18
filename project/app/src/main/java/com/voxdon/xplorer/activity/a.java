/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.activity;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import ax.Q2.f;
import ax.W2.h;
import ax.X2.J;
import ax.X2.Q;
import ax.X2.v;
import ax.X2.y;
import ax.Z2.j;
import ax.Z2.n;
import ax.a3.G;
import ax.b3.c;
import ax.c0.F0;
import ax.c0.d0;
import ax.c3.K;
import ax.c3.u;
import ax.d3.E;
import ax.d3.s;
import ax.t3.k;
import ax.u3.B;
import ax.u3.g;
import ax.u3.z;
import com.voxdon.xplorer.activity.b;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.service.CommandService;
import java.io.Serializable;
import java.util.logging.Logger;

public abstract class a
extends ax.n.c
implements ax.R2.a,
s {
    private static final Logger h = ax.Q2.g.a(a.class);
    private static boolean i;
    private f a;
    private int b;
    private String c;
    private boolean d = true;
    private long e;
    private boolean f;
    private BroadcastReceiver g = new BroadcastReceiver(this){
        final a a;
        {
            this.a = a8;
        }

        public void onReceive(Context context, Intent intent) {
            if ("local.intent.action.THEME_CHANGED".equals(intent.getAction())) {
                ax.P.b.r(this.a);
            }
        }
    };

    static /* synthetic */ boolean H(boolean bl) {
        i = bl;
        return bl;
    }

    private void I(View object) {
        k.a a8;
        int n8;
        if ((object = d0.G(object)) != null && (n8 = B.f((Context)this, object.f((int)F0.m.h()).d)) > 10 && n8 < 25 && (object = ax.t3.j.c((Context)this)) != (a8 = k.a.q)) {
            ax.t3.j.q((Context)this, a8);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @TargetApi(value=21)
    private void O(int var1_1, Intent var2_2) {
        block26: {
            block28: {
                block29: {
                    block25: {
                        block27: {
                            var8_5 /* !! */  = this.a;
                            var3_6 = this.b;
                            var9_7 = this.c;
                            var5_8 /* !! */  = var8_5 /* !! */  != null ? K.a(var8_5 /* !! */ , var3_6) : null;
                            this.L();
                            var7_9 /* !! */  = var8_5 /* !! */ ;
                            var6_10 = var5_8 /* !! */ ;
                            if (var5_8 /* !! */  == null) {
                                var10_11 = this.Q(var2_2 /* !! */ );
                                var5_8 /* !! */  = var8_5 /* !! */ ;
                                if (var10_11 != null) {
                                    var5_8 /* !! */  = var10_11.d();
                                    var10_11.b();
                                }
                                var7_9 /* !! */  = var5_8 /* !! */ ;
                                var6_10 = var10_11;
                                if (var10_11 == null) {
                                    return;
                                }
                            }
                            var5_8 /* !! */  = var9_7;
                            if (var6_10 == K.e) {
                                var5_8 /* !! */  = var9_7;
                                if (var9_7 == null) {
                                    var5_8 /* !! */  = var9_7;
                                    if (var2_2 /* !! */  != null) {
                                        var5_8 /* !! */  = var9_7;
                                        if (var2_2 /* !! */ .getData() != null) {
                                            try {
                                                var5_8 /* !! */  = com.voxdon.xplorer.file.g.z(v.h(var2_2 /* !! */ .getData()));
                                                if (var5_8 /* !! */  == null) return;
                                            }
                                            catch (IllegalArgumentException var2_4) {
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                            if (!(var2_2 /* !! */  == null || var2_2 /* !! */ .getData() == null || var2_2 /* !! */ .getData().getAuthority() == null || "com.android.externalstorage.documents".equals((Object)(var8_5 /* !! */  = var2_2 /* !! */ .getData().getAuthority())) || "com.android.mtp.documents".equals((Object)var8_5 /* !! */ ) || J.o() || "com.android.providers.downloads.documents".equals((Object)var8_5 /* !! */ ))) {
                                var10_11 = ax.Ha.c.h().f().b("Unknown external storage authority");
                                var9_7 = new StringBuilder();
                                var9_7.append("authority:");
                                var9_7.append((String)var8_5 /* !! */ );
                                var10_11.g(var9_7.toString()).h();
                            }
                            if (var1_1 == -1 && var2_2 /* !! */  != null && var2_2 /* !! */ .getData() != null && com.voxdon.xplorer.file.g.H((Context)this, var6_10, (String)var5_8 /* !! */ , var2_2 /* !! */ .getData())) {
                                block24: {
                                    block23: {
                                        block22: {
                                            try {
                                                v.t((Context)this, var2_2 /* !! */ );
                                                if (!j.F().E0(var6_10) || var5_8 /* !! */  == null) break block22;
                                                n.b((Context)this).a(var2_2 /* !! */ .getData());
                                                break block23;
                                            }
                                            catch (SecurityException var2_3) {
                                                break block24;
                                            }
                                        }
                                        com.voxdon.xplorer.file.g.O((Context)this, var6_10, (String)var5_8 /* !! */ , var2_2 /* !! */ .getData());
                                    }
                                    this.S();
                                    return;
                                }
                                var2_3.printStackTrace();
                                ax.Ha.c.h().d("TAKE PERSITABLE PERMISSION ERROR!").l(var2_3).h();
                                return;
                            }
                            if (var1_1 != -1 || var2_2 /* !! */  == null || var2_2 /* !! */ .getData() == null) break block27;
                            var4_12 = Q.R1();
                            var3_6 = 2;
                            if (var4_12 && var6_10.d() != ax.Q2.f.u0) {
                                if (com.voxdon.xplorer.file.g.I(var6_10, var2_2 /* !! */ .getData())) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        var3_6 = 1;
                                        break block25;
                                        break;
                                    }
                                }
                                break block25;
                            } else if (x.o1((Context)this, var6_10, var2_2 /* !! */ .getData())) {
                                ** continue;
                            }
                            break block25;
                        }
                        if (var1_1 == 0 && var7_9 /* !! */  == ax.Q2.f.p0 && Q.L1()) {
                            k.s((Context)this);
                        }
                        var3_6 = 0;
                    }
                    if (var1_1 == 0) {
                        if (this.d == false) return;
                    }
                    if (!Q.L1()) break block28;
                    if (System.currentTimeMillis() - this.e < 750L) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            var4_12 = true;
                            break block26;
                            break;
                        }
                    }
                    if (var1_1 != -1 || var2_2 /* !! */  == null || var2_2 /* !! */ .getData() != null) break block29;
                    var2_2 /* !! */  = var2_2 /* !! */ .toString();
                    ax.Ha.c.h().f().c("7.0 DOCUMENT TREE OK BUT FAIL").g(var2_2 /* !! */ ).h();
                    ** GOTO lbl-1000
                }
                if (var1_1 != -1) ** break;
                ** while (true)
            }
            var4_12 = false;
        }
        this.R(var3_6, var6_10, (String)var5_8 /* !! */ , var4_12, true);
    }

    private void S() {
        ax.d3.n n8;
        if (this instanceof b && (n8 = ((b)this).d0()) instanceof E) {
            ((E)n8).W8();
        }
    }

    @Override
    public boolean A(e e8, String string, boolean bl) {
        if (this.n()) {
            return false;
        }
        B.d0(this.getSupportFragmentManager(), e8, string, bl);
        return true;
    }

    protected void J() {
        int n8;
        if (z.w((Context)this) != this.f && ((n8 = ax.t3.j.i((Context)this)) == 0 || n8 == -1)) {
            ax.P.b.r(this);
        }
    }

    public void L() {
        Fragment fragment = this.getSupportFragmentManager().k0("guide_document_tree");
        if (fragment instanceof e) {
            ((e)fragment).O2();
        }
    }

    public boolean M() {
        return this.getSupportFragmentManager().k0("guide_document_tree") != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void N(K object) {
        if (CommandService.y((K)object)) {
            Toast.makeText((Context)this, (int)2131951932, (int)1).show();
            return;
        }
        if (Q.R1() && ((K)object).d() != ax.Q2.f.u0) {
            Q.l(37);
            Intent intent = new Intent("android.provider.action.DOCUMENT_ROOT_SETTINGS");
            String string = j.F().Z((K)object);
            if (string != null) {
                object = new StringBuilder();
                ((StringBuilder)object).append("content://com.android.externalstorage.documents/root/");
                ((StringBuilder)object).append(string);
                intent.setDataAndType(Uri.parse((String)((StringBuilder)object).toString()), "vnd.android.document/root");
                if (B.K((Context)this, intent)) {
                    try {
                        u.q0(this, intent, 50201);
                        return;
                    }
                    catch (ActivityNotFoundException activityNotFoundException) {}
                }
            }
        }
        object = new Intent("android.settings.MEMORY_CARD_SETTINGS");
        try {
            u.q0(this, (Intent)object, 50201);
            return;
        }
        catch (NullPointerException | SecurityException runtimeException) {
            Toast.makeText((Context)this, (int)2131951927, (int)1).show();
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            Toast.makeText((Context)this, (int)2131952448, (int)1).show();
        }
    }

    K Q(Intent object) {
        if (!Q.V1()) {
            return null;
        }
        if (object != null && object.getData() != null && (object = com.voxdon.xplorer.file.g.h((Context)this, object.getData())) != null) {
            return object;
        }
        if (this instanceof b && (object = ((b)this).d0()) != null && (object = ax.Q2.f.L(((ax.d3.n)object).A3())) != null && ((K)object).e() != null) {
            return object;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void R(int n8, K object, String object2, boolean bl, boolean bl2) {
        Object object3;
        K k8;
        block14: {
            k8 = ax.Q2.f.L((K)object);
            if (k8 == null) {
                object2 = ax.Ha.c.h().b("ILLEGAL LOCATION FOR TREEDOCUMENT");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("loc:");
                stringBuilder.append(((K)object).toString());
                ((ax.Ha.b)object2).g(stringBuilder.toString()).j().h();
                return;
            }
            if (!bl && Q.L1() && object2 == null && ax.Q2.f.c0(k8.d())) {
                object = j.F().Z(k8);
                object = object != null ? y.c((Context)this.s(), (String)object) : null;
                object3 = object;
                if (object == null) {
                    object3 = object;
                    if (ax.Q2.f.i0(k8.d())) {
                        object3 = object;
                        if (k8.e() != null) {
                            object3 = y.b((Context)this.s(), k8.e());
                        }
                    }
                }
                if (object3 != null) {
                    ActivityNotFoundException activityNotFoundException2;
                    block13: {
                        NullPointerException nullPointerException2;
                        block12: {
                            SecurityException securityException2;
                            block11: {
                                try {
                                    this.a = k8.d();
                                    this.b = k8.b();
                                    this.c = object2;
                                    this.d = n8 != 0;
                                }
                                catch (SecurityException securityException2) {
                                    break block11;
                                }
                                catch (NullPointerException nullPointerException2) {
                                    break block12;
                                }
                                catch (ActivityNotFoundException activityNotFoundException2) {
                                    break block13;
                                }
                                u.q0(this, (Intent)object3, 50101);
                                return;
                            }
                            securityException2.printStackTrace();
                            break block14;
                        }
                        nullPointerException2.printStackTrace();
                        break block14;
                    }
                    activityNotFoundException2.printStackTrace();
                }
            }
        }
        object = new G();
        object3 = new Bundle();
        if (n8 != 0) {
            object3.putInt("ERROR_CAUSE", n8);
        }
        object3.putBoolean("SHOW_CANCEL", bl2);
        object3.putSerializable("LOCATION", (Serializable)((Object)k8.d()));
        object3.putInt("LOCATION_KEY", k8.b());
        object3.putString("TREE_PATH", (String)object2);
        ((Fragment)object).v2((Bundle)object3);
        this.A((e)object, "guide_document_tree", true);
    }

    public void T(int n8) {
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().v((Drawable)new ColorDrawable(n8));
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean U(K var1_1, String var2_4) {
        block13: {
            block12: {
                if (var1_1 == null) {
                    Toast.makeText((Context)this, (int)2131951927, (int)1).show();
                    return false;
                }
                if (var1_1 == K.e && !ax.c3.d0.B(var2_4)) {
                    Toast.makeText((Context)this, (int)2131951927, (int)1).show();
                    return false;
                }
                var3_5 = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                if (!Q.J0()) ** GOTO lbl-1000
                if (ax.Q2.f.b0(var1_1.d()) || ax.Q2.f.Q(var1_1)) break block12;
                if (ax.Q2.f.h1 != var1_1.d() || (var4_6 = j.F().N(var1_1)) == null) ** GOTO lbl-1000
                var3_5.putExtra("android.provider.extra.INITIAL_URI", (Parcelable)var4_6);
                break block13;
            }
            var4_6 = com.voxdon.xplorer.file.g.m(var1_1, var2_4);
            if (var4_6 != null) {
                var3_5.putExtra("android.provider.extra.INITIAL_URI", (Parcelable)var4_6);
            } else lbl-1000:
            // 3 sources

            {
                var3_5.putExtra("android.content.extra.SHOW_ADVANCED", true);
                var3_5.putExtra("android.provider.extra.SHOW_ADVANCED", true);
            }
        }
        var4_6 = this.getPackageManager().queryIntentActivities(var3_5, 65536);
        if (var4_6 != null) {
            var5_7 = var4_6.iterator();
            while (var5_7.hasNext()) {
                var6_8 = (ResolveInfo)var5_7.next();
                var7_9 = var6_8.activityInfo;
                if (var7_9 != null && (var7_9 = var7_9.applicationInfo) != null && (var7_9.flags & 1) == 1 || var6_8.priority >= 0) continue;
                var5_7.remove();
            }
        }
        if (var4_6 != null && var4_6.size() > 1) {
            var4_6 = var4_6.iterator();
            while (var4_6.hasNext()) {
                var6_8 = (ResolveInfo)var4_6.next();
                if (Q.L0() && (var5_7 = var6_8.activityInfo) != null && "com.google.android.documentsui".equals(var5_7.packageName)) {
                    var3_5.setPackage("com.google.android.documentsui");
                    continue;
                }
                var5_7 = var6_8.activityInfo;
                if (var5_7 == null || !"com.android.documentsui".equals(var5_7.packageName)) continue;
                var3_5.setPackage("com.android.documentsui");
            }
        }
        try {
            this.a = var1_1.d();
            this.b = var1_1.b();
            this.d = true;
            this.c = var2_4;
            u.q0(this, var3_5, 50101);
            return true;
        }
        catch (ActivityNotFoundException var1_2) {
            Toast.makeText((Context)this, (int)2131952448, (int)1).show();
            return false;
        }
        catch (NullPointerException | SecurityException var1_3) {
            Toast.makeText((Context)this, (int)2131951927, (int)1).show();
            return false;
        }
    }

    @Override
    public Context b() {
        return this;
    }

    @Override
    public void l(h h8, boolean bl) throws c {
        CommandService.M(this, null, h8, bl, true);
    }

    @Override
    public boolean n() {
        return this.getSupportFragmentManager().Q0();
    }

    @Override
    protected void onActivityResult(int n8, int n9, Intent intent) {
        super.onActivityResult(n8, n9, intent);
        if (n8 != 50101) {
            if (n8 != 50201) {
                return;
            }
            j.F().K0();
            return;
        }
        this.O(n9, intent);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        ax.Q2.b.f((Context)this, true);
        super.onCreate(bundle);
        if (Q.N1()) {
            v.s(this.getWindow(), ax.Q.b.c((Context)this, 2131100837));
        }
        ax.u3.g.a().d("local.intent.action.THEME_CHANGED", this.g);
        this.f = z.w((Context)this);
    }

    @Override
    protected void onDestroy() {
        ax.u3.g.a().h(this.g);
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.e = System.currentTimeMillis();
    }

    @Override
    protected void onPostCreate(Bundle object) {
        super.onPostCreate((Bundle)object);
        if (Q.R0() && k.v() && !i) {
            object = this.findViewById(0x1020002);
            object.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(){
                final View a;
                final a b;
                {
                    this.b = a8;
                    this.a = view;
                }

                public void onViewAttachedToWindow(View view) {
                    this.b.I(this.a);
                    com.voxdon.xplorer.activity.a.H(true);
                }

                public void onViewDetachedFromWindow(View view) {
                }
            });
        }
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.a = (f)((Object)bundle.getSerializable("DOCUMENT_TREE_REQUEST_LOCATION"));
        this.b = bundle.getInt("DOCUMENT_TREE_REQUEST_LOCATION_KEY");
        this.c = bundle.getString("DOCUMENT_TREE_REQUEST_ROOT_TREE_PATH");
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            bundle.putSerializable("DOCUMENT_TREE_REQUEST_LOCATION", (Serializable)((Object)this.a));
            bundle.putInt("DOCUMENT_TREE_REQUEST_LOCATION_KEY", this.b);
            bundle.putString("DOCUMENT_TREE_REQUEST_ROOT_TREE_PATH", this.c);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            ax.Ha.c.h().d("BaseAppCompatActivity onSaveInstanceState Error").l(illegalStateException).h();
            return;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public ax.n.c s() {
        return this;
    }
}

