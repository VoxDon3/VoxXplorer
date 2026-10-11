/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.fragment.app.Fragment;
import ax.Z2.c;
import ax.Z2.h;
import ax.a3.I;
import ax.a3.P;
import ax.a3.n;
import ax.c3.A;
import ax.c3.B;
import ax.c3.N;
import ax.c3.V;
import ax.c3.d0;
import ax.c3.u;
import ax.c3.v;
import ax.d3.J;
import ax.g3.c;
import ax.u3.b;
import ax.u3.q;
import com.alphainventor.filemanager.activity.DefaultsSettingsActivity;
import com.alphainventor.filemanager.file.y;
import com.alphainventor.filemanager.service.HttpServerService;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class Q
extends I
implements n.c {
    private static final Logger N0 = Logger.getLogger("FileManager.FileIntent");
    boolean A0;
    boolean B0;
    h C0;
    boolean D0;
    boolean E0;
    g F0;
    private int G0 = -1;
    private ListView H0;
    private String I0;
    private List<h.a> J0;
    private boolean K0;
    private LruCache<ResolveInfo, Drawable> L0 = new LruCache(30);
    private HashMap<ResolveInfo, CharSequence> M0 = new HashMap();
    ax.Z2.h t0;
    boolean u0;
    private c.a v0;
    String w0;
    String x0;
    String y0;
    Uri z0;

    public static Intent A3(Context context, com.alphainventor.filemanager.file.n n8) {
        String string = v.e(n8, "application/octet-stream");
        if (B.H(n8)) {
            n8 = Q.E3(n8);
        } else {
            if (A.G(n8)) {
                return null;
            }
            n8 = u.w(n8.N());
        }
        return Q.z3(context, c.a.c0, (Uri)n8, string, true, false);
    }

    private static Intent B3(Context context, com.alphainventor.filemanager.file.n n8, boolean bl) {
        Uri uri = bl ? HttpServerService.l(0, n8) : u.H(n8, true);
        return Q.z3(context, c.a.c0, uri, n8.s(), true, true);
    }

    private static Intent C3(Context context, c.a a8, com.alphainventor.filemanager.file.n n8, boolean bl) {
        Uri uri = bl ? HttpServerService.l(0, n8) : u.L(n8, true);
        return Q.z3(context, a8, uri, n8.s(), true, true);
    }

    private static Uri D3(Context context, Uri uri) {
        return u.u(context, new File(uri.getPath()));
    }

    public static Uri E3(com.alphainventor.filemanager.file.n n8) {
        if (n8 instanceof y) {
            return u.w(((y)n8).F0());
        }
        if (n8 instanceof com.alphainventor.filemanager.file.i) {
            return u.p((com.alphainventor.filemanager.file.i)n8);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not allowed fileinfo : ");
        stringBuilder.append(n8.getClass().getName());
        b.g(stringBuilder.toString());
        return null;
    }

    private static List<ax.Z2.c> F3(Context context, Uri object, String string) {
        object = d0.k(object.getPath());
        if (v.j(string) && TextUtils.isEmpty((CharSequence)object)) {
            return null;
        }
        return ax.t3.h.g(context, ax.t3.h.d(string, (String)object));
    }

    private Intent G3(h.a a8, boolean bl, boolean bl2, boolean bl3) {
        ResolveInfo resolveInfo;
        Intent intent;
        Object object;
        Intent intent2;
        boolean bl4;
        Context context;
        block22: {
            block24: {
                block23: {
                    context = this.b();
                    bl4 = false;
                    intent2 = new Intent(a8.d(0));
                    object = a8.f(0);
                    intent = intent2;
                    resolveInfo = object;
                    if (intent2.getData() == null) break block22;
                    intent = intent2;
                    resolveInfo = object;
                    if (!"http".equals(intent2.getData().getScheme())) break block22;
                    intent = intent2;
                    resolveInfo = object;
                    if (a8.c() <= 1) break block22;
                    if (!ax.Z2.h.l(context, a8.a)) break block23;
                    intent = new Intent(a8.d(1));
                    resolveInfo = a8.f(1);
                    break block22;
                }
                if (!a8.g()) break block24;
                intent = intent2;
                resolveInfo = object;
                if (a8.j()) break block22;
            }
            intent = new Intent(a8.d(1));
            resolveInfo = a8.f(1);
        }
        if (a8.h()) {
            return a8.d(0);
        }
        ComponentName componentName = a8.a;
        intent.setComponent(componentName);
        h h8 = Q.H3(intent.getData());
        boolean bl5 = this.u0;
        intent2 = null;
        boolean bl6 = bl4;
        Intent intent3 = intent2;
        if (bl5) {
            bl6 = bl4;
            intent3 = intent2;
            if (h8 == h.q) {
                bl6 = bl4;
                intent3 = intent2;
                if (this.b() != null) {
                    if (u.Q(this.b())) {
                        intent3 = u.b(intent);
                        bl6 = true;
                    } else {
                        return null;
                    }
                }
            }
        }
        object = intent;
        bl4 = bl6;
        ResolveInfo resolveInfo2 = resolveInfo;
        intent2 = intent3;
        if (bl3) {
            object = intent;
            bl4 = bl6;
            resolveInfo2 = resolveInfo;
            intent2 = intent3;
            if (this.u0) {
                h h9 = this.C0;
                h h10 = h.q;
                object = intent;
                bl4 = bl6;
                resolveInfo2 = resolveInfo;
                intent2 = intent3;
                if (h9 == h10) {
                    object = intent;
                    bl4 = bl6;
                    resolveInfo2 = resolveInfo;
                    intent2 = intent3;
                    if (h8 == h.c0) {
                        object = intent;
                        bl4 = bl6;
                        resolveInfo2 = resolveInfo;
                        intent2 = intent3;
                        if (!ax.X2.Q.U1()) {
                            object = intent;
                            bl4 = bl6;
                            resolveInfo2 = resolveInfo;
                            intent2 = intent3;
                            if (!ax.Z2.h.k(context, a8.a)) {
                                object = intent;
                                bl4 = bl6;
                                resolveInfo2 = resolveInfo;
                                intent2 = intent3;
                                if (a8.c() > 1) {
                                    h9 = a8.d(1);
                                    object = intent;
                                    bl4 = bl6;
                                    resolveInfo2 = resolveInfo;
                                    intent2 = intent3;
                                    if (Q.H3(h9.getData()) == h10) {
                                        object = intent;
                                        bl4 = bl6;
                                        resolveInfo2 = resolveInfo;
                                        intent2 = intent3;
                                        if (u.Q(context)) {
                                            h9.setComponent(a8.a);
                                            intent2 = u.b((Intent)h9);
                                            resolveInfo2 = a8.f(1);
                                            object = h9;
                                            bl4 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.u0 && !bl4 && this.C0 == h.q && h8 == h.c0 && componentName != null && !"com.voxdon.xplorer".equals(componentName.getPackageName()) && (resolveInfo = N.b(this.b(), this.z0.getPath())) != null) {
            object.setDataAndType((Uri)resolveInfo, object.getType());
        }
        resolveInfo = intent2;
        if (intent2 == null) {
            resolveInfo = object;
        }
        if (bl) {
            ax.t3.h.j(context, ax.t3.h.d(this.w0, this.I0), this.y0, this.z0.getScheme(), a8.a);
            if (bl2) {
                ax.t3.h.a(context, a8.a, 1);
                return resolveInfo;
            }
            this.U3((Intent)object, resolveInfo2, bl4);
            ax.t3.h.a(context, a8.a, 5);
        }
        return resolveInfo;
    }

    private static h H3(Uri uri) {
        if (u.P(uri)) {
            return h.q;
        }
        if (u.Z(uri)) {
            return h.d0;
        }
        if (u.O(uri)) {
            return h.c0;
        }
        b.f();
        return null;
    }

    public static boolean I3(Context context, Uri uri) {
        Intent intent;
        uri.buildUpon().path("/storage/emulated/0/urionly.mkv");
        Intent intent2 = intent = Q.z3(context, c.a.d0, uri, "video/x-matroska", true, true);
        if (intent == null) {
            context = Q.z3(context, c.a.c0, uri, "video/x-matroska", true, true);
            intent2 = context;
            if (context == null) {
                return false;
            }
        }
        return u.U(intent2);
    }

    public static boolean J3(Context context, com.alphainventor.filemanager.file.n n8, boolean bl) {
        if ((context = Q.B3(context, n8, bl)) == null) {
            return false;
        }
        return !u.T((Intent)context);
    }

    public static boolean K3(Context context, c.a a8, com.alphainventor.filemanager.file.n n8, boolean bl) {
        if ((context = Q.C3(context, a8, n8, bl)) == null) {
            return false;
        }
        return !u.U((Intent)context);
    }

    private void L() {
        N0.fine("onIntentResolveCancelled");
        J.e(this, "resolver_request_key", "fragment_result", 3);
    }

    private boolean L3(String string, Uri uri) {
        if (!v.j(string) && !v.i(string) && uri != null && uri.getPath() != null) {
            return uri.getPath().contains(ax.Q2.f.O0.I());
        }
        return false;
    }

    private static boolean M3(String string) {
        return V.j(string);
    }

    public static boolean N3(Context context, c.a a8, com.alphainventor.filemanager.file.n n8, boolean bl) {
        if ((context = Q.C3(context, a8, n8, bl)) == null) {
            return false;
        }
        return u.S((Intent)context);
    }

    private static boolean O3(String string) {
        return "file".equals(string) || "content".equals(string) || "http".equals(string);
        {
        }
    }

    private void P3(Intent intent) {
        Logger logger = N0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onIntentResolved : ");
        stringBuilder.append(intent);
        logger.fine(stringBuilder.toString());
        stringBuilder = new Bundle();
        stringBuilder.putInt("fragment_result", 1);
        stringBuilder.putParcelable("resolver_result_intent", (Parcelable)intent);
        J.f(this, "resolver_request_key", (Bundle)stringBuilder);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void Q3(Fragment fragment, int n8, Intent intent) {
        Uri uri;
        if (fragment != null && fragment.b() != null && intent.getComponent() != null && intent.getData() != null && B.E((uri = intent.getData()).getScheme())) {
            try {
                boolean bl = ax.X2.Q.s0();
                int n9 = bl ? 67 : 3;
                try {
                    fragment.b().grantUriPermission(intent.getComponent().getPackageName(), uri, n9);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    fragment.b().grantUriPermission(intent.getComponent().getPackageName(), uri, 3);
                }
            }
            catch (SecurityException | UndeclaredThrowableException runtimeException) {}
        }
        if (fragment instanceof f) {
            ((f)((Object)fragment)).W(n8, intent);
        }
    }

    public static void R3(Fragment fragment, c.a object, Uri uri, String string, String string2, boolean bl, boolean bl2) {
        b.c(Q.O3(uri.getScheme()));
        Logger logger = N0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("open mimetype : ");
        stringBuilder.append(string);
        logger.fine(stringBuilder.toString());
        if (!(fragment instanceof f)) {
            b.f();
            return;
        }
        if (fragment.b() == null) {
            logger.severe("onIntentResolveCancelled : no context");
            ((f)((Object)fragment)).L();
            return;
        }
        if (!bl && ax.u3.B.j(string, string2) && (stringBuilder = Q.z3(fragment.b(), (c.a)((Object)object), uri, string, bl2, false)) != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append("onIntentResolved by default : ");
            ((StringBuilder)object).append((Object)stringBuilder);
            logger.fine(((StringBuilder)object).toString());
            Q.Q3(fragment, 0, (Intent)stringBuilder);
            return;
        }
        if (!ax.u3.B.F(fragment, false)) {
            logger.severe("onIntentResolveCancelled: not active state");
            ((f)((Object)fragment)).L();
            return;
        }
        object = Q.w3(fragment, 0, (c.a)((Object)object), uri, string, string2, bl, bl2);
        ax.u3.B.d0(fragment.A0(), (androidx.fragment.app.e)object, "resolver", true);
        J.c(fragment, "resolver_request_key", new P(fragment));
    }

    private void S3(int n8, d d8) {
        if (this.b() != null && this.Q2() != null) {
            Context context = this.b();
            androidx.appcompat.app.a a8 = (androidx.appcompat.app.a)this.Q2();
            h.a a9 = this.F0.a(n8);
            if (d8 != d.c0 && d8 != d.d0 && (d8 == d.q && (this.D0 || !this.E0) || this.G0 == n8 || a9.h())) {
                if ((context = this.G3(a9, true, true, ax.t3.h.i(context))) != null) {
                    this.P3((Intent)context);
                    this.O2();
                } else {
                    this.W3();
                }
            } else {
                this.x3(a8, true);
            }
            if (d8 != d.q) {
                this.H0.setItemChecked(n8, true);
            }
            this.G0 = n8;
        }
    }

    private void T3(Context object, String string, c.a object2, String string2, String string3, String string4, ComponentName componentName, boolean bl, boolean bl2) {
        if (TextUtils.isEmpty((CharSequence)string4) && !this.L3(string, this.z0)) {
            object = ax.Ha.c.h().f().b("RESOLVER INVALID EXTENSION");
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("mimetype:");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append(",uri:");
            ((StringBuilder)object2).append(this.z0);
            ((ax.Ha.b)object).g(((StringBuilder)object2).toString()).h();
            return;
        }
        ax.t3.h.k((Context)object, ax.t3.h.d(string, string4), ax.Z2.c.a((c.a)((Object)object2), string2, string3, string4, componentName, bl), bl2);
    }

    private void U3(Intent intent, ResolveInfo object, boolean bl) {
        Object object2;
        Context context = this.b();
        boolean bl2 = u.R(this.I0);
        this.T3(context, this.w0, this.v0, intent.getScheme(), this.y0, this.I0, intent.getComponent(), bl, bl2);
        ArrayList<String> arrayList = new ArrayList<String>();
        if (!bl2 && (object2 = ((ResolveInfo)object).filter) != null) {
            int n8 = object2.countDataSchemes();
            int n9 = 0;
            if (n8 == 0) {
                arrayList.add("file");
                arrayList.add("content");
            } else {
                for (n8 = 0; n8 < ((ResolveInfo)object).filter.countDataSchemes(); ++n8) {
                    object2 = ((ResolveInfo)object).filter.getDataScheme(n8);
                    if (!Q.O3((String)object2)) continue;
                    arrayList.add((String)object2);
                }
            }
            int n10 = arrayList.size();
            for (n8 = n9; n8 < n10; ++n8) {
                object = (String)arrayList.get(n8);
                if (object == null || ((String)object).equals(intent.getScheme())) continue;
                this.T3(context, this.w0, this.v0, (String)object, this.y0, this.I0, intent.getComponent(), false, false);
            }
        }
    }

    private void V3() {
        if (this.f0() == null) {
            return;
        }
        this.F2(new Intent((Context)this.f0(), DefaultsSettingsActivity.class));
    }

    private void W3() {
        n n8 = n.k3(0, 2131952352, 2131952270, 0x1040000);
        n8.D2(this, 0);
        ax.u3.B.d0(this.s0(), n8, "fileuri", true);
    }

    private void f() {
        N0.fine("onIntentNotResolved");
        J.e(this, "resolver_request_key", "fragment_result", 2);
    }

    public static /* synthetic */ void i3(Fragment object, Bundle bundle) {
        int n8 = bundle.getInt("fragment_result", -1);
        if (n8 >= 0 && object instanceof f) {
            object = (f)object;
            if (n8 == 1) {
                object.W(0, (Intent)bundle.getParcelable("resolver_result_intent"));
                return;
            }
            if (n8 == 2) {
                object.f();
                return;
            }
            if (n8 == 3) {
                object.L();
            }
        }
    }

    private boolean s3() {
        Object object = this.z0;
        if (object == null) {
            b.f();
            return false;
        }
        if (this.v0 == c.a.d0) {
            return false;
        }
        object = d0.k(object.getPath());
        if (V.d0.h().equals(this.y0)) {
            return true;
        }
        if (Q.M3(this.y0)) {
            return false;
        }
        return A.w((String)object);
    }

    private boolean t3() {
        if (V.e0.h().equals(this.y0)) {
            return true;
        }
        if (Q.M3(this.y0)) {
            return false;
        }
        return A.x(d0.k(this.z0.getPath()));
    }

    private static boolean u3(String string, String string2) {
        return !v.j(string) || !TextUtils.isEmpty((CharSequence)string2);
        {
        }
    }

    private static boolean v3(Uri object) {
        String string = object.getPath();
        object = Q.H3(object);
        return !(string != null && string.contains(".localcache") || object != h.q && object != h.c0);
        {
        }
    }

    private static Q w3(Fragment fragment, int n8, c.a a8, Uri uri, String string, String string2, boolean bl, boolean bl2) {
        Q q8 = new Q();
        fragment = new Bundle();
        fragment.putParcelable("URI", (Parcelable)uri);
        fragment.putString("MIME_TYPE", string);
        fragment.putString("OPEN_MIME_TYPE", string2);
        fragment.putBoolean("SHOW_CHOOSER", bl);
        fragment.putBoolean("NEW_TASK", bl2);
        fragment.putSerializable("CONDITION", (Serializable)((Object)a8));
        q8.v2((Bundle)fragment);
        return q8;
    }

    private void x3(androidx.appcompat.app.a a8, boolean bl) {
        Button button = a8.i(-1);
        if (button != null) {
            if (!this.E0) {
                button.setEnabled(false);
            } else {
                button.setEnabled(bl);
            }
        }
        if ((a8 = a8.i(-2)) != null) {
            a8.setEnabled(bl);
        }
    }

    private static ax.Z2.c y3(List<ax.Z2.c> object, c.a a8, String string) {
        object = object.iterator();
        while (object.hasNext()) {
            ax.Z2.c c8 = (ax.Z2.c)object.next();
            if (!c8.b.equals(string) || a8 != c8.a) continue;
            return c8;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static Intent z3(Context context, c.a a8, Uri uri, String object, boolean bl, boolean bl2) {
        Object var5_16;
        boolean var4_15;
        boolean var10_35;
        boolean var3_13;
        Object var9_28;
        boolean bl3;
        boolean bl4;
        List<ax.Z2.c> list;
        block16: {
            Object var10_32;
            block15: {
                block14: {
                    ax.Z2.c c8;
                    Object var3_11;
                    Object var9_23;
                    list = Q.F3(context, uri, (String)object);
                    if (list == null) return null;
                    if (list.size() == 0) {
                        return null;
                    }
                    bl4 = ax.X2.Q.N();
                    if (u.P(uri) && bl4) {
                        ax.Z2.c c9;
                        bl3 = u.Q(context) && (c9 = Q.y3(list, a8, "file")) != null && c9.f;
                        if (!bl3) {
                            if (u.R(d0.k(uri.getPath()))) {
                                Uri uri2 = u.C(context, new File(uri.getPath()));
                            } else {
                                Object var3_7 = null;
                            }
                            Uri uri3 = Q.D3(context, uri);
                        } else {
                            Object var3_9 = null;
                            Object var9_21 = null;
                        }
                    } else {
                        Object var3_10 = null;
                        Object var9_22 = null;
                        bl3 = false;
                    }
                    void var10_30 = var9_23;
                    if (var9_23 == null) {
                        Uri uri4 = uri;
                    }
                    if (var3_11 == null) break block14;
                    ax.Z2.c c10 = c8 = Q.y3(list, a8, var3_11.getScheme());
                    if (c8 == null) break block15;
                    ax.Z2.c c11 = c8;
                    break block16;
                }
                Object var9_27 = null;
            }
            void var3_12 = var10_32;
        }
        void var10_33 = var9_28;
        if (var9_28 == null) {
            ax.Z2.c c12 = Q.y3(list, a8, var3_13.getScheme());
        }
        if (var10_35 == null) {
            return null;
        }
        boolean bl5 = Q.v3((Uri)var3_13);
        a8 = u.n((Uri)var3_13, var10_35.c, (boolean)var4_15, bl5);
        ComponentName componentName = var10_35.e;
        a8.setComponent(componentName);
        if (a8.resolveActivityInfo(context.getPackageManager(), 0) == null) {
            return null;
        }
        if (var5_16 != false) {
            return a8;
        }
        if (bl3) {
            return u.b((Intent)a8);
        }
        if (!bl4) return a8;
        h h8 = Q.H3(uri);
        h h9 = Q.H3((Uri)var3_13);
        if (h8 != h.q) return a8;
        if (h9 != h.c0) return a8;
        if (componentName == null) return a8;
        if ("com.voxdon.xplorer".equals(componentName.getPackageName())) return a8;
        if ((context = N.b(context, uri.getPath())) == null) return a8;
        a8.setDataAndType((Uri)context, a8.getType());
        return a8;
    }

    @Override
    public void G(n n8) {
    }

    @Override
    public void J1() {
        super.J1();
        g g8 = this.F0;
        if (g8 != null) {
            g8.b(ax.t3.h.i(this.b()));
        }
    }

    @Override
    public void P(n n8) {
        n8 = new Intent("android.intent.action.VIEW", Uri.parse((String)"market://details?id=com.alphainventor.plugin.fileuri"));
        try {
            u.p0(this, (Intent)n8);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            Toast.makeText((Context)this.b(), (int)2131952448, (int)1).show();
            return;
        }
    }

    @Override
    public void Z(n n8) {
    }

    @Override
    public void f3() {
        super.f3();
        androidx.fragment.app.f f8 = this.f0();
        List<Object> list = new ArrayList<Intent>();
        if (this.C0 == h.q) {
            if (this.u0) {
                Uri uri;
                File file = new File(this.z0.getPath());
                if (u.R(d0.k(this.z0.getPath())) && (uri = u.C((Context)f8, file)) != null) {
                    list.add(u.n(uri, this.y0, this.B0, this.K0));
                    this.t0.p(true);
                }
                list.add(u.n(u.u((Context)f8, file), this.y0, this.B0, this.K0));
                if (ax.X2.Q.O() || u.Q(this.b())) {
                    list.add(u.n(this.z0, this.y0, this.B0, this.K0));
                }
            } else {
                list.add(u.n(this.z0, this.y0, this.B0, this.K0));
            }
        } else {
            list.add(u.n(this.z0, this.y0, this.B0, this.K0));
        }
        list = this.t0.f(true, false, list, this.s3(), this.t3());
        this.J0 = list;
        if (list != null) {
            this.t0.o((Context)f8, this.z0, this.x0, this.y0, list);
        }
        if ((list = this.J0) != null && list.size() != 0) {
            if (this.J0.size() == 1 && !this.A0 && (f8 = this.G3(this.J0.get(0), false, true, ax.t3.h.i((Context)f8))) != null) {
                this.P3((Intent)f8);
                this.Z2(false);
                this.O2();
            }
            return;
        }
        this.f();
        this.Z2(false);
        this.O2();
    }

    @Override
    public Dialog g3() {
        androidx.fragment.app.f f8 = this.f0();
        Object object = ax.u3.h.a((Context)f8);
        this.F0 = new g(this, (Context)f8, this.t0, this.J0);
        LayoutInflater layoutInflater = LayoutInflater.from((Context)f8);
        layoutInflater = layoutInflater.inflate(2131558519, null, false);
        this.H0 = (ListView)layoutInflater.findViewById(2131362452);
        this.F0.b(ax.t3.h.i((Context)f8));
        this.H0.setAdapter((ListAdapter)this.F0);
        this.D0 = false;
        ComponentName componentName = ax.t3.h.e((Context)f8, this.x0, this.y0, this.z0.getScheme());
        if (componentName != null) {
            for (int i8 = 0; i8 < this.J0.size(); ++i8) {
                if (!componentName.equals((Object)this.J0.get((int)i8).a)) continue;
                this.D0 = true;
                this.H0.setItemChecked(i8, true);
                this.G0 = i8;
            }
        }
        ((a.a)object).setNegativeButton(2131951653, null);
        ((a.a)object).setPositiveButton(2131951652, null);
        ((a.a)object).p(2131952282);
        ((a.a)object).b(true);
        ((a.a)object).setView((View)layoutInflater);
        object = ((a.a)object).create();
        object.setCanceledOnTouchOutside(true);
        object.setOnShowListener(new DialogInterface.OnShowListener(){
            final androidx.appcompat.app.a a;
            final Context b;
            final Q c;
            {
                this.c = q8;
                this.a = a8;
                this.b = context;
            }

            public void onShow(DialogInterface object) {
                this.a.i(-1).setOnClickListener((View.OnClickListener)new c(this){
                    final a c;
                    {
                        this.c = a8;
                    }

                    @Override
                    public void a(View object) {
                        if (this.c.c.b() == null) {
                            return;
                        }
                        int n8 = this.c.c.H0.getCheckedItemPosition();
                        if (n8 >= 0 && n8 < this.c.c.F0.getCount()) {
                            boolean bl = ax.t3.h.i(this.c.b);
                            object = this.c.c;
                            if ((object = ((Q)object).G3(((Q)object).F0.a(n8), true, false, bl)) != null) {
                                this.c.c.P3((Intent)object);
                                this.c.c.O2();
                                return;
                            }
                            this.c.c.W3();
                            return;
                        }
                        ax.Ha.b b8 = ax.Ha.c.h().f().b("RESOLVE DIALOG INEXT OUT OF BOUND");
                        object = new StringBuilder();
                        ((StringBuilder)object).append("pos:");
                        ((StringBuilder)object).append(n8);
                        b8.g(((StringBuilder)object).toString()).h();
                    }
                });
                this.a.i(-2).setOnClickListener((View.OnClickListener)new c(this){
                    final a c;
                    {
                        this.c = a8;
                    }

                    @Override
                    public void a(View object) {
                        if (this.c.c.b() == null) {
                            return;
                        }
                        int n8 = this.c.c.H0.getCheckedItemPosition();
                        if (n8 >= 0 && n8 < this.c.c.F0.getCount()) {
                            boolean bl = ax.t3.h.i(this.c.b);
                            object = this.c.c;
                            if ((object = ((Q)object).G3(((Q)object).F0.a(n8), true, true, bl)) != null) {
                                this.c.c.P3((Intent)object);
                                this.c.c.O2();
                                return;
                            }
                            this.c.c.W3();
                            return;
                        }
                        object = ax.Ha.c.h().f().b("RESOLVE DIALOG INEXT OUT OF BOUND 2");
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("pos:");
                        stringBuilder.append(n8);
                        ((ax.Ha.b)object).g(stringBuilder.toString()).h();
                    }
                });
                object = this.c;
                if (!object.D0) {
                    ((Q)object).x3(this.a, false);
                    return;
                }
                ((Q)object).x3(this.a, true);
            }
        });
        this.H0.setOnItemClickListener((AdapterView.OnItemClickListener)new ax.g3.d(this){
            final Q c;
            {
                this.c = q8;
            }

            @Override
            public void a(AdapterView<?> adapterView, View view, int n8, long l8) {
                this.c.S3(n8, d.q);
            }
        });
        this.H0.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(this){
            final Q a;
            {
                this.a = q8;
            }

            public boolean onItemLongClick(AdapterView<?> intent, View view, int n8, long l8) {
                if (this.a.f0() == null) {
                    return false;
                }
                intent = u.d(this.a.F0.a((int)n8).a.getPackageName());
                try {
                    u.p0(this.a, intent);
                }
                catch (ActivityNotFoundException activityNotFoundException) {
                    Toast.makeText((Context)this.a.f0(), (int)2131952448, (int)1).show();
                }
                return true;
            }
        });
        return object;
    }

    @Override
    public void k1(Context object) {
        super.k1((Context)object);
        this.u0 = ax.X2.Q.N();
        this.t0 = new ax.Z2.h((Context)object);
        object = this.j0();
        this.w0 = object.getString("MIME_TYPE");
        this.v0 = (c.a)((Object)object.getSerializable("CONDITION"));
        this.y0 = object.getString("OPEN_MIME_TYPE");
        this.z0 = (Uri)object.getParcelable("URI");
        this.A0 = object.getBoolean("SHOW_CHOOSER");
        this.B0 = object.getBoolean("NEW_TASK");
        this.C0 = Q.H3(this.z0);
        object = d0.k(this.z0.getPath());
        this.I0 = object;
        this.E0 = Q.u3(this.w0, (String)object);
        this.x0 = ax.t3.h.d(this.w0, this.I0);
        this.K0 = Q.v3(this.z0);
    }

    @Override
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.L();
    }

    @Override
    public void s1() {
        super.s1();
        J.b(this, "resolver_request_key");
    }

    static final class d
    extends Enum<d> {
        public static final /* enum */ d c0;
        public static final /* enum */ d d0;
        public static final /* enum */ d e0;
        private static final d[] f0;
        public static final /* enum */ d q;

        static {
            q = new d();
            c0 = new d();
            d0 = new d();
            e0 = new d();
            f0 = d.d();
        }

        private static /* synthetic */ d[] d() {
            return new d[]{q, c0, d0, e0};
        }

        public static d valueOf(String string) {
            return Enum.valueOf(d.class, string);
        }

        public static d[] values() {
            return (d[])f0.clone();
        }
    }

    static class e
    extends q<Void, Void, Drawable> {
        private ResolveInfo h;
        private i i;
        private ax.Z2.h j;
        private LruCache<ResolveInfo, Drawable> k;

        e(ax.Z2.h h8, i i8, LruCache<ResolveInfo, Drawable> lruCache, ResolveInfo resolveInfo) {
            super(q.e.e0);
            this.j = h8;
            this.i = i8;
            this.k = lruCache;
            this.h = resolveInfo;
        }

        protected Drawable w(Void ... drawable) {
            drawable = this.j.c(this.h);
            Context context = this.i.c.getContext();
            if (drawable != null) {
                int n8 = ax.u3.B.e(context, 32);
                drawable.setBounds(0, 0, n8, n8);
            }
            return drawable;
        }

        protected void x(Drawable drawable) {
            ResolveInfo resolveInfo = this.i.b;
            ResolveInfo resolveInfo2 = this.h;
            if (resolveInfo != resolveInfo2) {
                return;
            }
            if (drawable != null) {
                this.k.put((Object)resolveInfo2, (Object)drawable);
            }
            this.i.c.setImageDrawable(drawable);
        }
    }

    public static interface f {
        public void L();

        public void W(int var1, Intent var2);

        public void f();
    }

    class g
    extends BaseAdapter {
        private List<h.a> a;
        private Context b;
        private PackageManager c;
        private ax.Z2.h d;
        private boolean e;
        final Q f;

        g(Q q8, Context context, ax.Z2.h h8, List<h.a> list) {
            this.f = q8;
            this.b = context;
            this.c = context.getPackageManager();
            this.a = list;
            this.d = h8;
        }

        public h.a a(int n8) {
            return this.a.get(n8);
        }

        public void b(boolean bl) {
            this.e = bl;
            this.notifyDataSetChanged();
        }

        public int getCount() {
            return this.a.size();
        }

        public long getItemId(int n8) {
            return n8;
        }

        public View getView(int n8, View view, ViewGroup object) {
            ResolveInfo resolveInfo;
            if (view != null) {
                object = (i)view.getTag();
            } else {
                view = ((LayoutInflater)this.b.getSystemService("layout_inflater")).inflate(2131558575, object, false);
                object = new i(this.f, view);
                view.setTag(object);
            }
            object.a = n8;
            h.a a8 = this.a(n8);
            if (a8.h()) {
                Intent intent = a8.d(0);
                n8 = intent.getIntExtra("title_resource", 0);
                String string = n8 != 0 ? this.f.M0(n8) : "";
                object.b = null;
                object.d.setText((CharSequence)string);
                object.c.setImageResource(intent.getIntExtra("icon_resource", 0));
                object.e.setVisibility(8);
                return view;
            }
            object.b = resolveInfo = a8.f(0);
            CharSequence charSequence = (CharSequence)this.f.M0.get(resolveInfo);
            Object object2 = charSequence;
            if (charSequence == null) {
                object2 = a8.e(this.c);
                this.f.M0.put(resolveInfo, object2);
            }
            object.d.setText((CharSequence)object2);
            object2 = object.h;
            if (object2 != null) {
                ((q)object2).e();
                object.h = null;
            }
            if ((object2 = (Drawable)this.f.L0.get((Object)resolveInfo)) != null) {
                object.c.setImageDrawable((Drawable)object2);
            } else {
                object.c.setImageDrawable(null);
                object.h = object2 = new e(this.d, (i)object, (LruCache<ResolveInfo, Drawable>)this.f.L0, resolveInfo);
                ((q)object2).i(new Void[0]);
            }
            object2 = this.f;
            if (((Q)object2).u0 && ((Q)object2).C0 == h.q && !this.e && (ax.Z2.h.g(a8) || ax.Z2.h.j(this.b, a8.a))) {
                object.e.setVisibility(0);
            } else {
                object.e.setVisibility(8);
            }
            if (a8.g() && a8.c() > 1) {
                object.g.setVisibility(0);
                object.g.setChecked(a8.j());
                object.g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
                    final h.a a;
                    final g b;
                    {
                        this.b = g8;
                        this.a = a8;
                    }

                    public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                        this.a.i(bl);
                    }
                });
                return view;
            }
            object.g.setVisibility(8);
            object.g.setOnCheckedChangeListener(null);
            return view;
        }
    }

    public static final class h
    extends Enum<h> {
        public static final /* enum */ h c0;
        public static final /* enum */ h d0;
        private static final h[] e0;
        public static final /* enum */ h q;

        static {
            q = new h();
            c0 = new h();
            d0 = new h();
            e0 = h.d();
        }

        private static /* synthetic */ h[] d() {
            return new h[]{q, c0, d0};
        }

        public static h valueOf(String string) {
            return Enum.valueOf(h.class, string);
        }

        public static h[] values() {
            return (h[])e0.clone();
        }
    }

    class i {
        int a;
        ResolveInfo b;
        ImageView c;
        TextView d;
        View e;
        View f;
        CheckBox g;
        e h;
        final Q i;

        i(Q q8, View view) {
            this.i = q8;
            this.c = (ImageView)view.findViewById(2131362383);
            this.d = (TextView)view.findViewById(16908308);
            this.e = view.findViewById(2131362605);
            this.f = view.findViewById(2131362034);
            view = (CheckBox)view.findViewById(2131363018);
            this.g = view;
            view.setButtonDrawable(2131230909);
            this.e.setOnClickListener((View.OnClickListener)new c(this, q8){
                final Q c;
                final i d;
                {
                    this.d = i8;
                    this.c = q8;
                }

                @Override
                public void a(View view) {
                    if (this.d.i.b() == null) {
                        return;
                    }
                    if (u.Q(this.d.i.b())) {
                        this.d.i.V3();
                        return;
                    }
                    this.d.i.W3();
                }
            });
            this.f.setOnClickListener((View.OnClickListener)new c(this, q8){
                final Q c;
                final i d;
                {
                    this.d = i8;
                    this.c = q8;
                }

                @Override
                public void a(View object) {
                    object = this.d;
                    object.i.S3(object.a, ax.a3.Q$d.d0);
                }
            });
        }
    }
}

