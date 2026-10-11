/*
 * Decompiled with CFR 0.152.
 */
package ax.l;

import android.content.Context;
import android.content.Intent;
import ax.Gb.g;
import ax.Gb.l;
import ax.Lb.f;
import ax.l.a;
import ax.sb.m;
import ax.sb.q;
import ax.tb.F;
import ax.tb.i;
import ax.tb.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b
extends ax.l.a<String[], Map<String, Boolean>> {
    public static final a a = new a(null);

    public Intent d(Context context, String[] stringArray) {
        l.f(context, "context");
        l.f(stringArray, "input");
        return a.a(stringArray);
    }

    public a.a<Map<String, Boolean>> e(Context object, String[] stringArray) {
        int n8;
        l.f(object, "context");
        l.f(stringArray, "input");
        if (stringArray.length == 0) {
            return new a.a<Map<String, Boolean>>(F.g());
        }
        int n9 = stringArray.length;
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            if (ax.Q.b.a((Context)object, stringArray[n8]) == 0) {
                continue;
            }
            return null;
        }
        object = new LinkedHashMap(f.b(F.d(stringArray.length), 16));
        n9 = stringArray.length;
        for (n8 = n10; n8 < n9; ++n8) {
            m<String, Boolean> m8 = q.a(stringArray[n8], Boolean.TRUE);
            object.put(m8.c(), m8.d());
        }
        return new a.a<Context>((Context)object);
    }

    public Map<String, Boolean> f(int n8, Intent object) {
        if (n8 != -1) {
            return F.g();
        }
        if (object == null) {
            return F.g();
        }
        String[] stringArray = object.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] nArray = object.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (nArray != null && stringArray != null) {
            object = new ArrayList(nArray.length);
            int n9 = nArray.length;
            for (n8 = 0; n8 < n9; ++n8) {
                boolean bl = nArray[n8] == 0;
                object.add(bl);
            }
            return F.n(o.Z((Iterable)i.t(stringArray), object));
        }
        return F.g();
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final Intent a(String[] intent) {
            l.f(intent, "input");
            intent = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[])intent);
            l.e(intent, "Intent(ACTION_REQUEST_PE\u2026EXTRA_PERMISSIONS, input)");
            return intent;
        }
    }
}

