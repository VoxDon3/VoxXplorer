package com.google.firebase.crashlytics;

import androidx.annotation.Keep;
import ax.D7.C0661c;
import ax.Gb.g;
import ax.tb.C3139o;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        private a() {
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0661c<?>> getComponents() {
        return C3139o.j();
    }
}
