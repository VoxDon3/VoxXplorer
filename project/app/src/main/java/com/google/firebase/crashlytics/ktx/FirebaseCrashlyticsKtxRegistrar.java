/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.ktx;

import androidx.annotation.Keep;
import ax.D7.c;
import ax.Gb.g;
import ax.tb.o;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

@Keep
public final class FirebaseCrashlyticsKtxRegistrar
implements ComponentRegistrar {
    public static final a Companion = new a(null);

    @Override
    public List<c<?>> getComponents() {
        return o.j();
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }
}

