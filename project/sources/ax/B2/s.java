package ax.B2;

import android.annotation.SuppressLint;
import android.content.Context;
import ax.C2.D;
import java.util.Collections;
import java.util.List;

@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes.dex */
public abstract class s {
    protected s() {
    }

    public static s c(Context context) {
        return D.j(context);
    }

    public static void d(Context context, androidx.work.a aVar) {
        D.d(context, aVar);
    }

    public final l a(t tVar) {
        return b(Collections.singletonList(tVar));
    }

    public abstract l b(List<? extends t> list);
}
