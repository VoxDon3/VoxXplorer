package ax.l;

import android.content.Context;
import android.content.Intent;
import ax.Gb.g;
import ax.Gb.l;
import ax.Lb.f;
import ax.l.AbstractC2438a;
import ax.sb.C3081m;
import ax.sb.q;
import ax.tb.C3115F;
import ax.tb.C3133i;
import ax.tb.C3139o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ax.l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2439b extends AbstractC2438a<String[], Map<String, Boolean>> {
    public static final a a = new a(null);

    /* renamed from: ax.l.b$a */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final Intent a(String[] strArr) {
            l.f(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            l.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }

        private a() {
        }
    }

    @Override // ax.l.AbstractC2438a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] strArr) {
        l.f(context, "context");
        l.f(strArr, "input");
        return a.a(strArr);
    }

    @Override // ax.l.AbstractC2438a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC2438a.C0356a<Map<String, Boolean>> b(Context context, String[] strArr) {
        l.f(context, "context");
        l.f(strArr, "input");
        if (strArr.length == 0) {
            return new AbstractC2438a.C0356a<>(C3115F.g());
        }
        for (String str : strArr) {
            if (ax.Q.b.a(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.b(C3115F.d(strArr.length), 16));
        for (String str2 : strArr) {
            C3081m a2 = q.a(str2, Boolean.TRUE);
            linkedHashMap.put(a2.c(), a2.d());
        }
        return new AbstractC2438a.C0356a<>(linkedHashMap);
    }

    @Override // ax.l.AbstractC2438a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map<String, Boolean> c(int i, Intent intent) {
        if (i != -1) {
            return C3115F.g();
        }
        if (intent == null) {
            return C3115F.g();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return C3115F.g();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        return C3115F.n(C3139o.Z(C3133i.t(stringArrayExtra), arrayList));
    }
}
