/*
 * Decompiled with CFR 0.152.
 */
package ax.P9;

import ax.M9.d;
import ax.P9.f;
import ax.P9.g;
import ax.P9.h;
import ax.P9.i;
import ax.P9.l;
import ax.P9.o;
import ax.S9.b;
import ax.T9.e;
import com.microsoft.graph.http.GraphErrorResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class j
extends d {
    private final GraphErrorResponse c0;
    private final String d0;
    private final String e0;
    private final List<String> f0;
    private final String g0;
    private final int h0;
    private final String i0;
    private final List<String> j0;

    protected j(String string, String string2, List<String> list, String string3, int n8, String string4, List<String> list2, GraphErrorResponse graphErrorResponse) {
        super(string4, null, null);
        this.d0 = string;
        this.e0 = string2;
        this.f0 = list;
        this.g0 = string3;
        this.h0 = n8;
        this.i0 = string4;
        this.j0 = list2;
        this.c0 = graphErrorResponse;
    }

    public static <T> j b(o object, T object2, e object3, l object4) throws IOException {
        int n8;
        Object object5;
        String string = object4.d();
        String string2 = object.d().toString();
        LinkedList<String> linkedList = new LinkedList<String>();
        for (b object62 : object.a()) {
            object5 = new StringBuilder();
            ((StringBuilder)object5).append(object62.a());
            ((StringBuilder)object5).append(" : ");
            ((StringBuilder)object5).append(object62.b());
            linkedList.add(((StringBuilder)object5).toString());
        }
        if (object2 instanceof byte[]) {
            object = (byte[])object2;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("byte[");
            ((StringBuilder)object2).append(((Object)object).length);
            ((StringBuilder)object2).append("]");
            ((StringBuilder)object2).append(" {");
            for (n8 = 0; n8 < 8 && n8 < ((Object)object).length; ++n8) {
                ((StringBuilder)object2).append((int)object[n8]);
                ((StringBuilder)object2).append(", ");
            }
            if (((Object)object).length > 8) {
                ((StringBuilder)object2).append("[...]");
                ((StringBuilder)object2).append("}");
            }
            object = ((StringBuilder)object2).toString();
        } else {
            object = object2 != null ? object3.a(object2) : null;
        }
        n8 = object4.f();
        LinkedList<String> linkedList2 = new LinkedList<String>();
        Object object6 = object4.a();
        for (String exception : object6.keySet()) {
            if (exception == null) {
                object2 = "";
            } else {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(exception);
                ((StringBuilder)object2).append(" : ");
                object2 = ((StringBuilder)object2).toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object2);
            stringBuilder.append((String)object6.get(exception));
            linkedList2.add(stringBuilder.toString());
        }
        object5 = object4.g();
        object4 = f.d(object4.c());
        try {
            object2 = object3.b((String)object4, GraphErrorResponse.class);
        }
        catch (Exception exception) {
            object2 = new GraphErrorResponse();
            ((GraphErrorResponse)object2).b = object6 = new g();
            ((g)object6).b = "Unable to parse error response message";
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("Raw error: ");
            ((StringBuilder)object3).append((String)object4);
            ((g)object6).a = ((StringBuilder)object3).toString();
            ((GraphErrorResponse)object2).b.c = new i();
            ((GraphErrorResponse)object2).b.c.a = exception.getMessage();
        }
        if (n8 >= 500) {
            return new h(string, string2, linkedList, (String)object, n8, (String)object5, linkedList2, (GraphErrorResponse)object2);
        }
        return new j(string, string2, linkedList, (String)object, n8, (String)object5, linkedList2, (GraphErrorResponse)object2);
    }

    @Override
    public boolean a(ax.M9.e e8) {
        if (this.d() != null) {
            return this.d().a(e8);
        }
        return false;
    }

    public String c(boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.c0;
        if (object != null && ((GraphErrorResponse)object).b != null) {
            stringBuilder.append("Error code: ");
            stringBuilder.append(this.c0.b.b);
            stringBuilder.append('\n');
            stringBuilder.append("Error message: ");
            stringBuilder.append(this.c0.b.a);
            stringBuilder.append('\n');
            stringBuilder.append('\n');
        }
        stringBuilder.append(this.d0);
        stringBuilder.append(' ');
        stringBuilder.append(this.e0);
        stringBuilder.append('\n');
        for (String string : this.f0) {
            if (bl) {
                stringBuilder.append(string);
            } else {
                string = string.substring(0, Math.min(50, string.length()));
                stringBuilder.append(string);
                if (string.length() == 50) {
                    stringBuilder.append("[...]");
                }
            }
            stringBuilder.append('\n');
        }
        object = this.g0;
        if (object != null) {
            if (bl) {
                stringBuilder.append((String)object);
            } else {
                int n8 = Math.min(50, ((String)object).length());
                object = this.g0.substring(0, n8);
                stringBuilder.append((String)object);
                if (((String)object).length() == 50) {
                    stringBuilder.append("[...]");
                }
            }
        }
        stringBuilder.append('\n');
        stringBuilder.append('\n');
        stringBuilder.append(this.h0);
        stringBuilder.append(" : ");
        stringBuilder.append(this.i0);
        stringBuilder.append('\n');
        object = this.j0.iterator();
        while (object.hasNext()) {
            String string;
            string = object.next();
            if (bl) {
                stringBuilder.append(string);
                stringBuilder.append('\n');
                continue;
            }
            if (!string.toLowerCase(Locale.ROOT).startsWith("x-throwsite")) continue;
            stringBuilder.append(string);
            stringBuilder.append('\n');
        }
        if (bl && (object = this.c0) != null && ((GraphErrorResponse)object).c != null) {
            try {
                object = new JSONObject(this.c0.c.toString());
                stringBuilder.append(object.toString(3));
                stringBuilder.append('\n');
            }
            catch (JSONException jSONException) {
                stringBuilder.append("[Warning: Unable to parse error message body]");
                stringBuilder.append('\n');
            }
        } else {
            stringBuilder.append("[...]");
            stringBuilder.append('\n');
            stringBuilder.append('\n');
            stringBuilder.append("[Some information was truncated for brevity, enable debug logging for more details]");
        }
        return stringBuilder.toString();
    }

    public g d() {
        return this.c0.b;
    }

    @Override
    public String getMessage() {
        return this.c(false);
    }
}

