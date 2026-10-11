/*
 * Decompiled with CFR 0.152.
 */
package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.h;
import ax.b2.g;
import ax.b2.i;
import ax.b2.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class b
extends Preference {
    private long R0;

    b(Context context, List<Preference> list, long l8) {
        super(context);
        this.T0();
        this.U0(list);
        this.R0 = l8 + 1000000L;
    }

    private void T0() {
        this.E0(i.a);
        this.A0(g.a);
        this.L0(j.b);
        this.I0(999);
    }

    private void U0(List<Preference> object) {
        ArrayList<PreferenceGroup> arrayList = new ArrayList<PreferenceGroup>();
        Iterator<Preference> iterator = object.iterator();
        object = null;
        while (iterator.hasNext()) {
            Preference preference = iterator.next();
            CharSequence charSequence = preference.O();
            boolean bl = preference instanceof PreferenceGroup;
            if (bl && !TextUtils.isEmpty((CharSequence)charSequence)) {
                arrayList.add((PreferenceGroup)preference);
            }
            if (arrayList.contains(preference.E())) {
                if (!bl) continue;
                arrayList.add((PreferenceGroup)preference);
                continue;
            }
            if (TextUtils.isEmpty((CharSequence)charSequence)) continue;
            if (object == null) {
                object = charSequence;
                continue;
            }
            object = this.s().getString(j.e, new Object[]{object, charSequence});
        }
        this.J0((CharSequence)object);
    }

    @Override
    public void c0(h h8) {
        super.c0(h8);
        h8.R(false);
    }

    @Override
    long x() {
        return this.R0;
    }
}

