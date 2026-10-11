package ax.B2;

import android.os.Build;
import androidx.work.OverwritingInputMerger;
import ax.B2.t;

/* loaded from: classes.dex */
public final class k extends t {
    public static final b e = new b(null);

    public static final class b {
        public /* synthetic */ b(ax.Gb.g gVar) {
            this();
        }

        public final k a(Class<? extends androidx.work.c> cls) {
            ax.Gb.l.f(cls, "workerClass");
            return new a(cls).a();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a aVar) {
        super(aVar.d(), aVar.g(), aVar.e());
        ax.Gb.l.f(aVar, "builder");
    }

    public static final k e(Class<? extends androidx.work.c> cls) {
        return e.a(cls);
    }

    public static final class a extends t.a<a, k> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends androidx.work.c> cls) {
            super(cls);
            ax.Gb.l.f(cls, "workerClass");
            g().d = OverwritingInputMerger.class.getName();
        }

        @Override // ax.B2.t.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public k b() {
            if (c() && Build.VERSION.SDK_INT >= 23 && g().j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new k(this);
        }

        @Override // ax.B2.t.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a f() {
            return this;
        }
    }
}
