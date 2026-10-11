package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
final class X3 implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ C3688k3 a;

    X3(C3688k3 c3688k3) {
        this.a = c3688k3;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00af A[Catch: RuntimeException -> 0x0028, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0028, blocks: (B:3:0x000c, B:5:0x0018, B:8:0x002c, B:14:0x00af, B:16:0x00bb, B:20:0x00d3, B:22:0x00d9, B:25:0x00e6, B:27:0x00ec, B:28:0x00ff, B:31:0x010b, B:36:0x0113, B:40:0x0136, B:41:0x0152, B:43:0x0143, B:44:0x0159, B:46:0x015f, B:48:0x0165, B:50:0x016b, B:52:0x0171, B:54:0x0179, B:56:0x0181, B:58:0x0187, B:61:0x018d, B:63:0x0040, B:66:0x0048, B:68:0x0050, B:70:0x0056, B:72:0x005c, B:74:0x0062, B:76:0x006a, B:78:0x0072, B:80:0x007a, B:82:0x0082, B:83:0x008e, B:85:0x00a6), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9 A[Catch: RuntimeException -> 0x0028, TryCatch #0 {RuntimeException -> 0x0028, blocks: (B:3:0x000c, B:5:0x0018, B:8:0x002c, B:14:0x00af, B:16:0x00bb, B:20:0x00d3, B:22:0x00d9, B:25:0x00e6, B:27:0x00ec, B:28:0x00ff, B:31:0x010b, B:36:0x0113, B:40:0x0136, B:41:0x0152, B:43:0x0143, B:44:0x0159, B:46:0x015f, B:48:0x0165, B:50:0x016b, B:52:0x0171, B:54:0x0179, B:56:0x0181, B:58:0x0187, B:61:0x018d, B:63:0x0040, B:66:0x0048, B:68:0x0050, B:70:0x0056, B:72:0x005c, B:74:0x0062, B:76:0x006a, B:78:0x0072, B:80:0x007a, B:82:0x0082, B:83:0x008e, B:85:0x00a6), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0113 A[Catch: RuntimeException -> 0x0028, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0028, blocks: (B:3:0x000c, B:5:0x0018, B:8:0x002c, B:14:0x00af, B:16:0x00bb, B:20:0x00d3, B:22:0x00d9, B:25:0x00e6, B:27:0x00ec, B:28:0x00ff, B:31:0x010b, B:36:0x0113, B:40:0x0136, B:41:0x0152, B:43:0x0143, B:44:0x0159, B:46:0x015f, B:48:0x0165, B:50:0x016b, B:52:0x0171, B:54:0x0179, B:56:0x0181, B:58:0x0187, B:61:0x018d, B:63:0x0040, B:66:0x0048, B:68:0x0050, B:70:0x0056, B:72:0x005c, B:74:0x0062, B:76:0x006a, B:78:0x0072, B:80:0x007a, B:82:0x0082, B:83:0x008e, B:85:0x00a6), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void a(com.google.android.gms.measurement.internal.X3 r17, boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.X3.a(com.google.android.gms.measurement.internal.X3, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        X3 x3;
        try {
            try {
                this.a.k().K().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    this.a.s().F(activity, bundle);
                    return;
                }
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString("com.android.vending.referral_url");
                        if (!TextUtils.isEmpty(string)) {
                            data = Uri.parse(string);
                        }
                    }
                    data = null;
                }
                Uri uri = data;
                if (uri == null || !uri.isHierarchical()) {
                    this.a.s().F(activity, bundle);
                    return;
                }
                this.a.i();
                String str = B5.f0(intent) ? "gs" : "auto";
                String queryParameter = uri.getQueryParameter("referrer");
                x3 = this;
                try {
                    this.a.l().D(new W3(x3, bundle == null, uri, str, queryParameter));
                    x3.a.s().F(activity, bundle);
                } catch (RuntimeException e) {
                    e = e;
                    x3.a.k().G().b("Throwable caught in onActivityCreated", e);
                    x3.a.s().F(activity, bundle);
                }
            } catch (Throwable th) {
                th = th;
                this.a.s().F(activity, bundle);
                throw th;
            }
        } catch (RuntimeException e2) {
            e = e2;
            x3 = this;
        } catch (Throwable th2) {
            th = th2;
            this.a.s().F(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.a.s().E(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.a.s().Q(activity);
        V4 u = this.a.u();
        u.l().D(new W4(u, u.b().b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        V4 u = this.a.u();
        u.l().D(new X4(u, u.b().b()));
        this.a.s().S(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.a.s().R(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
