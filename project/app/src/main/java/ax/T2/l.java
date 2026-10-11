/*
 * Decompiled with CFR 0.152.
 */
package ax.T2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import ax.Q2.e;
import ax.b3.j;
import ax.c3.F;
import ax.c3.K;
import ax.c3.x;
import ax.u3.c;
import ax.u3.d;
import com.alphainventor.filemanager.file.A;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;

public class l {
    private HashMap<String, b> a = new HashMap();
    private Context b;
    private K c;
    private a d;

    l(Context context, K k8, a a8) {
        this.c = k8;
        this.b = context;
        this.d = a8;
    }

    private static File c(Context object, K object2) throws IOException {
        object = e.q((Context)object);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("duplicate_hash_");
        stringBuilder.append(((K)object2).d().I());
        stringBuilder.append("#");
        stringBuilder.append(((K)object2).b());
        object2 = stringBuilder.toString();
        if (object != null) {
            return new File(((File)object).getAbsolutePath(), (String)object2);
        }
        throw new IOException("cannot get index file");
    }

    private static File d(Context object, K object2) throws IOException {
        object = e.q((Context)object);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("duplicate_hash_");
        stringBuilder.append(((K)object2).d().I());
        stringBuilder.append(":");
        stringBuilder.append(((K)object2).b());
        object2 = stringBuilder.toString();
        if (object != null) {
            return new File(((File)object).getAbsolutePath(), (String)object2);
        }
        throw new IOException("cannot get index file");
    }

    private void f(String string) {
        long l8;
        long l9;
        Object object;
        try {
            object = string.split("\u0000");
            string = Uri.decode((String)object[0]);
            l9 = Long.parseLong(object[1]);
            l8 = Long.parseLong(object[2]);
        }
        catch (RuntimeException runtimeException) {
            runtimeException.printStackTrace();
            return;
        }
        String string2 = object[3];
        String string3 = object[4];
        String string4 = object[5];
        object = new b(string, l9, l8, string2, string3, string4);
        this.a.put(string, (b)object);
    }

