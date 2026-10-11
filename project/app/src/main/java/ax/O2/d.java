/*
 * Decompiled with CFR 0.152.
 */
package ax.O2;

import android.os.Build;
import ax.B2.i;
import ax.Gb.l;
import ax.K2.A;
import ax.K2.j;
import ax.K2.v;
import ax.K2.y;
import ax.tb.o;
import java.util.List;

public final class d {
    private static final String a;

    static {
        String string = i.i("DiagnosticsWrkr");
        l.e(string, "tagWithPrefix(\"DiagnosticsWrkr\")");
        a = string;
    }

    public static final /* synthetic */ String a() {
        return a;
    }

    public static final /* synthetic */ String b(ax.K2.o o8, A a8, j j8, List list) {
        return d.d(o8, a8, j8, list);
    }

    private static final String c(v v8, String string, Integer n8, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\n');
        stringBuilder.append(v8.a);
        stringBuilder.append("\t ");
        stringBuilder.append(v8.c);
        stringBuilder.append("\t ");
        stringBuilder.append(n8);
        stringBuilder.append("\t ");
        stringBuilder.append(v8.b.name());
        stringBuilder.append("\t ");
        stringBuilder.append(string);
        stringBuilder.append("\t ");
        stringBuilder.append(string2);
        stringBuilder.append('\t');
        return stringBuilder.toString();
    }

    private static final String d(ax.K2.o object, A a8, j j8, List<v> object2) {
        StringBuilder stringBuilder = new StringBuilder();
        String string = Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id";
        Object object32 = new StringBuilder();
        ((StringBuilder)object32).append("\n Id \t Class Name\t ");
        ((StringBuilder)object32).append(string);
        ((StringBuilder)object32).append("\t State\t Unique Name\t Tags\t");
        stringBuilder.append(((StringBuilder)object32).toString());
        for (Object object32 : (Iterable)object2) {
            object2 = j8.c(y.a((v)object32));
            object2 = object2 != null ? Integer.valueOf(((ax.K2.i)object2).c) : null;
            stringBuilder.append(d.c((v)object32, o.L(object.b(((v)object32).a), ",", null, null, 0, null, null, 62, null), (Integer)object2, o.L(a8.b(((v)object32).a), ",", null, null, 0, null, null, 62, null)));
        }
        object = stringBuilder.toString();
        l.e(object, "StringBuilder().apply(builderAction).toString()");
        return object;
    }
}

