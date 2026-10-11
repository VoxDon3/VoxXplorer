package ax.u3;

import android.os.Process;
import ax.u3.AbstractC3199q;
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

/* renamed from: ax.u3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3198p {

    /* renamed from: ax.u3.p$a */
    class a implements Callable<c> {
        final /* synthetic */ String a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;
        final /* synthetic */ b d;

        a(String str, int i, int i2, b bVar) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = bVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c call() {
            Process.setThreadPriority(AbstractC3199q.e.NORMAL.h());
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(this.a, this.b), this.c);
                socket.close();
                b bVar = this.d;
                if (bVar != null) {
                    bVar.a(this.a);
                }
                return new c(this.a, true);
            } catch (Exception unused) {
                return new c(this.a, false);
            }
        }
    }

    /* renamed from: ax.u3.p$b */
    public interface b {
        void a(String str);
    }

    /* renamed from: ax.u3.p$c */
    public static class c {
        public String a;
        public boolean b;

        public c(String str, boolean z) {
            this.a = str;
            this.b = z;
        }
    }

    public static Future<c> a(ExecutorService executorService, String str, int i, int i2, b bVar) {
        return executorService.submit(new a(str, i, i2, bVar));
    }

    public static List<Future<c>> b(byte[] bArr, int i, int i2, b bVar) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(i2);
        ArrayList arrayList = new ArrayList();
        try {
            System.currentTimeMillis();
            for (int i3 = 1; i3 < 255; i3++) {
                copyOf[3] = (byte) i3;
                arrayList.add(a(newFixedThreadPool, InetAddress.getByAddress(copyOf).getHostAddress(), 445, i, bVar));
            }
            newFixedThreadPool.shutdown();
            return arrayList;
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return arrayList;
        }
    }
}
