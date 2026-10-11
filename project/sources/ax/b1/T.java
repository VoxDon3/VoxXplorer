package ax.b1;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class T extends IOException {
    public final Uri c0;
    public final Map<String, List<String>> d0;
    public final long e0;
    public final ax.U0.k q;

    public T(ax.U0.k kVar, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.q = kVar;
        this.c0 = uri;
        this.d0 = map;
        this.e0 = j;
    }
}
