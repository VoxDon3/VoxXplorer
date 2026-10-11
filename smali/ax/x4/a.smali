.class public Lax/x4/a;
.super Lax/x4/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/x4/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Lax/p4/m;Lax/u4/a;)V
    .registers 9

    .line 2
    sget-object v3, Lax/p4/k;->e:Lax/p4/k;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lax/x4/a;-><init>(Lax/p4/m;Lax/u4/a;Lax/p4/k;Ljava/lang/String;Lax/C4/a;)V

    return-void
.end method

.method private constructor <init>(Lax/p4/m;Lax/u4/a;Lax/p4/k;Ljava/lang/String;Lax/C4/a;)V
    .registers 12

    .line 4
    new-instance v0, Lax/x4/a$a;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lax/x4/a$a;-><init>(Lax/p4/m;Lax/u4/a;Lax/p4/k;Ljava/lang/String;Lax/C4/a;)V

    invoke-direct {p0, v0}, Lax/x4/b;-><init>(Lax/x4/d;)V

    return-void
.end method

.method public constructor <init>(Lax/p4/m;Ljava/lang/String;)V
    .registers 5

    .line 1
    sget-object v0, Lax/p4/k;->e:Lax/p4/k;

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lax/x4/a;-><init>(Lax/p4/m;Ljava/lang/String;Lax/p4/k;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lax/p4/m;Ljava/lang/String;Lax/p4/k;Ljava/lang/String;)V
    .registers 11

    .line 3
    new-instance v2, Lax/u4/a;

    invoke-direct {v2, p2}, Lax/u4/a;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lax/x4/a;-><init>(Lax/p4/m;Lax/u4/a;Lax/p4/k;Ljava/lang/String;Lax/C4/a;)V

    return-void
.end method

.method constructor <init>(Lax/x4/d;)V
    .registers 2

    .line 5
    invoke-direct {p0, p1}, Lax/x4/b;-><init>(Lax/x4/d;)V

    return-void
.end method


# virtual methods
.method public c()Lax/u4/d;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/p4/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/x4/b;->a:Lax/x4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x4/d;->l()Lax/u4/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public d(Lax/C4/a;)Lax/x4/a;
    .registers 4

    .line 1
    if-eqz p1, :cond_e

    .line 2
    .line 3
    new-instance v0, Lax/x4/a;

    .line 4
    .line 5
    iget-object v1, p0, Lax/x4/b;->a:Lax/x4/d;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Lax/x4/d;->q(Lax/C4/a;)Lax/x4/d;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, p1}, Lax/x4/a;-><init>(Lax/x4/d;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const-string v0, "\'pathRoot\' should not be null"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method
