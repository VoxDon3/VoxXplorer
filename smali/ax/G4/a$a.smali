.class public Lax/G4/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/G4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field protected final a:Ljava/lang/String;

.field protected b:Lax/G4/T0;

.field protected c:Z

.field protected d:Ljava/util/Date;

.field protected e:Z

.field protected f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/E4/e;",
            ">;"
        }
    .end annotation
.end field

.field protected g:Z


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_28

    .line 5
    .line 6
    const-string v0, "(/(.|[\\r\\n])*)|(ns:[0-9]+(/.*)?)|(id:.*)"

    .line 7
    .line 8
    invoke-static {v0, p1}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_20

    .line 13
    .line 14
    iput-object p1, p0, Lax/G4/a$a;->a:Ljava/lang/String;

    .line 15
    .line 16
    sget-object p1, Lax/G4/T0;->c:Lax/G4/T0;

    .line 17
    .line 18
    iput-object p1, p0, Lax/G4/a$a;->b:Lax/G4/T0;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-boolean p1, p0, Lax/G4/a$a;->c:Z

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lax/G4/a$a;->d:Ljava/util/Date;

    .line 25
    .line 26
    iput-boolean p1, p0, Lax/G4/a$a;->e:Z

    .line 27
    .line 28
    iput-object v0, p0, Lax/G4/a$a;->f:Ljava/util/List;

    .line 29
    .line 30
    iput-boolean p1, p0, Lax/G4/a$a;->g:Z

    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    const-string v0, "String \'path\' does not match pattern"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :cond_28
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    const-string v0, "Required value for \'path\' is null"

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1
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


# virtual methods
.method public a()Lax/G4/a;
    .registers 9

    .line 1
    new-instance v0, Lax/G4/a;

    .line 2
    .line 3
    iget-object v1, p0, Lax/G4/a$a;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lax/G4/a$a;->b:Lax/G4/T0;

    .line 6
    .line 7
    iget-boolean v3, p0, Lax/G4/a$a;->c:Z

    .line 8
    .line 9
    iget-object v4, p0, Lax/G4/a$a;->d:Ljava/util/Date;

    .line 10
    .line 11
    iget-boolean v5, p0, Lax/G4/a$a;->e:Z

    .line 12
    .line 13
    iget-object v6, p0, Lax/G4/a$a;->f:Ljava/util/List;

    .line 14
    .line 15
    iget-boolean v7, p0, Lax/G4/a$a;->g:Z

    .line 16
    .line 17
    invoke-direct/range {v0 .. v7}, Lax/G4/a;-><init>(Ljava/lang/String;Lax/G4/T0;ZLjava/util/Date;ZLjava/util/List;Z)V

    .line 18
    .line 19
    .line 20
    return-object v0
    .line 21
.end method

.method public b(Ljava/lang/Boolean;)Lax/G4/a$a;
    .registers 2

    .line 1
    if-eqz p1, :cond_9

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput-boolean p1, p0, Lax/G4/a$a;->c:Z

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_9
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lax/G4/a$a;->c:Z

    .line 12
    .line 13
    return-object p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public c(Ljava/util/Date;)Lax/G4/a$a;
    .registers 2

    .line 1
    invoke-static {p1}, Lax/w4/d;->b(Ljava/util/Date;)Ljava/util/Date;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lax/G4/a$a;->d:Ljava/util/Date;

    .line 6
    .line 7
    return-object p0
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
    .line 22
.end method

.method public d(Lax/G4/T0;)Lax/G4/a$a;
    .registers 2

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    iput-object p1, p0, Lax/G4/a$a;->b:Lax/G4/T0;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_5
    sget-object p1, Lax/G4/T0;->c:Lax/G4/T0;

    .line 7
    .line 8
    iput-object p1, p0, Lax/G4/a$a;->b:Lax/G4/T0;

    .line 9
    .line 10
    return-object p0
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
    .line 22
.end method
