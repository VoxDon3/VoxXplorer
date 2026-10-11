package ax.P;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import ax.P.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
class o {
    private static final Object a = new Object();
    private static final Object b = new Object();

    static Bundle a(l.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d = aVar.d();
        bundle.putInt("icon", d != null ? d.o() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(u uVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", uVar.i());
        bundle.putCharSequence("label", uVar.h());
        bundle.putCharSequenceArray("choices", uVar.e());
        bundle.putBoolean("allowFreeFormInput", uVar.c());
        bundle.putBundle("extras", uVar.g());
        Set<String> d = uVar.d();
        if (d != null && !d.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(d.size());
            Iterator<String> it = d.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(u[] uVarArr) {
        if (uVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[uVarArr.length];
        for (int i = 0; i < uVarArr.length; i++) {
            bundleArr[i] = b(uVarArr[i]);
        }
        return bundleArr;
    }
}
