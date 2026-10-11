/*
 * Decompiled with CFR 0.152.
 */
package ax.d8;

import ax.d8.d;
import ax.x7.f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    private File a;
    private final f b;

    public c(f f8) {
        this.b = f8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private File a() {
        if (this.a != null) return this.a;
        synchronized (this) {
            try {
                File file;
                if (this.a != null) return this.a;
                File file2 = this.b.k().getFilesDir();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("PersistedInstallation.");
                stringBuilder.append(this.b.o());
                stringBuilder.append(".json");
                this.a = file = new File(file2, stringBuilder.toString());
                return this.a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONObject c() {
        int n8;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Object object = new byte[16384];
        FileInputStream fileInputStream = new FileInputStream(this.a());
        while (true) {
            n8 = fileInputStream.read((byte[])object, 0, 16384);
            if (n8 >= 0) break block10;
            object = new JSONObject;
            object(byteArrayOutputStream.toString());
            break;
        }
        catch (Throwable throwable) {}
        {
            block10: {
                fileInputStream.close();
                return object;
            }
            byteArrayOutputStream.write((byte[])object, 0, n8);
            continue;
        }
        try {
            fileInputStream.close();
            throw throwable;
        }
        catch (Throwable throwable) {
            try {
                throwable.addSuppressed(throwable);
                throw throwable;
            }
            catch (IOException | JSONException throwable2) {
                return new JSONObject();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public d b(d d8) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", (Object)d8.d());
            jSONObject.put("Status", d8.g().ordinal());
            jSONObject.put("AuthToken", (Object)d8.b());
            jSONObject.put("RefreshToken", (Object)d8.f());
            jSONObject.put("TokenCreationEpochInSecs", d8.h());
            jSONObject.put("ExpiresInSecs", d8.c());
            jSONObject.put("FisError", (Object)d8.e());
            File file = File.createTempFile("PersistedInstallation", "tmp", this.b.k().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!file.renameTo(this.a())) {
                IOException iOException = new IOException("unable to rename the tmpfile to PersistedInstallation");
                throw iOException;
            }
            return d8;
        }
        catch (IOException | JSONException throwable) {
            return d8;
        }
    }

    public d d() {
        Object object = this.c();
        String string = object.optString("Fid", null);
        int n8 = object.optInt("Status", ax.d8.c$a.q.ordinal());
        String string2 = object.optString("AuthToken", null);
        String string3 = object.optString("RefreshToken", null);
        long l8 = object.optLong("TokenCreationEpochInSecs", 0L);
        long l9 = object.optLong("ExpiresInSecs", 0L);
        object = object.optString("FisError", null);
        return d.a().d(string).g(ax.d8.c$a.values()[n8]).b(string2).f(string3).h(l8).c(l9).e((String)object).a();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        public static final /* enum */ a f0;
        private static final a[] g0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = new a();
            f0 = new a();
            g0 = ax.d8.c$a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0, d0, e0, f0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])g0.clone();
        }
    }
}

