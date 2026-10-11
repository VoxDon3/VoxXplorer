/*
 * Decompiled with CFR 0.152.
 */
package ax.w6;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

public final class b
implements CompoundButton.OnCheckedChangeListener {
    public final Chip a;

    public /* synthetic */ b(Chip chip) {
        this.a = chip;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
        Chip.b(this.a, compoundButton, bl);
    }
}

