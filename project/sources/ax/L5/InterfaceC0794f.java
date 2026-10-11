package ax.L5;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: ax.L5.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0794f {
    void m(String str, LifecycleCallback lifecycleCallback);

    void startActivityForResult(Intent intent, int i);

    <T extends LifecycleCallback> T y(String str, Class<T> cls);

    Activity z();
}
