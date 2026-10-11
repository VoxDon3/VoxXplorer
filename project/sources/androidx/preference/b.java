package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import ax.b2.C1479g;
import ax.b2.C1481i;
import ax.b2.C1482j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class b extends Preference {
    private long R0;

    b(Context context, List<Preference> list, long j) {
        super(context);
        T0();
        U0(list);
        this.R0 = j + 1000000;
    }

    private void T0() {
        E0(C1481i.a);
        A0(C1479g.a);
        L0(C1482j.b);
        I0(999);
    }

    private void U0(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = null;
        for (Preference preference : list) {
            CharSequence O = preference.O();
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(O)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.E())) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(O)) {
                charSequence = charSequence == null ? O : s().getString(C1482j.e, charSequence, O);
            }
        }
        J0(charSequence);
    }

    @Override // androidx.preference.Preference
    public void c0(h hVar) {
        super.c0(hVar);
        hVar.R(false);
    }

    @Override // androidx.preference.Preference
    long x() {
        return this.R0;
    }
}
