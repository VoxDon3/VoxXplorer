/*
 * Decompiled with CFR 0.152.
 */
package ax.Q7;

import ax.G7.g;
import ax.J7.i;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Writer;
import org.json.JSONObject;

public class a {
    private final File a;

    public a(ax.O7.g g8) {
        this.a = g8.g("com.crashlytics.settings.json");
    }

    private File a() {
        return this.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject b() {
        RuntimeException var2_9;
        FileInputStream fileInputStream;
        block10: {
            Object object;
            block11: {
                block9: {
                    block8: {
                        g.f().b("Checking for cached settings...");
                        fileInputStream = null;
                        File file = this.a();
                        if (!file.exists()) break block8;
                        object = new FileInputStream(file);
                        fileInputStream = object;
                        file = new JSONObject(i.A((InputStream)object));
                        fileInputStream = object;
                        object = file;
                        break block9;
                    }
                    try {
                        g.f().i("Settings file does not exist.");
                        object = null;
                    }
                    catch (Throwable throwable) {
                        fileInputStream = null;
                        break block10;
                    }
                    catch (Exception exception) {
                        object = null;
                        break block11;
                    }
                }
                i.f(fileInputStream, "Error while closing settings cache file.");
                return object;
                catch (Throwable throwable) {
                    break block10;
                }
                catch (Exception exception) {}
            }
            fileInputStream = object;
            {
                Throwable var3_5;
                g.f().e("Failed to fetch cached settings", (Throwable)var3_5);
            }
            i.f((Closeable)object, "Error while closing settings cache file.");
            return null;
        }
        i.f(fileInputStream, "Error while closing settings cache file.");
        throw var2_9;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(long l8, JSONObject object) {
        RuntimeException var3_5;
        Object object2;
        block7: {
            Object object3;
            block8: {
                JSONObject jSONObject;
                g.f().i("Writing settings to cache file...");
                if (object == null) return;
                Object var6_6 = null;
                object2 = jSONObject = null;
                try {
                    object.put("expires_at", l8);
                    object2 = jSONObject;
                    object2 = jSONObject;
                    object3 = new FileWriter(this.a());
                }
                catch (Throwable throwable) {
                    break block7;
                }
                catch (Exception exception) {
                    object = var6_6;
                    break block8;
                }
                try {
                    ((Writer)object3).write(object.toString());
                    ((Writer)object3).flush();
                }
                catch (Throwable throwable) {
                    object2 = object3;
                    break block7;
                }
                catch (Exception exception) {
                    object = object3;
                    object3 = exception;
                    break block8;
                }
                i.f((Closeable)object3, "Failed to close settings writer.");
                return;
            }
            object2 = object;
            {
                g.f().e("Failed to cache settings", (Throwable)object3);
            }
            i.f((Closeable)object, "Failed to close settings writer.");
            return;
        }
        i.f(object2, "Failed to close settings writer.");
        throw var3_5;
    }
}

