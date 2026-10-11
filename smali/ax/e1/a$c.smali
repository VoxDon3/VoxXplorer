.class public final Lax/e1/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/e1/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/e1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lax/e1/a$c;-><init>(Landroid/content/Context;Lax/e1/a$b;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lax/e1/a$b;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/e1/a$c;->a:Landroid/content/Context;

    const/4 p1, -0x1

    .line 4
    iput p1, p0, Lax/e1/a$c;->b:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lax/e1/b;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/e1/a$c;->c()Lax/e1/a;

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

.method public b(Lax/P0/v;)I
    .registers 3

    .line 1
    iget-object v0, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1f

    .line 4
    .line 5
    invoke-static {v0}, Lax/P0/D;->q(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    goto :goto_1f

    .line 12
    :cond_b
    iget-object p1, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p1}, Lax/S0/d0;->J0(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_19

    .line 19
    .line 20
    const/4 p1, 0x4

    .line 21
    invoke-static {p1}, Lax/Y0/V;->a(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_19
    const/4 p1, 0x1

    .line 27
    invoke-static {p1}, Lax/Y0/V;->a(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1

    .line 32
    :cond_1f
    :goto_1f
    const/4 p1, 0x0

    .line 33
    invoke-static {p1}, Lax/Y0/V;->a(I)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public c()Lax/e1/a;
    .registers 5

    .line 1
    new-instance v0, Lax/e1/a;

    .line 2
    .line 3
    iget-object v1, p0, Lax/e1/a$c;->a:Landroid/content/Context;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget v3, p0, Lax/e1/a$c;->b:I

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3, v2}, Lax/e1/a;-><init>(Landroid/content/Context;Lax/e1/a$b;ILax/e1/a$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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
