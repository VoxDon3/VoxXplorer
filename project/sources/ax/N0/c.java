package ax.N0;

import android.app.PendingIntent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import ax.P.k;
import ax.P.l;

/* loaded from: classes.dex */
public class c extends l.f {
    MediaSessionCompat.Token f;
    PendingIntent g;
    CharSequence h;
    int i;
    PendingIntent j;
    int[] e = null;
    boolean k = false;

    @Override // ax.P.l.f
    public void b(k kVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.d(kVar.a(), a.b(b.a(a.a(), this.h, this.i, this.j, Boolean.valueOf(this.k)), this.e, this.f));
        } else {
            a.d(kVar.a(), a.b(a.a(), this.e, this.f));
        }
    }

    @Override // ax.P.l.f
    public RemoteViews d(k kVar) {
        return null;
    }

    @Override // ax.P.l.f
    public RemoteViews e(k kVar) {
        return null;
    }

    public c h(PendingIntent pendingIntent) {
        this.g = pendingIntent;
        return this;
    }

    public c i(MediaSessionCompat.Token token) {
        this.f = token;
        return this;
    }

    public c j(int... iArr) {
        this.e = iArr;
        return this;
    }

    public c k(boolean z) {
        return this;
    }
}
