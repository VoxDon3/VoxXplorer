.class public final synthetic Lax/f1/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaCodec$OnFrameRenderedListener;


# instance fields
.field public final synthetic a:Lax/f1/c0;

.field public final synthetic b:Lax/f1/x$d;


# direct methods
.method public synthetic constructor <init>(Lax/f1/c0;Lax/f1/x$d;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/f1/b0;->a:Lax/f1/c0;

    iput-object p2, p0, Lax/f1/b0;->b:Lax/f1/x$d;

    return-void
.end method


# virtual methods
.method public final onFrameRendered(Landroid/media/MediaCodec;JJ)V
    .registers 13

    .line 1
    iget-object v0, p0, Lax/f1/b0;->a:Lax/f1/c0;

    iget-object v1, p0, Lax/f1/b0;->b:Lax/f1/x$d;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-static/range {v0 .. v6}, Lax/f1/c0;->r(Lax/f1/c0;Lax/f1/x$d;Landroid/media/MediaCodec;JJ)V

    return-void
.end method
