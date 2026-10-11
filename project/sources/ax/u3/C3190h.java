package ax.u3;

import android.content.Context;
import android.util.TypedValue;
import androidx.appcompat.app.a;
import ax.s.C3036c;
import com.voxdon.xplorer.R;

/* renamed from: ax.u3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3190h {
    public static a.C0006a a(Context context) {
        return c(context, R.style.FileManager_Material3_MaterialAlertDialog);
    }

    public static a.C0006a b(Context context) {
        return c(context, R.style.FileManager_Material3_MaterialAlertDialog_Wide);
    }

    private static a.C0006a c(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true);
        return typedValue.data != 0 ? new ax.B6.b(new C3036c(context, R.style.FileManager_Material3_Wrapper), i) : new ax.B6.b(new C3036c(context, R.style.FileManager_Material3_Dark_Wrapper), i);
    }
}
