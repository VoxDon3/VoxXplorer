/*
 * Decompiled with CFR 0.152.
 */
package ax.C5;

import android.net.Uri;
import ax.C5.a;
import ax.C5.d;
import java.util.Map;

final class b
extends Thread {
    final Map q;

    b(a a8, Map map) {
        this.q = map;
    }

    @Override
    public final void run() {
        Map map = this.q;
        Uri.Builder builder = Uri.parse((String)"https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String string : map.keySet()) {
            builder.appendQueryParameter(string, (String)map.get(string));
        }
        d.a(builder.build().toString());
    }
}

