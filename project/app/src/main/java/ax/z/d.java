/*
 * Decompiled with CFR 0.152.
 */
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
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import ax.z.a;
import ax.z.f;
import java.util.ArrayList;

public final class d {
    public final Intent a;
    public final Bundle b;

    d(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.a.setData(uri);
        ax.Q.b.l(context, this.a, this.b);
    }

    private static class a {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    private static class b {
        static String a() {
            LocaleList localeList = LocaleList.getAdjustedDefault();
            if (localeList.size() > 0) {
                return localeList.get(0).toLanguageTag();
            }
            return null;
        }
    }

    private static class c {
        static void a(ActivityOptions activityOptions, boolean bl) {
            activityOptions.setShareIdentityEnabled(bl);
        }
    }

    public static final class d {
        private final Intent a = new Intent("android.intent.action.VIEW");
        private final a.a b = new a.a();
        private ArrayList<Bundle> c;
        private ActivityOptions d;
        private ArrayList<Bundle> e;
        private SparseArray<Bundle> f;
        private Bundle g;
        private int h = 0;
        private boolean i = true;
        private boolean j;

        public d(f f8) {
            if (f8 != null) {
                this.c(f8);
            }
        }

        private void b() {
            Bundle bundle;
            String string = ax.z.d$b.a();
            if (!TextUtils.isEmpty((CharSequence)string) && !(bundle = this.a.hasExtra("com.android.browser.headers") ? this.a.getBundleExtra("com.android.browser.headers") : new Bundle()).containsKey("Accept-Language")) {
                bundle.putString("Accept-Language", string);
                this.a.putExtra("com.android.browser.headers", bundle);
            }
        }

        private void d(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", (Parcelable)pendingIntent);
            }
            this.a.putExtras(bundle);
        }

        private void e() {
            if (this.d == null) {
                this.d = ax.z.d$a.a();
            }
            ax.z.d$c.a(this.d, this.j);
        }

        public d a() {
            Bundle bundle;
            boolean bl = this.a.hasExtra("android.support.customtabs.extra.SESSION");
            Bundle bundle2 = null;
            if (!bl) {
                this.d(null, null);
            }
            if ((bundle = this.c) != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", bundle);
            }
            if ((bundle = this.e) != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", bundle);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.i);
            this.a.putExtras(this.b.a().a());
            bundle = this.g;
            if (bundle != null) {
                this.a.putExtras(bundle);
            }
            if (this.f != null) {
                bundle = new Bundle();
                bundle.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f);
                this.a.putExtras(bundle);
            }
            this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.h);
            int n8 = Build.VERSION.SDK_INT;
            if (n8 >= 24) {
                this.b();
            }
            if (n8 >= 34) {
                this.e();
            }
            if ((bundle = this.d) != null) {
                bundle2 = bundle.toBundle();
            }
            return new d(this.a, bundle2);
        }

        public d c(f f8) {
            this.a.setPackage(f8.d().getPackageName());
            this.d(f8.c(), f8.e());
            return this;
        }

        public d f(boolean bl) {
            this.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", bl ? 1 : 0);
            return this;
        }
    }
}

