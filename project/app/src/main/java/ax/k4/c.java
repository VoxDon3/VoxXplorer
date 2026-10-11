/*
 * Decompiled with CFR 0.152.
 */
package ax.k4;

import ax.k4.i;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Queue;

public class c
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private static final Queue<c> d0 = i.e(0);
    private IOException c0;
    private InputStream q;

    c() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c b(InputStream inputStream) {
        c c8;
        Object object = d0;
        synchronized (object) {
            c8 = object.poll();
        }
        object = c8;
        if (c8 == null) {
            object = new c();
        }
        ((c)object).d(inputStream);
        return object;
    }

    public IOException a() {
        return this.c0;
    }

    @Override
    public int available() throws IOException {
        return this.q.available();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c() {
        this.c0 = null;
        this.q = null;
        Queue<c> queue = d0;
        synchronized (queue) {
            queue.offer(this);
            return;
        }
    }

    @Override
    public void close() throws IOException {
        this.q.close();
    }

    void d(InputStream inputStream) {
        this.q = inputStream;
    }

    @Override
    public void mark(int n8) {
        this.q.mark(n8);
    }

    @Override
    public boolean markSupported() {
        return this.q.markSupported();
    }

    @Override
    public int read() throws IOException {
        try {
            int n8 = this.q.read();
            return n8;
        }
        catch (IOException iOException) {
            this.c0 = iOException;
            return -1;
        }
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        try {
            int n8 = this.q.read(byArray);
            return n8;
        }
        catch (IOException iOException) {
            this.c0 = iOException;
            return -1;
        }
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        try {
            n8 = this.q.read(byArray, n8, n9);
            return n8;
        }
        catch (IOException iOException) {
            this.c0 = iOException;
            return -1;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void reset() throws IOException {
        synchronized (this) {
            this.q.reset();
            return;
        }
    }

    @Override
    public long skip(long l8) throws IOException {
        try {
            l8 = this.q.skip(l8);
            return l8;
        }
        catch (IOException iOException) {
            this.c0 = iOException;
            return 0L;
        }
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

