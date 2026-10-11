/*
 * Decompiled with CFR 0.152.
 */
package ax.R5;

import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import ax.M5.p;
import ax.R5.k;
import ax.R5.m;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

public class n {
    private static String a;
    private static int b;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a() {
        block19: {
            block18: {
                if (n.a != null) return n.a;
                if (Build.VERSION.SDK_INT >= 28) {
                    n.a = m.a();
                    return n.a;
                }
                var0_1 = var1 = n.b;
                if (var1 == 0) {
                    n.b = var0_1 = Process.myPid();
                }
                var4_2 = null;
                var3_4 = null;
                var2_7 /* !! */  = null;
                if (var0_1 <= 0) {
                    var2_7 /* !! */  = var3_4;
                } else {
                    var3_4 = new StringBuilder();
                    var3_4.append("/proc/");
                    var3_4.append(var0_1);
                    var3_4.append("/cmdline");
                    var6_11 = var3_4.toString();
                    var5_12 = StrictMode.allowThreadDiskReads();
                    break block18;
                }
lbl25:
                // 2 sources

                while (true) {
                    n.a = var2_7 /* !! */ ;
                    return n.a;
                }
            }
            var7_13 = new FileReader(var6_11);
            var3_4 = new BufferedReader(var7_13);
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var5_12);
            try {}
            catch (IOException var4_3) {}
lbl36:
            // 3 sources

            while (true) {
                k.a((Closeable)var3_4);
                ** continue;
                break;
            }
            {
                catch (Throwable var2_9) {
                    var3_4 = var4_2;
                    break block19;
                }
                catch (IOException var3_6) {
                    var3_4 = null;
                    ** GOTO lbl36
                }
lbl45:
                // 1 sources

                while (true) {
                    var4_2 = var3_4.readLine();
                    p.l(var4_2);
                    var4_2 = var4_2.trim();
                    var2_7 /* !! */  = var4_2;
                    ** continue;
                    break;
                }
            }
            finally {
                ** continue;
            }
            {
                catch (Throwable var3_5) {}
                {
                    StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var5_12);
                    throw var3_5;
                }
            }
        }
        k.a((Closeable)var3_4);
        throw var2_10;
    }
}

