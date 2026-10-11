/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public interface f {
    public void m(String var1, LifecycleCallback var2);

    public void startActivityForResult(Intent var1, int var2);

    public <T extends LifecycleCallback> T y(String var1, Class<T> var2);

    public Activity z();
}

