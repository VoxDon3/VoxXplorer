package ax.A2;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import ax.z2.C3539a;

/* loaded from: classes.dex */
public interface v {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final v a() {
            int i = Build.VERSION.SDK_INT;
            return i >= 34 ? x.b : i >= 30 ? w.b : y.b;
        }
    }

    C3539a a(Context context, m mVar);

    C3539a b(Activity activity, m mVar);
}
