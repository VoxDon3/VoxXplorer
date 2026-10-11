package ax.O2;

import android.os.Build;
import ax.B2.i;
import ax.Gb.l;
import ax.K2.A;
import ax.K2.j;
import ax.K2.o;
import ax.K2.v;
import ax.K2.y;
import ax.tb.C3139o;
import java.util.List;

/* loaded from: classes.dex */
public final class d {
    private static final String a;

    static {
        String i = i.i("DiagnosticsWrkr");
        l.e(i, "tagWithPrefix(\"DiagnosticsWrkr\")");
        a = i;
    }

    private static final String c(v vVar, String str, Integer num, String str2) {
        return '\n' + vVar.a + "\t " + vVar.c + "\t " + num + "\t " + vVar.b.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(o oVar, A a2, j jVar, List<v> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Id \t Class Name\t " + (Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id") + "\t State\t Unique Name\t Tags\t");
        for (v vVar : list) {
            ax.K2.i c = jVar.c(y.a(vVar));
            sb.append(c(vVar, C3139o.L(oVar.b(vVar.a), ",", null, null, 0, null, null, 62, null), c != null ? Integer.valueOf(c.c) : null, C3139o.L(a2.b(vVar.a), ",", null, null, 0, null, null, 62, null)));
        }
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
