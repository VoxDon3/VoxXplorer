.class public final synthetic Landroidx/media3/exoplayer/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(IZ)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/media3/exoplayer/g0;->a:I

    iput-boolean p2, p0, Landroidx/media3/exoplayer/g0;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 4

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/g0;->a:I

    iget-boolean v1, p0, Landroidx/media3/exoplayer/g0;->b:Z

    check-cast p1, Lax/P0/H$d;

    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/X$c;->H(IZLax/P0/H$d;)V

    return-void
.end method
