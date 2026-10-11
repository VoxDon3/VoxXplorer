.class public final synthetic Lax/p1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Landroid/graphics/SurfaceTexture;

.field public final synthetic q:Lax/p1/l;


# direct methods
.method public synthetic constructor <init>(Lax/p1/l;Landroid/graphics/SurfaceTexture;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/p1/k;->q:Lax/p1/l;

    iput-object p2, p0, Lax/p1/k;->c0:Landroid/graphics/SurfaceTexture;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/p1/k;->q:Lax/p1/l;

    iget-object v1, p0, Lax/p1/k;->c0:Landroid/graphics/SurfaceTexture;

    invoke-static {v0, v1}, Lax/p1/l;->b(Lax/p1/l;Landroid/graphics/SurfaceTexture;)V

    return-void
.end method
