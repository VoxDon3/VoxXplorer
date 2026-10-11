package ax.K7;

import ax.J7.C0764i;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class f {
    private static final Charset b = Charset.forName("UTF-8");
    private final ax.O7.g a;

    class a extends JSONObject {
        final /* synthetic */ String a;

        a(String str) throws JSONException {
            this.a = str;
            put("userId", str);
        }
    }

    public f(ax.O7.g gVar) {
        this.a = gVar;
    }

    private static Map<String, String> e(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, o(jSONObject, next));
        }
        return hashMap;
    }

    private static List<i> f(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(i.a(string));
            } catch (Exception e) {
                ax.G7.g.f().l("Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    private String g(String str) throws JSONException {
        return o(new JSONObject(str), "userId");
    }

    private static String h(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String l(List<i> list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(i.a.b(list.get(i))));
            } catch (JSONException e) {
                ax.G7.g.f().l("Exception parsing rollout assignment!", e);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    private static void m(File file) {
        if (file.exists() && file.delete()) {
            ax.G7.g.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static String n(String str) throws JSONException {
        return new a(str).toString();
    }

    private static String o(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.a.q(str, "internal-keys");
    }

    public File b(String str) {
        return this.a.q(str, "keys");
    }

    public File c(String str) {
        return this.a.q(str, "rollouts-state");
    }

    public File d(String str) {
        return this.a.q(str, "user-data");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    Map<String, String> i(String str, boolean z) {
        FileInputStream fileInputStream;
        Exception e;
        File a2 = z ? a(str) : b(str);
        if (a2.exists()) {
            ?? length = a2.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(a2);
                        try {
                            Map<String, String> e2 = e(C0764i.A(fileInputStream));
                            C0764i.f(fileInputStream, "Failed to close user metadata file.");
                            return e2;
                        } catch (Exception e3) {
                            e = e3;
                            ax.G7.g.f().l("Error deserializing user metadata.", e);
                            m(a2);
                            C0764i.f(fileInputStream, "Failed to close user metadata file.");
                            return Collections.EMPTY_MAP;
                        }
                    } catch (Throwable th) {
                        th = th;
                        closeable = length;
                        C0764i.f(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e4) {
                    fileInputStream = null;
                    e = e4;
                } catch (Throwable th2) {
                    th = th2;
                    C0764i.f(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        m(a2);
        return Collections.EMPTY_MAP;
    }

    public List<i> j(String str) {
        FileInputStream fileInputStream;
        File c = c(str);
        if (!c.exists() || c.length() == 0) {
            m(c);
            return Collections.EMPTY_LIST;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(c);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            List<i> f = f(C0764i.A(fileInputStream));
            ax.G7.g.f().b("Loaded rollouts state:\n" + f + "\nfor session " + str);
            C0764i.f(fileInputStream, "Failed to close rollouts state file.");
            return f;
        } catch (Exception e2) {
            e = e2;
            fileInputStream2 = fileInputStream;
            ax.G7.g.f().l("Error deserializing rollouts state.", e);
            m(c);
            C0764i.f(fileInputStream2, "Failed to close rollouts state file.");
            return Collections.EMPTY_LIST;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            C0764i.f(fileInputStream2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public String k(String str) {
        FileInputStream fileInputStream;
        File d = d(str);
        FileInputStream fileInputStream2 = null;
        if (!d.exists() || d.length() == 0) {
            ax.G7.g.f().b("No userId set for session " + str);
            m(d);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(d);
            try {
                try {
                    String g = g(C0764i.A(fileInputStream));
                    ax.G7.g.f().b("Loaded userId " + g + " for session " + str);
                    C0764i.f(fileInputStream, "Failed to close user metadata file.");
                    return g;
                } catch (Exception e) {
                    e = e;
                    ax.G7.g.f().l("Error deserializing user metadata.", e);
                    m(d);
                    C0764i.f(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                C0764i.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            C0764i.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void p(String str, Map<String, String> map) {
        q(str, map, false);
    }

    public void q(String str, Map<String, String> map, boolean z) {
        String h;
        BufferedWriter bufferedWriter;
        File a2 = z ? a(str) : b(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                h = h(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a2), b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            bufferedWriter.write(h);
            bufferedWriter.flush();
            C0764i.f(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            ax.G7.g.f().l("Error serializing key/value metadata.", e);
            m(a2);
            C0764i.f(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            C0764i.f(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public void r(String str, List<i> list) {
        String l;
        BufferedWriter bufferedWriter;
        File c = c(str);
        if (list.isEmpty()) {
            m(c);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                l = l(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            bufferedWriter.write(l);
            bufferedWriter.flush();
            C0764i.f(bufferedWriter, "Failed to close rollouts state file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            ax.G7.g.f().l("Error serializing rollouts state.", e);
            m(c);
            C0764i.f(bufferedWriter2, "Failed to close rollouts state file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            C0764i.f(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public void s(String str, String str2) {
        String n;
        BufferedWriter bufferedWriter;
        File d = d(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                n = n(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d), b));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(n);
            bufferedWriter.flush();
            C0764i.f(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            ax.G7.g.f().l("Error serializing user metadata.", e);
            C0764i.f(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            C0764i.f(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
