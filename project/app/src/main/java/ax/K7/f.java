/*
 * Decompiled with CFR 0.152.
 */
package ax.K7;

import ax.G7.g;
import ax.K7.i;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
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

class f {
    private static final Charset b = Charset.forName("UTF-8");
    private final ax.O7.g a;

    public f(ax.O7.g g8) {
        this.a = g8;
    }

    private static Map<String, String> e(String object) throws JSONException {
        JSONObject jSONObject = new JSONObject((String)object);
        object = new HashMap();
        Iterator iterator = jSONObject.keys();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            object.put(string, f.o(jSONObject, string));
        }
        return object;
    }

    private static List<i> f(String string) throws JSONException {
        JSONArray jSONArray = new JSONObject(string).getJSONArray("rolloutsState");
        ArrayList<i> arrayList = new ArrayList<i>();
        for (int i8 = 0; i8 < jSONArray.length(); ++i8) {
            string = jSONArray.getString(i8);
            try {
                arrayList.add(i.a(string));
                continue;
            }
            catch (Exception exception) {
                g g8 = g.f();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed de-serializing rollouts state. ");
                stringBuilder.append(string);
                g8.l(stringBuilder.toString(), exception);
            }
        }
        return arrayList;
    }

    private String g(String string) throws JSONException {
        return f.o(new JSONObject(string), "userId");
    }

    private static String h(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String l(List<i> list) {
        HashMap<String, JSONArray> hashMap = new HashMap<String, JSONArray>();
        JSONArray jSONArray = new JSONArray();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            String string = i.a.b(list.get(i8));
            try {
                JSONObject jSONObject = new JSONObject(string);
                jSONArray.put((Object)jSONObject);
                continue;
            }
            catch (JSONException jSONException) {
                g.f().l("Exception parsing rollout assignment!", jSONException);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    private static void m(File file) {
        if (file.exists() && file.delete()) {
            g g8 = g.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Deleted corrupt file: ");
            stringBuilder.append(file.getAbsolutePath());
            g8.g(stringBuilder.toString());
        }
    }

    private static String n(String string) throws JSONException {
        return new JSONObject(string){
            final String a;
            {
                this.a = string;
                this.put("userId", string);
            }
        }.toString();
    }

    private static String o(JSONObject jSONObject, String string) {
        if (!jSONObject.isNull(string)) {
            return jSONObject.optString(string, null);
        }
        return null;
    }

    public File a(String string) {
        return this.a.q(string, "internal-keys");
    }

    public File b(String string) {
        return this.a.q(string, "keys");
    }

    public File c(String string) {
        return this.a.q(string, "rollouts-state");
    }

    public File d(String string) {
        return this.a.q(string, "user-data");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    Map<String, String> i(String object, boolean bl) {
        Object object2;
        block8: {
            FileInputStream fileInputStream;
            block9: {
                object2 = bl ? this.a((String)object) : this.b((String)object);
                if (((File)object2).exists() && ((File)object2).length() != 0L) {
                    Map<String, String> map = null;
                    fileInputStream = new FileInputStream((File)object2);
                    object = fileInputStream;
                    map = f.e(ax.J7.i.A(fileInputStream));
                    ax.J7.i.f(fileInputStream, "Failed to close user metadata file.");
                    return map;
                    catch (Throwable throwable) {
                        object2 = map;
                        break block8;
                    }
                    catch (Exception exception) {
                        fileInputStream = null;
                        break block9;
                    }
                }
                f.m((File)object2);
                return Collections.EMPTY_MAP;
                catch (Throwable throwable) {
                    object2 = object;
                    object = throwable;
                    break block8;
                }
                catch (Exception exception) {}
            }
            object = fileInputStream;
            {
                Throwable var5_8;
                g.f().l("Error deserializing user metadata.", (Throwable)var5_8);
                object = fileInputStream;
                f.m((File)object2);
            }
            ax.J7.i.f(fileInputStream, "Failed to close user metadata file.");
            return Collections.EMPTY_MAP;
        }
        ax.J7.i.f((Closeable)object2, "Failed to close user metadata file.");
        throw object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<i> j(String object) {
        File file = this.c((String)object);
        if (file.exists() && file.length() != 0L) {
            RuntimeException var1_4;
            Object object2;
            block8: {
                Object object3;
                block9: {
                    Object object4;
                    StringBuilder stringBuilder = null;
                    object2 = object4 = null;
                    try {
                        object2 = object4;
                        object3 = new FileInputStream(file);
                    }
                    catch (Throwable throwable) {
                        break block8;
                    }
                    catch (Exception exception) {
                        object = stringBuilder;
                        break block9;
                    }
                    try {
                        object2 = f.f(ax.J7.i.A((InputStream)object3));
                        object4 = g.f();
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Loaded rollouts state:\n");
                        stringBuilder.append(object2);
                        stringBuilder.append("\nfor session ");
                        stringBuilder.append((String)object);
                        ((g)object4).b(stringBuilder.toString());
                    }
                    catch (Throwable throwable) {
                        object2 = object3;
                        break block8;
                    }
                    catch (Exception exception) {
                        object = object3;
                        object3 = exception;
                        break block9;
                    }
                    ax.J7.i.f((Closeable)object3, "Failed to close rollouts state file.");
                    return object2;
                }
                object2 = object;
                {
                    g.f().l("Error deserializing rollouts state.", (Throwable)object3);
                    object2 = object;
                    f.m(file);
                }
                ax.J7.i.f((Closeable)object, "Failed to close rollouts state file.");
                return Collections.EMPTY_LIST;
            }
            ax.J7.i.f(object2, "Failed to close rollouts state file.");
            throw var1_4;
        }
        f.m(file);
        return Collections.EMPTY_LIST;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String k(String object) {
        Object object2;
        block8: {
            Object object3;
            File file;
            block9: {
                file = this.d((String)object);
                boolean bl = file.exists();
                StringBuilder stringBuilder = null;
                if (bl && file.length() != 0L) {
                    object2 = object3 = new FileInputStream(file);
                    String string = this.g(ax.J7.i.A((InputStream)object3));
                    object2 = object3;
                    g g8 = g.f();
                    object2 = object3;
                    object2 = object3;
                    stringBuilder = new StringBuilder();
                    object2 = object3;
                    stringBuilder.append("Loaded userId ");
                    object2 = object3;
                    stringBuilder.append(string);
                    object2 = object3;
                    stringBuilder.append(" for session ");
                    object2 = object3;
                    stringBuilder.append((String)object);
                    object2 = object3;
                    g8.b(stringBuilder.toString());
                    ax.J7.i.f((Closeable)object3, "Failed to close user metadata file.");
                    return string;
                    catch (Throwable throwable) {
                        object = stringBuilder;
                        break block8;
                    }
                    catch (Exception exception) {
                        object = null;
                        break block9;
                    }
                }
                g g9 = g.f();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("No userId set for session ");
                stringBuilder2.append((String)object);
                g9.b(stringBuilder2.toString());
                f.m(file);
                return null;
                catch (Throwable throwable) {
                    object = object2;
                    object2 = throwable;
                    break block8;
                }
                catch (Exception exception) {
                    object = object3;
                    object3 = exception;
                }
            }
            object2 = object;
            {
                g.f().l("Error deserializing user metadata.", (Throwable)object3);
                object2 = object;
                f.m(file);
            }
            ax.J7.i.f((Closeable)object, "Failed to close user metadata file.");
            return null;
        }
        ax.J7.i.f((Closeable)object, "Failed to close user metadata file.");
        throw object2;
    }

    public void p(String string, Map<String, String> map) {
        this.q(string, map, false);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void q(String object, Map<String, String> object2, boolean bl) {
        block7: {
            Object object3;
            block8: {
                String string;
                object3 = bl ? this.a((String)object) : this.b((String)object);
                Object var6_7 = null;
                Object var5_8 = null;
                object = var5_8;
                try {
                    string = f.h(object2);
                    object = var5_8;
                    object = var5_8;
                    object = var5_8;
                    object = var5_8;
                    FileOutputStream fileOutputStream = new FileOutputStream((File)object3);
                    object = var5_8;
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)fileOutputStream, b);
                    object = var5_8;
                    object2 = new BufferedWriter(outputStreamWriter);
                }
                catch (Throwable throwable) {
                    break block7;
                }
                catch (Exception exception) {
                    object2 = var6_7;
                    break block8;
                }
                try {
                    ((Writer)object2).write(string);
                    ((Writer)object2).flush();
                }
                catch (Throwable throwable) {
                    object3 = object2;
                    object2 = throwable;
                    object = object3;
                    break block7;
                }
                catch (Exception exception) {
                    break block8;
                }
                ax.J7.i.f((Closeable)object2, "Failed to close key/value metadata file.");
                return;
            }
            object = object2;
            {
                Throwable var5_11;
                g.f().l("Error serializing key/value metadata.", (Throwable)var5_11);
                object = object2;
                f.m((File)object3);
            }
            ax.J7.i.f((Closeable)object2, "Failed to close key/value metadata file.");
            return;
        }
        ax.J7.i.f((Closeable)object, "Failed to close key/value metadata file.");
        throw object2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void r(String object, List<i> object2) {
        block8: {
            File file;
            block9: {
                String string;
                file = this.c((String)object);
                if (object2.isEmpty()) {
                    f.m(file);
                    return;
                }
                Object var4_5 = null;
                Object var3_6 = null;
                object = var3_6;
                try {
                    string = f.l(object2);
                    object = var3_6;
                    object = var3_6;
                    object = var3_6;
                    object = var3_6;
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    object = var3_6;
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)fileOutputStream, b);
                    object = var3_6;
                    object2 = new BufferedWriter(outputStreamWriter);
                }
                catch (Throwable throwable) {
                    break block8;
                }
                catch (Exception exception) {
                    object2 = var4_5;
                    break block9;
                }
                try {
                    ((Writer)object2).write(string);
                    ((Writer)object2).flush();
                }
                catch (Throwable throwable) {
                    object = object2;
                    object2 = throwable;
                    break block8;
                }
                catch (Exception exception) {
                    break block9;
                }
                ax.J7.i.f((Closeable)object2, "Failed to close rollouts state file.");
                return;
            }
            object = object2;
            {
                Throwable var3_10;
                g.f().l("Error serializing rollouts state.", (Throwable)var3_10);
                object = object2;
                f.m(file);
            }
            ax.J7.i.f((Closeable)object2, "Failed to close rollouts state file.");
            return;
        }
        ax.J7.i.f((Closeable)object, "Failed to close rollouts state file.");
        throw object2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void s(String object, String object2) {
        block7: {
            block8: {
                String string;
                File file = this.d((String)object);
                Object var4_5 = null;
                Object var3_6 = null;
                object = var3_6;
                try {
                    string = f.n((String)object2);
                    object = var3_6;
                    object = var3_6;
                    object = var3_6;
                    object = var3_6;
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    object = var3_6;
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)fileOutputStream, b);
                    object = var3_6;
                    object2 = new BufferedWriter(outputStreamWriter);
                }
                catch (Throwable throwable) {
                    break block7;
                }
                catch (Exception exception) {
                    object2 = var4_5;
                    break block8;
                }
                try {
                    ((Writer)object2).write(string);
                    ((Writer)object2).flush();
                }
                catch (Throwable throwable) {
                    object = object2;
                    object2 = throwable;
                    break block7;
                }
                catch (Exception exception) {
                    break block8;
                }
                ax.J7.i.f((Closeable)object2, "Failed to close user metadata file.");
                return;
            }
            object = object2;
            {
                Throwable var3_10;
                g.f().l("Error serializing user metadata.", (Throwable)var3_10);
            }
            ax.J7.i.f((Closeable)object2, "Failed to close user metadata file.");
            return;
        }
        ax.J7.i.f((Closeable)object, "Failed to close user metadata file.");
        throw object2;
    }
}

