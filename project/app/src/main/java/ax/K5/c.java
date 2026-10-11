/*
 * Decompiled with CFR 0.152.
 */
package ax.K5;

import android.text.TextUtils;
import ax.B.a;
import ax.L5.b;
import ax.M5.p;
import java.util.ArrayList;

public class c
extends Exception {
    private final a q;

    public c(a a8) {
        this.q = a8;
    }

    @Override
    public String getMessage() {
        ArrayList<String> arrayList = new ArrayList<String>();
        Object object = this.q.keySet().iterator();
        boolean bl = true;
        while (object.hasNext()) {
            Object object2 = (b)object.next();
            Object object3 = p.l((ax.J5.c)this.q.get(object2));
            bl &= ((ax.J5.c)object3).C() ^ true;
            object2 = ((b)object2).b();
            object3 = String.valueOf(object3);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object2);
            stringBuilder.append(": ");
            stringBuilder.append((String)object3);
            arrayList.add(stringBuilder.toString());
        }
        object = new StringBuilder();
        if (bl) {
            ((StringBuilder)object).append("None of the queried APIs are available. ");
        } else {
            ((StringBuilder)object).append("Some of the queried APIs are unavailable. ");
        }
        ((StringBuilder)object).append(TextUtils.join((CharSequence)"; ", arrayList));
        return ((StringBuilder)object).toString();
    }
}

