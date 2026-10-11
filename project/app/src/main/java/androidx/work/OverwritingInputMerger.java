/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import androidx.work.b;
import ax.B2.g;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger
extends g {
    @Override
    public b b(List<b> object) {
        b.a a8 = new b.a();
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        object = object.iterator();
        while (object.hasNext()) {
            hashMap.putAll(((b)object.next()).h());
        }
        a8.d(hashMap);
        return a8.a();
    }
}

