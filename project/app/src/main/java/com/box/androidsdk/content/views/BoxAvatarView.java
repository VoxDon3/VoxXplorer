/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
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
import com.box.androidsdk.content.models.BoxEntity;
import com.box.androidsdk.content.models.BoxUser;
import com.box.androidsdk.content.utils.SdkUtils;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;

public class BoxAvatarView
extends LinearLayout {
    private BoxCollaborator a;
    private b b;
    private TextView c;
    private ImageView d;
    private WeakReference<h<BoxDownload>> e;

    public BoxAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoxAvatarView(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        LayoutInflater layoutInflater = LayoutInflater.from((Context)context);
        context = context.obtainStyledAttributes(attributeSet, ax.I3.e.e, n8, 0);
        attributeSet = layoutInflater.inflate(ax.I3.c.d, (ViewGroup)this, true);
        this.c = (TextView)attributeSet.findViewById(ax.I3.b.e);
        n8 = context.getInteger(ax.I3.e.f, 0);
        if (n8 != 0) {
            this.c.setTextSize(2, (float)n8);
        }
        this.d = (ImageView)attributeSet.findViewById(ax.I3.b.d);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <T extends Serializable & b> void a(BoxCollaborator weakReference, T object) {
        if (object != null) {
            this.b = (b)object;
        }
        if ((object = this.a) != null && weakReference != null && TextUtils.equals((CharSequence)((BoxEntity)object).G(), (CharSequence)((BoxEntity)((Object)weakReference)).G())) {
            return;
        }
        this.a = weakReference;
        weakReference = this.e;
        if (weakReference != null && weakReference.get() != null) {
            try {
                ((h)this.e.get()).cancel(true);
            }
            catch (Exception exception) {}
        }
        this.b();
    }

    protected void b() {
        if (this.a != null && this.b != null) {
            int n8;
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                this.post(new Runnable(this){
                    final BoxAvatarView q;
                    {
                        this.q = boxAvatarView;
                    }

                    @Override
                    public void run() {
                        this.q.b();
                    }
                });
                return;
            }
            Object object = this.b.a(this.a.G());
            if (((File)object).exists()) {
                this.d.setImageDrawable(Drawable.createFromPath((String)((File)object).getAbsolutePath()));
                this.d.setVisibility(0);
                this.c.setVisibility(8);
                return;
            }
            if (s.a(this.a)) {
                object = this.a.I();
            } else {
                String string = "";
                object = string;
                if (SdkUtils.k("")) {
                    BoxCollaborator boxCollaborator = this.a;
                    object = string;
                    if (boxCollaborator instanceof BoxUser) {
                        object = ((BoxUser)boxCollaborator).J();
                    }
                }
            }
            try {
                n8 = Integer.parseInt((String)object);
            }
            catch (NumberFormatException numberFormatException) {
                n8 = 0;
            }
            if (n8 == 0) {
                SdkUtils.s(this.getContext(), this.c, (String)object);
            } else {
                SdkUtils.o(this.getContext(), this.c, n8);
            }
            this.d.setVisibility(8);
            this.c.setVisibility(0);
            this.e = new WeakReference<h<BoxDownload>>(this.b.b(this.a.G(), this));
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            parcelable = (Bundle)parcelable;
            this.b = (b)((Object)parcelable.getSerializable("extraAvatarController"));
            this.a = (BoxUser)parcelable.getSerializable("extraUser");
            super.onRestoreInstanceState(parcelable.getParcelable("extraParent"));
            if (this.a != null) {
                this.b();
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("extraAvatarController", (Serializable)((Object)this.b));
        bundle.putSerializable("extraUser", (Serializable)this.a);
        bundle.putParcelable("extraParent", super.onSaveInstanceState());
        return bundle;
    }

    public static interface b {
        public File a(String var1);

        public h<BoxDownload> b(String var1, BoxAvatarView var2);
    }
}

