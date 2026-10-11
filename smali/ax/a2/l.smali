.class public final synthetic Lax/a2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Landroid/graphics/Bitmap;

.field public final synthetic q:Landroidx/media3/ui/PlayerView;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/PlayerView;Landroid/graphics/Bitmap;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/a2/l;->q:Landroidx/media3/ui/PlayerView;

    iput-object p2, p0, Lax/a2/l;->c0:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a2/l;->q:Landroidx/media3/ui/PlayerView;

    iget-object v1, p0, Lax/a2/l;->c0:Landroid/graphics/Bitmap;

    invoke-static {v0, v1}, Landroidx/media3/ui/PlayerView;->a(Landroidx/media3/ui/PlayerView;Landroid/graphics/Bitmap;)V

    return-void
.end method
