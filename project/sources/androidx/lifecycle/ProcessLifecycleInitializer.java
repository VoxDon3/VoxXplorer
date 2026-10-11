package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.j;
import ax.r2.InterfaceC2941a;
import ax.tb.C3139o;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC2941a<ax.G0.h> {
    @Override // ax.r2.InterfaceC2941a
    public List<Class<? extends InterfaceC2941a<?>>> a() {
        return C3139o.j();
    }

    @Override // ax.r2.InterfaceC2941a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ax.G0.h b(Context context) {
        ax.Gb.l.f(context, "context");
        androidx.startup.a e = androidx.startup.a.e(context);
        ax.Gb.l.e(e, "getInstance(context)");
        if (!e.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        e.a(context);
        j.b bVar = j.i;
        bVar.b(context);
        return bVar.a();
    }
}
