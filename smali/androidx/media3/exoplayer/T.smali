.class public final synthetic Landroidx/media3/exoplayer/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Lax/P0/y;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lax/P0/y;I)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/T;->a:Lax/P0/y;

    iput p2, p0, Landroidx/media3/exoplayer/T;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/T;->a:Lax/P0/y;

    iget v1, p0, Landroidx/media3/exoplayer/T;->b:I

    check-cast p1, Lax/P0/H$d;

    invoke-static {v0, v1, p1}, Landroidx/media3/exoplayer/X;->P0(Lax/P0/y;ILax/P0/H$d;)V

    return-void
.end method
