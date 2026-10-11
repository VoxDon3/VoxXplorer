package ax.C5;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes3.dex */
final class b extends Thread {
    final /* synthetic */ Map q;

    b(a aVar, Map map) {
        this.q = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.q;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        d.a(buildUpon.build().toString());
    }
}
