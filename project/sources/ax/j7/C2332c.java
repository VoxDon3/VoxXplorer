package ax.j7;

import ax.i7.AbstractC2274A;
import ax.i7.z;
import ax.m7.v;
import ax.m7.y;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ax.j7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2332c extends z {
    private static final InterfaceC0342c g = new b();
    private final HttpURLConnection e;
    private int f = 0;

    /* renamed from: ax.j7.c$a */
    class a implements Callable<Boolean> {
        final /* synthetic */ InterfaceC0342c a;
        final /* synthetic */ OutputStream b;
        final /* synthetic */ y c;

        a(InterfaceC0342c interfaceC0342c, OutputStream outputStream, y yVar) {
            this.a = interfaceC0342c;
            this.b = outputStream;
            this.c = yVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws IOException {
            this.a.a(this.b, this.c);
            return Boolean.TRUE;
        }
    }

    /* renamed from: ax.j7.c$b */
    static class b implements InterfaceC0342c {
        b() {
        }

        @Override // ax.j7.C2332c.InterfaceC0342c
        public void a(OutputStream outputStream, y yVar) throws IOException {
            yVar.b(outputStream);
        }
    }

    /* renamed from: ax.j7.c$c, reason: collision with other inner class name */
    interface InterfaceC0342c {
        void a(OutputStream outputStream, y yVar) throws IOException;
    }

    C2332c(HttpURLConnection httpURLConnection) {
        this.e = httpURLConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
    }

    private boolean n(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getResponseCode() > 0;
    }

    private void o(InterfaceC0342c interfaceC0342c, OutputStream outputStream) throws IOException {
        if (this.f == 0) {
            interfaceC0342c.a(outputStream, f());
            return;
        }
        a aVar = new a(interfaceC0342c, outputStream, f());
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future submit = newSingleThreadExecutor.submit(new FutureTask(aVar), null);
        newSingleThreadExecutor.shutdown();
        try {
            submit.get(this.f, TimeUnit.MILLISECONDS);
            if (newSingleThreadExecutor.isTerminated()) {
                return;
            }
            newSingleThreadExecutor.shutdown();
        } catch (InterruptedException e) {
            throw new IOException("Socket write interrupted", e);
        } catch (ExecutionException e2) {
            throw new IOException("Exception in socket write", e2);
        } catch (TimeoutException e3) {
            throw new IOException("Socket write timed out", e3);
        }
    }

    @Override // ax.i7.z
    public void a(String str, String str2) {
        this.e.addRequestProperty(str, str2);
    }

    @Override // ax.i7.z
    public AbstractC2274A b() throws IOException {
        return m(g);
    }

    @Override // ax.i7.z
    public void k(int i, int i2) {
        this.e.setReadTimeout(i2);
        this.e.setConnectTimeout(i);
    }

    @Override // ax.i7.z
    public void l(int i) throws IOException {
        this.f = i;
    }

    AbstractC2274A m(InterfaceC0342c interfaceC0342c) throws IOException {
        HttpURLConnection httpURLConnection = this.e;
        if (f() != null) {
            String e = e();
            if (e != null) {
                a("Content-Type", e);
            }
            String c = c();
            if (c != null) {
                a("Content-Encoding", c);
            }
            long d = d();
            if (d >= 0) {
                httpURLConnection.setRequestProperty("Content-Length", Long.toString(d));
            }
            String requestMethod = httpURLConnection.getRequestMethod();
            if ("POST".equals(requestMethod) || "PUT".equals(requestMethod)) {
                httpURLConnection.setDoOutput(true);
                if (d < 0 || d > 2147483647L) {
                    httpURLConnection.setChunkedStreamingMode(0);
                } else {
                    httpURLConnection.setFixedLengthStreamingMode((int) d);
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    try {
                        o(interfaceC0342c, outputStream);
                        outputStream.close();
                    } catch (IOException e2) {
                        if (!n(httpURLConnection)) {
                            throw e2;
                        }
                    }
                } finally {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                }
            } else {
                v.c(d == 0, "%s with non-zero content length is not supported", requestMethod);
            }
        } else if ("DELETE".equals(httpURLConnection.getRequestMethod())) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(0L);
        }
        try {
            httpURLConnection.connect();
            return new C2333d(httpURLConnection);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
