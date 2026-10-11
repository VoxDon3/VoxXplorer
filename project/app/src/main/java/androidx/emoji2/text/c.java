/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.e;
import androidx.emoji2.text.k;
import ax.Z.i;
import ax.b0.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c {
    public static k a(Context context) {
        return (k)new a(null).c(context);
    }

    public static class a {
        private final b a;

        public a(b b8) {
            if (b8 == null) {
                b8 = androidx.emoji2.text.c$a.e();
            }
            this.a = b8;
        }

        private e.b a(Context context, i i8) {
            if (i8 == null) {
                return null;
            }
            return new k(context, i8);
        }

        private List<List<byte[]>> b(Signature[] signatureArray) {
            ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
            int n8 = signatureArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                arrayList.add(signatureArray[i8].toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        private i d(ProviderInfo object, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String string = object.authority;
            object = object.packageName;
            return new i(string, (String)object, "emojicompat-emoji-font", this.b(this.a.b(packageManager, (String)object)));
        }

        private static b e() {
            if (Build.VERSION.SDK_INT >= 28) {
                return new c();
            }
            return new b();
        }

        private boolean f(ProviderInfo providerInfo) {
            return providerInfo != null && (providerInfo = providerInfo.applicationInfo) != null && (providerInfo.flags & 1) == 1;
        }

        private ProviderInfo g(PackageManager object) {
            for (ResolveInfo resolveInfo : this.a.c((PackageManager)object, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
                if (!this.f((ProviderInfo)(resolveInfo = this.a.a(resolveInfo)))) continue;
                return resolveInfo;
            }
            return null;
        }

        public e.b c(Context context) {
            return this.a(context, this.h(context));
        }

        i h(Context object) {
            PackageManager packageManager = object.getPackageManager();
            g.h(packageManager, "Package manager required to locate emoji font provider");
            object = this.g(packageManager);
            if (object == null) {
                return null;
            }
            try {
                object = this.d((ProviderInfo)object, packageManager);
                return object;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                Log.wtf((String)"emoji2.text.DefaultEmojiConfig", (Throwable)nameNotFoundException);
                return null;
            }
        }
    }

    public static class b {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        public Signature[] b(PackageManager packageManager, String string) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo((String)string, (int)64).signatures;
        }

        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int n8) {
            return packageManager.queryIntentContentProviders(intent, n8);
        }
    }

    public static class c
    extends b {
        @Override
        public Signature[] b(PackageManager packageManager, String string) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo((String)string, (int)64).signatures;
        }
    }
}

