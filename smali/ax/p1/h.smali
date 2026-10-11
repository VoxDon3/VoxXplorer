.class public final synthetic Lax/p1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# instance fields
.field public final synthetic q:Lax/p1/i;


# direct methods
.method public synthetic constructor <init>(Lax/p1/i;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/p1/h;->q:Lax/p1/i;

    return-void
.end method


# virtual methods
.method public final onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/p1/h;->q:Lax/p1/i;

    invoke-static {v0, p1}, Lax/p1/i;->a(Lax/p1/i;Landroid/graphics/SurfaceTexture;)V

    return-void
.end method
