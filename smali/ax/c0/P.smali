.class public final Lax/c0/P;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/c0/P$b;,
        Lax/c0/P$c;,
        Lax/c0/P$a;
    }
.end annotation


# instance fields
.field private final a:Lax/c0/P$c;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_11

    .line 3
    new-instance v0, Lax/c0/P$b;

    invoke-direct {v0, p1}, Lax/c0/P$b;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lax/c0/P;->a:Lax/c0/P$c;

    return-void

    .line 4
    :cond_11
    new-instance v0, Lax/c0/P$a;

    invoke-direct {v0, p1}, Lax/c0/P$a;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lax/c0/P;->a:Lax/c0/P$c;

    return-void
.end method

.method constructor <init>(Landroid/view/WindowInsetsController;)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Lax/c0/P$b;

    invoke-direct {v0, p1}, Lax/c0/P$b;-><init>(Landroid/view/WindowInsetsController;)V

    iput-object v0, p0, Lax/c0/P;->a:Lax/c0/P$c;

    return-void
.end method


# virtual methods
.method public a()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c0/P;->a:Lax/c0/P$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/c0/P$c;->a()V

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
.end method

.method public b()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c0/P;->a:Lax/c0/P$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/c0/P$c;->b()V

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
.end method
