package ax.P9;

import com.microsoft.graph.http.GraphErrorResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class j extends ax.M9.d {
    private final GraphErrorResponse c0;
    private final String d0;
    private final String e0;
    private final List<String> f0;
    private final String g0;
    private final int h0;
    private final String i0;
    private final List<String> j0;

    protected j(String str, String str2, List<String> list, String str3, int i, String str4, List<String> list2, GraphErrorResponse graphErrorResponse) {
        super(str4, null, null);
        this.d0 = str;
        this.e0 = str2;
        this.f0 = list;
        this.g0 = str3;
        this.h0 = i;
        this.i0 = str4;
        this.j0 = list2;
        this.c0 = graphErrorResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> j b(o oVar, T t, ax.T9.e eVar, l lVar) throws IOException {
        String a;
        GraphErrorResponse graphErrorResponse;
        String d = lVar.d();
        String url = oVar.d().toString();
        LinkedList linkedList = new LinkedList();
        for (ax.S9.b bVar : oVar.a()) {
            linkedList.add(bVar.a() + " : " + bVar.b());
        }
        if (t instanceof byte[]) {
            byte[] bArr = (byte[]) t;
            StringBuilder sb = new StringBuilder();
            sb.append("byte[");
            sb.append(bArr.length);
            sb.append("]");
            sb.append(" {");
            for (int i = 0; i < 8 && i < bArr.length; i++) {
                sb.append((int) bArr[i]);
                sb.append(", ");
            }
            if (bArr.length > 8) {
                sb.append("[...]");
                sb.append("}");
            }
            a = sb.toString();
        } else {
            a = t != 0 ? eVar.a(t) : null;
        }
        int f = lVar.f();
        LinkedList linkedList2 = new LinkedList();
        Map<String, String> a2 = lVar.a();
        for (String str : a2.keySet()) {
            linkedList2.add((str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str + " : ") + a2.get(str));
        }
        String g = lVar.g();
        String d2 = f.d(lVar.c());
        try {
            graphErrorResponse = (GraphErrorResponse) eVar.b(d2, GraphErrorResponse.class);
        } catch (Exception e) {
            GraphErrorResponse graphErrorResponse2 = new GraphErrorResponse();
            g gVar = new g();
            graphErrorResponse2.b = gVar;
            gVar.b = "Unable to parse error response message";
            gVar.a = "Raw error: " + d2;
            graphErrorResponse2.b.c = new i();
            graphErrorResponse2.b.c.a = e.getMessage();
            graphErrorResponse = graphErrorResponse2;
        }
        return f >= 500 ? new h(d, url, linkedList, a, f, g, linkedList2, graphErrorResponse) : new j(d, url, linkedList, a, f, g, linkedList2, graphErrorResponse);
    }

    @Override // ax.M9.d
    public boolean a(ax.M9.e eVar) {
        if (d() != null) {
            return d().a(eVar);
        }
        return false;
    }

    public String c(boolean z) {
        GraphErrorResponse graphErrorResponse;
        StringBuilder sb = new StringBuilder();
        GraphErrorResponse graphErrorResponse2 = this.c0;
        if (graphErrorResponse2 != null && graphErrorResponse2.b != null) {
            sb.append("Error code: ");
            sb.append(this.c0.b.b);
            sb.append('\n');
            sb.append("Error message: ");
            sb.append(this.c0.b.a);
            sb.append('\n');
            sb.append('\n');
        }
        sb.append(this.d0);
        sb.append(' ');
        sb.append(this.e0);
        sb.append('\n');
        for (String str : this.f0) {
            if (z) {
                sb.append(str);
            } else {
                String substring = str.substring(0, Math.min(50, str.length()));
                sb.append(substring);
                if (substring.length() == 50) {
                    sb.append("[...]");
                }
            }
            sb.append('\n');
        }
        String str2 = this.g0;
        if (str2 != null) {
            if (z) {
                sb.append(str2);
            } else {
                String substring2 = this.g0.substring(0, Math.min(50, str2.length()));
                sb.append(substring2);
                if (substring2.length() == 50) {
                    sb.append("[...]");
                }
            }
        }
        sb.append('\n');
        sb.append('\n');
        sb.append(this.h0);
        sb.append(" : ");
        sb.append(this.i0);
        sb.append('\n');
        for (String str3 : this.j0) {
            if (z) {
                sb.append(str3);
                sb.append('\n');
            } else if (str3.toLowerCase(Locale.ROOT).startsWith("x-throwsite")) {
                sb.append(str3);
                sb.append('\n');
            }
        }
        if (!z || (graphErrorResponse = this.c0) == null || graphErrorResponse.c == null) {
            sb.append("[...]");
            sb.append('\n');
            sb.append('\n');
            sb.append("[Some information was truncated for brevity, enable debug logging for more details]");
        } else {
            try {
                sb.append(new JSONObject(this.c0.c.toString()).toString(3));
                sb.append('\n');
            } catch (JSONException unused) {
                sb.append("[Warning: Unable to parse error message body]");
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public g d() {
        return this.c0.b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return c(false);
    }
}
