/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Packet;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;

class IO {
    InputStream a;
    OutputStream b;
    OutputStream c;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;

    IO() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void a() {
        Closeable closeable;
        try {
            closeable = this.a;
            if (closeable != null && !this.d) {
                ((InputStream)closeable).close();
            }
            this.a = null;
        }
        catch (Exception exception) {}
        this.d();
        try {
            closeable = this.c;
            if (closeable != null && !this.f) {
                ((OutputStream)closeable).close();
            }
            this.c = null;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    int b() throws IOException {
        return this.a.read();
    }

    void c(byte[] byArray, int n8, int n9) throws IOException {
        int n10;
        while ((n10 = this.a.read(byArray, n8, n9)) >= 0) {
            n8 += n10;
            n9 = n10 = n9 - n10;
            if (n10 > 0) continue;
            return;
        }
        throw new IOException("End of IO Stream Read");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void d() {
        try {
            OutputStream outputStream = this.b;
            if (outputStream != null && !this.e) {
                outputStream.close();
            }
            this.b = null;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    void e(Packet object) throws IOException, SocketException {
        OutputStream outputStream = this.b;
        object = ((Packet)object).a;
        outputStream.write(((Buffer)object).b, 0, ((Buffer)object).c);
        this.b.flush();
    }

    void f(byte[] byArray, int n8, int n9) throws IOException {
        this.b.write(byArray, n8, n9);
        this.b.flush();
    }

    void g(byte[] byArray, int n8, int n9) throws IOException {
        this.c.write(byArray, n8, n9);
        this.c.flush();
    }

    void h(InputStream inputStream) {
        this.a = inputStream;
    }

    void i(InputStream inputStream, boolean bl) {
        this.d = bl;
        this.h(inputStream);
    }

    void j(OutputStream outputStream) {
        this.b = outputStream;
    }

    void k(OutputStream outputStream, boolean bl) {
        this.e = bl;
        this.j(outputStream);
    }
}

