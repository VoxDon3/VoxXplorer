.class public final synthetic Landroidx/media3/exoplayer/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Landroidx/media3/exoplayer/J0;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/J0;I)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/t;->a:Landroidx/media3/exoplayer/J0;

    iput p2, p0, Landroidx/media3/exoplayer/t;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/t;->a:Landroidx/media3/exoplayer/J0;

    iget v1, p0, Landroidx/media3/exoplayer/t;->b:I

    check-cast p1, Lax/P0/H$d;

    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/X;->i1(Landroidx/media3/exoplayer/J0;ILax/P0/H$d;)V

    return-void
.end method
