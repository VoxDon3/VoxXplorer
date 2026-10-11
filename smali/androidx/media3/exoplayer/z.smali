.class public final synthetic Landroidx/media3/exoplayer/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(II)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/media3/exoplayer/z;->a:I

    iput p2, p0, Landroidx/media3/exoplayer/z;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 4

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/z;->a:I

    iget v1, p0, Landroidx/media3/exoplayer/z;->b:I

    check-cast p1, Lax/P0/H$d;

    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/X;->U0(IILax/P0/H$d;)V

    return-void
.end method
