package ax.x0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import ax.b0.C1446g;

/* renamed from: ax.x0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3399f {
    private final b a;

    /* renamed from: ax.x0.f$a */
    private static class a extends b {
        private final TextView a;
        private final C3397d b;
        private boolean c = true;

        a(TextView textView) {
            this.a = textView;
            this.b = new C3397d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C3397d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> g = g(inputFilterArr);
            if (g.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - g.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (g.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof C3401h ? ((C3401h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.a.setFilters(a(this.a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return transformationMethod instanceof C3401h ? transformationMethod : transformationMethod instanceof PasswordTransformationMethod ? transformationMethod : new C3401h(transformationMethod);
        }

        @Override // ax.x0.C3399f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // ax.x0.C3399f.b
        public boolean b() {
            return this.c;
        }

        @Override // ax.x0.C3399f.b
        void c(boolean z) {
            if (z) {
                l();
            }
        }

        @Override // ax.x0.C3399f.b
        void d(boolean z) {
            this.c = z;
            l();
            k();
        }

        @Override // ax.x0.C3399f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z) {
            this.c = z;
        }

        void l() {
            this.a.setTransformationMethod(e(this.a.getTransformationMethod()));
        }
    }

    /* renamed from: ax.x0.f$b */
    static class b {
        b() {
        }

        InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        void c(boolean z) {
            throw null;
        }

        void d(boolean z) {
            throw null;
        }

        TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* renamed from: ax.x0.f$c */
    private static class c extends b {
        private final a a;

        c(TextView textView) {
            this.a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.e.i();
        }

        @Override // ax.x0.C3399f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.a.a(inputFilterArr);
        }

        @Override // ax.x0.C3399f.b
        public boolean b() {
            return this.a.b();
        }

        @Override // ax.x0.C3399f.b
        void c(boolean z) {
            if (f()) {
                return;
            }
            this.a.c(z);
        }

        @Override // ax.x0.C3399f.b
        void d(boolean z) {
            if (f()) {
                this.a.i(z);
            } else {
                this.a.d(z);
            }
        }

        @Override // ax.x0.C3399f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.a.e(transformationMethod);
        }
    }

    public C3399f(TextView textView, boolean z) {
        C1446g.h(textView, "textView cannot be null");
        if (z) {
            this.a = new a(textView);
        } else {
            this.a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.a.a(inputFilterArr);
    }

    public boolean b() {
        return this.a.b();
    }

    public void c(boolean z) {
        this.a.c(z);
    }

    public void d(boolean z) {
        this.a.d(z);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.a.e(transformationMethod);
    }
}
