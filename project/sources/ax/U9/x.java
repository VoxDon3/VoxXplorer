package ax.U9;

import android.app.Activity;
import android.util.Log;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
abstract class x {
    public static final x q = new a("SMALL", 0);
    public static final x c0 = new x("NORMAL", 1) { // from class: ax.U9.x.b
        {
            a aVar = null;
        }

        @Override // ax.U9.x
        public ax.U9.d j() {
            return ax.U9.d.q;
        }
    };
    public static final x d0 = new x("LARGE", 2) { // from class: ax.U9.x.c
        {
            a aVar = null;
        }

        @Override // ax.U9.x
        public ax.U9.d j() {
            return ax.U9.d.c0;
        }
    };
    public static final x e0 = new x("XLARGE", 3) { // from class: ax.U9.x.d
        {
            a aVar = null;
        }

        @Override // ax.U9.x
        public ax.U9.d j() {
            return ax.U9.d.c0;
        }
    };
    private static final /* synthetic */ x[] f0 = d();

    enum a extends x {
        a(String str, int i) {
            super(str, i, null);
        }

        @Override // ax.U9.x
        public ax.U9.d j() {
            return ax.U9.d.q;
        }
    }

    private x(String str, int i) {
    }

    private static /* synthetic */ x[] d() {
        return new x[]{q, c0, d0, e0};
    }

    public static x h(Activity activity) {
        int i = activity.getResources().getConfiguration().screenLayout & 15;
        if (i == 1) {
            return q;
        }
        if (i == 2) {
            return c0;
        }
        if (i == 3) {
            return d0;
        }
        if (i == 4) {
            return e0;
        }
        Log.d("Live SDK ScreenSize", "Unable to determine ScreenSize. A Normal ScreenSize will be returned.");
        return c0;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f0.clone();
    }

    public abstract ax.U9.d j();

    /* synthetic */ x(String str, int i, a aVar) {
        this(str, i);
    }
}
