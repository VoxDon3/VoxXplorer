package com.box.androidsdk.content.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ax.E3.h;
import ax.I3.c;
import ax.I3.e;
import ax.i.s;
import com.box.androidsdk.content.models.BoxCollaborator;
import com.box.androidsdk.content.models.BoxDownload;
import com.box.androidsdk.content.models.BoxUser;
import com.box.androidsdk.content.utils.SdkUtils;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class BoxAvatarView extends LinearLayout {
    private BoxCollaborator a;
    private b b;
    private TextView c;
    private ImageView d;
    private WeakReference<h<BoxDownload>> e;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BoxAvatarView.this.b();
        }
    }

    public interface b {
        File a(String str);

        h<BoxDownload> b(String str, BoxAvatarView boxAvatarView);
    }

    public BoxAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public <T extends Serializable & b> void a(BoxCollaborator boxCollaborator, T t) {
        if (t != null) {
            this.b = t;
        }
        BoxCollaborator boxCollaborator2 = this.a;
        if (boxCollaborator2 == null || boxCollaborator == null || !TextUtils.equals(boxCollaborator2.G(), boxCollaborator.G())) {
            this.a = boxCollaborator;
            WeakReference<h<BoxDownload>> weakReference = this.e;
            if (weakReference != null && weakReference.get() != null) {
                try {
                    this.e.get().cancel(true);
                } catch (Exception unused) {
                }
            }
            b();
        }
    }

    protected void b() {
        String str;
        int i;
        if (this.a == null || this.b == null) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            post(new a());
            return;
        }
        File a2 = this.b.a(this.a.G());
        if (a2.exists()) {
            this.d.setImageDrawable(Drawable.createFromPath(a2.getAbsolutePath()));
            this.d.setVisibility(0);
            this.c.setVisibility(8);
            return;
        }
        if (s.a(this.a)) {
            str = this.a.I();
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (SdkUtils.k(HttpUrl.FRAGMENT_ENCODE_SET)) {
                BoxCollaborator boxCollaborator = this.a;
                if (boxCollaborator instanceof BoxUser) {
                    str = ((BoxUser) boxCollaborator).J();
                }
            }
        }
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i == 0) {
            SdkUtils.s(getContext(), this.c, str);
        } else {
            SdkUtils.o(getContext(), this.c, i);
        }
        this.d.setVisibility(8);
        this.c.setVisibility(0);
        this.e = new WeakReference<>(this.b.b(this.a.G(), this));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.b = (b) bundle.getSerializable("extraAvatarController");
        this.a = (BoxUser) bundle.getSerializable("extraUser");
        super.onRestoreInstanceState(bundle.getParcelable("extraParent"));
        if (this.a != null) {
            b();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("extraAvatarController", (Serializable) this.b);
        bundle.putSerializable("extraUser", this.a);
        bundle.putParcelable("extraParent", super.onSaveInstanceState());
        return bundle;
    }

    public BoxAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.e, i, 0);
        View inflate = from.inflate(c.d, (ViewGroup) this, true);
        this.c = (TextView) inflate.findViewById(ax.I3.b.e);
        int integer = obtainStyledAttributes.getInteger(e.f, 0);
        if (integer != 0) {
            this.c.setTextSize(2, integer);
        }
        this.d = (ImageView) inflate.findViewById(ax.I3.b.d);
    }
}
