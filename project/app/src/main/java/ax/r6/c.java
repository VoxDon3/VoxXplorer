/*
 * Decompiled with CFR 0.152.
 */
package ax.r6;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.a;
import java.util.Comparator;

public final class c
implements Comparator {
    public final a q;

    public /* synthetic */ c(a a8) {
        this.q = a8;
    }

    public final int compare(Object object, Object object2) {
        return a.a(this.q, (MaterialButton)object, (MaterialButton)object2);
    }
}

