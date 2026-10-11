/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.p;
import ax.c0.a;
import ax.c0.d0;
import ax.d0.H;

public class CheckableImageButton
extends p
implements Checkable {
    private static final int[] g = new int[]{0x10100A0};
    private boolean d;
    private boolean e = true;
    private boolean f = true;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.E);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        d0.l0((View)this, new a(this){
            final CheckableImageButton d;
            {
                this.d = checkableImageButton;
            }

            @Override
            public void f(View view, AccessibilityEvent accessibilityEvent) {
                super.f(view, accessibilityEvent);
                accessibilityEvent.setChecked(this.d.isChecked());
            }

            @Override
            public void g(View view, H h8) {
                super.g(view, h8);
                h8.k0(this.d.a());
                h8.l0(this.d.isChecked());
            }
        });
    }

    public boolean a() {
        return this.e;
    }

    public boolean isChecked() {
        return this.d;
    }

    public int[] onCreateDrawableState(int n8) {
        if (this.d) {
            int[] nArray = g;
            return View.mergeDrawableStates((int[])super.onCreateDrawableState(n8 + nArray.length), (int[])nArray);
        }
        return super.onCreateDrawableState(n8);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (b)parcelable;
        super.onRestoreInstanceState(parcelable.a());
        this.setChecked(parcelable.d0);
    }

    protected Parcelable onSaveInstanceState() {
        b b8 = new b(super.onSaveInstanceState());
        b8.d0 = this.d;
        return b8;
    }

    public void setCheckable(boolean bl) {
        if (this.e != bl) {
            this.e = bl;
            this.sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean bl) {
        if (this.e && this.d != bl) {
            this.d = bl;
            this.refreshDrawableState();
            this.sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean bl) {
        this.f = bl;
    }

    public void setPressed(boolean bl) {
        if (this.f) {
            super.setPressed(bl);
        }
    }

    public void toggle() {
        this.setChecked(this.d ^ true);
    }

    static class b
    extends ax.k0.a {
        public static final Parcelable.Creator<b> CREATOR = new Parcelable.ClassLoaderCreator<b>(){

            public b a(Parcel parcel) {
                return new b(parcel, null);
            }

            public b b(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            public b[] c(int n8) {
                return new b[n8];
            }
        };
        boolean d0;

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.b(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            int n8 = parcel.readInt();
            boolean bl = true;
            if (n8 != 1) {
                bl = false;
            }
            this.d0 = bl;
        }

        @Override
        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeInt(this.d0 ? 1 : 0);
        }
    }
}

