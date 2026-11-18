/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.Q2.f;
import ax.Sa.g;
import ax.Va.c;
import ax.Z2.s;
import ax.b3.D;
import ax.b3.a;
import ax.b3.j;
import ax.b3.t;
import ax.b3.y;
import ax.c3.B;
import ax.c3.G;
import ax.c3.c0;
import ax.c3.d0;
import ax.c3.g;
import ax.c3.k0;
import ax.d3.D0;
import ax.g3.h;
import ax.g3.i;
import ax.g3.k;
import ax.j3.b;
import ax.u3.q;
import com.voxdon.xplorer.file.T;
import com.voxdon.xplorer.file.Z;
import com.voxdon.xplorer.file.c;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.p;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

public class Y
extends m {
    private static final Logger l = Logger.getLogger("FileManager.YandexFileHelper");
    private static e m;
    private volatile ax.Sa.i h;
    private volatile boolean i;
    private q<Object, Void, Boolean> j;
    private n k;

    private void A0(ax.Va.c object, ax.u3.c c8) throws Exception, a {
        if (object != null && object != ax.Va.c.e && ((ax.Va.c)object).b() != c.b.q && !TextUtils.isEmpty((CharSequence)((ax.Va.c)object).a())) {
            while (true) {
                Y.y0(c8);
                ax.Va.d d8 = this.s0().g((ax.Va.c)object);
                if (!d8.b()) {
                    if (d8.c()) break;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Yandex operation failed: ");
                    ((StringBuilder)object).append(d8.a());
                    throw new j(((StringBuilder)object).toString());
                }
                try {
                    Thread.sleep(2000L);
                }
                catch (InterruptedException interruptedException) {
                    Thread.currentThread().interrupt();
                    throw new IOException(interruptedException);
                }
            }
        }
    }

    private void B0(n object, G d8, long l8, boolean bl, ax.u3.c c8, i i8) throws j, a {
        Y.y0(c8);
        try {
            object = this.s0().i(((n)object).E(), bl);
            ax.Sa.i i9 = this.s0();
            ax.Sa.k k8 = new ax.Sa.k(){
                final G a;
                final long b;
                final Y c;
                {
                    this.c = y8;
                    this.a = g8;
                    this.b = l8;
                }

                @Override
                public InputStream a(long l8) throws IOException {
                    try {
                        InputStream inputStream = this.a.c(l8);
                        return inputStream;
                    }
                    catch (j j8) {
                        throw new IOException(j8);
                    }
                }

                @Override
                public long length() {
                    return this.b;
                }
            };
            d8 = new ax.Sa.d(){
                final i a;
                final ax.u3.c b;
                final Y c;
                {
                    this.c = y8;
                    this.a = i8;
                    this.b = c8;
                }

                @Override
                public boolean a() {
                    ax.u3.c c8 = this.b;
                    return c8 != null && c8.isCancelled();
                }

                @Override
                public void b(long l8, long l9) {
                    i i8 = this.a;
                    if (i8 != null) {
                        i8.a(l8, l9);
                    }
                }
            };
            i9.m((ax.Va.c)object, k8, d8);
            return;
        }
        catch (Exception exception) {
            if (c8 != null && c8.isCancelled()) {
                throw new a(exception);
            }
            if (exception instanceof IOException && exception.getCause() instanceof j) {
                throw (j)exception.getCause();
            }
            throw this.p0("yandex writeFile", exception);
        }
    }

    static /* synthetic */ q m0(Y y8, q q8) {
        y8.j = q8;
        return q8;
    }

    private static void o0(n n8, ax.u3.c c8) throws t, a {
        if (n8.n()) {
            Y.y0(c8);
            return;
        }
        throw new t();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private j p0(String object, Exception exception) {
        block12: {
            block13: {
                if (exception instanceof j) {
                    return (j)exception;
                }
                if (!(exception instanceof ax.Ua.g)) {
                    return ax.b3.d.b((String)object, exception);
                }
                object = (ax.Ua.g)exception;
                int n8 = ((ax.Ua.g)object).a();
                if (n8 == 401) break block12;
                if (n8 == 409) {
                    return new ax.b3.f(false, (Throwable)exception);
                }
                if (n8 == 413) {
                    return new D(exception);
                }
                if (n8 == 429 || n8 == 500) break block13;
                if (n8 == 507) {
                    return new ax.b3.s(exception);
                }
                if (n8 == 403) break block12;
                if (n8 == 404) {
                    return new t(exception);
                }
                switch (n8) {
                    default: {
                        return new j(exception);
                    }
                    case 502: 
                    case 503: 
                    case 504: 
                }
            }
            return new y(String.valueOf(((ax.Ua.g)object).a()), exception);
        }
        return new ax.b3.e(exception);
    }

    private void q0(n n8) throws j {
        if (n8.n()) {
            a a82;
            block4: {
                try {
                    this.A0(this.s0().b(n8.E(), false), null);
                    return;
                }
                catch (Exception exception) {
                }
                catch (a a82) {
                    break block4;
                }
                throw this.p0("yandex deleteFile", exception);
            }
            throw new j(a82);
        }
        throw new t();
    }

    private static String r0(Context object) {
        object = g.c(object).a(f.Q0);
        if ("ru".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("https://oauth.yandex.ru/authorize?response_type=token&client_id=");
            stringBuilder.append((String)object);
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://oauth.yandex.com/authorize?response_type=token&client_id=");
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    private ax.Sa.i s0() throws ax.b3.h {
        ax.Sa.i i8 = this.h;
        if (this.i && i8 != null) {
            return i8;
        }
        throw new ax.b3.h("Not connected : yandex");
    }

    public static e t0(Context context) {
        if (m == null) {
            m = new e(context.getApplicationContext());
        }
        return m;
    }

    static boolean u0(String string, String string2) {
        long l8 = string2 != null && !string2.equals("0") ? System.currentTimeMillis() + (long)Integer.parseInt(string2) * 1000L : 0L;
        return string != null && (l8 == 0L || System.currentTimeMillis() < l8);
    }

    private static void v0(i i8, long l8) {
        if (i8 != null) {
            i8.a(l8, l8);
        }
    }

    private void w0(ax.Sa.i i8) {
        this.h = i8;
        boolean bl = i8 != null;
        this.i = bl;
        this.k = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void x0(Activity activity, String string, b.d d8) {
        String string2 = Y.r0((Context)activity);
        CharSequence charSequence = string2;
        if (!TextUtils.isEmpty((CharSequence)string)) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append("&login_hint=");
            ((StringBuilder)charSequence).append(string);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        try {
            b.D(activity, (String)charSequence, null, null, null, "https://yxb31d3cb91f694e99bc65b2ed68322b14.oauth.yandex.ru/auth/finish?platform=android", d8).show();
            return;
        }
        catch (NullPointerException nullPointerException) {
            ax.Ha.c.h().d("WEBVIEW CREATE").l(nullPointerException).h();
            Toast.makeText((Context)activity, (int)2131951927, (int)1).show();
            return;
        }
        catch (AndroidRuntimeException androidRuntimeException) {}
        Toast.makeText((Context)activity, (int)2131951927, (int)1).show();
    }

    private static void y0(ax.u3.c c8) throws a {
        if (c8 != null && c8.isCancelled()) {
            throw new a();
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public InputStream A(String var1_1, String var2_3, String var3_4) {
        block7: {
            block8: {
                var4_5 = null;
                if (var3_4 == null) ** GOTO lbl7
                try {
                    if (var3_4.startsWith("url=")) {
                        var1_1 = Uri.decode((String)var3_4.substring(4));
                        break block7;
                    }
lbl7:
                    // 3 sources

                    var3_4 = this.s0();
                    var1_1 = new g.b();
                    if (!TextUtils.isEmpty((CharSequence)(var1_1 = var3_4.h(var1_1.d(var2_3).e("S").a())).h())) break block8;
                    return null;
                }
                catch (Exception var1_2) {
                    var1_1 = var4_5;
                    ** continue;
                }
            }
            var1_1 = var1_1.h();
        }
        if (var1_1 == null) {
            return null;
        }
        var1_1 = this.s0().f((String)var1_1, 0L);
lbl22:
        // 2 sources

        return var1_1;
    }

    @Override
    public boolean B(n n8) {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<n> C(n n8, m.f object) throws j {
        int n9;
        int n10;
        if (!n8.n()) throw new t();
        ax.u3.b.c(n8.isDirectory());
        ArrayList<n> arrayList = new ArrayList<n>();
        int n11 = 0;
        do {
            Object object2;
            try {
                object2 = this.s0();
                object = new g.b();
                object2 = ((ax.Sa.i)object2).h(((g.b)object).d(n8.E()).b(1000).c(n11).e("S").a()).i();
                object = object2 == null ? null : ((ax.Va.f)object2).a();
                if (object == null) return arrayList;
                if (object.isEmpty()) {
                    return arrayList;
                }
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    ax.Va.e e8 = (ax.Va.e)iterator.next();
                    if (e8 == null || e8.g() == null) continue;
                    Z z8 = new Z(this, e8, null);
                    arrayList.add(z8);
                }
            }
            catch (Exception exception) {
                throw this.p0("yandex listChildren", exception);
            }
            n9 = n11 + object.size();
            n10 = ((ax.Va.f)object2).b();
            n11 = n9;
        } while (n10 > n9);
        return arrayList;
    }

    @Override
    public void D(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, i i8) throws j, a {
        this.B0(n8, g8, l8, false, c8, i8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void E(n object, n object2, ax.u3.c c8, i i8) throws j, a {
        Y.o0((n)object, c8);
        ax.u3.b.a(object2.n());
        try {
            object2 = this.s0().l(((n)object).E(), ((n)object2).E(), false);
            if (object2 != null && ((ax.Va.c)object2).a() != null) {
                this.A0((ax.Va.c)object2, c8);
                Y.v0(i8, object.p());
                return;
            }
        }
        catch (Exception exception) {
            throw this.p0("yandex moveFile", exception);
        }
        catch (a a8) {
            throw a8;
        }
        object = new j("response body null error");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void F(n object, n object2, ax.u3.c c8, i i8) throws j, a {
        Y.o0((n)object, c8);
        try {
            object2 = this.s0().a(((n)object).E(), ((n)object2).E(), false);
            if (object2 != null && ((ax.Va.c)object2).a() != null) {
                this.A0((ax.Va.c)object2, c8);
                Y.v0(i8, object.p());
                return;
            }
        }
        catch (Exception exception) {
            throw this.p0("yandex copyFile", exception);
        }
        catch (a a8) {
            throw a8;
        }
        object = new j("response body null error");
        throw object;
    }

    @Override
    public int G(String string, String string2) {
        return -1;
    }

    @Override
    public String H(n n8) {
        Comparable<n> comparable;
        if (n8 instanceof Z && ((Z)(comparable = (Z)n8)).g0()) {
            String string = ((Z)comparable).f0();
            if (string == null) {
                return null;
            }
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append("url=");
            ((StringBuilder)comparable).append(Uri.encode((String)string));
            return B.a0(n8, ((StringBuilder)comparable).toString());
        }
        return null;
    }

    @Override
    public void I(n n8) throws j {
        this.q0(n8);
    }

    @Override
    public InputStream J(n object, long l8) throws j {
        if (object.n()) {
            try {
                object = this.s0().e(((n)object).E(), l8);
                return object;
            }
            catch (Exception exception) {
                throw this.p0("yandex getInputStream", exception);
            }
        }
        throw new t();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void K(Activity activity, Fragment fragment, c.a a8) {
        block9: {
            d d8;
            block8: {
                try {
                    d8 = this.j;
                    if (d8 == null) break block8;
                }
                catch (Exception exception) {}
                try {
                    if (d8.isCancelled()) break block8;
                    this.j.e();
                }
                catch (Exception exception) {
                    break block9;
                }
            }
            Context context = this.p();
            int n8 = this.t();
            try {
                this.j = d8 = new d(context, activity, fragment, this, n8, a8);
                d8.i(new Object[0]);
                return;
            }
            catch (Exception exception) {}
        }
        if (a8 != null) {
            RuntimeException var1_4;
            a8.B();
            a8.T(false, var1_4.getMessage());
        }
    }

    @Override
    public boolean L() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean M(n object) {
        block5: {
            if (object.n()) {
                return false;
            }
            try {
                object = this.s0().k(((n)object).E());
                if (object == null) break block5;
            }
            catch (Exception exception) {
                return false;
            }
            object = ((ax.Va.c)object).a();
            if (object == null) break block5;
            return true;
        }
        return false;
    }

    @Override
    public boolean N(n n8) {
        return this.l(n8);
    }

    @Override
    public boolean O() {
        return true;
    }

    @Override
    public void P(n n8) throws j {
        this.q0(n8);
    }

    @Override
    public boolean Q(n n8, n n9) {
        return true;
    }

    @Override
    public boolean Y() {
        return true;
    }

    @Override
    public boolean a() {
        return this.i && this.h != null;
    }

    @Override
    public void b() {
        this.i = false;
        this.k = null;
    }

    @Override
    public boolean h0() {
        return true;
    }

    @Override
    public void j0(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, i i8) throws j, a {
        this.B0(n8, g8, l8, true, c8, i8);
    }

    @Override
    void m(n n8, String string, boolean bl, boolean bl2, h h8, ax.u3.c c8) throws j {
        this.o(n8, string, bl, bl2, h8, c8);
    }

    @Override
    public k0 y() throws j {
        try {
            Object object = this.s0().c();
            object = new k0(((ax.Va.b)object).a(), ((ax.Va.b)object).b());
            return object;
        }
        catch (Exception exception) {
            throw this.p0("yandex getStorageSpace", exception);
        }
    }

    @Override
    public n z(String string) throws j {
        ax.Ua.g g82;
        block8: {
            Exception exception2;
            block7: {
                Object object;
                block6: {
                    Object object2;
                    boolean bl = d0.a.equals(string = d0.U(string));
                    if (bl && (object2 = this.k) != null) {
                        return object2;
                    }
                    object = this.s0();
                    object2 = new g.b();
                    object2 = ((ax.Sa.i)object).h(((g.b)object2).d(string).e("S").a());
                    object = new Z(this, (ax.Va.e)object2, string);
                    if (!bl) break block6;
                    try {
                        this.k = object;
                        return object;
                    }
                    catch (Exception exception2) {
                        break block7;
                    }
                    catch (ax.Ua.g g82) {
                        break block8;
                    }
                }
                return object;
            }
            throw this.p0("yandex getFileInfo", exception2);
        }
        if (g82.a() == 404) {
            return new Z(this, null, string);
        }
        throw this.p0("yandex getFileInfo", g82);
    }

    void z0(Activity activity, Fragment fragment, String string, int n8, c.a a8) {
        ax.u3.B.X(new ValueCallback<Boolean>(){
            final Activity a;
            final String b;
            final int c;
            final Fragment d;
            final c.a e;
            final Y f;
            {
                this.f = y8;
                this.a = activity;
                this.b = string;
                this.c = n8;
                this.d = fragment;
                this.e = a8;
            }

            public void a(Boolean bl) {
                Y.x0(this.a, this.b, new b.d(this){
                    final c a;
                    {
                        this.a = c8;
                    }

                    @Override
                    public void a() {
                        this.a.e.T(false, null);
                    }

                    @Override
                    public void b(Bundle bundle) {
                        CookieSyncManager.getInstance().sync();
                        String string = bundle.getString("access_token");
                        if (Y.u0(string, bundle.getString("expires_in"))) {
                            Y.t0(this.a.f.p()).n(this.a.c, string, "");
                            Y y8 = this.a.f;
                            bundle = this.a.f.p();
                            Object object = this.a;
                            string = object.a;
                            Fragment fragment = object.d;
                            object = object.f;
                            Y.m0(y8, new d((Context)bundle, (Activity)string, fragment, (Y)object, ((m)object).t(), this.a.e));
                            this.a.f.j.i(new Object[0]);
                            return;
                        }
                        l.severe("OAUTH : FAILED TO RECEIVE ACCESS TOKEN 2");
                        this.a.e.T(false, null);
                    }

                    @Override
                    public void c(ax.j3.c c8) {
                        Logger logger = l;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("OAUTH ERROR 2:");
                        stringBuilder.append(c8.getMessage());
                        logger.severe(stringBuilder.toString());
                        this.a.e.T(false, null);
                    }
                });
            }
        });
    }

    private static class d
    extends q<Object, Void, Boolean> {
        Context h;
        c.a i;
        String j;
        String k;
        Y l;
        boolean m;
        int n;
        D0 o;
        boolean p;
        Activity q;

        public d(Context context, Activity object, Fragment object2, Y object3, int n8, c.a a8) {
            super(q.e.c0);
            this.h = context;
            this.q = object;
            this.l = object3;
            this.i = a8;
            this.n = n8;
            this.o = (D0)object2;
            context = context.getSharedPreferences("YandexDiskPrefs", 0);
            object3 = f.Q0;
            object = new c0((f)((Object)object3));
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("version_");
            ((StringBuilder)object2).append(n8);
            int n9 = context.getInt(((StringBuilder)object2).toString(), 0);
            if (n9 == 0) {
                object = new StringBuilder();
                ((StringBuilder)object).append("access_token_");
                ((StringBuilder)object).append(n8);
                this.k = context.getString(((StringBuilder)object).toString(), "");
            } else {
                object2 = ax.Y2.a.a().b((f)((Object)object3));
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("access_token_");
                ((StringBuilder)object3).append(n8);
                this.k = ((c0)object).a(n9, (String)object2, context.getString(((StringBuilder)object3).toString(), ""));
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("account_name_");
            ((StringBuilder)object).append(n8);
            this.j = context.getString(((StringBuilder)object).toString(), "");
        }

        @Override
        protected void r() {
            c.a a8 = this.i;
            if (a8 != null) {
                a8.B();
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Boolean w(Object ... object) {
            ax.Ua.g g82;
            boolean bl;
            block8: {
                Exception exception2;
                block7: {
                    Object object2;
                    block5: {
                        String string;
                        block6: {
                            bl = true;
                            try {
                                object2 = new ax.Sa.a(this.j, this.k);
                                object = new ax.Sa.i((ax.Sa.a)object2);
                                object2 = ((ax.Sa.i)object).c();
                                if (!TextUtils.isEmpty((CharSequence)this.j) || ((ax.Va.b)object2).c() == null) break block5;
                                this.j = string = ((ax.Va.b)object2).c().a();
                                if (!TextUtils.isEmpty((CharSequence)string)) break block6;
                                this.j = ((ax.Va.b)object2).c().b();
                            }
                            catch (Exception exception2) {
                                break block7;
                            }
                            catch (ax.Ua.g g82) {
                                break block8;
                            }
                        }
                        if (!TextUtils.isEmpty((CharSequence)this.j)) {
                            string = this.h.getSharedPreferences("YandexDiskPrefs", 0).edit();
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("account_name_");
                            ((StringBuilder)object2).append(this.n);
                            string.putString(((StringBuilder)object2).toString(), this.j).apply();
                            this.m = true;
                        }
                    }
                    if ((object2 = this.l) == null) return Boolean.TRUE;
                    ((Y)object2).w0((ax.Sa.i)object);
                    return Boolean.TRUE;
                }
                exception2.printStackTrace();
                return Boolean.FALSE;
            }
            if (g82.a() != 401) {
                bl = false;
            }
            this.p = bl;
            return Boolean.FALSE;
        }

        protected void x(Boolean object) {
            c.a a8;
            if (this.m && (a8 = this.o) != null) {
                ((ax.d3.a)a8).ua();
            }
            if (this.p) {
                object = this.l;
                if (object != null && (a8 = this.q) != null) {
                    ((Y)object).z0((Activity)a8, this.o, this.j, this.n, this.i);
                    return;
                }
                object = this.i;
                if (object != null) {
                    object.T(false, null);
                    return;
                }
            } else {
                a8 = this.i;
                if (a8 != null) {
                    a8.T((Boolean)object, null);
                }
            }
        }
    }

    public static class e
    extends T {
        Context a;

        public e(Context context) {
            this.a = context;
        }

        private void o(Activity activity, k k8) {
            CookieSyncManager.createInstance((Context)activity);
            ax.u3.B.X(new ValueCallback<Boolean>(){
                final Activity a;
                final k b;
                final e c;
                {
                    this.c = e8;
                    this.a = activity;
                    this.b = k8;
                }

                public void a(Boolean bl) {
                    Y.x0(this.a, null, new b.d(this){
                        final a a;
                        {
                            this.a = a8;
                        }

                        @Override
                        public void a() {
                        }

                        @Override
                        public void b(Bundle object) {
                            CookieSyncManager.getInstance().sync();
                            String string = object.getString("access_token");
                            if (Y.u0(string, object.getString("expires_in"))) {
                                int n8 = this.a.c.l();
                                this.a.c.n(n8, string, "");
                                object = this.a.b;
                                if (object != null) {
                                    object.c(f.Q0, n8);
                                    return;
                                }
                            } else {
                                l.severe("OAUTH : FAILED TO RECEIVE ACCESS TOKEN");
                                object = this.a.b;
                                if (object != null) {
                                    object.a(f.Q0, "", 0, "", null);
                                }
                            }
                        }

                        @Override
                        public void c(ax.j3.c object) {
                            Logger logger = l;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("OAUTH ERROR :");
                            stringBuilder.append(((Throwable)object).getMessage());
                            logger.severe(stringBuilder.toString());
                            object = this.a.b;
                            if (object != null) {
                                object.a(f.Q0, "", 0, "", null);
                            }
                        }
                    });
                }
            });
        }

        @Override
        public void a(int n8) {
            Object object = this.a.getSharedPreferences("YandexDiskPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("version_");
            stringBuilder.append(n8);
            object = object.remove(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("access_token_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("account_name_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("location_name_");
            stringBuilder.append(n8);
            object = object.remove(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("created_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("sortindex_");
            ((StringBuilder)object).append(n8);
            stringBuilder.remove(((StringBuilder)object).toString()).commit();
        }

        @Override
        public s f(int n8) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("YandexDiskPrefs", 0);
            CharSequence charSequence = new StringBuilder();
            charSequence.append("account_name_");
            charSequence.append(n8);
            charSequence = sharedPreferences.getString(charSequence.toString(), null);
            Object object = new StringBuilder();
            ((StringBuilder)object).append("location_name_");
            ((StringBuilder)object).append(n8);
            String string = ((StringBuilder)object).toString();
            object = f.Q0;
            string = sharedPreferences.getString(string, ((f)((Object)object)).M(this.a));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("created_");
            stringBuilder.append(n8);
            long l8 = sharedPreferences.getLong(stringBuilder.toString(), 0L);
            stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            return new s((f)((Object)object), n8, string, (String)charSequence, null, null, l8, sharedPreferences.getLong(stringBuilder.toString(), 0L));
        }

        @Override
        public void g(int n8, String string) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("YandexDiskPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("location_name_");
            stringBuilder.append(n8);
            editor.putString(stringBuilder.toString(), string);
            editor.commit();
        }

        @Override
        public void j(int n8, long l8) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("YandexDiskPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            editor.putLong(stringBuilder.toString(), l8);
            editor.apply();
        }

        public void k(com.voxdon.xplorer.activity.a a8, k k8) {
            k8.b(f.Q0);
            this.o(a8, k8);
        }

        int l() {
            return this.a.getSharedPreferences("YandexDiskPrefs", 0).getInt("count", 0);
        }

        public List<s> m() {
            ArrayList<s> arrayList = new ArrayList<s>();
            Context context = this.a;
            context = context.getSharedPreferences("YandexDiskPrefs", 0);
            int n8 = context.getInt("count", 0);
            for (int i8 = 0; i8 < n8; ++i8) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("access_token_");
                stringBuilder.append(i8);
                if (context.getString(stringBuilder.toString(), null) == null) continue;
                arrayList.add(this.f(i8));
            }
            return arrayList;
        }

        void n(int n8, String charSequence, String charSequence2) {
            Context context = this.a;
            boolean bl = false;
            if (n8 >= (context = context.getSharedPreferences("YandexDiskPrefs", 0)).getInt("count", 0)) {
                bl = true;
            }
            f f8 = f.Q0;
            c0 c02 = new c0(f8);
            context = context.edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("version_");
            stringBuilder.append(n8);
            SharedPreferences.Editor editor = context.putInt(stringBuilder.toString(), 3);
            stringBuilder = new StringBuilder();
            stringBuilder.append("access_token_");
            stringBuilder.append(n8);
            c02 = editor.putString(stringBuilder.toString(), c02.e(ax.Y2.a.a().b(f8), (String)charSequence));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("account_name_");
            ((StringBuilder)charSequence).append(n8);
            charSequence = c02.putString(((StringBuilder)charSequence).toString(), (String)charSequence2);
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append("location_name_");
            ((StringBuilder)charSequence2).append(n8);
            charSequence.putString(((StringBuilder)charSequence2).toString(), f8.M(this.a));
            if (bl) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("created_");
                ((StringBuilder)charSequence).append(n8);
                context.putLong(((StringBuilder)charSequence).toString(), System.currentTimeMillis());
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("sortindex_");
                ((StringBuilder)charSequence).append(n8);
                context.putLong(((StringBuilder)charSequence).toString(), System.currentTimeMillis());
            }
            if (bl) {
                context.putInt("count", n8 + 1);
            }
            context.commit();
        }
    }
}

