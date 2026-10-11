package ax.u3;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* renamed from: ax.u3.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3200r {
    private static final Logger a = ax.Q2.g.a(C3200r.class);
    static final String[] b = {"/debug_ramdisk/", "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/su/bin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/", "/data/bin/", "/apex/com.android.runtime/bin/"};
    static b c;
    static b d;

    /* renamed from: ax.u3.r$a */
    public static class a extends Exception {
    }

    /* renamed from: ax.u3.r$b */
    public static class b {
        DataOutputStream a;
        BufferedReader b;
        BufferedReader c;
        boolean d;
        boolean e;
        boolean f;
        Process g;

        b(boolean z) {
            this.d = z;
        }

        private void a() {
            if (this.e) {
                return;
            }
            try {
                if (Runtime.getRuntime().exec(new String[]{"su", "--mount-master", "-c", "echo"}).waitFor() == 0) {
                    this.f = true;
                } else {
                    this.f = false;
                }
            } catch (Exception unused) {
                this.f = false;
            }
            this.e = true;
        }

        private ArrayList<String> e() throws IOException {
            ArrayList<String> arrayList = new ArrayList<>();
            while (true) {
                String readLine = this.c.readLine();
                if (readLine == null || readLine.endsWith("END_OF_CMD")) {
                    break;
                }
                C3200r.a.severe("root execute error : " + readLine);
                arrayList.add(readLine);
            }
            return arrayList;
        }

        private ArrayList<String> f() throws IOException {
            ArrayList<String> arrayList = new ArrayList<>();
            while (true) {
                String readLine = this.b.readLine();
                if (readLine == null || readLine.endsWith("END_OF_CMD")) {
                    break;
                }
                arrayList.add(readLine);
            }
            return arrayList;
        }

        private void g() throws a {
            b();
            if (!h()) {
                throw new a();
            }
        }

        private void i(String str) throws IOException {
            this.a.write((str + "\n").getBytes());
            this.a.write("echo END_OF_CMD\n".getBytes());
            this.a.write(">&2 echo END_OF_CMD\n".getBytes());
            this.a.flush();
        }

        public void b() {
            DataOutputStream dataOutputStream = this.a;
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                    this.a = null;
                } catch (IOException unused) {
                }
            }
            BufferedReader bufferedReader = this.b;
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                    this.b = null;
                } catch (IOException unused2) {
                }
            }
            BufferedReader bufferedReader2 = this.c;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                    this.c = null;
                } catch (IOException unused3) {
                }
            }
        }

        public ArrayList<String> c(String str) throws a {
            if (!d() || this.a == null || this.c == null || this.b == null) {
                g();
                try {
                    if (this.c.ready()) {
                        ArrayList<String> e = e();
                        if (e.size() > 0) {
                            String str2 = e.get(0);
                            if (!HttpUrl.FRAGMENT_ENCODE_SET.equals(str2) && str2 != null && !C3200r.c(str2)) {
                                return null;
                            }
                        }
                    }
                } catch (IOException unused) {
                    b();
                    return null;
                }
            }
            if (this.c.ready()) {
                C3184b.e("error reader already has something");
                while (this.c.ready()) {
                    if (this.c.read() == -1) {
                        g();
                    }
                }
            }
            if (this.b.ready()) {
                C3184b.e("input reader already has something");
                while (this.b.ready()) {
                    if (this.b.read() == -1) {
                        g();
                    }
                }
            }
            i(str);
            ArrayList<String> f = f();
            ArrayList<String> e2 = e();
            if (e2.size() > 0) {
                String str3 = e2.get(0);
                if (!HttpUrl.FRAGMENT_ENCODE_SET.equals(str3) && str3 != null) {
                    if (!C3200r.c(str3)) {
                        return null;
                    }
                }
            }
            return f;
        }

        public boolean d() {
            Process process = this.g;
            if (process == null) {
                return false;
            }
            try {
                process.exitValue();
                return false;
            } catch (IllegalThreadStateException unused) {
                return true;
            }
        }

        public boolean h() {
            String str;
            try {
                if (this.d) {
                    a();
                    str = this.f ? "su --mount-master" : "su";
                } else {
                    str = "sh";
                }
                Process exec = Runtime.getRuntime().exec(str);
                this.g = exec;
                OutputStream outputStream = exec.getOutputStream();
                if (outputStream == null) {
                    return false;
                }
                this.a = new DataOutputStream(outputStream);
                InputStream inputStream = this.g.getInputStream();
                if (inputStream == null) {
                    return false;
                }
                this.b = new BufferedReader(new InputStreamReader(inputStream));
                InputStream errorStream = this.g.getErrorStream();
                if (errorStream == null) {
                    return false;
                }
                this.c = new BufferedReader(new InputStreamReader(errorStream));
                return true;
            } catch (Exception e) {
                if (e.getMessage() == null || !e.getMessage().contains("Permission denied")) {
                    ax.Ha.c.h().f().b("Root command start error").l(e).h();
                }
                b();
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(String str) {
        return Pattern.compile("[+]").matcher(str).find();
    }

    public static synchronized ArrayList<String> d(String str, long j) {
        ArrayList<String> c2;
        synchronized (C3200r.class) {
            try {
                c2 = e().c(str);
            } catch (a unused) {
                return null;
            }
        }
        return c2;
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
        for (String str : b) {
            if (new File(str + "su").exists()) {
                return true;
            }
        }
        return false;
    }

    public static synchronized ArrayList<String> h(String str, long j) {
        ArrayList<String> c2;
        synchronized (C3200r.class) {
            try {
                c2 = f().c(str);
            } catch (a unused) {
                return null;
            }
        }
        return c2;
    }
}
