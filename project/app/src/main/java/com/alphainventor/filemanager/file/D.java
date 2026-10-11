/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.file;

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
import ax.Z2.s;
import ax.a3.U;
import ax.b3.d;
import ax.b3.j;
import ax.c3.F;
import ax.c3.c0;
import ax.c3.k0;
import ax.g3.k;
import ax.j3.b;
import ax.r8.l;
import ax.r8.n;
import ax.r8.o;
import ax.u3.B;
import ax.u3.q;
import com.alphainventor.filemanager.file.T;
import com.alphainventor.filemanager.file.W;
import com.alphainventor.filemanager.file.c;
import com.alphainventor.filemanager.file.m;
import com.socialnmobile.dav.gson.ServerType;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Logger;

public class D
extends W {
    private static final Logger x = Logger.getLogger("FileManager.NextCloudFileHelper");
    static c y;
    private String w;

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static U.d X0(Context object, String object2, boolean bl) {
        o o8;
        boolean var2_8;
        W.J0(object);
        ax.Ka.a a8 = ax.Ia.b.a((boolean)var2_8, 15000L);
        l l8 = ax.r8.n.d(D.d1(a8, (String)((Object)o8))).h();
        o o9 = l8.w("installed");
        o8 = l8.w("version");
        o o10 = l8.w("versionstring");
        if (o9 == null) return U.d.d0;
        boolean bl2 = false;
        boolean bl3 = o8 != null;
        if (o10 != null) {
            bl2 = true;
        }
        if (!(bl3 & bl2)) return U.d.d0;
        try {
            return U.d.q;
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        catch (Exception exception) {
            if (d.b("test", exception) instanceof ax.b3.q) {
                return U.d.c0;
            }
            if (!(exception instanceof ax.Ja.a)) return U.d.d0;
            if (((ax.Ja.a)exception).b() != 403) return U.d.d0;
            return U.d.e0;
        }
    }

    public static String Y0(String string) {
        if (string == null) {
            return null;
        }
        int n8 = string.indexOf("/remote.php");
        if (n8 < 0) {
            return null;
        }
        return string.substring(0, n8);
    }

    private static String Z0(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/index.php/login/flow");
        return stringBuilder.toString();
    }

    public static c a1(Context context) {
        if (y == null) {
            y = new c(context.getApplicationContext());
        }
        return y;
    }

    public static k0 b1(ax.Ia.a object, String object2) throws j {
        try {
            object = D.c1((ax.Ia.a)object, (String)object2);
            object2 = new n();
            object = ((n)object2).a((String)object).h().t("ocs").h().t("data").h().t("quota").h();
            object = new k0(((l)object).t("total").i().t(), ((l)object).t("used").i().t());
            return object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            throw new j(exception);
        }
    }

    private static String c1(ax.Ia.a a8, String string) throws ax.Ja.a, IOException {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("OCS-APIRequest", "true");
        return new String(F.h(a8.u(D.g1(string), hashMap), 2048));
    }

    private static String d1(ax.Ia.a a8, String string) throws ax.Ja.a, IOException {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("OCS-APIRequest", "true");
        return new String(F.h(a8.u(D.e1(string), hashMap), 2048));
    }

    private static String e1(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/status.php");
        return stringBuilder.toString();
    }

    public static String f1(String string, int n8, String string2) {
        if (string == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/apps/files/api/v1/thumbnail/");
        stringBuilder.append(n8);
        stringBuilder.append("/");
        stringBuilder.append(n8);
        stringBuilder.append(Uri.encode((String)string2, (String)"/"));
        return stringBuilder.toString();
    }

    private static String g1(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/ocs/v1.php/cloud/user?format=json");
        return stringBuilder.toString();
    }

    private static String h1(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/remote.php/dav/files/");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    private void i1(String string) {
        this.w = string;
    }

    static void j1(Activity activity, String string, b.d d8) {
        string = D.Z0(string);
        try {
            W.J0((Context)activity);
            ax.j3.a.F(activity, string, "nc://login/server", d8).show();
            return;
        }
        catch (NullPointerException nullPointerException) {
            ax.Ha.c.h().d("WEBVIEW CREATE").l(nullPointerException).h();
            Toast.makeText((Context)activity, (int)2131951927, (int)1).show();
        }
        catch (AndroidRuntimeException androidRuntimeException) {
            Toast.makeText((Context)activity, (int)2131951927, (int)1).show();
        }
    }

    @Override
    protected String A0() {
        return this.w;
    }

    void k1(Activity activity, Fragment fragment, String string, int n8, c.a a8) {
        CookieSyncManager.createInstance((Context)activity);
        B.X(new ValueCallback<Boolean>(){
            final Activity a;
            final String b;
            final int c;
            final Fragment d;
            final c.a e;
            final D f;
            {
                this.f = d8;
                this.a = activity;
                this.b = string;
                this.c = n8;
                this.d = fragment;
                this.e = a8;
            }

            public void a(Boolean bl) {
                D.j1(this.a, this.b, new b.d(this){
                    final a a;
                    {
                        this.a = a8;
                    }

                    @Override
                    public void a() {
                        this.a.e.T(false, null);
                    }

                    @Override
                    public void b(Bundle object) {
                        CookieSyncManager.getInstance().sync();
                        String string = object.getString("user");
                        String string2 = object.getString("password");
                        boolean bl = object.getBoolean("invalid_cert");
                        object = string != null && string.contains("@") ? "" : string;
                        Object object2 = D.a1(this.a.f.p());
                        Object object3 = this.a;
                        ((c)object2).m(object3.c, object3.b, string2, string, (String)object, bl);
                        object = this.a.d;
                        if (object instanceof ax.d3.W) {
                            ((ax.d3.W)object).ua();
                        }
                        object = this.a;
                        if (object.e != null) {
                            object = object.f;
                            string2 = this.a.f.p();
                            object3 = this.a;
                            string = object3.a;
                            object2 = object3.d;
                            object3 = object3.f;
                            object.o = new b((Context)string2, (Activity)string, (Fragment)object2, (D)object3, ((m)object3).t(), this.a.e);
                            this.a.f.o.i(new Object[0]);
                        }
                    }

                    @Override
                    public void c(ax.j3.c c8) {
                        Logger logger = x;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("OAUTH ERROR 2:");
                        stringBuilder.append(c8.getMessage());
                        logger.severe(stringBuilder.toString());
                        this.a.e.T(false, c8);
                    }
                });
            }
        });
    }

    protected q r0(Activity activity, Fragment fragment, W w8, int n8, c.a a8) {
        return new b(this.p(), activity, fragment, this, this.t(), a8);
    }

    private static class b
    extends q<Object, Void, Boolean> {
        Context h;
        c.a i;
        String j;
        String k;
        String l;
        D m;
        int n;
        ax.d3.W o;
        Activity p;
        String q;
        boolean r;
        boolean s;
        Exception t;

        public b(Context context, Activity object, Fragment object2, D object3, int n8, c.a a8) {
            super(q.e.c0);
            this.h = context;
            this.p = object;
            this.m = object3;
            this.i = a8;
            this.n = n8;
            this.o = (ax.d3.W)object2;
            context = context.getSharedPreferences("NextCloudPrefs", 0);
            object2 = f.T0;
            object = new c0((f)((Object)object2));
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("version_");
            ((StringBuilder)object3).append(n8);
            int n9 = context.getInt(((StringBuilder)object3).toString(), 0);
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("login_name_");
            ((StringBuilder)object3).append(n8);
            this.j = context.getString(((StringBuilder)object3).toString(), "");
            if (n9 == 0) {
                object = new StringBuilder();
                ((StringBuilder)object).append("access_token_");
                ((StringBuilder)object).append(n8);
                this.q = context.getString(((StringBuilder)object).toString(), "");
            } else {
                object2 = ax.Y2.a.a().b((f)((Object)object2));
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("access_token_");
                ((StringBuilder)object3).append(n8);
                this.q = ((c0)object).a(n9, (String)object2, context.getString(((StringBuilder)object3).toString(), ""));
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("ignorecert_");
            ((StringBuilder)object).append(n8);
            this.r = context.getBoolean(((StringBuilder)object).toString(), false);
            object = new StringBuilder();
            ((StringBuilder)object).append("server_address_");
            ((StringBuilder)object).append(n8);
            this.l = context.getString(((StringBuilder)object).toString(), "");
            object = new StringBuilder();
            ((StringBuilder)object).append("user_name_");
            ((StringBuilder)object).append(n8);
            this.k = context.getString(((StringBuilder)object).toString(), "");
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
            ax.Ja.a a82;
            block11: {
                IOException iOException2;
                block10: {
                    NullPointerException nullPointerException2;
                    block9: {
                        Object object2;
                        String string;
                        block8: {
                            Exception exception2;
                            block13: {
                                block12: {
                                    W.J0(this.h);
                                    object = ax.Ia.b.b(ServerType.TYPE_NEXTCLOUD, this.j, this.q, this.r, 15000L);
                                    try {
                                        string = D.c1((ax.Ia.a)object, this.l);
                                        boolean bl = TextUtils.isEmpty((CharSequence)this.k);
                                        if (!bl) break block8;
                                    }
                                    catch (NullPointerException nullPointerException2) {
                                        break block9;
                                    }
                                    catch (IOException iOException2) {
                                        break block10;
                                    }
                                    catch (ax.Ja.a a82) {
                                        break block11;
                                    }
                                    try {
                                        object2 = new n();
                                        string = ((n)object2).a(string).h().t("ocs").h().t("data").h().t("id").i().k();
                                        if (string == null) break block12;
                                        this.k = string;
                                        string = this.h.getSharedPreferences("NextCloudPrefs", 0).edit();
                                        object2 = new StringBuilder();
                                        ((StringBuilder)object2).append("user_name_");
                                        ((StringBuilder)object2).append(this.n);
                                        string.putString(((StringBuilder)object2).toString(), this.k).apply();
                                        break block8;
                                    }
                                    catch (Exception exception2) {
                                        break block13;
                                    }
                                }
                                ax.Ha.c.h().f().b("INVALID NEXT JSON FORMAT").h();
                                this.k = this.j;
                                break block8;
                            }
                            exception2.printStackTrace();
                            this.k = this.j;
                        }
                        object2 = D.h1(this.l, this.k);
                        if (this.m == null) return Boolean.TRUE;
                        string = Uri.parse((String)object2).getPath();
                        this.m.R0((String)object2, string);
                        this.m.P0((ax.Ia.a)object);
                        this.m.i1(this.l);
                        this.m.Q0(ServerType.TYPE_NEXTCLOUD);
                        return Boolean.TRUE;
                    }
                    this.t = nullPointerException2;
                    return Boolean.FALSE;
                }
                this.t = iOException2;
                iOException2.printStackTrace();
                return Boolean.FALSE;
            }
            this.t = a82;
            if (a82.b() == 401) {
                this.s = true;
            }
            a82.printStackTrace();
            return Boolean.FALSE;
        }

        protected void x(Boolean object) {
            if (this.s) {
                Activity activity;
                object = this.m;
                if (object != null && (activity = this.p) != null) {
                    ((D)object).k1(activity, this.o, this.l, this.n, this.i);
                    return;
                }
                this.i.T(false, this.t);
                return;
            }
            c.a a8 = this.i;
            if (a8 != null) {
                a8.T((Boolean)object, this.t);
            }
        }
    }

    public static class c
    extends T {
        Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override
        public void a(int n8) {
            Object object = this.a.getSharedPreferences("NextCloudPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("version_");
            stringBuilder.append(n8);
            object = object.remove(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("server_address_");
            stringBuilder.append(n8);
            object = object.remove(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("login_name_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("user_name_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("access_token_");
            stringBuilder.append(n8);
            object = object.remove(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("ignorecert_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("location_name_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("created_");
            stringBuilder.append(n8);
            object = object.remove(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            object.remove(stringBuilder.toString()).commit();
        }

        @Override
        public s f(int n8) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("NextCloudPrefs", 0);
            CharSequence charSequence = new StringBuilder();
            charSequence.append("login_name_");
            charSequence.append(n8);
            charSequence = sharedPreferences.getString(charSequence.toString(), null);
            Object object = new StringBuilder();
            ((StringBuilder)object).append("location_name_");
            ((StringBuilder)object).append(n8);
            String string = ((StringBuilder)object).toString();
            object = f.T0;
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
            SharedPreferences.Editor editor = this.a.getSharedPreferences("NextCloudPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("location_name_");
            stringBuilder.append(n8);
            editor.putString(stringBuilder.toString(), string);
            editor.commit();
        }

        @Override
        public void j(int n8, long l8) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("NextCloudPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            editor.putLong(stringBuilder.toString(), l8);
            editor.apply();
        }

        public void k(com.alphainventor.filemanager.activity.a a8, String string, k k8) {
            k8.b(f.T0);
            CookieSyncManager.createInstance((Context)a8);
            B.X(new ValueCallback<Boolean>(){
                final com.alphainventor.filemanager.activity.a a;
                final String b;
                final k c;
                final c d;
                {
                    this.d = c8;
                    this.a = a8;
                    this.b = string;
                    this.c = k8;
                }

                public void a(Boolean bl) {
                    D.j1(this.a, this.b, new b.d(this){
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
                            String string = object.getString("user");
                            String string2 = object.getString("password");
                            boolean bl = object.getBoolean("invalid_cert");
                            object = string != null && string.contains("@") ? "" : string;
                            int n8 = this.a.d.l();
                            a a8 = this.a;
                            a8.d.m(n8, a8.b, string2, string, (String)object, bl);
                            object = this.a.c;
                            if (object != null) {
                                object.c(f.T0, n8);
                            }
                        }

                        @Override
                        public void c(ax.j3.c c8) {
                            Logger logger = x;
                            Object object = new StringBuilder();
                            ((StringBuilder)object).append("NextCloud login error :");
                            ((StringBuilder)object).append(c8.getMessage());
                            logger.severe(((StringBuilder)object).toString());
                            object = this.a.c;
                            if (object != null) {
                                object.a(f.T0, "", 0, "", c8.getMessage());
                            }
                        }
                    });
                }
            });
        }

        int l() {
            return this.a.getSharedPreferences("NextCloudPrefs", 0).getInt("count", 0);
        }

        void m(int n8, String charSequence, String charSequence2, String string, String string2, boolean bl) {
            Context context = this.a;
            boolean bl2 = false;
            if (n8 >= (context = context.getSharedPreferences("NextCloudPrefs", 0)).getInt("count", 0)) {
                bl2 = true;
            }
            f f8 = f.T0;
            Object object = new c0(f8);
            context = context.edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("version_");
            stringBuilder.append(n8);
            SharedPreferences.Editor editor = context.putInt(stringBuilder.toString(), 3);
            stringBuilder = new StringBuilder();
            stringBuilder.append("access_token_");
            stringBuilder.append(n8);
            charSequence2 = editor.putString(stringBuilder.toString(), ((c0)object).e(ax.Y2.a.a().b(f8), (String)charSequence2));
            object = new StringBuilder();
            ((StringBuilder)object).append("ignorecert_");
            ((StringBuilder)object).append(n8);
            charSequence2 = charSequence2.putBoolean(((StringBuilder)object).toString(), bl);
            object = new StringBuilder();
            ((StringBuilder)object).append("server_address_");
            ((StringBuilder)object).append(n8);
            charSequence = charSequence2.putString(((StringBuilder)object).toString(), (String)charSequence);
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append("login_name_");
            ((StringBuilder)charSequence2).append(n8);
            charSequence2 = charSequence.putString(((StringBuilder)charSequence2).toString(), string);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("user_name_");
            ((StringBuilder)charSequence).append(n8);
            charSequence2 = charSequence2.putString(((StringBuilder)charSequence).toString(), string2);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("location_name_");
            ((StringBuilder)charSequence).append(n8);
            charSequence2.putString(((StringBuilder)charSequence).toString(), f8.M(this.a));
            if (bl2) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("created_");
                ((StringBuilder)charSequence).append(n8);
                context.putLong(((StringBuilder)charSequence).toString(), System.currentTimeMillis());
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("sortindex_");
                ((StringBuilder)charSequence).append(n8);
                context.putLong(((StringBuilder)charSequence).toString(), System.currentTimeMillis());
            }
            if (bl2) {
                context.putInt("count", n8 + 1);
            }
            context.commit();
        }

        public void n(com.alphainventor.filemanager.activity.a a8) {
            U u8 = U.l3(f.T0);
            B.d0(a8.getSupportFragmentManager(), u8, "serveraddress", true);
        }
    }
}

