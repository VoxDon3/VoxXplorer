.class public final synthetic Lax/l1/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    .line 1
    check-cast p1, Lax/l1/n$k;

    check-cast p2, Lax/l1/n$k;

    invoke-static {p1, p2}, Lax/l1/n$k;->l(Lax/l1/n$k;Lax/l1/n$k;)I

    move-result p1

    return p1
.end method
