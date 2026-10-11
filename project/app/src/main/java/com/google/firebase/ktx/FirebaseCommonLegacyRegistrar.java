/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.ktx;

import androidx.annotation.Keep;
import ax.D7.c;
import ax.h8.h;
import ax.tb.o;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

@Keep
public final class FirebaseCommonLegacyRegistrar
implements ComponentRegistrar {
    @Override
    public List<c<?>> getComponents() {
        return o.d(h.b("fire-core-ktx", "21.0.0"));
    }
}

