.class public final Lax/o1/x;
.super Landroid/opengl/GLSurfaceView;
.source "SourceFile"

# interfaces
.implements Lax/o1/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/o1/x$a;
    }
.end annotation


# static fields
.field public static final synthetic b:I


# instance fields
.field private final a:Lax/o1/x$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lax/o1/x;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    new-instance p1, Lax/o1/x$a;

    invoke-direct {p1, p0}, Lax/o1/x$a;-><init>(Landroid/opengl/GLSurfaceView;)V

    iput-object p1, p0, Lax/o1/x;->a:Lax/o1/x$a;

    const/4 p2, 0x1

    .line 4
    invoke-virtual {p0, p2}, Landroid/opengl/GLSurfaceView;->setPreserveEGLContextOnPause(Z)V

    const/4 p2, 0x2

    .line 5
    invoke-virtual {p0, p2}, Landroid/opengl/GLSurfaceView;->setEGLContextClientVersion(I)V

    .line 6
    invoke-virtual {p0, p1}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1}, Landroid/opengl/GLSurfaceView;->setRenderMode(I)V

    return-void
.end method


# virtual methods
.method public getVideoDecoderOutputBufferRenderer()Lax/o1/y;
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-object p0
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public setOutputBuffer(Landroidx/media3/decoder/b;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/x;->a:Lax/o1/x$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/o1/x$a;->a(Landroidx/media3/decoder/b;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
