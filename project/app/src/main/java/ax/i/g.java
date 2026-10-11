/*
 * Decompiled with CFR 0.152.
 */
package ax.i;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.savedstate.a;

public final class g
implements a.c {
    public final ComponentActivity a;

    public /* synthetic */ g(ComponentActivity componentActivity) {
        this.a = componentActivity;
    }

    @Override
    public final Bundle a() {
        return ComponentActivity.z(this.a);
    }
}

