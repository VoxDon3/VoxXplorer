package androidx.work;

import android.content.Context;
import androidx.work.a;
import ax.B2.i;
import ax.B2.s;
import ax.r2.InterfaceC2941a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC2941a<s> {
    private static final String a = i.i("WrkMgrInitializer");

    @Override // ax.r2.InterfaceC2941a
    public List<Class<? extends InterfaceC2941a<?>>> a() {
        return Collections.EMPTY_LIST;
    }

    @Override // ax.r2.InterfaceC2941a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public s b(Context context) {
        i.e().a(a, "Initializing WorkManager with default configuration.");
        s.d(context, new a.b().a());
        return s.c(context);
    }
}
