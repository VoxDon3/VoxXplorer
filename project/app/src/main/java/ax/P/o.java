/*
 * Decompiled with CFR 0.152.
 */
package ax.P;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import ax.P.l;
import ax.P.u;
import java.util.ArrayList;

class o {
    private static final Object a = new Object();
    private static final Object b = new Object();

    static Bundle a(l.a a8) {
        Bundle bundle = new Bundle();
        IconCompat iconCompat = a8.d();
        int n8 = iconCompat != null ? iconCompat.o() : 0;
        bundle.putInt("icon", n8);
        bundle.putCharSequence("title", a8.h());
        bundle.putParcelable("actionIntent", (Parcelable)a8.a());
        iconCompat = a8.c() != null ? new Bundle(a8.c()) : new Bundle();
        iconCompat.putBoolean("android.support.allowGeneratedReplies", a8.b());
        bundle.putBundle("extras", (Bundle)iconCompat);
        bundle.putParcelableArray("remoteInputs", (Parcelable[])o.c(a8.e()));
        bundle.putBoolean("showsUserInterface", a8.g());
        bundle.putInt("semanticAction", a8.f());
        return bundle;
    }

    private static Bundle b(u object) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", ((u)object).i());
        bundle.putCharSequence("label", ((u)object).h());
        bundle.putCharSequenceArray("choices", ((u)object).e());
        bundle.putBoolean("allowFreeFormInput", ((u)object).c());
        bundle.putBundle("extras", ((u)object).g());
        Object object2 = ((u)object).d();
        if (object2 != null && !object2.isEmpty()) {
            object = new ArrayList(object2.size());
            object2 = object2.iterator();
            while (object2.hasNext()) {
                ((ArrayList)object).add((String)object2.next());
            }
            bundle.putStringArrayList("allowedDataTypes", (ArrayList)object);
        }
        return bundle;
    }

    private static Bundle[] c(u[] uArray) {
        if (uArray == null) {
            return null;
        }
        Bundle[] bundleArray = new Bundle[uArray.length];
        for (int i8 = 0; i8 < uArray.length; ++i8) {
            bundleArray[i8] = o.b(uArray[i8]);
        }
        return bundleArray;
    }
}

