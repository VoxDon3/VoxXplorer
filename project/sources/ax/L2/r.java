package ax.L2;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public class r {
    private static final String a = ax.B2.i.i("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            ax.B2.i e = ax.B2.i.e();
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            e.a(str, sb.toString());
        } catch (Exception e2) {
            ax.B2.i e3 = ax.B2.i.e();
            String str2 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z ? "enabled" : "disabled");
            e3.b(str2, sb2.toString(), e2);
        }
    }
}
