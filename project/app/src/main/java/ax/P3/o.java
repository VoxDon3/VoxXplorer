/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import android.util.Log;
import ax.M3.h;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class o
extends Exception {
    private static final StackTraceElement[] f0 = new StackTraceElement[0];
    private h c0;
    private ax.M3.a d0;
    private Class<?> e0;
    private final List<Exception> q;

    public o(String string) {
        this(string, Collections.EMPTY_LIST);
    }

    public o(String string, Exception exception) {
        this(string, Collections.singletonList(exception));
    }

    public o(String string, List<Exception> list) {
        super(string);
        this.setStackTrace(f0);
        this.q = list;
    }

    private void a(Exception object, List<Exception> list) {
        if (object instanceof o) {
            object = ((o)object).e().iterator();
            while (object.hasNext()) {
                this.a((Exception)object.next(), list);
            }
            return;
        }
        list.add((Exception)object);
    }

    private static void b(List<Exception> list, Appendable appendable) {
        try {
            o.c(list, appendable);
            return;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    private static void c(List<Exception> list, Appendable appendable) throws IOException {
        int n8 = list.size();
        int n9 = 0;
        while (n9 < n8) {
            Object object = appendable.append("Cause (");
            int n10 = n9 + 1;
            object.append(String.valueOf(n10)).append(" of ").append(String.valueOf(n8)).append("): ");
            object = list.get(n9);
            if (object instanceof o) {
                ((o)object).h(appendable);
            } else {
                o.d((Exception)object, appendable);
            }
            n9 = n10;
        }
    }

    private static void d(Exception exception, Appendable appendable) {
        try {
            appendable.append(exception.getClass().toString()).append(": ").append(exception.getMessage()).append('\n');
            return;
        }
        catch (IOException iOException) {
            throw new RuntimeException(exception);
        }
    }

    private void h(Appendable appendable) {
        o.d(this, appendable);
        o.b(this.e(), new a(appendable));
    }

    public List<Exception> e() {
        return this.q;
    }

    public List<Exception> f() {
        ArrayList<Exception> arrayList = new ArrayList<Exception>();
        this.a(this, arrayList);
        return arrayList;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String string) {
        List<Exception> list = this.f();
        int n8 = list.size();
        int n9 = 0;
        while (n9 < n8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Root cause (");
            int n10 = n9 + 1;
            stringBuilder.append(n10);
            stringBuilder.append(" of ");
            stringBuilder.append(n8);
            stringBuilder.append(")");
            Log.i((String)string, (String)stringBuilder.toString(), (Throwable)list.get(n9));
            n9 = n10;
        }
    }

    @Override
    public String getMessage() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.getMessage());
        Object object = this.e0;
        String string = "";
        if (object != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append(", ");
            ((StringBuilder)object).append(this.e0);
            object = ((StringBuilder)object).toString();
        } else {
            object = "";
        }
        stringBuilder.append((String)object);
        if (this.d0 != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append(", ");
            ((StringBuilder)object).append((Object)this.d0);
            object = ((StringBuilder)object).toString();
        } else {
            object = "";
        }
        stringBuilder.append((String)object);
        object = string;
        if (this.c0 != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append(", ");
            ((StringBuilder)object).append(this.c0);
            object = ((StringBuilder)object).toString();
        }
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    void i(h h8, ax.M3.a a8) {
        this.j(h8, a8, null);
    }

    void j(h h8, ax.M3.a a8, Class<?> clazz) {
        this.c0 = h8;
        this.d0 = a8;
        this.e0 = clazz;
    }

    @Override
    public void printStackTrace() {
        this.printStackTrace(System.err);
    }

    @Override
    public void printStackTrace(PrintStream printStream) {
        this.h(printStream);
    }

    @Override
    public void printStackTrace(PrintWriter printWriter) {
        this.h(printWriter);
    }

    private static final class a
    implements Appendable {
        private boolean c0 = true;
        private final Appendable q;

        a(Appendable appendable) {
            this.q = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            CharSequence charSequence2 = charSequence;
            if (charSequence == null) {
                charSequence2 = "";
            }
            return charSequence2;
        }

        @Override
        public Appendable append(char c8) throws IOException {
            boolean bl = this.c0;
            boolean bl2 = false;
            if (bl) {
                this.c0 = false;
                this.q.append("  ");
            }
            if (c8 == '\n') {
                bl2 = true;
            }
            this.c0 = bl2;
            this.q.append(c8);
            return this;
        }

        @Override
        public Appendable append(CharSequence charSequence) throws IOException {
            charSequence = this.a(charSequence);
            return this.append(charSequence, 0, charSequence.length());
        }

        @Override
        public Appendable append(CharSequence charSequence, int n8, int n9) throws IOException {
            charSequence = this.a(charSequence);
            boolean bl = this.c0;
            boolean bl2 = false;
            if (bl) {
                this.c0 = false;
                this.q.append("  ");
            }
            bl = bl2;
            if (charSequence.length() > 0) {
                bl = bl2;
                if (charSequence.charAt(n9 - 1) == '\n') {
                    bl = true;
                }
            }
            this.c0 = bl;
            this.q.append(charSequence, n8, n9);
            return this;
        }
    }
}