    private void i(BufferedWriter bufferedWriter, b object) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Uri.encode((String)((b)object).a));
        stringBuffer.append("\u0000");
        stringBuffer.append(String.valueOf(((b)object).b));
        stringBuffer.append("\u0000");
        stringBuffer.append(String.valueOf(((b)object).c));
        stringBuffer.append("\u0000");
        String string = ((b)object).d;
        if (string != null) {
            stringBuffer.append(string);
        }
        stringBuffer.append("\u0000");
        string = ((b)object).e;
        if (string != null) {
            stringBuffer.append(string);
        }
        stringBuffer.append("\u0000");
        object = ((b)object).f;
        if (object != null) {
            stringBuffer.append((String)object);
        }
        stringBuffer.append("\u0000");
        stringBuffer.append("#");
        stringBuffer.append("\n");
        bufferedWriter.write(stringBuffer.toString());
    }

    public boolean a(A object, A object2, c c8) throws ax.b3.a {
        if (!".folderimage".equals(((A)object).b()) && !".folderimage".equals(((A)object2).b())) {
            String string;
            String string2;
            object = this.b((A)object);
            object2 = this.b((A)object2);
            if (c8 != null && c8.isCancelled()) {
                throw new ax.b3.a();
            }
            if (object != null && object2 != null && (string2 = ((b)object).d) != null && (string = ((b)object2).d) != null) {
                if (!string2.equals(string)) {
                    return false;
                }
                if (c8 != null && c8.isCancelled()) {
                    throw new ax.b3.a();
                }
                if (TextUtils.isEmpty((CharSequence)((b)object).e)) {
                    this.h((b)object, 2);
                }
                if (c8 != null && c8.isCancelled()) {
                    throw new ax.b3.a();
                }
                if (TextUtils.isEmpty((CharSequence)((b)object2).e)) {
                    this.h((b)object2, 2);
                }
                if ((string2 = ((b)object).e) != null && (string = ((b)object2).e) != null) {
                    if (!string2.equals(string)) {
                        return false;
                    }
                    if (((b)object).c == ((b)object2).c) {
                        return true;
                    }
                    if (c8 != null && c8.isCancelled()) {
                        throw new ax.b3.a();
                    }
                    if (TextUtils.isEmpty((CharSequence)((b)object).f)) {
                        this.h((b)object, 3);
                    }
                    if (c8 != null && c8.isCancelled()) {
                        throw new ax.b3.a();
                    }
                    if (TextUtils.isEmpty((CharSequence)((b)object2).f)) {
                        this.h((b)object2, 3);
                    }
                    if ((object = ((b)object).f) != null && (object2 = ((b)object2).f) != null) {
                        return ((String)object).equals(object2);
                    }
                }
            }
        }
        return false;
    }

    public b b(A a8) {
        Object object = this.a.get(a8.a);
        if (object != null) {
            if (a8.c == ((b)object).c && a8.d == ((b)object).b) {
                ((b)object).g = true;
                return object;
            }
            this.a.remove(a8.a);
        }
        try {
            object = x.g(a8.a);
            object = ax.u3.d.b(((o)object).J(((o)object).z(a8.a), 0L), 8192L, null);
            b b8 = new b(a8.a, a8.d, a8.c, (String)object, null, null);
            b8.g = true;
            this.a.put(b8.a, b8);
            return b8;
        }
        catch (j | IOException exception) {
            return null;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e() {
        Object object;
        Object object2;
        block14: {
            Object object3;
            block15: {
                Throwable throwable;
                block13: {
                    throwable = null;
                    Throwable throwable2 = null;
                    object2 = throwable2;
                    Object object4 = l.d(this.b, this.c);
                    object2 = throwable2;
                    object = l.c(this.b, this.c);
                    object2 = throwable2;
                    object3 = object;
                    if (((File)object4).exists()) {
                        object2 = throwable2;
                        if (!((File)object).exists()) {
                            object2 = throwable2;
                            ((File)object4).renameTo((File)object);
                            object2 = throwable2;
                            object3 = l.c(this.b, this.c);
                        } else {
                            object2 = throwable2;
                            ((File)object4).delete();
                            object3 = object;
                        }
                    }
                    object2 = throwable2;
                    if (!((File)object3).exists()) {
                        return;
                    }
                    object2 = throwable2;
                    object2 = throwable2;
                    object2 = throwable2;
                    object4 = new FileReader((File)object3);
                    object2 = throwable2;
                    object = new BufferedReader((Reader)object4);
                    if ("1".equals(((BufferedReader)object).readLine())) break block13;
                    ((BufferedReader)object).close();
                    ((File)object3).delete();
                    F.a((AutoCloseable)object);
                    return;
                }
                try {
                    while ((object2 = ((BufferedReader)object).readLine()) != null) {
                        this.f((String)object2);
                    }
                }
                catch (Throwable throwable3) {
                    break block14;
                }
                catch (IOException iOException) {
                    object3 = iOException;
                    break block15;
                }
                F.a((AutoCloseable)object);
                return;
                catch (Throwable throwable4) {
                    object = object2;
                    object2 = throwable4;
                    break block14;
                }
                catch (IOException iOException) {
                    object = throwable;
                    object3 = iOException;
                }
            }
            object2 = object;
            {
                ((Throwable)object3).printStackTrace();
                if (object == null) return;
            }
            F.a((AutoCloseable)object);
            return;
        }
        if (object == null) throw object2;
        F.a((AutoCloseable)object);
        throw object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g() {
        BufferedWriter bufferedWriter;
        block7: {
            Object object;
            Object object2 = null;
            try {
                File file = l.c(this.b, this.c);
                object = new FileWriter(file);
                bufferedWriter = new BufferedWriter((Writer)object);
            }
            catch (IOException iOException) {
                bufferedWriter = object2;
                break block7;
            }
            try {
                bufferedWriter.write("1\n");
                object = this.a.values().iterator();
                while (true) {
                    if (!object.hasNext()) {
                        bufferedWriter.close();
                        return;
                    }
                    object2 = (b)object.next();
                    if (!((b)object2).g) continue;
                    this.i(bufferedWriter, (b)object2);
                }
            }
            catch (IOException iOException) {}
        }
        if (bufferedWriter != null) {
            F.a(bufferedWriter);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void h(b b8, int n8) {
        try {
            Object object = x.g(b8.a);
            n n9 = ((o)object).z(b8.a);
            object = ((o)object).J(n9, 0L);
            if (n8 == 2) {
                b8.e = ax.u3.d.b((InputStream)object, 0x100000L, null);
            } else if (n8 == 3) {
                this.d.a(b8.a);
                b8.f = ax.u3.d.b((InputStream)object, n9.p(), null);
                this.d.a("");
            }
            this.a.put(b8.a, b8);
            return;
        }
        catch (j | IOException exception) {
            return;
        }
    }

    public static interface a {
        public void a(String var1);
    }

    public static class b {
        String a;
        long b;
        long c;
        public String d;
        public String e;
        public String f;
        public boolean g;

        b(String string, long l8, long l9, String string2, String string3, String string4) {
            this.a = string;
            this.b = l8;
            this.c = l9;
            this.d = string2;
            this.e = string3;
            this.f = string4;
        }
    }
}

