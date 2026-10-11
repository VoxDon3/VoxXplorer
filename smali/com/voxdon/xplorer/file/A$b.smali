.class public Lcom/voxdon/xplorer/file/A$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/voxdon/xplorer/file/A;",
        ">;"
    }
.end annotation


# instance fields
.field c0:Ljava/text/Collator;

.field q:Lax/u3/a;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/voxdon/xplorer/file/A$b;->c0:Ljava/text/Collator;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    :try_start_a
    invoke-virtual {v0, v1}, Ljava/text/Collator;->setDecomposition(I)V
    :try_end_d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_a .. :try_end_d} :catch_d

    .line 12
    .line 13
    .line 14
    :catch_d
    iget-object v0, p0, Lcom/voxdon/xplorer/file/A$b;->c0:Ljava/text/Collator;

    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    invoke-virtual {v0, v1}, Ljava/text/Collator;->setStrength(I)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lax/u3/a;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/voxdon/xplorer/file/A$b;->c0:Ljava/text/Collator;

    .line 23
    .line 24
    invoke-direct {v0, v1}, Lax/u3/a;-><init>(Ljava/text/Collator;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/voxdon/xplorer/file/A$b;->q:Lax/u3/a;

    .line 28
    .line 29
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method


# virtual methods
.method public a(Lcom/voxdon/xplorer/file/A;Lcom/voxdon/xplorer/file/A;)I
    .registers 3

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/A;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/A;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/voxdon/xplorer/file/A$b;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
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

.method public b(Ljava/lang/String;Ljava/lang/String;)I
    .registers 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/file/A$b;->q:Lax/u3/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/u3/a;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_6} :catch_7

    .line 7
    return p1

    .line 8
    :catch_7
    iget-object v0, p0, Lcom/voxdon/xplorer/file/A$b;->c0:Ljava/text/Collator;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
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

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    .line 1
    check-cast p1, Lcom/voxdon/xplorer/file/A;

    .line 2
    .line 3
    check-cast p2, Lcom/voxdon/xplorer/file/A;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/voxdon/xplorer/file/A$b;->a(Lcom/voxdon/xplorer/file/A;Lcom/voxdon/xplorer/file/A;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
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
