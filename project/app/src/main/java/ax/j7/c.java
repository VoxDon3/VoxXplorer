/*
 * Decompiled with CFR 0.152.
 */
package ax.j7;

import ax.i7.A;
import ax.i7.z;
import ax.j7.d;
import ax.m7.v;
import ax.m7.y;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class c
extends z {
    private static final c g = new b();
    private final HttpURLConnection e;
    private int f;

    c(HttpURLConnection httpURLConnection) {
        this.e = httpURLConnection;
        this.f = 0;
        httpURLConnection.setInstanceFollowRedirects(false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean n(HttpURLConnection httpURLConnection) {
        block3: {
            try {
                int n8 = httpURLConnection.getResponseCode();
                if (n8 <= 0) break block3;
                return true;
            }
            catch (IOException iOException) {
                return false;
            }
        }
        return false;
    }

    private void o(c object, OutputStream future) throws IOException {
        InterruptedException interruptedException2;
        block7: {
            ExecutionException executionException2;
            block6: {
                if (this.f == 0) {
                    object.a((OutputStream)((Object)future), this.f());
                    return;
                }
                future = new Callable<Boolean>(this, (c)object, (OutputStream)((Object)future), this.f()){
                    final c a;
                    final OutputStream b;
                    final y c;
                    final c d;
                    {
                        this.d = c8;
                        this.a = c9;
                        this.b = outputStream;
                        this.c = y8;
                    }

                    public Boolean a() throws IOException {
                        this.a.a(this.b, this.c);
                        return Boolean.TRUE;
                    }
                };
                object = Executors.newSingleThreadExecutor();
                future = object.submit(new FutureTask(future), null);
                object.shutdown();
                try {
                    future.get(this.f, TimeUnit.MILLISECONDS);
                    if (!object.isTerminated()) {
                        object.shutdown();
                    }
                    return;
                }
                catch (TimeoutException timeoutException) {
                }
                catch (ExecutionException executionException2) {
                    break block6;
                }
                catch (InterruptedException interruptedException2) {
                    break block7;
                }
                throw new IOException("Socket write timed out", timeoutException);
            }
            throw new IOException("Exception in socket write", executionException2);
        }
        throw new IOException("Socket write interrupted", interruptedException2);
    }

    @Override
    public void a(String string, String string2) {
        this.e.addRequestProperty(string, string2);
    }

    @Override
    public A b() throws IOException {
        return this.m(g);
    }

    @Override
    public void k(int n8, int n9) {
        this.e.setReadTimeout(n9);
        this.e.setConnectTimeout(n8);
    }

    @Override
    public void l(int n8) throws IOException {
        this.f = n8;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    A m(c object) throws IOException {
        Throwable throwable222222;
        HttpURLConnection httpURLConnection;
        block21: {
            Object object2;
            httpURLConnection = this.e;
            if (this.f() != null) {
                long l8;
                long l9;
                long l10;
                object2 = this.e();
                if (object2 != null) {
                    this.a("Content-Type", (String)object2);
                }
                if ((object2 = this.c()) != null) {
                    this.a("Content-Encoding", (String)object2);
                }
                if ((l10 = (l9 = (l8 = this.d()) - 0L) == 0L ? 0 : (l9 < 0L ? -1 : 1)) >= 0) {
                    httpURLConnection.setRequestProperty("Content-Length", Long.toString(l8));
                }
                if (!"POST".equals(object2 = httpURLConnection.getRequestMethod()) && !"PUT".equals(object2)) {
                    boolean bl = l10 == false;
                    v.c(bl, "%s with non-zero content length is not supported", object2);
                    break block21;
                } else {
                    httpURLConnection.setDoOutput(true);
                    if (l10 >= 0 && l8 <= Integer.MAX_VALUE) {
                        httpURLConnection.setFixedLengthStreamingMode((int)l8);
                    } else {
                        httpURLConnection.setChunkedStreamingMode(0);
                    }
                    object2 = httpURLConnection.getOutputStream();
                    this.o((c)object, (OutputStream)object2);
                    ((OutputStream)object2).close();
                }
            } else if ("DELETE".equals(httpURLConnection.getRequestMethod())) {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setFixedLengthStreamingMode(0L);
            }
            break block21;
            {
                block22: {
                    catch (Throwable throwable222222) {
                        break block22;
                    }
                    catch (IOException iOException) {}
                    {
                        boolean bl = this.n(httpURLConnection);
                        if (!bl) throw iOException;
                    }
                    try {
                        ((OutputStream)object2).close();
                    }
                    catch (IOException iOException) {}
                }
                ((OutputStream)object2).close();
                throw throwable222222;
            }
        }
        try {
            httpURLConnection.connect();
            return new d(httpURLConnection);
        }
        catch (Throwable throwable3) {
            httpURLConnection.disconnect();
            throw throwable3;
        }
        catch (IOException iOException) {
            throw throwable222222;
        }
    }

    static class b
    implements c {
        b() {
        }

        @Override
        public void a(OutputStream outputStream, y y8) throws IOException {
            y8.b(outputStream);
        }
    }

    static interface c {
        public void a(OutputStream var1, y var2) throws IOException;
    }
}

