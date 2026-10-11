package ax.A2;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public interface m {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final m a() {
            return Build.VERSION.SDK_INT >= 34 ? n.b : o.b;
        }
    }

    float a(Context context);
}
