.class Lax/o4/b$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/o4/b$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "i"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lax/o4/b$a;)V
    .registers 2

    .line 2
    invoke-direct {p0}, Lax/o4/b$i;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lax/o4/b$q;Lax/o4/g$L;)Z
    .registers 4

    .line 1
    instance-of p1, p2, Lax/o4/g$J;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p1, :cond_14

    .line 5
    .line 6
    check-cast p2, Lax/o4/g$J;

    .line 7
    .line 8
    invoke-interface {p2}, Lax/o4/g$J;->b()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_12

    .line 17
    .line 18
    return v0

    .line 19
    :cond_12
    const/4 p1, 0x0

    .line 20
    return p1

    .line 21
    :cond_14
    return v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    .line 1
    const-string v0, "empty"

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
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
