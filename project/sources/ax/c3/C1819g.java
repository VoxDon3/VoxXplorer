package ax.c3;

import android.content.Context;
import ax.u3.C3184b;
import ax.x8.C3475a;
import com.voxdon.xplorer.R;
import com.google.gson.Gson;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ax.c3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1819g {
    public static String c = "com.voxdon.xplorer";
    public static int d = 3;
    private static C1819g e;
    private boolean a;
    private HashMap<String, String> b = new HashMap<>();

    /* renamed from: ax.c3.g$a */
    class a extends C3475a<HashMap<String, Object>> {
        a() {
        }
    }

    C1819g(Context context) {
        d(context);
    }

    public static C1819g c(Context context) {
        if (e == null) {
            e = new C1819g(context);
        }
        return e;
    }

    public String a(ax.Q2.f fVar) {
        return this.b.get(fVar.I() + "_id");
    }

    public String b(ax.Q2.f fVar) {
        return this.b.get(fVar.I() + "_secret");
    }

    public void d(Context context) {
        if (this.a) {
            return;
        }
        try {
            try {
                InputStream openRawResource = context.getResources().openRawResource(R.raw.client);
                String i = F.i(openRawResource, 512);
                ax.Q2.f fVar = ax.Q2.f.M0;
                String a2 = new c0(fVar).a(d, ax.Y2.a.a().b(fVar), i);
                if (a2 == null) {
                    C3184b.f();
                    F.a(openRawResource);
                    return;
                }
                Map map = (Map) ((Map) new Gson().l(a2, new a().d())).get("android_client");
                if (map == null) {
                    C3184b.f();
                    F.a(openRawResource);
                    return;
                }
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj instanceof String) {
                        this.b.put(str, (String) obj);
                    }
                }
                this.a = true;
                F.a(openRawResource);
            } catch (Exception e2) {
                e2.printStackTrace();
                F.a(null);
            }
        } catch (Throwable th) {
            F.a(null);
            throw th;
        }
    }
}
