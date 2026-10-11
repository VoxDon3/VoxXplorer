package ax.Q7;

import ax.J7.C0764i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {
    private final File a;

    public a(ax.O7.g gVar) {
        this.a = gVar.g("com.crashlytics.settings.json");
    }

    private File a() {
        return this.a;
    }

    public JSONObject b() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        ax.G7.g.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File a = a();
                if (a.exists()) {
                    fileInputStream = new FileInputStream(a);
                    try {
                        jSONObject = new JSONObject(C0764i.A(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        ax.G7.g.f().e("Failed to fetch cached settings", e);
                        C0764i.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    ax.G7.g.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                C0764i.f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                C0764i.f(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            C0764i.f(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j, JSONObject jSONObject) {
        FileWriter fileWriter;
        ax.G7.g.f().i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j);
                    fileWriter = new FileWriter(a());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                C0764i.f(fileWriter, "Failed to close settings writer.");
            } catch (Exception e2) {
                e = e2;
                fileWriter2 = fileWriter;
                ax.G7.g.f().e("Failed to cache settings", e);
                C0764i.f(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                C0764i.f(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}
