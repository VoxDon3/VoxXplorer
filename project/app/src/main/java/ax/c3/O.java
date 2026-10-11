/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.net.Uri;
import ax.Ha.c;
import ax.X2.Q;
import ax.Z2.i;
import ax.c3.A;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.q;
import ax.t3.k;
import com.alphainventor.filemanager.file.B;
import com.alphainventor.filemanager.file.C;
import com.alphainventor.filemanager.file.m;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.v;
import com.alphainventor.filemanager.file.y;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class O {
    private static final Logger b = Logger.getLogger("FileManager.NewFilesScan");
    private final B a;

    public O(B b8) {
        this.a = b8;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(List<v> list, List<n> list2, long l8, i i8, Writer writer) throws IOException {
        b b8 = new b();
        int n8 = 0;
        while (true) {
            block12: {
                block10: {
                    int n9;
                    Comparable<File> comparable;
                    v v8;
                    block11: {
                        if (n8 >= list.size()) {
                            return;
                        }
                        v8 = list.get(n8);
                        comparable = v8.F0();
                        if (v8.h() || !O.d((File)comparable, l8)) break block10;
                        String string = i8.c();
                        if (string == null) {
                            n9 = -1;
                        } else {
                            b8.c(string);
                            if (!b8.a) {
                                i8.b();
                                throw new IOException("scan file type does not match");
                            }
                            n9 = ((File)comparable).getAbsolutePath().compareTo(b8.b);
                        }
                        if (n9 != 0) break block11;
                        if (b8.c == ((File)comparable).lastModified()) {
                            comparable = new StringBuilder();
                            ((StringBuilder)comparable).append(string);
                            ((StringBuilder)comparable).append("\n");
                            writer.write(((StringBuilder)comparable).toString());
                            i8.a();
                            this.e(v8, list2, l8, i8, writer);
                            break block10;
                        } else {
                            i8.a();
                            this.g(i8);
                            this.f((File)comparable, list2, l8, v8.B0(), writer);
                        }
                        break block10;
                    }
                    if (n9 >= 0) break block12;
                    this.f((File)comparable, list2, l8, v8.B0(), writer);
                }
                ++n8;
                continue;
            }
            i8.a();
            this.g(i8);
        }
    }

    public static long c() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -10);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return Math.max(calendar.getTimeInMillis(), k.m());
    }

    private static boolean d(File file, long l8) {
        return file.lastModified() >= l8;
    }

    private void e(v v8, List<n> list, long l8, i i8, Writer writer) throws IOException {
        b b8 = new b();
        while (true) {
            String string;
            block6: {
                block5: {
                    if ((string = i8.c()) == null) break block5;
                    b8.c(string);
                    if (!b8.a) break block6;
                }
                return;
            }
            if (b8.c > l8) {
                Comparable<File> comparable = new File(b8.b);
                list.add(new C(this.a, (File)comparable, v8.B0()));
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append(string);
                ((StringBuilder)comparable).append("\n");
                writer.write(((StringBuilder)comparable).toString());
            }
            i8.a();
        }
    }

    /*
     * Unable to fully structure code
     */
    private void f(File var1_1, List<n> var2_4, long var3_5, K var5_6, Writer var6_7) throws IOException {
        block13: {
            if (O.d(var1_1, var3_5)) {
                if (var1_1.isDirectory()) {
                    if (!d0.C(var1_1.getName())) {
                        var10_8 = var1_1.listFiles();
                        if (var10_8 == null) ** GOTO lbl27
                        if (var1_1.length() <= 0L) break block13;
                        this.i(var6_7, var1_1);
                        for (File var1_1 : var10_8) {
                            try {
                                var9_11 = var1_1.isDirectory();
                                if (var9_11) continue;
                            }
                            catch (OutOfMemoryError var1_2) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    c.h().d("searchNewFile : OutOfMemory").h();
                                    break;
                                }
                            }
                            this.f(var1_1, var2_4, var3_5, var5_6, var6_7);
                        }
                    }
                } else if (A.b(var1_1.getName())) {
                    this.j(var6_7, var1_1);
                    var2_4.add(new C(this.a, var1_1, var5_6));
                }
            }
        }
        return;
        catch (OutOfMemoryError var1_3) {
            ** continue;
        }
    }

    private void g(i i8) throws IOException {
        String string;
        while ((string = i8.c()) != null && string.startsWith("F")) {
            i8.a();
        }
        return;
    }

    private void h(List<n> object) {
        List<n> list = object;
        if (object.size() > 10000) {
            list = q.g(object, q.c("DateDown")).subList(0, 10000);
            ax.Z2.b.k().w(40960);
        }
        object = this.a;
        object = ((B)object).z(((m)object).x());
        ax.Z2.b.k().m((n)object, list);
    }

    private void i(Writer writer, File file) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("D");
        stringBuffer.append("\u0000");
        stringBuffer.append(Uri.encode((String)file.getAbsolutePath()));
        stringBuffer.append("\u0000");
        stringBuffer.append(String.valueOf(file.lastModified()));
        stringBuffer.append("\n");
        if (writer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    private void j(Writer writer, File file) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("F");
        stringBuffer.append("\u0000");
        stringBuffer.append(Uri.encode((String)file.getAbsolutePath()));
        stringBuffer.append("\u0000");
        stringBuffer.append(String.valueOf(file.lastModified()));
        stringBuffer.append("\n");
        if (writer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(File var1_1, HashMap<String, v> var2_7, List<n> var3_13) throws IOException {
        block42: {
            block35: {
                block41: {
                    block40: {
                        block38: {
                            block39: {
                                block37: {
                                    block36: {
                                        block34: {
                                            block33: {
                                                var5_17 = O.c();
                                                var9_18 = new ArrayList<n>();
                                                var10_19 = new ArrayList<v>(var2_7.values());
                                                if (Q.h1() && var3_13 != null && var3_13.size() > 0) {
                                                    O.b.fine("scan build newfiles using MediaStore");
                                                    try {
                                                        var3_13 = var3_13.iterator();
                                                        while (true) {
                                                            if (!var3_13.hasNext()) {
                                                                this.h(var9_18);
                                                                return;
                                                            }
                                                            var7_20 = (n)var3_13.next();
                                                            if (var7_20.q() < var5_17 || !A.a(var7_20.G()) || var7_20.isDirectory() || (var8_22 = (v)var2_7.get(var7_20.T())) == null || var8_22.h()) continue;
                                                            var7_20 = (y)var7_20;
                                                            var8_22 = new C(this.a, var7_20.F0(), var7_20.B0());
                                                            var8_22.r1();
                                                            if (!var8_22.n()) continue;
                                                            var9_18.add(var8_22);
                                                        }
                                                    }
                                                    catch (Exception var2_8) {}
                                                    var2_8.printStackTrace();
                                                }
                                                var8_23 = null;
                                                var11_24 = var1_1.getAbsolutePath();
                                                var4_25 = var1_1.exists();
                                                if (!var4_25) break block33;
                                                try {
                                                    var3_13 = new FileReader(var11_24);
                                                    var2_7 = new BufferedReader((Reader)var3_13);
                                                    break block34;
                                                }
                                                catch (Throwable var2_9) lbl-1000:
                                                // 2 sources

                                                {
                                                    while (true) {
                                                        var1_1 = null;
                                                        var3_13 = var8_23;
                                                        break block35;
                                                        break;
                                                    }
                                                }
                                            }
                                            var2_7 = null;
                                        }
                                        var12_26 = new StringBuilder();
                                        var12_26.append(var11_24);
                                        var12_26.append(".tmp");
                                        var3_13 = new FileWriter(var12_26.toString());
                                        var7_21 = new BufferedWriter((Writer)var3_13);
                                        if (var2_7 == null) break block36;
                                        try {
                                            var3_13 = var2_7.readLine();
                                            break block37;
                                        }
                                        catch (Throwable var3_14) {
                                            var1_1 = var7_21;
lbl54:
                                            // 3 sources

                                            while (true) {
                                                var7_21 = var2_7;
                                                var2_7 = var3_13;
                                                var3_13 = var7_21;
                                                break block35;
                                                break;
                                            }
                                        }
                                    }
                                    var3_13 = null;
                                }
                                var4_25 = "1".equals(var3_13);
                                if (var4_25 || var2_7 == null) break block38;
                                {
                                    var2_7.close();
                                }
                                try {
                                    if (!var1_1.exists()) break block39;
                                    var1_1.delete();
                                }
                                catch (Throwable var2_10) {
                                    var1_1 = var7_21;
                                    var3_13 = var8_23;
                                    break block35;
                                }
                            }
                            var2_7 = null;
                        }
                        var7_21.write("1\n");
                        var8_23 = new i((BufferedReader)var2_7);
                        var3_13 = new Comparator<n>(this){
                            final O q;
                            {
                                this.q = o8;
                            }

                            public int a(n n8, n n9) {
                                return n8.E().compareTo(n9.E());
                            }
                        };
                        Collections.sort(var10_19, var3_13);
                        this.b(var10_19, var9_18, var5_17, (i)var8_23, (Writer)var7_21);
                        var8_23 = var2_7;
                        try {
                            this.h(var9_18);
                            var3_13 = var2_7;
                            if (var2_7 == null) break block40;
                            var8_23 = var2_7;
                            var2_7.close();
                            var3_13 = null;
                        }
                        catch (Throwable var1_2) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                var2_7 = var1_1;
                                var3_13 = var8_23;
                                var1_1 = var7_21;
                                break block35;
                                break;
                            }
                        }
                    }
                    var8_23 = var3_13;
                    var7_21.close();
                    try {
                        if (!var1_1.exists()) break block41;
                        var1_1.delete();
                    }
                    catch (Throwable var2_11) {
                        var1_1 = null;
                        break block35;
                    }
                }
                var2_7 = new StringBuilder();
                var2_7.append(var11_24);
                var2_7.append(".tmp");
                var7_21 = new File(var2_7.toString());
                var7_21.renameTo(var1_1.getAbsoluteFile());
                if (var3_13 == null) return;
                try {
                    var3_13.close();
                    return;
                }
                catch (IOException var1_5) {
                    return;
                }
                catch (Throwable var1_3) {
                    var8_23 = var2_7;
                    ** GOTO lbl-1000
                }
                catch (Throwable var1_4) {
                    var8_23 = var2_7;
                    ** continue;
                }
                catch (Throwable var3_15) {
                    var1_1 = var7_21;
                    ** GOTO lbl54
                }
                catch (Throwable var3_16) {
                    var1_1 = null;
                    ** continue;
                }
                catch (Throwable var2_12) {
                    ** continue;
                }
            }
            if (var3_13 == null) break block42;
            try {}
            catch (IOException var1_6) {
                throw var2_7;
            }
            var3_13.close();
        }
        if (var1_1 == null) throw var2_7;
        var1_1.close();
        throw var2_7;
    }

    private static class b {
        boolean a;
        String b;
        long c;

        private b() {
        }

        private void b() {
            this.a = false;
            this.b = null;
            this.c = 0L;
        }

        private void c(String stringArray) throws IOException {
            block6: {
                block9: {
                    String string;
                    block8: {
                        block7: {
                            stringArray = stringArray.split("\u0000");
                            this.b();
                            if (stringArray.length < 3) break block6;
                            if (!"D".equals(stringArray[0])) break block7;
                            this.a = true;
                            break block8;
                        }
                        if (!"F".equals(stringArray[0])) break block9;
                        this.a = false;
                    }
                    this.b = string = Uri.decode((String)stringArray[1]);
                    if (string != null) {
                        try {
                            this.c = Long.parseLong(stringArray[2]);
                            return;
                        }
                        catch (NumberFormatException numberFormatException) {
                            ax.Ha.b b8 = ax.Ha.c.h().f().b("NEW FILES PARSING ERROR").l(numberFormatException);
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("broken:");
                            stringBuilder.append(stringArray[2]);
                            b8.g(stringBuilder.toString()).h();
                            throw new IOException("Scan file last modified broken");
                        }
                    }
                    throw new IOException("Scan file broken path == null");
                }
                throw new IOException("Scan file broken invalid type");
            }
            throw new IOException("Scan file broken 1");
        }
    }
}

