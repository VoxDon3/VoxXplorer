.class public final synthetic Landroidx/media3/exoplayer/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lax/P0/H$e;

.field public final synthetic c:Lax/P0/H$e;


# direct methods
.method public synthetic constructor <init>(ILax/P0/H$e;Lax/P0/H$e;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/media3/exoplayer/S;->a:I

    iput-object p2, p0, Landroidx/media3/exoplayer/S;->b:Lax/P0/H$e;

    iput-object p3, p0, Landroidx/media3/exoplayer/S;->c:Lax/P0/H$e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 5

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/S;->a:I

    iget-object v1, p0, Landroidx/media3/exoplayer/S;->b:Lax/P0/H$e;

    iget-object v2, p0, Landroidx/media3/exoplayer/S;->c:Lax/P0/H$e;

    check-cast p1, Lax/P0/H$d;

    invoke-static {v0, v1, v2, p1}, Landroidx/media3/exoplayer/X;->d1(ILax/P0/H$e;Lax/P0/H$e;Lax/P0/H$d;)V

    return-void
.end method
