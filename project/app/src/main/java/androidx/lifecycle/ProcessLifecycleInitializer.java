/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.e;
import androidx.lifecycle.j;
import androidx.startup.a;
import ax.G0.h;
import ax.Gb.l;
import ax.tb.o;
import java.util.List;

public final class ProcessLifecycleInitializer
implements ax.r2.a<h> {
    @Override
    public List<Class<? extends ax.r2.a<?>>> a() {
        return o.j();
    }

    public h c(Context context) {
        l.f(context, "context");
        Object object = a.e(context);
        l.e(object, "getInstance(context)");
        if (((a)object).g(ProcessLifecycleInitializer.class)) {
            e.a(context);
            object = j.i;
            ((j.b)object).b(context);
            return ((j.b)object).a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }
}

