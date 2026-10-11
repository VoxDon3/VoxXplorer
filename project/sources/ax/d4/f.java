package ax.d4;

import android.content.Context;
import ax.d4.c;

/* loaded from: classes.dex */
public class f implements d {
    @Override // ax.d4.d
    public c a(Context context, c.a aVar) {
        return ax.Q.b.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new e(context, aVar) : new j();
    }
}
