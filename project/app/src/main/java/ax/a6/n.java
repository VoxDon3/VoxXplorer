/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import ax.a6.I0;
import ax.a6.Y;
import ax.a6.Z;
import ax.a6.j0;
import ax.a6.p;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class n
implements j0 {
    private final Application a;
    private final p b;
    private final I0 c;
    private final Executor d;

    public n(Application application, p p8, I0 i02, Executor executor) {
        this.a = application;
        this.b = p8;
        this.d = executor;
        this.c = i02;
    }

    @Override
    public final Executor a() {
        return this.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean b(String object, JSONObject object2) {
        int n8 = ((String)object).hashCode();
        int n9 = 0;
        if (n8 != 94746189) {
            if (n8 != 113399775) return false;
            if (!((String)object).equals("write")) return false;
            n8 = 0;
        } else {
            if (!((String)object).equals("clear")) return false;
            n8 = 1;
        }
        if (n8 != 0) {
            if (n8 != 1) {
                return false;
            }
            object = object2.optJSONArray("keys");
            if (object != null && object.length() != 0) {
                object2 = new HashSet();
                int n10 = object.length();
                for (n8 = n9; n8 < n10; ++n8) {
                    CharSequence charSequence = object.optString(n8);
                    if (TextUtils.isEmpty((CharSequence)charSequence)) {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append("Action[clear]: empty key at index: ");
                        ((StringBuilder)charSequence).append(n8);
                        Log.d((String)"UserMessagingPlatform", (String)((StringBuilder)charSequence).toString());
                        continue;
                    }
                    object2.add(charSequence);
                }
                Z.b((Context)this.a, (Set)object2);
                return true;
            } else {
                Log.d((String)"UserMessagingPlatform", (String)"Action[clear]: wrong args.".concat(String.valueOf(object2.toString())));
            }
            return true;
        }
        object = new Y((Context)this.a);
        Iterator iterator = object2.keys();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            Object object3 = object2.opt(string);
            String string2 = String.valueOf(object3);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Writing to storage: [");
            stringBuilder.append(string);
            stringBuilder.append("] ");
            stringBuilder.append(string2);
            Log.d((String)"UserMessagingPlatform", (String)stringBuilder.toString());
            if (((Y)object).e(string, object3)) {
                this.b.c().add(string);
                continue;
            }
            Log.d((String)"UserMessagingPlatform", (String)"Failed writing key: ".concat(String.valueOf(string)));
        }
        this.b.d();
        ((Y)object).c();
        object2 = ((Y)object).b();
        if (object2.size() <= 1) return true;
        this.c.a((Map)object2);
        ((Y)object).d();
        return true;
    }
}

