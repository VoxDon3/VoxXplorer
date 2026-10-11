package androidx.work;

import androidx.work.b;
import ax.B2.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends g {
    @Override // ax.B2.g
    public b b(List<b> list) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            hashMap.putAll(it.next().h());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}
