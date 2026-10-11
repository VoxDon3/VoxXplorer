/*
 * Decompiled with CFR 0.152.
 */
package ax.la;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import ax.z.c;
import ax.z.d;
import ax.z.e;
import ax.z.f;

public class l {
    private final Uri a;
    private e b;
    private f c;

    public l(Uri uri) {
        this.a = uri;
        this.b = new e(this){
            final l c0;
            {
                this.c0 = l8;
            }

            @Override
            public void a(ComponentName componentName, c c8) {
                c8.e(0L);
                this.c0.c = c8.c(null);
                if (this.c0.c != null) {
                    this.c0.c.f(this.c0.a, null, null);
                }
            }

            public void onServiceDisconnected(ComponentName componentName) {
            }
        };
    }

    public void d(Activity activity) {
        e e8 = this.b;
        if (e8 != null) {
            activity.unbindService((ServiceConnection)e8);
            this.b = null;
            this.c = null;
        }
    }

    public void e(Activity activity, String string) {
        ax.z.c.a((Context)activity, activity.getPackageName(), this.b);
        d d8 = new d.d(this.c).f(true).a();
        d8.a.setPackage(string);
        d8.a.setData(this.a);
        d8.a((Context)activity, this.a);
    }
}

