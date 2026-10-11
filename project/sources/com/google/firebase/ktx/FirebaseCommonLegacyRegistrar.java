package com.google.firebase.ktx;

import androidx.annotation.Keep;
import ax.D7.C0661c;
import ax.h8.h;
import ax.tb.C3139o;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0661c<?>> getComponents() {
        return C3139o.d(h.b("fire-core-ktx", "21.0.0"));
    }
}
