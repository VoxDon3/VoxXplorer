/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import android.os.Process;
import ax.u3.q;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class p {
    public static Future<c> a(ExecutorService executorService, String string, int n8, int n9, b b8) {
        return executorService.submit(new Callable<c>(){
            final String a;
            final int b;
            final int c;
            final b d;
            {
                this.a = string;
                this.b = n8;
                this.c = n9;
                this.d = b8;
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            public c a() {
                Object object;
                Process.setThreadPriority((int)q.e.f0.h());
                try {
                    object = new Socket();
                    InetSocketAddress inetSocketAddress = new InetSocketAddress(this.a, this.b);
                    ((Socket)object).connect(inetSocketAddress, this.c);
                    ((Socket)object).close();
                    object = this.d;
                    if (object == null) return new c(this.a, true);
                }
                catch (Exception exception) {
                    return new c(this.a, false);
                }
                object.a(this.a);
                return new c(this.a, true);
            }
        });
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List<Future<c>> b(byte[] object, int n8, int n9, b b8) {
        UnknownHostException unknownHostException2;
        block5: {
            byte[] byArray = Arrays.copyOf((byte[])object, ((byte[])object).length);
            ExecutorService executorService = Executors.newFixedThreadPool(n9);
            object = new ArrayList();
            try {
                System.currentTimeMillis();
            }
            catch (UnknownHostException unknownHostException2) {
                break block5;
            }
            for (n9 = 1; n9 < 255; ++n9) {
                byArray[3] = (byte)n9;
                {
                    object.add(p.a(executorService, InetAddress.getByAddress(byArray).getHostAddress(), 445, n8, b8));
                    continue;
                }
            }
            {
                executorService.shutdown();
                return object;
            }
        }
        unknownHostException2.printStackTrace();
        return object;
    }

    public static interface b {
        public void a(String var1);
    }

    public static class c {
        public String a;
        public boolean b;

        public c(String string, boolean bl) {
            this.a = string;
            this.b = bl;
        }
    }
}

