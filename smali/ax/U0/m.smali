.class public final Lax/U0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/U0/g$a;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lax/U0/z;

.field private final c:Lax/U0/g$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lax/U0/z;Lax/U0/g$a;)V
    .registers 4

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lax/U0/m;->a:Landroid/content/Context;

    .line 5
    iput-object p2, p0, Lax/U0/m;->b:Lax/U0/z;

    .line 6
    iput-object p3, p0, Lax/U0/m;->c:Lax/U0/g$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .registers 4

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lax/U0/m;-><init>(Landroid/content/Context;Ljava/lang/String;Lax/U0/z;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lax/U0/z;)V
    .registers 5

    .line 2
    new-instance v0, Lax/U0/n$b;

    invoke-direct {v0}, Lax/U0/n$b;-><init>()V

    invoke-virtual {v0, p2}, Lax/U0/n$b;->c(Ljava/lang/String;)Lax/U0/n$b;

    move-result-object p2

    invoke-direct {p0, p1, p3, p2}, Lax/U0/m;-><init>(Landroid/content/Context;Lax/U0/z;Lax/U0/g$a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lax/U0/g;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/U0/m;->b()Lax/U0/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
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

.method public b()Lax/U0/l;
    .registers 4

    .line 1
    new-instance v0, Lax/U0/l;

    .line 2
    .line 3
    iget-object v1, p0, Lax/U0/m;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Lax/U0/m;->c:Lax/U0/g$a;

    .line 6
    .line 7
    invoke-interface {v2}, Lax/U0/g$a;->a()Lax/U0/g;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, v1, v2}, Lax/U0/l;-><init>(Landroid/content/Context;Lax/U0/g;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lax/U0/m;->b:Lax/U0/z;

    .line 15
    .line 16
    if-eqz v1, :cond_14

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lax/U0/l;->d(Lax/U0/z;)V

    .line 19
    .line 20
    .line 21
    :cond_14
    return-object v0
.end method
