/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Kc.l;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

class X
extends OutputStream
implements AutoCloseable {
    private File c0;
    private final long d0;
    private int e0;
    private long f0;
    private boolean g0;
    private final byte[] h0;
    private OutputStream q;

    private File a(Integer object) throws IOException {
        int n8 = object == null ? this.e0 + 2 : (Integer)object;
        String string = l.a(this.c0.getName());
        if (n8 <= 9) {
            object = new StringBuilder();
            ((StringBuilder)object).append(".z");
            ((StringBuilder)object).append("0");
            ((StringBuilder)object).append(n8);
            object = ((StringBuilder)object).toString();
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append(".z");
            ((StringBuilder)object).append(n8);
            object = ((StringBuilder)object).toString();
        }
        Object object2 = this.c0.getParent();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append((String)object);
        object2 = new File((String)object2, stringBuilder.toString());
        if (!((File)object2).exists()) {
            return object2;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("split zip segment ");
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(" already exists");
        throw new IOException(((StringBuilder)object2).toString());
    }

    private void b() throws IOException {
        if (!this.g0) {
            CharSequence charSequence = l.a(this.c0.getName());
            File file = this.c0.getParentFile();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append(".zip");
            file = new File(file, stringBuilder.toString());
            this.q.close();
            if (this.c0.renameTo(file)) {
                this.g0 = true;
                return;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Failed to rename ");
            ((StringBuilder)charSequence).append(this.c0);
            ((StringBuilder)charSequence).append(" to ");
            ((StringBuilder)charSequence).append(file);
            throw new IOException(((StringBuilder)charSequence).toString());
        }
        throw new IOException("This archive has already been finished");
    }

    private void e() throws IOException {
        File file;
        if (this.e0 == 0) {
            this.q.close();
            file = this.a(1);
            if (!this.c0.renameTo(file)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to rename ");
                stringBuilder.append(this.c0);
                stringBuilder.append(" to ");
                stringBuilder.append(file);
                throw new IOException(stringBuilder.toString());
            }
        }
        file = this.a(null);
        this.q.close();
        this.q = j.Files.newOutputStream((j.Path)j.FileRetargetClass.toPath((File)file), (j.OpenOption[])new j.OpenOption[0]);
        this.f0 = 0L;
        this.c0 = file;
        ++this.e0;
    }

    public long c() {
        return this.f0;
    }

    @Override
    public void close() throws IOException {
        if (!this.g0) {
            this.b();
        }
    }

    public int d() {
        return this.e0;
    }

    public void f(long l8) throws IllegalArgumentException, IOException {
        long l9 = this.d0;
        if (l8 <= l9) {
            if (l9 - this.f0 < l8) {
                this.e();
            }
            return;
        }
        throw new IllegalArgumentException("The unsplittable content size is bigger than the split segment size");
    }

    @Override
    public void write(int n8) throws IOException {
        byte[] byArray = this.h0;
        byArray[0] = (byte)(n8 & 0xFF);
        this.write(byArray);
    }

    @Override
    public void write(byte[] byArray) throws IOException {
        this.write(byArray, 0, byArray.length);
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        if (n9 <= 0) {
            return;
        }
        long l8 = this.f0;
        long l9 = this.d0;
        if (l8 >= l9) {
            this.e();
            this.write(byArray, n8, n9);
            return;
        }
        long l10 = n9;
        if (l8 + l10 > l9) {
            int n10 = (int)l9 - (int)l8;
            this.write(byArray, n8, n10);
            this.e();
            this.write(byArray, n8 + n10, n9 - n10);
            return;
        }
        this.q.write(byArray, n8, n9);
        this.f0 += l10;
    }
}

