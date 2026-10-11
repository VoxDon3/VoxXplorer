/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import com.google.firebase.remoteconfig.internal.c;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class h {
    private static final Map<String, h> c = new HashMap<String, h>();
    private final Context a;
    private final String b;

    private h(Context context, String string) {
        this.a = context;
        this.b = string;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static h c(Context object, String string) {
        synchronized (h.class) {
            try {
                Map<String, h> map = c;
                if (map.containsKey(string)) return map.get(string);
                h h8 = new h((Context)object, string);
                map.put(string, h8);
                return map.get(string);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Void a() {
        synchronized (this) {
            this.a.deleteFile(this.b);
            return null;
        }
    }

    String b() {
        return this.b;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public c d() throws IOException {
        synchronized (this) {
            FileInputStream fileInputStream;
            block10: {
                Throwable throwable22;
                block11: {
                    RuntimeException var3_10;
                    block9: {
                        fileInputStream = this.a.openFileInput(this.b);
                        int n8 = fileInputStream.available();
                        Object object = new byte[n8];
                        fileInputStream.read((byte[])object, 0, n8);
                        Object object2 = new String((byte[])object, "UTF-8");
                        object = new JSONObject;
                        object((String)object2);
                        object2 = com.google.firebase.remoteconfig.internal.c.b((JSONObject)object);
                        try {
                            fileInputStream.close();
                            return object2;
                        }
                        catch (Throwable throwable22) {}
                        break block11;
                        catch (Throwable throwable3) {
                            break block9;
                        }
                        catch (FileNotFoundException | JSONException throwable4) {
                            break block10;
                        }
                        catch (Throwable throwable5) {
                            fileInputStream = null;
                        }
                        catch (FileNotFoundException | JSONException throwable6) {
                            return null;
                        }
                    }
                    if (fileInputStream == null) throw var3_10;
                    fileInputStream.close();
                    throw var3_10;
                }
                throw throwable22;
            }
            if (fileInputStream == null) return null;
            fileInputStream.close();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Void e(c c8) throws IOException {
        synchronized (this) {
            FileOutputStream fileOutputStream;
            try {
                fileOutputStream = this.a.openFileOutput(this.b, 0);
            }
            catch (Throwable throwable) {}
            try {
                fileOutputStream.write(c8.toString().getBytes("UTF-8"));
            }
            catch (Throwable throwable) {
                fileOutputStream.close();
                throw throwable;
            }
            fileOutputStream.close();
            return null;
            throw throwable;
        }
    }
}

