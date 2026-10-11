.class Lcom/voxdon/xplorer/license/components/DataTypeSerializerGsonFactory$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/r8/w;


# direct methods
.method constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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


# virtual methods
.method public b(Lcom/google/gson/Gson;Lax/x8/a;)Lcom/google/gson/TypeAdapter;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/gson/Gson;",
            "Lax/x8/a<",
            "TT;>;)",
            "Lcom/google/gson/TypeAdapter<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lax/x8/a;->c()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lax/Fa/c;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_13

    .line 12
    .line 13
    const-class p2, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/google/gson/Gson;->n(Ljava/lang/Class;)Lcom/google/gson/TypeAdapter;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_13
    const-class v0, Lax/Fa/d;

    .line 21
    .line 22
    invoke-virtual {p2}, Lax/x8/a;->c()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_26

    .line 31
    .line 32
    const-class p2, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Lcom/google/gson/Gson;->n(Ljava/lang/Class;)Lcom/google/gson/TypeAdapter;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_26
    const/4 p1, 0x0

    .line 40
    return-object p1
    .line 41
.end method
