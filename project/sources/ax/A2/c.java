package ax.A2;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;

/* loaded from: classes.dex */
public interface c {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final String b;

        static {
            String simpleName = c.class.getSimpleName();
            ax.Gb.l.e(simpleName, "getSimpleName(...)");
            b = simpleName;
        }

        private a() {
        }

        public final c a() {
            int i = Build.VERSION.SDK_INT;
            return i >= 30 ? h.b : i >= 29 ? g.b : i >= 28 ? f.b : i >= 24 ? e.b : d.b;
        }

        public final String b() {
            return b;
        }
    }

    Rect a(Activity activity);
}
