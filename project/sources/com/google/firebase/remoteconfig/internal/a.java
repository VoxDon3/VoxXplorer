package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import ax.i8.AbstractC2284b;
import ax.i8.InterfaceC2285c;
import ax.i8.i;
import ax.i8.k;
import ax.j6.AbstractC2327j;
import ax.j6.InterfaceC2319b;
import ax.j6.m;
import ax.m.j;
import com.google.firebase.remoteconfig.internal.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class a {
    private final Set<InterfaceC2285c> a;
    private final HttpURLConnection b;
    private final d c;
    private final b d;
    private final InterfaceC2285c e;
    private final ScheduledExecutorService f;
    private final Random g = new Random();

    /* renamed from: com.google.firebase.remoteconfig.internal.a$a, reason: collision with other inner class name */
    class RunnableC0563a implements Runnable {
        final /* synthetic */ long c0;
        final /* synthetic */ int q;

        RunnableC0563a(int i, long j) {
            this.q = i;
            this.c0 = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.d(this.q, this.c0);
        }
    }

    public a(HttpURLConnection httpURLConnection, d dVar, b bVar, Set<InterfaceC2285c> set, InterfaceC2285c interfaceC2285c, ScheduledExecutorService scheduledExecutorService) {
        this.b = httpURLConnection;
        this.c = dVar;
        this.d = bVar;
        this.a = set;
        this.e = interfaceC2285c;
        this.f = scheduledExecutorService;
    }

    public static /* synthetic */ AbstractC2327j a(a aVar, AbstractC2327j abstractC2327j, AbstractC2327j abstractC2327j2, long j, int i, AbstractC2327j abstractC2327j3) {
        aVar.getClass();
        if (!abstractC2327j.m()) {
            return m.d(new ax.i8.h("Failed to auto-fetch config update.", abstractC2327j.i()));
        }
        if (!abstractC2327j2.m()) {
            return m.d(new ax.i8.h("Failed to get activated config for auto-fetch", abstractC2327j2.i()));
        }
        d.a aVar2 = (d.a) abstractC2327j.j();
        c cVar = (c) abstractC2327j2.j();
        if (!e(aVar2, j).booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            aVar.b(i, j);
            return m.e(null);
        }
        if (aVar2.d() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return m.e(null);
        }
        if (cVar == null) {
            cVar = c.l().a();
        }
        Set<String> f = cVar.f(aVar2.d());
        if (f.isEmpty()) {
            Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
            return m.e(null);
        }
        aVar.c(AbstractC2284b.a(f));
        return m.e(null);
    }

    private void b(int i, long j) {
        if (i == 0) {
            j(new k("Unable to fetch the latest version of the template.", i.a.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.f.schedule(new RunnableC0563a(i, j), this.g.nextInt(4), TimeUnit.SECONDS);
        }
    }

    private synchronized void c(AbstractC2284b abstractC2284b) {
        Iterator<InterfaceC2285c> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(abstractC2284b);
        }
    }

    private static Boolean e(d.a aVar, long j) {
        if (aVar.d() != null) {
            return Boolean.valueOf(aVar.d().k() >= j);
        }
        return Boolean.valueOf(aVar.f() == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r5 = new org.json.JSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r5.has("featureDisabled") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r5.getBoolean("featureDisabled") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r9.e.a(new ax.i8.k("The server is temporarily unavailable. Try again in a few minutes.", ax.i8.i.a.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (g() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r5.has("latestTemplateVersionNumber") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        r6 = r9.c.r();
        r4 = r5.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (r4 <= r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        b(3, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(java.io.InputStream r10) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = "latestTemplateVersionNumber"
            java.lang.String r1 = "featureDisabled"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "utf-8"
            r3.<init>(r10, r4)
            r2.<init>(r3)
            java.lang.String r3 = ""
        L12:
            r4 = r3
        L13:
            java.lang.String r5 = r2.readLine()
            if (r5 == 0) goto L96
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "}"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L13
            java.lang.String r4 = r9.i(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L3b
            goto L13
        L3b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5b
            r5.<init>(r4)     // Catch: org.json.JSONException -> L5b
            boolean r4 = r5.has(r1)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L5d
            boolean r4 = r5.getBoolean(r1)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L5d
            ax.i8.c r4 = r9.e     // Catch: org.json.JSONException -> L5b
            ax.i8.k r5 = new ax.i8.k     // Catch: org.json.JSONException -> L5b
            java.lang.String r6 = "The server is temporarily unavailable. Try again in a few minutes."
            ax.i8.i$a r7 = ax.i8.i.a.CONFIG_UPDATE_UNAVAILABLE     // Catch: org.json.JSONException -> L5b
            r5.<init>(r6, r7)     // Catch: org.json.JSONException -> L5b
            r4.a(r5)     // Catch: org.json.JSONException -> L5b
            goto L96
        L5b:
            r4 = move-exception
            goto L7d
        L5d:
            boolean r4 = r9.g()     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L64
            goto L96
        L64:
            boolean r4 = r5.has(r0)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L12
            com.google.firebase.remoteconfig.internal.d r4 = r9.c     // Catch: org.json.JSONException -> L5b
            long r6 = r4.r()     // Catch: org.json.JSONException -> L5b
            long r4 = r5.getLong(r0)     // Catch: org.json.JSONException -> L5b
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L12
            r6 = 3
            r9.b(r6, r4)     // Catch: org.json.JSONException -> L5b
            goto L12
        L7d:
            ax.i8.h r5 = new ax.i8.h
            java.lang.Throwable r6 = r4.getCause()
            ax.i8.i$a r7 = ax.i8.i.a.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r8 = "Unable to parse config update message."
            r5.<init>(r8, r6, r7)
            r9.j(r5)
            java.lang.String r5 = "FirebaseRemoteConfig"
            java.lang.String r6 = "Unable to parse latest config update message."
            android.util.Log.e(r5, r6, r4)
            goto L12
        L96:
            r2.close()
            r10.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.a.f(java.io.InputStream):void");
    }

    private synchronized boolean g() {
        return this.a.isEmpty();
    }

    private String i(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(j.L0);
        return (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) ? HttpUrl.FRAGMENT_ENCODE_SET : str.substring(indexOf, lastIndexOf + 1);
    }

    private synchronized void j(i iVar) {
        Iterator<InterfaceC2285c> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(iVar);
        }
    }

    public synchronized AbstractC2327j<Void> d(int i, final long j) {
        final int i2 = i - 1;
        try {
            try {
                final AbstractC2327j<d.a> n = this.c.n(d.b.REALTIME, 3 - i2);
                final AbstractC2327j<c> e = this.d.e();
                return m.j(n, e).h(this.f, new InterfaceC2319b() { // from class: ax.j8.a
                    @Override // ax.j6.InterfaceC2319b
                    public final Object a(AbstractC2327j abstractC2327j) {
                        return com.google.firebase.remoteconfig.internal.a.a(com.google.firebase.remoteconfig.internal.a.this, n, e, j, i2, abstractC2327j);
                    }
                });
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void h() {
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            f(inputStream);
            inputStream.close();
        } catch (IOException e) {
            Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e);
        } finally {
            this.b.disconnect();
        }
    }
}
