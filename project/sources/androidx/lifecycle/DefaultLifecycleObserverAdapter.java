package androidx.lifecycle;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements f {
    private final f c0;
    private final ax.G0.c q;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(ax.G0.c cVar, f fVar) {
        ax.Gb.l.f(cVar, "defaultLifecycleObserver");
        this.q = cVar;
        this.c0 = fVar;
    }

    @Override // androidx.lifecycle.f
    public void b(ax.G0.h hVar, d.a aVar) {
        ax.Gb.l.f(hVar, "source");
        ax.Gb.l.f(aVar, "event");
        switch (a.a[aVar.ordinal()]) {
            case 1:
                this.q.c(hVar);
                break;
            case 2:
                this.q.g(hVar);
                break;
            case 3:
                this.q.d(hVar);
                break;
            case 4:
                this.q.e(hVar);
                break;
            case 5:
                this.q.a(hVar);
                break;
            case 6:
                this.q.f(hVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        f fVar = this.c0;
        if (fVar != null) {
            fVar.b(hVar, aVar);
        }
    }
}
