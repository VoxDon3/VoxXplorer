/*
 * Decompiled with CFR 0.152.
 */
package ax.x0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.e;
import ax.b0.g;
import ax.x0.d;
import ax.x0.h;

public final class f {
    private final b a;

    public f(TextView textView, boolean bl) {
        g.h(textView, "textView cannot be null");
        if (!bl) {
            this.a = new c(textView);
            return;
        }
        this.a = new a(textView);
    }

    public InputFilter[] a(InputFilter[] inputFilterArray) {
        return this.a.a(inputFilterArray);
    }

    public boolean b() {
        return this.a.b();
    }

    public void c(boolean bl) {
        this.a.c(bl);
    }

    public void d(boolean bl) {
        this.a.d(bl);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.a.e(transformationMethod);
    }

    private static class a
    extends b {
        private final TextView a;
        private final d b;
        private boolean c;

        a(TextView textView) {
            this.a = textView;
            this.c = true;
            this.b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArray) {
            int n8 = inputFilterArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (inputFilterArray[i8] != this.b) continue;
                return inputFilterArray;
            }
            InputFilter[] inputFilterArray2 = new InputFilter[inputFilterArray.length + 1];
            System.arraycopy(inputFilterArray, 0, inputFilterArray2, 0, n8);
            inputFilterArray2[n8] = this.b;
            return inputFilterArray2;
        }

        private SparseArray<InputFilter> g(InputFilter[] inputFilterArray) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i8 = 0; i8 < inputFilterArray.length; ++i8) {
                InputFilter inputFilter = inputFilterArray[i8];
                if (!(inputFilter instanceof d)) continue;
                sparseArray.put(i8, (Object)inputFilter);
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArray) {
            SparseArray<InputFilter> sparseArray = this.g(inputFilterArray);
            if (sparseArray.size() == 0) {
                return inputFilterArray;
            }
            int n8 = inputFilterArray.length;
            InputFilter[] inputFilterArray2 = new InputFilter[inputFilterArray.length - sparseArray.size()];
            int n9 = 0;
            for (int i8 = 0; i8 < n8; ++i8) {
                int n10 = n9;
                if (sparseArray.indexOfKey(i8) < 0) {
                    inputFilterArray2[n9] = inputFilterArray[i8];
                    n10 = n9 + 1;
                }
                n9 = n10;
            }
            return inputFilterArray2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            TransformationMethod transformationMethod2 = transformationMethod;
            if (transformationMethod instanceof h) {
                transformationMethod2 = ((h)transformationMethod).a();
            }
            return transformationMethod2;
        }

        private void k() {
            InputFilter[] inputFilterArray = this.a.getFilters();
            this.a.setFilters(this.a(inputFilterArray));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof h) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new h(transformationMethod);
        }

        @Override
        InputFilter[] a(InputFilter[] inputFilterArray) {
            if (!this.c) {
                return this.h(inputFilterArray);
            }
            return this.f(inputFilterArray);
        }

        @Override
        public boolean b() {
            return this.c;
        }

        @Override
        void c(boolean bl) {
            if (bl) {
                this.l();
            }
        }

        @Override
        void d(boolean bl) {
            this.c = bl;
            this.l();
            this.k();
        }

        @Override
        TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.c) {
                return this.m(transformationMethod);
            }
            return this.j(transformationMethod);
        }

        void i(boolean bl) {
            this.c = bl;
        }

        void l() {
            TransformationMethod transformationMethod = this.e(this.a.getTransformationMethod());
            this.a.setTransformationMethod(transformationMethod);
        }
    }

    static class b {
        b() {
        }

        InputFilter[] a(InputFilter[] inputFilterArray) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        void c(boolean bl) {
            throw null;
        }

        void d(boolean bl) {
            throw null;
        }

        TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    private static class c
    extends b {
        private final a a;

        c(TextView textView) {
            this.a = new a(textView);
        }

        private boolean f() {
            return e.i() ^ true;
        }

        @Override
        InputFilter[] a(InputFilter[] inputFilterArray) {
            if (this.f()) {
                return inputFilterArray;
            }
            return this.a.a(inputFilterArray);
        }

        @Override
        public boolean b() {
            return this.a.b();
        }

        @Override
        void c(boolean bl) {
            if (this.f()) {
                return;
            }
            this.a.c(bl);
        }

        @Override
        void d(boolean bl) {
            if (this.f()) {
                this.a.i(bl);
                return;
            }
            this.a.d(bl);
        }

        @Override
        TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.f()) {
                return transformationMethod;
            }
            return this.a.e(transformationMethod);
        }
    }
}

