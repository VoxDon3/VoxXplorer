package ax.la;

import android.app.Activity;
import android.content.ComponentName;
import android.net.Uri;
import ax.z.AbstractServiceConnectionC3533e;
import ax.z.C3531c;
import ax.z.C3532d;
import ax.z.C3534f;

/* loaded from: classes3.dex */
public class l {
    private final Uri a;
    private AbstractServiceConnectionC3533e b = new a();
    private C3534f c;

    public l(Uri uri) {
        this.a = uri;
    }

    public void d(Activity activity) {
        AbstractServiceConnectionC3533e abstractServiceConnectionC3533e = this.b;
        if (abstractServiceConnectionC3533e != null) {
            activity.unbindService(abstractServiceConnectionC3533e);
            this.b = null;
            this.c = null;
        }
    }

    public void e(Activity activity, String str) {
        C3531c.a(activity, activity.getPackageName(), this.b);
        C3532d a2 = new C3532d.C0505d(this.c).f(true).a();
        a2.a.setPackage(str);
        a2.a.setData(this.a);
        a2.a(activity, this.a);
    }

    class a extends AbstractServiceConnectionC3533e {
        a() {
        }

        @Override // ax.z.AbstractServiceConnectionC3533e
        public void a(ComponentName componentName, C3531c c3531c) {
            c3531c.e(0L);
            l.this.c = c3531c.c(null);
            if (l.this.c != null) {
                l.this.c.f(l.this.a, null, null);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
