package ax.P3;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class o extends Exception {
    private static final StackTraceElement[] f0 = new StackTraceElement[0];
    private ax.M3.h c0;
    private ax.M3.a d0;
    private Class<?> e0;
    private final List<Exception> q;

    public o(String str) {
        this(str, (List<Exception>) Collections.EMPTY_LIST);
    }

    private void a(Exception exc, List<Exception> list) {
        if (!(exc instanceof o)) {
            list.add(exc);
            return;
        }
        Iterator<Exception> it = ((o) exc).e().iterator();
        while (it.hasNext()) {
            a(it.next(), list);
        }
    }

    private static void b(List<Exception> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void c(List<Exception> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Exception exc = list.get(i);
            if (exc instanceof o) {
                ((o) exc).h(appendable);
            } else {
                d(exc, appendable);
            }
            i = i2;
        }
    }

    private static void d(Exception exc, Appendable appendable) {
        try {
            appendable.append(exc.getClass().toString()).append(": ").append(exc.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(exc);
        }
    }

    private void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List<Exception> e() {
        return this.q;
    }

    public List<Exception> f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public void g(String str) {
        List<Exception> f = f();
        int size = f.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), f.get(i));
            i = i2;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        Class<?> cls = this.e0;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (cls != null) {
            str = ", " + this.e0;
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        if (this.d0 != null) {
            str2 = ", " + this.d0;
        } else {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str2);
        if (this.c0 != null) {
            str3 = ", " + this.c0;
        }
        sb.append(str3);
        return sb.toString();
    }

    void i(ax.M3.h hVar, ax.M3.a aVar) {
        j(hVar, aVar, null);
    }

    void j(ax.M3.h hVar, ax.M3.a aVar, Class<?> cls) {
        this.c0 = hVar;
        this.d0 = aVar;
        this.e0 = cls;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public o(String str, Exception exc) {
        this(str, (List<Exception>) Collections.singletonList(exc));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public o(String str, List<Exception> list) {
        super(str);
        setStackTrace(f0);
        this.q = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }

    private static final class a implements Appendable {
        private boolean c0 = true;
        private final Appendable q;

        a(Appendable appendable) {
            this.q = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? HttpUrl.FRAGMENT_ENCODE_SET : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            if (this.c0) {
                this.c0 = false;
                this.q.append("  ");
            }
            this.c0 = c == '\n';
            this.q.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence a = a(charSequence);
            return append(a, 0, a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence a = a(charSequence);
            boolean z = false;
            if (this.c0) {
                this.c0 = false;
                this.q.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.c0 = z;
            this.q.append(a, i, i2);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
