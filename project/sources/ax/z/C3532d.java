package ax.z;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import ax.z.C3529a;
import java.util.ArrayList;

/* renamed from: ax.z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3532d {
    public final Intent a;
    public final Bundle b;

    /* renamed from: ax.z.d$a */
    private static class a {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* renamed from: ax.z.d$b */
    private static class b {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* renamed from: ax.z.d$c */
    private static class c {
        static void a(ActivityOptions activityOptions, boolean z) {
            activityOptions.setShareIdentityEnabled(z);
        }
    }

    /* renamed from: ax.z.d$d, reason: collision with other inner class name */
    public static final class C0505d {
        private ArrayList<Bundle> c;
        private ActivityOptions d;
        private ArrayList<Bundle> e;
        private SparseArray<Bundle> f;
        private Bundle g;
        private boolean j;
        private final Intent a = new Intent("android.intent.action.VIEW");
        private final C3529a.C0504a b = new C3529a.C0504a();
        private int h = 0;
        private boolean i = true;

        public C0505d(C3534f c3534f) {
            if (c3534f != null) {
                c(c3534f);
            }
        }

        private void b() {
            String a = b.a();
            if (TextUtils.isEmpty(a)) {
                return;
            }
            Bundle bundleExtra = this.a.hasExtra("com.android.browser.headers") ? this.a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", a);
            this.a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void d(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.a.putExtras(bundle);
        }

        private void e() {
            if (this.d == null) {
                this.d = a.a();
            }
            c.a(this.d, this.j);
        }

        public C3532d a() {
            if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
                d(null, null);
            }
            ArrayList<Bundle> arrayList = this.c;
            if (arrayList != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.e;
            if (arrayList2 != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.i);
            this.a.putExtras(this.b.a().a());
            Bundle bundle = this.g;
            if (bundle != null) {
                this.a.putExtras(bundle);
            }
            if (this.f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f);
                this.a.putExtras(bundle2);
            }
            this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.h);
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                b();
            }
            if (i >= 34) {
                e();
            }
            ActivityOptions activityOptions = this.d;
            return new C3532d(this.a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public C0505d c(C3534f c3534f) {
            this.a.setPackage(c3534f.d().getPackageName());
            d(c3534f.c(), c3534f.e());
            return this;
        }

        public C0505d f(boolean z) {
            this.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }
    }

    C3532d(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.a.setData(uri);
        ax.Q.b.l(context, this.a, this.b);
    }
}
