package ax.l;

import android.content.Context;
import android.content.Intent;
import ax.Gb.g;
import ax.Gb.l;
import ax.k.C2350a;

/* renamed from: ax.l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2440c extends AbstractC2438a<Intent, C2350a> {
    public static final a a = new a(null);

    /* renamed from: ax.l.c$a */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        private a() {
        }
    }

    @Override // ax.l.AbstractC2438a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent intent) {
        l.f(context, "context");
        l.f(intent, "input");
        return intent;
    }

    @Override // ax.l.AbstractC2438a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C2350a c(int i, Intent intent) {
        return new C2350a(i, intent);
    }
}
