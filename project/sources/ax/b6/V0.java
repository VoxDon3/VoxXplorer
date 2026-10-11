package ax.b6;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import ax.M5.C0821p;
import ax.b6.W0;
import ax.f6.C2065m;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes3.dex */
final class V0 extends W0.a {
    private final /* synthetic */ String f0;
    private final /* synthetic */ String g0;
    private final /* synthetic */ Context h0;
    private final /* synthetic */ Bundle i0;
    private final /* synthetic */ W0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V0(W0 w0, String str, String str2, Context context, Bundle bundle) {
        super(w0);
        this.f0 = str;
        this.g0 = str2;
        this.h0 = context;
        this.i0 = bundle;
        this.j0 = w0;
    }

    @Override // ax.b6.W0.a
    public final void a() {
        boolean G;
        String str;
        String str2;
        String str3;
        H0 h0;
        H0 h02;
        String str4;
        String str5;
        try {
            G = this.j0.G(this.f0, this.g0);
            if (G) {
                String str6 = this.g0;
                String str7 = this.f0;
                str5 = this.j0.a;
                str3 = str6;
                str2 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            C0821p.l(this.h0);
            W0 w0 = this.j0;
            w0.i = w0.c(this.h0, true);
            h0 = this.j0.i;
            if (h0 == null) {
                str4 = this.j0.a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int a = DynamiteModule.a(this.h0, ModuleDescriptor.MODULE_ID);
            U0 u0 = new U0(97001L, Math.max(a, r0), DynamiteModule.c(this.h0, ModuleDescriptor.MODULE_ID) < a, str, str2, str3, this.i0, C2065m.a(this.h0));
            h02 = this.j0.i;
            ((H0) C0821p.l(h02)).initialize(ax.T5.b.a2(this.h0), u0, this.q);
        } catch (Exception e) {
            this.j0.r(e, true, false);
        }
    }
}
