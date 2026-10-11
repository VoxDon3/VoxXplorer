/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import ax.Ha.c;
import ax.Q2.g;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class r {
    private static final Logger a = g.a(r.class);
    static final String[] b = new String[]{"/debug_ramdisk/", "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/su/bin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/", "/data/bin/", "/apex/com.android.runtime/bin/"};
    static b c;
    static b d;

    private static boolean c(String string) {
        return Pattern.compile("[+]").matcher(string).find();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ArrayList<String> d(String object, long l8) {
        synchronized (r.class) {
            try {
                return r.e().c((String)object);
            }
            catch (a a8) {
                return null;
            }
        }
    }

    public static b e() {
        if (c == null) {
            c = new b(true);
        }
        return c;
    }

    public static b f() {
        if (d == null) {
            d = new b(false);
        }
        return d;
    }

    public static boolean g() {
        for (String string : b) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("su");
            if (!new File(stringBuilder.toString()).exists()) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ArrayList<String> h(String object, long l8) {
        synchronized (r.class) {
            try {
                return r.f().c((String)object);
            }
            catch (a a8) {
                return null;
            }
        }
    }

    public static class a
    extends Exception {
    }

    public static class b {
        DataOutputStream a;
        BufferedReader b;
        BufferedReader c;
        boolean d;
        boolean e;
        boolean f;
        Process g;

        b(boolean bl) {
            this.d = bl;
        }

        private void a() {
            if (this.e) {
                return;
            }
            try {
                this.f = Runtime.getRuntime().exec(new String[]{"su", "--mount-master", "-c", "echo"}).waitFor() == 0;
            }
            catch (Exception exception) {
                this.f = false;
            }
            this.e = true;
        }

        private ArrayList<String> e() throws IOException {
            String string;
            ArrayList<String> arrayList = new ArrayList<String>();
            while ((string = this.c.readLine()) != null && !string.endsWith("END_OF_CMD")) {
                Logger logger = a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("root execute error : ");
                stringBuilder.append(string);
                logger.severe(stringBuilder.toString());
                arrayList.add(string);
            }
            return arrayList;
        }

        private ArrayList<String> f() throws IOException {
            String string;
            ArrayList<String> arrayList = new ArrayList<String>();
            while ((string = this.b.readLine()) != null && !string.endsWith("END_OF_CMD")) {
                arrayList.add(string);
            }
            return arrayList;
        }

        private void g() throws a {
            this.b();
            if (this.h()) {
                return;
            }
            throw new a();
        }

        private void i(String string) throws IOException {
            DataOutputStream dataOutputStream = this.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("\n");
            ((OutputStream)dataOutputStream).write(stringBuilder.toString().getBytes());
            ((OutputStream)this.a).write("echo END_OF_CMD\n".getBytes());
            ((OutputStream)this.a).write(">&2 echo END_OF_CMD\n".getBytes());
            this.a.flush();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void b() {
            Closeable closeable = this.a;
            if (closeable != null) {
                try {
                    ((OutputStream)closeable).close();
                    this.a = null;
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            if ((closeable = this.b) != null) {
                try {
                    ((BufferedReader)closeable).close();
                    this.b = null;
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            if ((closeable = this.c) == null) return;
            try {
                ((BufferedReader)closeable).close();
                this.c = null;
                return;
            }
            catch (IOException iOException) {
                return;
            }
        }

        public ArrayList<String> c(String object) throws a {
            block11: {
                Object object2;
                block10: {
                    if (!this.d() || this.a == null || this.c == null || this.b == null) {
                        this.g();
                        if (!this.c.ready() || ((ArrayList)(object2 = this.e())).size() <= 0 || "".equals(object2 = ((ArrayList)object2).get(0)) || object2 == null) break block10;
                        if (r.c(object2)) break block10;
                        return null;
                    }
                }
                try {
                    if (this.c.ready()) {
                        ax.u3.b.e("error reader already has something");
                        while (this.c.ready()) {
                            if (this.c.read() != -1) continue;
                            this.g();
                        }
                    }
                    if (this.b.ready()) {
                        ax.u3.b.e("input reader already has something");
                        while (this.b.ready()) {
                            if (this.b.read() != -1) continue;
                            this.g();
                        }
                    }
                    this.i((String)object);
                    object = this.f();
                    object2 = this.e();
                    if (((ArrayList)object2).size() <= 0 || "".equals(object2 = ((ArrayList)object2).get(0)) || object2 == null) break block11;
                }
                catch (IOException iOException) {
                    this.b();
                    return null;
                }
                boolean bl = r.c((String)object2);
                if (bl) break block11;
                return null;
            }
            return object;
        }

        public boolean d() {
            Process process = this.g;
            if (process == null) {
                return false;
            }
            try {
                process.exitValue();
                return false;
            }
            catch (IllegalThreadStateException illegalThreadStateException) {
                return true;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public boolean h() {
            Exception exception2;
            block9: {
                Closeable closeable;
                Closeable closeable2;
                Object object;
                block8: {
                    block6: {
                        block7: {
                            try {
                                if (!this.d) break block6;
                                this.a();
                                if (!this.f) break block7;
                                object = "su --mount-master";
                                break block8;
                            }
                            catch (Exception exception2) {
                                break block9;
                            }
                        }
                        object = "su";
                        break block8;
                    }
                    object = "sh";
                }
                this.g = object = Runtime.getRuntime().exec((String)object);
                object = ((Process)object).getOutputStream();
                if (object == null) {
                    return false;
                }
                this.a = closeable2 = new DataOutputStream((OutputStream)object);
                object = this.g.getInputStream();
                if (object == null) {
                    return false;
                }
                closeable2 = new InputStreamReader((InputStream)object);
                this.b = closeable = new BufferedReader((Reader)closeable2);
                closeable = this.g.getErrorStream();
                if (closeable == null) {
                    return false;
                }
                object = new InputStreamReader((InputStream)closeable);
                closeable2 = new BufferedReader((Reader)object);
                this.c = closeable2;
                return true;
            }
            if (exception2.getMessage() == null || !exception2.getMessage().contains("Permission denied")) {
                ax.Ha.c.h().f().b("Root command start error").l(exception2).h();
            }
            this.b();
            return false;
        }
    }
}

