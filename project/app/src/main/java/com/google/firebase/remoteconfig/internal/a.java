/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import ax.i8.h;
import ax.i8.i;
import ax.i8.k;
import ax.j6.j;
import ax.j6.m;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    private final Set<ax.i8.c> a;
    private final HttpURLConnection b;
    private final d c;
    private final b d;
    private final ax.i8.c e;
    private final ScheduledExecutorService f;
    private final Random g;

    public a(HttpURLConnection httpURLConnection, d d8, b b8, Set<ax.i8.c> set, ax.i8.c c8, ScheduledExecutorService scheduledExecutorService) {
        this.b = httpURLConnection;
        this.c = d8;
        this.d = b8;
        this.a = set;
        this.e = c8;
        this.f = scheduledExecutorService;
        this.g = new Random();
    }

    public static /* synthetic */ j a(a a8, j set, j object, long l8, int n8, j object2) {
        a8.getClass();
        if (!((j)((Object)set)).m()) {
            return m.d(new h("Failed to auto-fetch config update.", ((j)((Object)set)).i()));
        }
        if (!((j)object).m()) {
            return m.d(new h("Failed to get activated config for auto-fetch", ((j)object).i()));
        }
        object2 = (d.a)((j)((Object)set)).j();
        object = (c)((j)object).j();
        if (!com.google.firebase.remoteconfig.internal.a.e((d.a)object2, l8).booleanValue()) {
            Log.d((String)"FirebaseRemoteConfig", (String)"Fetched template version is the same as SDK's current version. Retrying fetch.");
            a8.b(n8, l8);
            return m.e(null);
        }
        if (((d.a)object2).d() == null) {
            Log.d((String)"FirebaseRemoteConfig", (String)"The fetch succeeded, but the backend had no updates.");
            return m.e(null);
        }
        set = object;
        if (object == null) {
            set = com.google.firebase.remoteconfig.internal.c.l().a();
        }
        if ((set = ((c)((Object)set)).f(((d.a)object2).d())).isEmpty()) {
            Log.d((String)"FirebaseRemoteConfig", (String)"Config was fetched, but no params changed.");
            return m.e(null);
        }
        a8.c(ax.i8.b.a(set));
        return m.e(null);
    }

    private void b(int n8, long l8) {
        if (n8 == 0) {
            this.j(new k("Unable to fetch the latest version of the template.", i.a.f0));
            return;
        }
        int n9 = this.g.nextInt(4);
        this.f.schedule(new Runnable(){
            final long c0;
            final a d0;
            final int q;
            {
                this.d0 = a8;
                this.q = n8;
                this.c0 = l8;
            }

            @Override
            public void run() {
                this.d0.d(this.q, this.c0);
            }
        }, (long)n9, TimeUnit.SECONDS);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c(ax.i8.b b8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Iterator<ax.i8.c> iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().b(b8);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    private static Boolean e(d.a a8, long l8) {
        c c8 = a8.d();
        boolean bl = false;
        boolean bl2 = false;
        if (c8 != null) {
            if (a8.d().k() >= l8) {
                bl2 = true;
            }
            return bl2;
        }
        bl2 = bl;
        if (a8.f() == 1) {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void f(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        block2: while (true) {
            String string;
            Object object = "";
            while ((string = bufferedReader.readLine()) != null) {
                JSONException jSONException2;
                block5: {
                    Object object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append(string);
                    object = object2 = ((StringBuilder)object2).toString();
                    if (!string.contains("}") || ((String)(object = this.i((String)object2))).isEmpty()) continue;
                    try {
                        object2 = new JSONObject((String)object);
                        if (object2.has("featureDisabled") && object2.getBoolean("featureDisabled")) {
                            object2 = this.e;
                            object = new k("The server is temporarily unavailable. Try again in a few minutes.", i.a.g0);
                            object2.a((i)object);
                            break block2;
                        }
                    }
                    catch (JSONException jSONException2) {
                        break block5;
                    }
                    if (this.g()) break block2;
                    if (!object2.has("latestTemplateVersionNumber")) continue block2;
                    long l8 = this.c.r();
                    long l9 = object2.getLong("latestTemplateVersionNumber");
                    if (l9 <= l8) continue block2;
                    this.b(3, l9);
                    continue block2;
                }
                this.j(new h("Unable to parse config update message.", jSONException2.getCause(), i.a.e0));
                Log.e((String)"FirebaseRemoteConfig", (String)"Unable to parse latest config update message.", (Throwable)jSONException2);
                continue block2;
            }
            break;
        }
        bufferedReader.close();
        inputStream.close();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean g() {
        synchronized (this) {
            return this.a.isEmpty();
        }
    }

    private String i(String string) {
        int n8 = string.indexOf(123);
        int n9 = string.lastIndexOf(125);
        if (n8 >= 0 && n9 >= 0) {
            if (n8 >= n9) {
                return "";
            }
            return string.substring(n8, n9 + 1);
        }
        return "";
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void j(i i8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Iterator<ax.i8.c> iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().a(i8);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public j<Void> d(int n8, long l8) {
        synchronized (this) {
            RuntimeException var4_7;
            ScheduledExecutorService scheduledExecutorService;
            j<List<j<Object>>> j8;
            j<c> j9;
            j<d.a> j10;
            --n8;
            try {
                j10 = this.c.n(d.b.d0, 3 - n8);
                j9 = this.d.e();
                j8 = m.j(j10, j9);
                scheduledExecutorService = this.f;
            }
            catch (Throwable throwable) {}
            try {
                ax.j8.a a8 = new ax.j8.a(this, j10, j9, l8, n8);
                return j8.h(scheduledExecutorService, a8);
            }
            catch (Throwable throwable) {}
            throw var4_7;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void h() {
        Throwable throwable2222222;
        block5: {
            Object object = this.b;
            if (object == null) {
                return;
            }
            object = ((URLConnection)object).getInputStream();
            this.f((InputStream)object);
            ((InputStream)object).close();
            this.b.disconnect();
            return;
            {
                catch (Throwable throwable2222222) {
                    break block5;
                }
                catch (IOException iOException) {}
                {
                    Log.d((String)"FirebaseRemoteConfig", (String)"Stream was cancelled due to an exception. Retrying the connection...", (Throwable)iOException);
                    this.b.disconnect();
                }
            }
            return;
        }
        this.b.disconnect();
        throw throwable2222222;
    }
}

